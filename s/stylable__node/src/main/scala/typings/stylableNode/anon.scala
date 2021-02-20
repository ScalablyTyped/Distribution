package typings.stylableNode

import typings.postcss.mod.ProcessOptions
import typings.postcss.mod.Root_
import typings.std.Error
import typings.stylableCore.anon.Cwd
import typings.stylableCore.anon.Dictkey
import typings.stylableCore.anon.Dirname
import typings.stylableCore.anon.OmitTimedCacheOptionscrea
import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.parserMod.CssParser
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableCore.typesMod.IStylableOptimizer
import typings.stylableCore.typesMod.ModuleResolver
import typings.stylableNode.stylableNodeStrings.development
import typings.stylableNode.stylableNodeStrings.production
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Errors extends StObject {
    
    var errors: js.Array[Error] = js.native
    
    var result: js.Array[String] = js.native
  }
  object Errors {
    
    @scala.inline
    def apply(errors: js.Array[Error], result: js.Array[String]): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setResult(value: js.Array[String]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultVarargs(value: String*): Self = StObject.set(x, "result", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(
      findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
      loadConfig: js.Function1[/* filePath */ String, js.Object],
      hasDirnameRelative: Dirname
    ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
    def apply(
      findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
      loadConfig: js.Function1[/* filePath */ String, js.Object],
      hasDirnameRelative: Dirname,
      hashSalt: js.UndefOr[scala.Nothing],
      prefix: js.UndefOr[scala.Nothing],
      normalizeVersion: js.Function1[/* semver */ String, String]
    ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
    def apply(
      findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
      loadConfig: js.Function1[/* filePath */ String, js.Object],
      hasDirnameRelative: Dirname,
      hashSalt: js.UndefOr[scala.Nothing],
      prefix: String
    ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
    def apply(
      findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
      loadConfig: js.Function1[/* filePath */ String, js.Object],
      hasDirnameRelative: Dirname,
      hashSalt: js.UndefOr[scala.Nothing],
      prefix: String,
      normalizeVersion: js.Function1[/* semver */ String, String]
    ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
    def apply(
      findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
      loadConfig: js.Function1[/* filePath */ String, js.Object],
      hasDirnameRelative: Dirname,
      hashSalt: String
    ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
    def apply(
      findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
      loadConfig: js.Function1[/* filePath */ String, js.Object],
      hasDirnameRelative: Dirname,
      hashSalt: String,
      prefix: js.UndefOr[scala.Nothing],
      normalizeVersion: js.Function1[/* semver */ String, String]
    ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
    def apply(
      findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
      loadConfig: js.Function1[/* filePath */ String, js.Object],
      hasDirnameRelative: Dirname,
      hashSalt: String,
      prefix: String
    ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
    def apply(
      findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
      loadConfig: js.Function1[/* filePath */ String, js.Object],
      hasDirnameRelative: Dirname,
      hashSalt: String,
      prefix: String,
      normalizeVersion: js.Function1[/* semver */ String, String]
    ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  }
  
  /* Inlined std.Partial<@stylable/node.@stylable/node/cjs/require-hook.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var afterCompile: js.UndefOr[js.Function2[/* code */ String, /* filename */ String, String]] = js.native
    
    var ignoreJSModules: js.UndefOr[Boolean] = js.native
    
    var matcher: js.UndefOr[js.Function1[/* filename */ String, Boolean]] = js.native
    
    var runtimePath: js.UndefOr[String] = js.native
    
    var stylableConfig: js.UndefOr[PartialStylableConfig] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterCompile(value: (/* code */ String, /* filename */ String) => String): Self = StObject.set(x, "afterCompile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterCompileUndefined: Self = StObject.set(x, "afterCompile", js.undefined)
      
      @scala.inline
      def setIgnoreJSModules(value: Boolean): Self = StObject.set(x, "ignoreJSModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreJSModulesUndefined: Self = StObject.set(x, "ignoreJSModules", js.undefined)
      
      @scala.inline
      def setMatcher(value: /* filename */ String => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
      
      @scala.inline
      def setRuntimePath(value: String): Self = StObject.set(x, "runtimePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimePathUndefined: Self = StObject.set(x, "runtimePath", js.undefined)
      
      @scala.inline
      def setStylableConfig(value: PartialStylableConfig): Self = StObject.set(x, "stylableConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylableConfigUndefined: Self = StObject.set(x, "stylableConfig", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@stylable/core.@stylable/core.StylableConfig> */
  @js.native
  trait PartialStylableConfig extends StObject {
    
    var cssParser: js.UndefOr[CssParser] = js.native
    
    var delimiter: js.UndefOr[String] = js.native
    
    var diagnostics: js.UndefOr[Diagnostics] = js.native
    
    var fileSystem: js.UndefOr[MinimalFS] = js.native
    
    var hooks: js.UndefOr[TransformHooks] = js.native
    
    var mode: js.UndefOr[production | development] = js.native
    
    var onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]] = js.native
    
    var optimizer: js.UndefOr[IStylableOptimizer] = js.native
    
    var projectRoot: js.UndefOr[String] = js.native
    
    var requireModule: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
    
    var resolveModule: js.UndefOr[ModuleResolver] = js.native
    
    var resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]] = js.native
    
    var resolveOptions: js.UndefOr[Dictkey] = js.native
    
    var timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea] = js.native
  }
  object PartialStylableConfig {
    
    @scala.inline
    def apply(): PartialStylableConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStylableConfig]
    }
    
    @scala.inline
    implicit class PartialStylableConfigMutableBuilder[Self <: PartialStylableConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssParser(value: (/* css */ String, /* options */ js.UndefOr[ProcessOptions]) => Root_): Self = StObject.set(x, "cssParser", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCssParserUndefined: Self = StObject.set(x, "cssParser", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      @scala.inline
      def setFileSystem(value: MinimalFS): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemUndefined: Self = StObject.set(x, "fileSystem", js.undefined)
      
      @scala.inline
      def setHooks(value: TransformHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      @scala.inline
      def setMode(value: production | development): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnProcess(value: (/* meta */ StylableMeta, /* path */ String) => StylableMeta): Self = StObject.set(x, "onProcess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnProcessUndefined: Self = StObject.set(x, "onProcess", js.undefined)
      
      @scala.inline
      def setOptimizer(value: IStylableOptimizer): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizerUndefined: Self = StObject.set(x, "optimizer", js.undefined)
      
      @scala.inline
      def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      @scala.inline
      def setRequireModule(value: /* path */ String => _): Self = StObject.set(x, "requireModule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequireModuleUndefined: Self = StObject.set(x, "requireModule", js.undefined)
      
      @scala.inline
      def setResolveModule(value: (/* directoryPath */ String, /* request */ String) => String): Self = StObject.set(x, "resolveModule", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolveModuleUndefined: Self = StObject.set(x, "resolveModule", js.undefined)
      
      @scala.inline
      def setResolveNamespace(value: (/* namespace */ String, /* source */ String) => String): Self = StObject.set(x, "resolveNamespace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolveNamespaceUndefined: Self = StObject.set(x, "resolveNamespace", js.undefined)
      
      @scala.inline
      def setResolveOptions(value: Dictkey): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveOptionsUndefined: Self = StObject.set(x, "resolveOptions", js.undefined)
      
      @scala.inline
      def setTimedCacheOptions(value: OmitTimedCacheOptionscrea): Self = StObject.set(x, "timedCacheOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimedCacheOptionsUndefined: Self = StObject.set(x, "timedCacheOptions", js.undefined)
    }
  }
}
