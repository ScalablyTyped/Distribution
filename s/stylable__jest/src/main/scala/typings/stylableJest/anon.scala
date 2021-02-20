package typings.stylableJest

import typings.postcss.mod.ProcessOptions
import typings.postcss.mod.Root_
import typings.stylableCore.anon.Dictkey
import typings.stylableCore.anon.OmitTimedCacheOptionscrea
import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.parserMod.CssParser
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableCore.typesMod.IStylableOptimizer
import typings.stylableCore.typesMod.ModuleResolver
import typings.stylableJest.stylableJestStrings.development
import typings.stylableJest.stylableJestStrings.module
import typings.stylableJest.stylableJestStrings.namespace
import typings.stylableJest.stylableJestStrings.production
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instrument extends StObject {
    
    var instrument: Boolean = js.native
  }
  object Instrument {
    
    @scala.inline
    def apply(instrument: Boolean): Instrument = {
      val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instrument]
    }
    
    @scala.inline
    implicit class InstrumentMutableBuilder[Self <: Instrument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@stylable/module-utils.@stylable/module-utils.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var injectCSS: js.UndefOr[Boolean] = js.native
    
    var renderableOnly: js.UndefOr[Boolean] = js.native
    
    var runtimePath: js.UndefOr[String] = js.native
    
    var runtimeStylesheetId: js.UndefOr[module | namespace] = js.native
    
    var staticImports: js.UndefOr[js.Array[String]] = js.native
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
      def setInjectCSS(value: Boolean): Self = StObject.set(x, "injectCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectCSSUndefined: Self = StObject.set(x, "injectCSS", js.undefined)
      
      @scala.inline
      def setRenderableOnly(value: Boolean): Self = StObject.set(x, "renderableOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderableOnlyUndefined: Self = StObject.set(x, "renderableOnly", js.undefined)
      
      @scala.inline
      def setRuntimePath(value: String): Self = StObject.set(x, "runtimePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimePathUndefined: Self = StObject.set(x, "runtimePath", js.undefined)
      
      @scala.inline
      def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeStylesheetIdUndefined: Self = StObject.set(x, "runtimeStylesheetId", js.undefined)
      
      @scala.inline
      def setStaticImports(value: js.Array[String]): Self = StObject.set(x, "staticImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticImportsUndefined: Self = StObject.set(x, "staticImports", js.undefined)
      
      @scala.inline
      def setStaticImportsVarargs(value: String*): Self = StObject.set(x, "staticImports", js.Array(value :_*))
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
