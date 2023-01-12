package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.`lazy-once`
import typings.webpack.webpackStrings.`lazy`
import typings.webpack.webpackStrings.auto
import typings.webpack.webpackStrings.eager
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.relative
import typings.webpack.webpackStrings.warn
import typings.webpack.webpackStrings.weak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parser options for javascript modules.
  */
trait JavascriptParserOptions
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  /**
  	 * Set the value of `require.amd` and `define.amd`. Or disable AMD support.
  	 */
  var amd: js.UndefOr[`false` | StringDictionary[Any]] = js.undefined
  
  /**
  	 * Enable/disable special handling for browserify bundles.
  	 */
  var browserify: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable parsing of CommonJs syntax.
  	 */
  var commonjs: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable parsing of magic comments in CommonJs syntax.
  	 */
  var commonjsMagicComments: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable parsing "import { createRequire } from "module"" and evaluating createRequire().
  	 */
  var createRequire: js.UndefOr[String | Boolean] = js.undefined
  
  /**
  	 * Specifies global mode for dynamic import.
  	 */
  var dynamicImportMode: js.UndefOr[weak | eager | `lazy` | `lazy-once`] = js.undefined
  
  /**
  	 * Specifies global prefetch for dynamic import.
  	 */
  var dynamicImportPrefetch: js.UndefOr[Double | Boolean] = js.undefined
  
  /**
  	 * Specifies global preload for dynamic import.
  	 */
  var dynamicImportPreload: js.UndefOr[Double | Boolean] = js.undefined
  
  /**
  	 * Specifies the behavior of invalid export names in "import ... from ..." and "export ... from ...".
  	 */
  var exportsPresence: js.UndefOr[`false` | auto | error | warn] = js.undefined
  
  /**
  	 * Enable warnings for full dynamic dependencies.
  	 */
  var exprContextCritical: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable recursive directory lookup for full dynamic dependencies.
  	 */
  var exprContextRecursive: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Sets the default regular expression for full dynamic dependencies.
  	 */
  var exprContextRegExp: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  /**
  	 * Set the default request for full dynamic dependencies.
  	 */
  var exprContextRequest: js.UndefOr[String] = js.undefined
  
  /**
  	 * Enable/disable parsing of EcmaScript Modules syntax.
  	 */
  var harmony: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable parsing of import() syntax.
  	 */
  var `import`: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Specifies the behavior of invalid export names in "import ... from ...".
  	 */
  var importExportsPresence: js.UndefOr[`false` | auto | error | warn] = js.undefined
  
  /**
  	 * Enable/disable evaluating import.meta.
  	 */
  var importMeta: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable evaluating import.meta.webpackContext.
  	 */
  var importMetaContext: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Include polyfills or mocks for various node stuff.
  	 */
  var node: js.UndefOr[`false` | NodeOptions] = js.undefined
  
  /**
  	 * Specifies the behavior of invalid export names in "export ... from ...". This might be useful to disable during the migration from "export ... from ..." to "export type ... from ..." when reexporting types in TypeScript.
  	 */
  var reexportExportsPresence: js.UndefOr[`false` | auto | error | warn] = js.undefined
  
  /**
  	 * Enable/disable parsing of require.context syntax.
  	 */
  var requireContext: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable parsing of require.ensure syntax.
  	 */
  var requireEnsure: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable parsing of require.include syntax.
  	 */
  var requireInclude: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable parsing of require.js special syntax like require.config, requirejs.config, require.version and requirejs.onError.
  	 */
  var requireJs: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Deprecated in favor of "exportsPresence". Emit errors instead of warnings when imported names don't exist in imported module.
  	 */
  var strictExportPresence: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Handle the this context correctly according to the spec for namespace objects.
  	 */
  var strictThisContextOnImports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable/disable parsing of System.js special syntax like System.import, System.get, System.set and System.register.
  	 */
  var system: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable warnings when using the require function in a not statically analyse-able way.
  	 */
  var unknownContextCritical: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable recursive directory lookup when using the require function in a not statically analyse-able way.
  	 */
  var unknownContextRecursive: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Sets the regular expression when using the require function in a not statically analyse-able way.
  	 */
  var unknownContextRegExp: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  /**
  	 * Sets the request when using the require function in a not statically analyse-able way.
  	 */
  var unknownContextRequest: js.UndefOr[String] = js.undefined
  
  /**
  	 * Enable/disable parsing of new URL() syntax.
  	 */
  var url: js.UndefOr[Boolean | relative] = js.undefined
  
  /**
  	 * Disable or configure parsing of WebWorker syntax like new Worker() or navigator.serviceWorker.register().
  	 */
  var worker: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /**
  	 * Enable warnings for partial dynamic dependencies.
  	 */
  var wrappedContextCritical: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable recursive directory lookup for partial dynamic dependencies.
  	 */
  var wrappedContextRecursive: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Set the inner regular expression for partial dynamic dependencies.
  	 */
  var wrappedContextRegExp: js.UndefOr[js.RegExp] = js.undefined
}
object JavascriptParserOptions {
  
  inline def apply(): JavascriptParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JavascriptParserOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JavascriptParserOptions] (val x: Self) extends AnyVal {
    
    inline def setAmd(value: `false` | StringDictionary[Any]): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    inline def setBrowserify(value: Boolean): Self = StObject.set(x, "browserify", value.asInstanceOf[js.Any])
    
    inline def setBrowserifyUndefined: Self = StObject.set(x, "browserify", js.undefined)
    
    inline def setCommonjs(value: Boolean): Self = StObject.set(x, "commonjs", value.asInstanceOf[js.Any])
    
    inline def setCommonjsMagicComments(value: Boolean): Self = StObject.set(x, "commonjsMagicComments", value.asInstanceOf[js.Any])
    
    inline def setCommonjsMagicCommentsUndefined: Self = StObject.set(x, "commonjsMagicComments", js.undefined)
    
    inline def setCommonjsUndefined: Self = StObject.set(x, "commonjs", js.undefined)
    
    inline def setCreateRequire(value: String | Boolean): Self = StObject.set(x, "createRequire", value.asInstanceOf[js.Any])
    
    inline def setCreateRequireUndefined: Self = StObject.set(x, "createRequire", js.undefined)
    
    inline def setDynamicImportMode(value: weak | eager | `lazy` | `lazy-once`): Self = StObject.set(x, "dynamicImportMode", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportModeUndefined: Self = StObject.set(x, "dynamicImportMode", js.undefined)
    
    inline def setDynamicImportPrefetch(value: Double | Boolean): Self = StObject.set(x, "dynamicImportPrefetch", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportPrefetchUndefined: Self = StObject.set(x, "dynamicImportPrefetch", js.undefined)
    
    inline def setDynamicImportPreload(value: Double | Boolean): Self = StObject.set(x, "dynamicImportPreload", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportPreloadUndefined: Self = StObject.set(x, "dynamicImportPreload", js.undefined)
    
    inline def setExportsPresence(value: `false` | auto | error | warn): Self = StObject.set(x, "exportsPresence", value.asInstanceOf[js.Any])
    
    inline def setExportsPresenceUndefined: Self = StObject.set(x, "exportsPresence", js.undefined)
    
    inline def setExprContextCritical(value: Boolean): Self = StObject.set(x, "exprContextCritical", value.asInstanceOf[js.Any])
    
    inline def setExprContextCriticalUndefined: Self = StObject.set(x, "exprContextCritical", js.undefined)
    
    inline def setExprContextRecursive(value: Boolean): Self = StObject.set(x, "exprContextRecursive", value.asInstanceOf[js.Any])
    
    inline def setExprContextRecursiveUndefined: Self = StObject.set(x, "exprContextRecursive", js.undefined)
    
    inline def setExprContextRegExp(value: Boolean | js.RegExp): Self = StObject.set(x, "exprContextRegExp", value.asInstanceOf[js.Any])
    
    inline def setExprContextRegExpUndefined: Self = StObject.set(x, "exprContextRegExp", js.undefined)
    
    inline def setExprContextRequest(value: String): Self = StObject.set(x, "exprContextRequest", value.asInstanceOf[js.Any])
    
    inline def setExprContextRequestUndefined: Self = StObject.set(x, "exprContextRequest", js.undefined)
    
    inline def setHarmony(value: Boolean): Self = StObject.set(x, "harmony", value.asInstanceOf[js.Any])
    
    inline def setHarmonyUndefined: Self = StObject.set(x, "harmony", js.undefined)
    
    inline def setImport(value: Boolean): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportExportsPresence(value: `false` | auto | error | warn): Self = StObject.set(x, "importExportsPresence", value.asInstanceOf[js.Any])
    
    inline def setImportExportsPresenceUndefined: Self = StObject.set(x, "importExportsPresence", js.undefined)
    
    inline def setImportMeta(value: Boolean): Self = StObject.set(x, "importMeta", value.asInstanceOf[js.Any])
    
    inline def setImportMetaContext(value: Boolean): Self = StObject.set(x, "importMetaContext", value.asInstanceOf[js.Any])
    
    inline def setImportMetaContextUndefined: Self = StObject.set(x, "importMetaContext", js.undefined)
    
    inline def setImportMetaUndefined: Self = StObject.set(x, "importMeta", js.undefined)
    
    inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    
    inline def setNode(value: `false` | NodeOptions): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setReexportExportsPresence(value: `false` | auto | error | warn): Self = StObject.set(x, "reexportExportsPresence", value.asInstanceOf[js.Any])
    
    inline def setReexportExportsPresenceUndefined: Self = StObject.set(x, "reexportExportsPresence", js.undefined)
    
    inline def setRequireContext(value: Boolean): Self = StObject.set(x, "requireContext", value.asInstanceOf[js.Any])
    
    inline def setRequireContextUndefined: Self = StObject.set(x, "requireContext", js.undefined)
    
    inline def setRequireEnsure(value: Boolean): Self = StObject.set(x, "requireEnsure", value.asInstanceOf[js.Any])
    
    inline def setRequireEnsureUndefined: Self = StObject.set(x, "requireEnsure", js.undefined)
    
    inline def setRequireInclude(value: Boolean): Self = StObject.set(x, "requireInclude", value.asInstanceOf[js.Any])
    
    inline def setRequireIncludeUndefined: Self = StObject.set(x, "requireInclude", js.undefined)
    
    inline def setRequireJs(value: Boolean): Self = StObject.set(x, "requireJs", value.asInstanceOf[js.Any])
    
    inline def setRequireJsUndefined: Self = StObject.set(x, "requireJs", js.undefined)
    
    inline def setStrictExportPresence(value: Boolean): Self = StObject.set(x, "strictExportPresence", value.asInstanceOf[js.Any])
    
    inline def setStrictExportPresenceUndefined: Self = StObject.set(x, "strictExportPresence", js.undefined)
    
    inline def setStrictThisContextOnImports(value: Boolean): Self = StObject.set(x, "strictThisContextOnImports", value.asInstanceOf[js.Any])
    
    inline def setStrictThisContextOnImportsUndefined: Self = StObject.set(x, "strictThisContextOnImports", js.undefined)
    
    inline def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setUnknownContextCritical(value: Boolean): Self = StObject.set(x, "unknownContextCritical", value.asInstanceOf[js.Any])
    
    inline def setUnknownContextCriticalUndefined: Self = StObject.set(x, "unknownContextCritical", js.undefined)
    
    inline def setUnknownContextRecursive(value: Boolean): Self = StObject.set(x, "unknownContextRecursive", value.asInstanceOf[js.Any])
    
    inline def setUnknownContextRecursiveUndefined: Self = StObject.set(x, "unknownContextRecursive", js.undefined)
    
    inline def setUnknownContextRegExp(value: Boolean | js.RegExp): Self = StObject.set(x, "unknownContextRegExp", value.asInstanceOf[js.Any])
    
    inline def setUnknownContextRegExpUndefined: Self = StObject.set(x, "unknownContextRegExp", js.undefined)
    
    inline def setUnknownContextRequest(value: String): Self = StObject.set(x, "unknownContextRequest", value.asInstanceOf[js.Any])
    
    inline def setUnknownContextRequestUndefined: Self = StObject.set(x, "unknownContextRequest", js.undefined)
    
    inline def setUrl(value: Boolean | relative): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWorker(value: Boolean | js.Array[String]): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    
    inline def setWorkerVarargs(value: String*): Self = StObject.set(x, "worker", js.Array(value*))
    
    inline def setWrappedContextCritical(value: Boolean): Self = StObject.set(x, "wrappedContextCritical", value.asInstanceOf[js.Any])
    
    inline def setWrappedContextCriticalUndefined: Self = StObject.set(x, "wrappedContextCritical", js.undefined)
    
    inline def setWrappedContextRecursive(value: Boolean): Self = StObject.set(x, "wrappedContextRecursive", value.asInstanceOf[js.Any])
    
    inline def setWrappedContextRecursiveUndefined: Self = StObject.set(x, "wrappedContextRecursive", js.undefined)
    
    inline def setWrappedContextRegExp(value: js.RegExp): Self = StObject.set(x, "wrappedContextRegExp", value.asInstanceOf[js.Any])
    
    inline def setWrappedContextRegExpUndefined: Self = StObject.set(x, "wrappedContextRegExp", js.undefined)
  }
}
