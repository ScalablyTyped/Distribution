package typings.webpackBlocksTypescript

import typings.webpackBlocksTypescript.anon.Modules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  @scala.inline
  def apply(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@webpack-blocks/typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BabelOptions extends StObject {
    
    var babelrc: js.UndefOr[Boolean] = js.undefined
    
    var presets: js.UndefOr[js.Array[js.Array[Modules | String]]] = js.undefined
  }
  object BabelOptions {
    
    @scala.inline
    def apply(): BabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabelOptions]
    }
    
    @scala.inline
    implicit class BabelOptionsMutableBuilder[Self <: BabelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabelrc(value: Boolean): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
      
      @scala.inline
      def setPresets(value: js.Array[js.Array[Modules | String]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: (js.Array[Modules | String])*): Self = StObject.set(x, "presets", js.Array(value :_*))
    }
  }
  
  type CustomTransformersFunction = js.Function1[/* program */ js.Any, js.Any]
  
  trait Options extends StObject {
    
    var babelCore: js.UndefOr[String] = js.undefined
    
    var babelOptions: js.UndefOr[BabelOptions] = js.undefined
    
    var cacheDirectory: js.UndefOr[String] = js.undefined
    
    var compiler: js.UndefOr[String] = js.undefined
    
    var configFileName: js.UndefOr[String] = js.undefined
    
    var errorsAsWarnings: js.UndefOr[Boolean] = js.undefined
    
    var forceIsolatedModules: js.UndefOr[Boolean] = js.undefined
    
    var getCustomTransformers: js.UndefOr[String | CustomTransformersFunction] = js.undefined
    
    var ignoreDiagnostics: js.UndefOr[js.Array[Double]] = js.undefined
    
    var instance: js.UndefOr[String] = js.undefined
    
    var reportFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var transpileOnly: js.UndefOr[Boolean] = js.undefined
    
    var useBabel: js.UndefOr[Boolean] = js.undefined
    
    var useCache: js.UndefOr[Boolean] = js.undefined
    
    var usePrecompiledFiles: js.UndefOr[Boolean] = js.undefined
    
    var useTranspileModule: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabelCore(value: String): Self = StObject.set(x, "babelCore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabelCoreUndefined: Self = StObject.set(x, "babelCore", js.undefined)
      
      @scala.inline
      def setBabelOptions(value: BabelOptions): Self = StObject.set(x, "babelOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabelOptionsUndefined: Self = StObject.set(x, "babelOptions", js.undefined)
      
      @scala.inline
      def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      @scala.inline
      def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      @scala.inline
      def setConfigFileName(value: String): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileNameUndefined: Self = StObject.set(x, "configFileName", js.undefined)
      
      @scala.inline
      def setErrorsAsWarnings(value: Boolean): Self = StObject.set(x, "errorsAsWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsAsWarningsUndefined: Self = StObject.set(x, "errorsAsWarnings", js.undefined)
      
      @scala.inline
      def setForceIsolatedModules(value: Boolean): Self = StObject.set(x, "forceIsolatedModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceIsolatedModulesUndefined: Self = StObject.set(x, "forceIsolatedModules", js.undefined)
      
      @scala.inline
      def setGetCustomTransformers(value: String | CustomTransformersFunction): Self = StObject.set(x, "getCustomTransformers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCustomTransformersFunction1(value: /* program */ js.Any => js.Any): Self = StObject.set(x, "getCustomTransformers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCustomTransformersUndefined: Self = StObject.set(x, "getCustomTransformers", js.undefined)
      
      @scala.inline
      def setIgnoreDiagnostics(value: js.Array[Double]): Self = StObject.set(x, "ignoreDiagnostics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDiagnosticsUndefined: Self = StObject.set(x, "ignoreDiagnostics", js.undefined)
      
      @scala.inline
      def setIgnoreDiagnosticsVarargs(value: Double*): Self = StObject.set(x, "ignoreDiagnostics", js.Array(value :_*))
      
      @scala.inline
      def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      @scala.inline
      def setReportFiles(value: js.Array[String]): Self = StObject.set(x, "reportFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportFilesUndefined: Self = StObject.set(x, "reportFiles", js.undefined)
      
      @scala.inline
      def setReportFilesVarargs(value: String*): Self = StObject.set(x, "reportFiles", js.Array(value :_*))
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setTranspileOnly(value: Boolean): Self = StObject.set(x, "transpileOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileOnlyUndefined: Self = StObject.set(x, "transpileOnly", js.undefined)
      
      @scala.inline
      def setUseBabel(value: Boolean): Self = StObject.set(x, "useBabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBabelUndefined: Self = StObject.set(x, "useBabel", js.undefined)
      
      @scala.inline
      def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
      
      @scala.inline
      def setUsePrecompiledFiles(value: Boolean): Self = StObject.set(x, "usePrecompiledFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePrecompiledFilesUndefined: Self = StObject.set(x, "usePrecompiledFiles", js.undefined)
      
      @scala.inline
      def setUseTranspileModule(value: Boolean): Self = StObject.set(x, "useTranspileModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTranspileModuleUndefined: Self = StObject.set(x, "useTranspileModule", js.undefined)
    }
  }
}
