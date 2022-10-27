package typings.vitejsPluginReact

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.mod.MatchPattern
import typings.babelCore.mod.MatchPatternContext
import typings.babelCore.mod.PluginItem
import typings.babelCore.mod.TransformCaller
import typings.babelCore.mod.TransformOptions
import typings.babelGenerator.mod.GeneratorOptions
import typings.babelParser.mod.ParserOptions
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Node
import typings.std.Extract
import typings.vite.mod.PluginOption
import typings.vite.mod.ResolvedConfig
import typings.vitejsPluginReact.anon.ParserOptionspluginsExtra
import typings.vitejsPluginReact.anon.ReactBabel
import typings.vitejsPluginReact.anon.Ssr
import typings.vitejsPluginReact.vitejsPluginReactStrings.`upward-optional`
import typings.vitejsPluginReact.vitejsPluginReactStrings.auto
import typings.vitejsPluginReact.vitejsPluginReactStrings.automatic
import typings.vitejsPluginReact.vitejsPluginReactStrings.classic
import typings.vitejsPluginReact.vitejsPluginReactStrings.enter
import typings.vitejsPluginReact.vitejsPluginReactStrings.exit
import typings.vitejsPluginReact.vitejsPluginReactStrings.module
import typings.vitejsPluginReact.vitejsPluginReactStrings.root
import typings.vitejsPluginReact.vitejsPluginReactStrings.script
import typings.vitejsPluginReact.vitejsPluginReactStrings.unambiguous
import typings.vitejsPluginReact.vitejsPluginReactStrings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(): js.Array[PluginOption] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[PluginOption]]
    inline def apply(opts: Options): js.Array[PluginOption] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Array[PluginOption]]
    
    @JSImport("@vitejs/plugin-react", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@vitejs/plugin-react", "default.preambleCode")
    @js.native
    def preambleCode: String = js.native
    inline def preambleCode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preambleCode")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Omit<@babel/core.@babel/core.TransformOptions, 'ast' | 'filename' | 'root' | 'sourceFileName' | 'sourceMaps' | 'inputSourceMap'> */
  trait BabelOptions extends StObject {
    
    var auxiliaryCommentAfter: js.UndefOr[String | Null] = js.undefined
    
    var auxiliaryCommentBefore: js.UndefOr[String | Null] = js.undefined
    
    var babelrc: js.UndefOr[Boolean | Null] = js.undefined
    
    var babelrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern] | Null] = js.undefined
    
    var browserslistConfigFile: js.UndefOr[Boolean | Null] = js.undefined
    
    var browserslistEnv: js.UndefOr[String | Null] = js.undefined
    
    var caller: js.UndefOr[TransformCaller] = js.undefined
    
    var cloneInputAst: js.UndefOr[Boolean | Null] = js.undefined
    
    var code: js.UndefOr[Boolean | Null] = js.undefined
    
    var comments: js.UndefOr[Boolean | Null] = js.undefined
    
    var compact: js.UndefOr[Boolean | auto | Null] = js.undefined
    
    var configFile: js.UndefOr[String | Boolean | Null] = js.undefined
    
    var cwd: js.UndefOr[String | Null] = js.undefined
    
    var env: js.UndefOr[(StringDictionary[js.UndefOr[TransformOptions | Null]]) | Null] = js.undefined
    
    var envName: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
    
    var `extends`: js.UndefOr[String | Null] = js.undefined
    
    var filenameRelative: js.UndefOr[String | Null] = js.undefined
    
    var generatorOpts: js.UndefOr[GeneratorOptions | Null] = js.undefined
    
    var getModuleId: js.UndefOr[(js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]) | Null] = js.undefined
    
    var highlightCode: js.UndefOr[Boolean | Null] = js.undefined
    
    var ignore: js.UndefOr[js.Array[MatchPattern] | Null] = js.undefined
    
    var include: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
    
    var minified: js.UndefOr[Boolean | Null] = js.undefined
    
    var moduleId: js.UndefOr[String | Null] = js.undefined
    
    var moduleIds: js.UndefOr[Boolean | Null] = js.undefined
    
    var moduleRoot: js.UndefOr[String | Null] = js.undefined
    
    var only: js.UndefOr[js.Array[MatchPattern] | Null] = js.undefined
    
    var overrides: js.UndefOr[js.Array[TransformOptions]] = js.undefined
    
    var parserOpts: js.UndefOr[ParserOptions | Null] = js.undefined
    
    var plugins: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
    
    var presets: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
    
    var retainLines: js.UndefOr[Boolean | Null] = js.undefined
    
    var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.undefined
    
    var shouldPrintComment: js.UndefOr[(js.Function1[/* commentContents */ String, Boolean]) | Null] = js.undefined
    
    var sourceRoot: js.UndefOr[String | Null] = js.undefined
    
    var sourceType: js.UndefOr[script | module | unambiguous | Null] = js.undefined
    
    var test: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
    
    var wrapPluginVisitorMethod: js.UndefOr[
        (js.Function3[
          /* pluginAlias */ String, 
          /* visitorType */ enter | exit, 
          /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit], 
          js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit]
        ]) | Null
      ] = js.undefined
  }
  object BabelOptions {
    
    inline def apply(): BabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabelOptions]
    }
    
    extension [Self <: BabelOptions](x: Self) {
      
      inline def setAuxiliaryCommentAfter(value: String): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentAfterNull: Self = StObject.set(x, "auxiliaryCommentAfter", null)
      
      inline def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
      
      inline def setAuxiliaryCommentBefore(value: String): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentBeforeNull: Self = StObject.set(x, "auxiliaryCommentBefore", null)
      
      inline def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
      
      inline def setBabelrc(value: Boolean): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
      
      inline def setBabelrcNull: Self = StObject.set(x, "babelrc", null)
      
      inline def setBabelrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "babelrcRoots", value.asInstanceOf[js.Any])
      
      inline def setBabelrcRootsFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "babelrcRoots", js.Any.fromFunction2(value))
      
      inline def setBabelrcRootsNull: Self = StObject.set(x, "babelrcRoots", null)
      
      inline def setBabelrcRootsUndefined: Self = StObject.set(x, "babelrcRoots", js.undefined)
      
      inline def setBabelrcRootsVarargs(value: MatchPattern*): Self = StObject.set(x, "babelrcRoots", js.Array(value*))
      
      inline def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
      
      inline def setBrowserslistConfigFile(value: Boolean): Self = StObject.set(x, "browserslistConfigFile", value.asInstanceOf[js.Any])
      
      inline def setBrowserslistConfigFileNull: Self = StObject.set(x, "browserslistConfigFile", null)
      
      inline def setBrowserslistConfigFileUndefined: Self = StObject.set(x, "browserslistConfigFile", js.undefined)
      
      inline def setBrowserslistEnv(value: String): Self = StObject.set(x, "browserslistEnv", value.asInstanceOf[js.Any])
      
      inline def setBrowserslistEnvNull: Self = StObject.set(x, "browserslistEnv", null)
      
      inline def setBrowserslistEnvUndefined: Self = StObject.set(x, "browserslistEnv", js.undefined)
      
      inline def setCaller(value: TransformCaller): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
      
      inline def setCloneInputAst(value: Boolean): Self = StObject.set(x, "cloneInputAst", value.asInstanceOf[js.Any])
      
      inline def setCloneInputAstNull: Self = StObject.set(x, "cloneInputAst", null)
      
      inline def setCloneInputAstUndefined: Self = StObject.set(x, "cloneInputAst", js.undefined)
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeNull: Self = StObject.set(x, "code", null)
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsNull: Self = StObject.set(x, "comments", null)
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCompact(value: Boolean | auto): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactNull: Self = StObject.set(x, "compact", null)
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setConfigFile(value: String | Boolean): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileNull: Self = StObject.set(x, "configFile", null)
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdNull: Self = StObject.set(x, "cwd", null)
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: StringDictionary[js.UndefOr[TransformOptions | Null]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvName(value: String): Self = StObject.set(x, "envName", value.asInstanceOf[js.Any])
      
      inline def setEnvNameUndefined: Self = StObject.set(x, "envName", js.undefined)
      
      inline def setEnvNull: Self = StObject.set(x, "env", null)
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExclude(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction2(value))
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: MatchPattern*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsNull: Self = StObject.set(x, "extends", null)
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setFilenameRelative(value: String): Self = StObject.set(x, "filenameRelative", value.asInstanceOf[js.Any])
      
      inline def setFilenameRelativeNull: Self = StObject.set(x, "filenameRelative", null)
      
      inline def setFilenameRelativeUndefined: Self = StObject.set(x, "filenameRelative", js.undefined)
      
      inline def setGeneratorOpts(value: GeneratorOptions): Self = StObject.set(x, "generatorOpts", value.asInstanceOf[js.Any])
      
      inline def setGeneratorOptsNull: Self = StObject.set(x, "generatorOpts", null)
      
      inline def setGeneratorOptsUndefined: Self = StObject.set(x, "generatorOpts", js.undefined)
      
      inline def setGetModuleId(value: /* moduleName */ String => js.UndefOr[String | Null]): Self = StObject.set(x, "getModuleId", js.Any.fromFunction1(value))
      
      inline def setGetModuleIdNull: Self = StObject.set(x, "getModuleId", null)
      
      inline def setGetModuleIdUndefined: Self = StObject.set(x, "getModuleId", js.undefined)
      
      inline def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightCodeNull: Self = StObject.set(x, "highlightCode", null)
      
      inline def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
      
      inline def setIgnore(value: js.Array[MatchPattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: MatchPattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInclude(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction2(value))
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: MatchPattern*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setMinified(value: Boolean): Self = StObject.set(x, "minified", value.asInstanceOf[js.Any])
      
      inline def setMinifiedNull: Self = StObject.set(x, "minified", null)
      
      inline def setMinifiedUndefined: Self = StObject.set(x, "minified", js.undefined)
      
      inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
      
      inline def setModuleIdNull: Self = StObject.set(x, "moduleId", null)
      
      inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
      
      inline def setModuleIds(value: Boolean): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
      
      inline def setModuleIdsNull: Self = StObject.set(x, "moduleIds", null)
      
      inline def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
      
      inline def setModuleRoot(value: String): Self = StObject.set(x, "moduleRoot", value.asInstanceOf[js.Any])
      
      inline def setModuleRootNull: Self = StObject.set(x, "moduleRoot", null)
      
      inline def setModuleRootUndefined: Self = StObject.set(x, "moduleRoot", js.undefined)
      
      inline def setOnly(value: js.Array[MatchPattern]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyNull: Self = StObject.set(x, "only", null)
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOnlyVarargs(value: MatchPattern*): Self = StObject.set(x, "only", js.Array(value*))
      
      inline def setOverrides(value: js.Array[TransformOptions]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setOverridesVarargs(value: TransformOptions*): Self = StObject.set(x, "overrides", js.Array(value*))
      
      inline def setParserOpts(value: ParserOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
      
      inline def setParserOptsNull: Self = StObject.set(x, "parserOpts", null)
      
      inline def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
      
      inline def setPlugins(value: js.Array[PluginItem]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginItem*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPresets(value: js.Array[PluginItem]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsNull: Self = StObject.set(x, "presets", null)
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: PluginItem*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      inline def setRetainLinesNull: Self = StObject.set(x, "retainLines", null)
      
      inline def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      inline def setRootMode(value: root | upward | `upward-optional`): Self = StObject.set(x, "rootMode", value.asInstanceOf[js.Any])
      
      inline def setRootModeUndefined: Self = StObject.set(x, "rootMode", js.undefined)
      
      inline def setShouldPrintComment(value: /* commentContents */ String => Boolean): Self = StObject.set(x, "shouldPrintComment", js.Any.fromFunction1(value))
      
      inline def setShouldPrintCommentNull: Self = StObject.set(x, "shouldPrintComment", null)
      
      inline def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootNull: Self = StObject.set(x, "sourceRoot", null)
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setTest(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: MatchPattern*): Self = StObject.set(x, "test", js.Array(value*))
      
      inline def setWrapPluginVisitorMethod(
        value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit]) => js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit]
      ): Self = StObject.set(x, "wrapPluginVisitorMethod", js.Any.fromFunction3(value))
      
      inline def setWrapPluginVisitorMethodNull: Self = StObject.set(x, "wrapPluginVisitorMethod", null)
      
      inline def setWrapPluginVisitorMethodUndefined: Self = StObject.set(x, "wrapPluginVisitorMethod", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Babel configuration applied in both dev and prod.
      */
    var babel: js.UndefOr[BabelOptions | (js.Function2[/* id */ String, /* options */ Ssr, BabelOptions])] = js.undefined
    
    var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    /**
      * Enable `react-refresh` integration. Vite disables this in prod env or build mode.
      * @default true
      */
    var fastRefresh: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    /**
      * Control where the JSX factory is imported from.
      * This option is ignored when `jsxRuntime` is not `"automatic"`.
      * @default "react"
      */
    var jsxImportSource: js.UndefOr[String] = js.undefined
    
    /**
      * Set this to `true` to annotate the JSX factory with `\/ * @__PURE__ *\/`.
      * This option is ignored when `jsxRuntime` is not `"automatic"`.
      * @default true
      */
    var jsxPure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set this to `"automatic"` to use [vite-react-jsx](https://github.com/alloc/vite-react-jsx).
      * @default "automatic"
      */
    var jsxRuntime: js.UndefOr[classic | automatic] = js.undefined
    
    /**
      * Toggles whether or not to throw an error if an XML namespaced tag name is used.
      * @default true
      */
    var jsxThrowIfNamespace: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBabel(value: BabelOptions | (js.Function2[/* id */ String, /* options */ Ssr, BabelOptions])): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      inline def setBabelFunction2(value: (/* id */ String, /* options */ Ssr) => BabelOptions): Self = StObject.set(x, "babel", js.Any.fromFunction2(value))
      
      inline def setBabelUndefined: Self = StObject.set(x, "babel", js.undefined)
      
      inline def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFastRefresh(value: Boolean): Self = StObject.set(x, "fastRefresh", value.asInstanceOf[js.Any])
      
      inline def setFastRefreshUndefined: Self = StObject.set(x, "fastRefresh", js.undefined)
      
      inline def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      inline def setJsxPure(value: Boolean): Self = StObject.set(x, "jsxPure", value.asInstanceOf[js.Any])
      
      inline def setJsxPureUndefined: Self = StObject.set(x, "jsxPure", js.undefined)
      
      inline def setJsxRuntime(value: classic | automatic): Self = StObject.set(x, "jsxRuntime", value.asInstanceOf[js.Any])
      
      inline def setJsxRuntimeUndefined: Self = StObject.set(x, "jsxRuntime", js.undefined)
      
      inline def setJsxThrowIfNamespace(value: Boolean): Self = StObject.set(x, "jsxThrowIfNamespace", value.asInstanceOf[js.Any])
      
      inline def setJsxThrowIfNamespaceUndefined: Self = StObject.set(x, "jsxThrowIfNamespace", js.undefined)
    }
  }
  
  type ReactBabelHook = js.Function3[
    /* babelConfig */ ReactBabelOptions, 
    /* context */ ReactBabelHookContext, 
    /* config */ ResolvedConfig, 
    Unit
  ]
  
  trait ReactBabelHookContext extends StObject {
    
    var id: String
    
    var ssr: Boolean
  }
  object ReactBabelHookContext {
    
    inline def apply(id: String, ssr: Boolean): ReactBabelHookContext = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ssr = ssr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactBabelHookContext]
    }
    
    extension [Self <: ReactBabelHookContext](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The object type used by the `options` passed to plugins with
    * an `api.reactBabel` method.
    */
  trait ReactBabelOptions
    extends StObject
       with BabelOptions {
    
    @JSName("overrides")
    var overrides_ReactBabelOptions: Extract[js.UndefOr[js.Array[TransformOptions]], js.Array[Any]]
    
    @JSName("parserOpts")
    var parserOpts_ReactBabelOptions: ParserOptionspluginsExtra
    
    @JSName("plugins")
    var plugins_ReactBabelOptions: Extract[js.UndefOr[js.Array[PluginItem] | Null], js.Array[Any]]
    
    @JSName("presets")
    var presets_ReactBabelOptions: Extract[js.UndefOr[js.Array[PluginItem] | Null], js.Array[Any]]
  }
  object ReactBabelOptions {
    
    inline def apply(
      overrides: Extract[js.UndefOr[js.Array[TransformOptions]], js.Array[Any]],
      parserOpts: ParserOptionspluginsExtra,
      plugins: Extract[js.UndefOr[js.Array[PluginItem] | Null], js.Array[Any]],
      presets: Extract[js.UndefOr[js.Array[PluginItem] | Null], js.Array[Any]]
    ): ReactBabelOptions = {
      val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any], parserOpts = parserOpts.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], presets = presets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactBabelOptions]
    }
    
    extension [Self <: ReactBabelOptions](x: Self) {
      
      inline def setOverrides(value: Extract[js.UndefOr[js.Array[TransformOptions]], js.Array[Any]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setParserOpts(value: ParserOptionspluginsExtra): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: Extract[js.UndefOr[js.Array[PluginItem] | Null], js.Array[Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPresets(value: Extract[js.UndefOr[js.Array[PluginItem] | Null], js.Array[Any]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object viteAugmentingMod {
    
    trait Plugin extends StObject {
      
      var api: js.UndefOr[ReactBabel] = js.undefined
    }
    object Plugin {
      
      inline def apply(): Plugin = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Plugin]
      }
      
      extension [Self <: Plugin](x: Self) {
        
        inline def setApi(value: ReactBabel): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
        
        inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      }
    }
  }
}
