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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Instrument extends StObject {
    
    var instrument: Boolean
  }
  object Instrument {
    
    inline def apply(instrument: Boolean): Instrument = {
      val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instrument]
    }
    
    extension [Self <: Instrument](x: Self) {
      
      inline def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@stylable/module-utils.@stylable/module-utils.Options> */
  trait PartialOptions extends StObject {
    
    var injectCSS: js.UndefOr[Boolean] = js.undefined
    
    var renderableOnly: js.UndefOr[Boolean] = js.undefined
    
    var runtimePath: js.UndefOr[String] = js.undefined
    
    var runtimeStylesheetId: js.UndefOr[module | namespace] = js.undefined
    
    var staticImports: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setInjectCSS(value: Boolean): Self = StObject.set(x, "injectCSS", value.asInstanceOf[js.Any])
      
      inline def setInjectCSSUndefined: Self = StObject.set(x, "injectCSS", js.undefined)
      
      inline def setRenderableOnly(value: Boolean): Self = StObject.set(x, "renderableOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderableOnlyUndefined: Self = StObject.set(x, "renderableOnly", js.undefined)
      
      inline def setRuntimePath(value: String): Self = StObject.set(x, "runtimePath", value.asInstanceOf[js.Any])
      
      inline def setRuntimePathUndefined: Self = StObject.set(x, "runtimePath", js.undefined)
      
      inline def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
      
      inline def setRuntimeStylesheetIdUndefined: Self = StObject.set(x, "runtimeStylesheetId", js.undefined)
      
      inline def setStaticImports(value: js.Array[String]): Self = StObject.set(x, "staticImports", value.asInstanceOf[js.Any])
      
      inline def setStaticImportsUndefined: Self = StObject.set(x, "staticImports", js.undefined)
      
      inline def setStaticImportsVarargs(value: String*): Self = StObject.set(x, "staticImports", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<@stylable/core.@stylable/core.StylableConfig> */
  trait PartialStylableConfig extends StObject {
    
    var cssParser: js.UndefOr[CssParser] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var diagnostics: js.UndefOr[Diagnostics] = js.undefined
    
    var fileSystem: js.UndefOr[MinimalFS] = js.undefined
    
    var hooks: js.UndefOr[TransformHooks] = js.undefined
    
    var mode: js.UndefOr[production | development] = js.undefined
    
    var onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]] = js.undefined
    
    var optimizer: js.UndefOr[IStylableOptimizer] = js.undefined
    
    var projectRoot: js.UndefOr[String] = js.undefined
    
    var requireModule: js.UndefOr[js.Function1[/* path */ String, js.Any]] = js.undefined
    
    var resolveModule: js.UndefOr[ModuleResolver] = js.undefined
    
    var resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]] = js.undefined
    
    var resolveOptions: js.UndefOr[Dictkey] = js.undefined
    
    var timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea] = js.undefined
  }
  object PartialStylableConfig {
    
    inline def apply(): PartialStylableConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStylableConfig]
    }
    
    extension [Self <: PartialStylableConfig](x: Self) {
      
      inline def setCssParser(value: (/* css */ String, /* options */ js.UndefOr[ProcessOptions]) => Root_): Self = StObject.set(x, "cssParser", js.Any.fromFunction2(value))
      
      inline def setCssParserUndefined: Self = StObject.set(x, "cssParser", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setFileSystem(value: MinimalFS): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemUndefined: Self = StObject.set(x, "fileSystem", js.undefined)
      
      inline def setHooks(value: TransformHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setMode(value: production | development): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnProcess(value: (/* meta */ StylableMeta, /* path */ String) => StylableMeta): Self = StObject.set(x, "onProcess", js.Any.fromFunction2(value))
      
      inline def setOnProcessUndefined: Self = StObject.set(x, "onProcess", js.undefined)
      
      inline def setOptimizer(value: IStylableOptimizer): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
      
      inline def setOptimizerUndefined: Self = StObject.set(x, "optimizer", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      inline def setRequireModule(value: /* path */ String => js.Any): Self = StObject.set(x, "requireModule", js.Any.fromFunction1(value))
      
      inline def setRequireModuleUndefined: Self = StObject.set(x, "requireModule", js.undefined)
      
      inline def setResolveModule(value: (/* directoryPath */ String, /* request */ String) => String): Self = StObject.set(x, "resolveModule", js.Any.fromFunction2(value))
      
      inline def setResolveModuleUndefined: Self = StObject.set(x, "resolveModule", js.undefined)
      
      inline def setResolveNamespace(value: (/* namespace */ String, /* source */ String) => String): Self = StObject.set(x, "resolveNamespace", js.Any.fromFunction2(value))
      
      inline def setResolveNamespaceUndefined: Self = StObject.set(x, "resolveNamespace", js.undefined)
      
      inline def setResolveOptions(value: Dictkey): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
      
      inline def setResolveOptionsUndefined: Self = StObject.set(x, "resolveOptions", js.undefined)
      
      inline def setTimedCacheOptions(value: OmitTimedCacheOptionscrea): Self = StObject.set(x, "timedCacheOptions", value.asInstanceOf[js.Any])
      
      inline def setTimedCacheOptionsUndefined: Self = StObject.set(x, "timedCacheOptions", js.undefined)
    }
  }
}
