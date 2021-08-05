package typings.stylableCore

import typings.postcss.mod.ProcessOptions
import typings.postcss.mod.Root_
import typings.stylableCore.anon.Dictkey
import typings.stylableCore.anon.OmitTimedCacheOptionscrea
import typings.stylableCore.anon.PartialTransformerOptions
import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.parserMod.CssParser
import typings.stylableCore.stylableCoreStrings.development
import typings.stylableCore.stylableCoreStrings.production
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableResolverMod.StylableResolver
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableCore.typesMod.IStylableOptimizer
import typings.stylableCore.typesMod.ModuleResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableMod {
  
  @JSImport("@stylable/core/cjs/stylable", "Stylable")
  @js.native
  class Stylable protected () extends StObject {
    def this(
      projectRoot: String,
      fileSystem: MinimalFS,
      requireModule: js.Function1[/* path */ String, js.Any],
      delimiter: js.UndefOr[String],
      onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]],
      diagnostics: js.UndefOr[Diagnostics],
      hooks: js.UndefOr[TransformHooks],
      resolveOptions: js.UndefOr[js.Any],
      optimizer: js.UndefOr[IStylableOptimizer],
      mode: js.UndefOr[production | development],
      resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
      timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
      resolveModule: js.UndefOr[ModuleResolver],
      cssParser: js.UndefOr[CssParser]
    ) = this()
    
    def createTransformer(): StylableTransformer = js.native
    def createTransformer(options: PartialTransformerOptions): StylableTransformer = js.native
    
    /* protected */ def cssParser(css: String): Root_ = js.native
    /* protected */ def cssParser(css: String, options: ProcessOptions): Root_ = js.native
    /* protected */ @JSName("cssParser")
    var cssParser_Original: CssParser = js.native
    
    var delimiter: String = js.native
    
    /* protected */ var diagnostics: Diagnostics = js.native
    
    var fileProcessor: FileProcessor[StylableMeta] = js.native
    
    /* protected */ var fileSystem: MinimalFS = js.native
    
    /* protected */ var hooks: TransformHooks = js.native
    
    /* protected */ var mode: production | development = js.native
    
    /* protected */ var onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]] = js.native
    
    var optimizer: js.UndefOr[IStylableOptimizer] = js.native
    
    def process(fullpath: String): StylableMeta = js.native
    def process(fullpath: String, context: String): StylableMeta = js.native
    def process(fullpath: String, context: String, ignoreCache: Boolean): StylableMeta = js.native
    def process(fullpath: String, context: Unit, ignoreCache: Boolean): StylableMeta = js.native
    
    var projectRoot: String = js.native
    
    /* protected */ def requireModule(path: String): js.Any = js.native
    
    /* protected */ var resolveModule: js.UndefOr[ModuleResolver] = js.native
    
    var resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]] = js.native
    
    /* protected */ var resolveOptions: js.Any = js.native
    
    def resolvePath(ctx: String, path: String): String = js.native
    def resolvePath(ctx: Unit, path: String): String = js.native
    
    var resolver: StylableResolver = js.native
    
    /* protected */ var timedCacheOptions: OmitTimedCacheOptionscrea = js.native
    
    def transform(meta: StylableMeta): StylableResults = js.native
    def transform(source: String, resourcePath: String): StylableResults = js.native
  }
  /* static members */
  object Stylable {
    
    @JSImport("@stylable/core/cjs/stylable", "Stylable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(config: StylableConfig): Stylable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[Stylable]
  }
  
  trait StylableConfig extends StObject {
    
    var cssParser: js.UndefOr[CssParser] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var diagnostics: js.UndefOr[Diagnostics] = js.undefined
    
    var fileSystem: MinimalFS
    
    var hooks: js.UndefOr[TransformHooks] = js.undefined
    
    var mode: js.UndefOr[production | development] = js.undefined
    
    var onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]] = js.undefined
    
    var optimizer: js.UndefOr[IStylableOptimizer] = js.undefined
    
    var projectRoot: String
    
    var requireModule: js.UndefOr[js.Function1[/* path */ String, js.Any]] = js.undefined
    
    var resolveModule: js.UndefOr[ModuleResolver] = js.undefined
    
    var resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]] = js.undefined
    
    var resolveOptions: js.UndefOr[Dictkey] = js.undefined
    
    var timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea] = js.undefined
  }
  object StylableConfig {
    
    inline def apply(fileSystem: MinimalFS, projectRoot: String): StylableConfig = {
      val __obj = js.Dynamic.literal(fileSystem = fileSystem.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylableConfig]
    }
    
    extension [Self <: StylableConfig](x: Self) {
      
      inline def setCssParser(value: (/* css */ String, /* options */ js.UndefOr[ProcessOptions]) => Root_): Self = StObject.set(x, "cssParser", js.Any.fromFunction2(value))
      
      inline def setCssParserUndefined: Self = StObject.set(x, "cssParser", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setFileSystem(value: MinimalFS): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: TransformHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setMode(value: production | development): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnProcess(value: (/* meta */ StylableMeta, /* path */ String) => StylableMeta): Self = StObject.set(x, "onProcess", js.Any.fromFunction2(value))
      
      inline def setOnProcessUndefined: Self = StObject.set(x, "onProcess", js.undefined)
      
      inline def setOptimizer(value: IStylableOptimizer): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
      
      inline def setOptimizerUndefined: Self = StObject.set(x, "optimizer", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
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
