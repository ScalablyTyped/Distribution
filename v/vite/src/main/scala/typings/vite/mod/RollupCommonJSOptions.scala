package typings.vite.mod

import typings.vite.viteStrings.auto
import typings.vite.viteStrings.namespace
import typings.vite.viteStrings.preferred
import typings.vite.viteStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupCommonJSOptions extends StObject {
  
  /**
    * @default "auto"
    */
  var defaultIsModuleExports: js.UndefOr[Boolean | auto | (js.Function1[/* id */ String, Boolean | auto])] = js.undefined
  
  /**
    * To avoid long paths when using the `dynamicRequireTargets` option, you can use this option to specify a directory
    * that is a common parent for all files that use dynamic require statements. Using a directory higher up such as `/`
    * may lead to unnecessarily long paths in the generated code and may expose directory names on your machine like your
    * home directory name. By default it uses the current working directory.
    */
  var dynamicRequireRoot: js.UndefOr[String] = js.undefined
  
  /**
    * Some modules contain dynamic `require` calls, or require modules that
    * contain circular dependencies, which are not handled well by static
    * imports. Including those modules as `dynamicRequireTargets` will simulate a
    * CommonJS (NodeJS-like)  environment for them with support for dynamic
    * dependencies. It also enables `strictRequires` for those modules.
    *
    * Note: In extreme cases, this feature may result in some paths being
    * rendered as absolute in the final bundle. The plugin tries to avoid
    * exposing paths from the local machine, but if you are `dynamicRequirePaths`
    * with paths that are far away from your project's folder, that may require
    * replacing strings like `"/Users/John/Desktop/foo-project/"` -\> `"/"`.
    */
  var dynamicRequireTargets: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Controls how to render imports from external dependencies. By default,
    * this plugin assumes that all external dependencies are CommonJS. This
    * means they are rendered as default imports to be compatible with e.g.
    * NodeJS where ES modules can only import a default export from a CommonJS
    * dependency.
    *
    * If you set `esmExternals` to `true`, this plugins assumes that all
    * external dependencies are ES modules and respect the
    * `requireReturnsDefault` option. If that option is not set, they will be
    * rendered as namespace imports.
    *
    * You can also supply an array of ids to be treated as ES modules, or a
    * function that will be passed each external id to determine if it is an ES
    * module.
    * @default false
    */
  var esmExternals: js.UndefOr[Boolean | js.Array[String] | (js.Function1[/* id */ String, Boolean])] = js.undefined
  
  /**
    * A minimatch pattern, or array of patterns, which specifies the files in
    * the build the plugin should _ignore_. By default, all files with
    * extensions other than those in `extensions` or `".cjs"` are ignored, but you
    * can exclude additional files. See also the `include` option.
    * @default undefined
    */
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  /**
    * For extensionless imports, search for extensions other than .js in the
    * order specified. Note that you need to make sure that non-JavaScript files
    * are transpiled by another plugin first.
    * @default [ '.js' ]
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Sometimes you have to leave require statements unconverted. Pass an array
    * containing the IDs or a `id => boolean` function.
    * @default []
    */
  var ignore: js.UndefOr[js.Array[String] | (js.Function1[/* id */ String, Boolean])] = js.undefined
  
  /**
    * Some `require` calls cannot be resolved statically to be translated to
    * imports.
    * When this option is set to `false`, the generated code will either
    * directly throw an error when such a call is encountered or, when
    * `dynamicRequireTargets` is used, when such a call cannot be resolved with a
    * configured dynamic require target.
    * Setting this option to `true` will instead leave the `require` call in the
    * code or use it as a fallback for `dynamicRequireTargets`.
    * @default false
    */
  var ignoreDynamicRequires: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true then uses of `global` won't be dealt with by this plugin
    * @default false
    */
  var ignoreGlobal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In most cases, where `require` calls are inside a `try-catch` clause,
    * they should be left unconverted as it requires an optional dependency
    * that may or may not be installed beside the rolled up package.
    * Due to the conversion of `require` to a static `import` - the call is
    * hoisted to the top of the file, outside of the `try-catch` clause.
    *
    * - `true`: All `require` calls inside a `try` will be left unconverted.
    * - `false`: All `require` calls inside a `try` will be converted as if the
    *   `try-catch` clause is not there.
    * - `remove`: Remove all `require` calls from inside any `try` block.
    * - `string[]`: Pass an array containing the IDs to left unconverted.
    * - `((id: string) => boolean|'remove')`: Pass a function that control
    *   individual IDs.
    *
    * @default false
    */
  var ignoreTryCatch: js.UndefOr[
    Boolean | remove | js.Array[String] | (js.Function1[/* id */ String, Boolean | remove])
  ] = js.undefined
  
  /**
    * A minimatch pattern, or array of patterns, which specifies the files in
    * the build the plugin should operate on. By default, all files with
    * extension `".cjs"` or those in `extensions` are included, but you can
    * narrow this list by only including specific files. These files will be
    * analyzed and transpiled if either the analysis does not find ES module
    * specific statements or `transformMixedEsModules` is `true`.
    * @default undefined
    */
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  /**
    * Controls what is returned when requiring an ES module from a CommonJS file.
    * When using the `esmExternals` option, this will also apply to external
    * modules. By default, this plugin will render those imports as namespace
    * imports i.e.
    *
    * ```js
    * // input
    * const foo = require('foo');
    *
    * // output
    * import * as foo from 'foo';
    * ```
    *
    * However there are some situations where this may not be desired.
    * For these situations, you can change Rollup's behaviour either globally or
    * per module. To change it globally, set the `requireReturnsDefault` option
    * to one of the following values:
    *
    * - `false`: This is the default, requiring an ES module returns its
    *   namespace. This is the only option that will also add a marker
    *   `__esModule: true` to the namespace to support interop patterns in
    *   CommonJS modules that are transpiled ES modules.
    * - `"namespace"`: Like `false`, requiring an ES module returns its
    *   namespace, but the plugin does not add the `__esModule` marker and thus
    *   creates more efficient code. For external dependencies when using
    *   `esmExternals: true`, no additional interop code is generated.
    * - `"auto"`: This is complementary to how `output.exports: "auto"` works in
    *   Rollup: If a module has a default export and no named exports, requiring
    *   that module returns the default export. In all other cases, the namespace
    *   is returned. For external dependencies when using `esmExternals: true`, a
    *   corresponding interop helper is added.
    * - `"preferred"`: If a module has a default export, requiring that module
    *   always returns the default export, no matter whether additional named
    *   exports exist. This is similar to how previous versions of this plugin
    *   worked. Again for external dependencies when using `esmExternals: true`,
    *   an interop helper is added.
    * - `true`: This will always try to return the default export on require
    *   without checking if it actually exists. This can throw at build time if
    *   there is no default export. This is how external dependencies are handled
    *   when `esmExternals` is not used. The advantage over the other options is
    *   that, like `false`, this does not add an interop helper for external
    *   dependencies, keeping the code lean.
    *
    * To change this for individual modules, you can supply a function for
    * `requireReturnsDefault` instead. This function will then be called once for
    * each required ES module or external dependency with the corresponding id
    * and allows you to return different values for different modules.
    * @default false
    */
  var requireReturnsDefault: js.UndefOr[
    Boolean | auto | preferred | namespace | (js.Function1[/* id */ String, Boolean | auto | preferred | namespace])
  ] = js.undefined
  
  /**
    * If false, skips source map generation for CommonJS modules. This will
    * improve performance.
    * @default true
    */
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, this plugin will try to hoist `require` statements as imports
    * to the top of each file. While this works well for many code bases and
    * allows for very efficient ESM output, it does not perfectly capture
    * CommonJS semantics as the order of side effects like log statements may
    * change. But it is especially problematic when there are circular `require`
    * calls between CommonJS modules as those often rely on the lazy execution of
    * nested `require` calls.
    *
    * Setting this option to `true` will wrap all CommonJS files in functions
    * which are executed when they are required for the first time, preserving
    * NodeJS semantics. Note that this can have an impact on the size and
    * performance of the generated code.
    *
    * The default value of `"auto"` will only wrap CommonJS files when they are
    * part of a CommonJS dependency cycle, e.g. an index file that is required by
    * many of its dependencies. All other CommonJS files are hoisted. This is the
    * recommended setting for most code bases.
    *
    * `false` will entirely prevent wrapping and hoist all files. This may still
    * work depending on the nature of cyclic dependencies but will often cause
    * problems.
    *
    * You can also provide a minimatch pattern, or array of patterns, to only
    * specify a subset of files which should be wrapped in functions for proper
    * `require` semantics.
    *
    * `"debug"` works like `"auto"` but after bundling, it will display a warning
    * containing a list of ids that have been wrapped which can be used as
    * minimatch pattern for fine-tuning.
    * @default "auto"
    */
  var strictRequires: js.UndefOr[Boolean | String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  /**
    * Instructs the plugin whether to enable mixed module transformations. This
    * is useful in scenarios with modules that contain a mix of ES `import`
    * statements and CommonJS `require` expressions. Set to `true` if `require`
    * calls should be transformed to imports in mixed modules, or `false` if the
    * `require` expressions should survive the transformation. The latter can be
    * important if the code contains environment detection, or you are coding
    * for an environment with special treatment for `require` calls such as
    * ElectronJS. See also the `ignore` option.
    * @default false
    */
  var transformMixedEsModules: js.UndefOr[Boolean] = js.undefined
}
object RollupCommonJSOptions {
  
  inline def apply(): RollupCommonJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupCommonJSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupCommonJSOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultIsModuleExports(value: Boolean | auto | (js.Function1[/* id */ String, Boolean | auto])): Self = StObject.set(x, "defaultIsModuleExports", value.asInstanceOf[js.Any])
    
    inline def setDefaultIsModuleExportsFunction1(value: /* id */ String => Boolean | auto): Self = StObject.set(x, "defaultIsModuleExports", js.Any.fromFunction1(value))
    
    inline def setDefaultIsModuleExportsUndefined: Self = StObject.set(x, "defaultIsModuleExports", js.undefined)
    
    inline def setDynamicRequireRoot(value: String): Self = StObject.set(x, "dynamicRequireRoot", value.asInstanceOf[js.Any])
    
    inline def setDynamicRequireRootUndefined: Self = StObject.set(x, "dynamicRequireRoot", js.undefined)
    
    inline def setDynamicRequireTargets(value: String | js.Array[String]): Self = StObject.set(x, "dynamicRequireTargets", value.asInstanceOf[js.Any])
    
    inline def setDynamicRequireTargetsUndefined: Self = StObject.set(x, "dynamicRequireTargets", js.undefined)
    
    inline def setDynamicRequireTargetsVarargs(value: String*): Self = StObject.set(x, "dynamicRequireTargets", js.Array(value*))
    
    inline def setEsmExternals(value: Boolean | js.Array[String] | (js.Function1[/* id */ String, Boolean])): Self = StObject.set(x, "esmExternals", value.asInstanceOf[js.Any])
    
    inline def setEsmExternalsFunction1(value: /* id */ String => Boolean): Self = StObject.set(x, "esmExternals", js.Any.fromFunction1(value))
    
    inline def setEsmExternalsUndefined: Self = StObject.set(x, "esmExternals", js.undefined)
    
    inline def setEsmExternalsVarargs(value: String*): Self = StObject.set(x, "esmExternals", js.Array(value*))
    
    inline def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setIgnore(value: js.Array[String] | (js.Function1[/* id */ String, Boolean])): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDynamicRequires(value: Boolean): Self = StObject.set(x, "ignoreDynamicRequires", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDynamicRequiresUndefined: Self = StObject.set(x, "ignoreDynamicRequires", js.undefined)
    
    inline def setIgnoreFunction1(value: /* id */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
    
    inline def setIgnoreGlobal(value: Boolean): Self = StObject.set(x, "ignoreGlobal", value.asInstanceOf[js.Any])
    
    inline def setIgnoreGlobalUndefined: Self = StObject.set(x, "ignoreGlobal", js.undefined)
    
    inline def setIgnoreTryCatch(value: Boolean | remove | js.Array[String] | (js.Function1[/* id */ String, Boolean | remove])): Self = StObject.set(x, "ignoreTryCatch", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTryCatchFunction1(value: /* id */ String => Boolean | remove): Self = StObject.set(x, "ignoreTryCatch", js.Any.fromFunction1(value))
    
    inline def setIgnoreTryCatchUndefined: Self = StObject.set(x, "ignoreTryCatch", js.undefined)
    
    inline def setIgnoreTryCatchVarargs(value: String*): Self = StObject.set(x, "ignoreTryCatch", js.Array(value*))
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
    
    inline def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setRequireReturnsDefault(
      value: Boolean | auto | preferred | namespace | (js.Function1[/* id */ String, Boolean | auto | preferred | namespace])
    ): Self = StObject.set(x, "requireReturnsDefault", value.asInstanceOf[js.Any])
    
    inline def setRequireReturnsDefaultFunction1(value: /* id */ String => Boolean | auto | preferred | namespace): Self = StObject.set(x, "requireReturnsDefault", js.Any.fromFunction1(value))
    
    inline def setRequireReturnsDefaultUndefined: Self = StObject.set(x, "requireReturnsDefault", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setStrictRequires(value: Boolean | String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "strictRequires", value.asInstanceOf[js.Any])
    
    inline def setStrictRequiresUndefined: Self = StObject.set(x, "strictRequires", js.undefined)
    
    inline def setStrictRequiresVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "strictRequires", js.Array(value*))
    
    inline def setTransformMixedEsModules(value: Boolean): Self = StObject.set(x, "transformMixedEsModules", value.asInstanceOf[js.Any])
    
    inline def setTransformMixedEsModulesUndefined: Self = StObject.set(x, "transformMixedEsModules", js.undefined)
  }
}
