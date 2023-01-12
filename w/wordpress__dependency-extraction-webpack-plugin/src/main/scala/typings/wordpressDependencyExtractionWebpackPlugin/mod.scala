package typings.wordpressDependencyExtractionWebpackPlugin

import typings.webpack.mod.Compiler
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.json
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.php
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/dependency-extraction-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DependencyExtractionWebpackPlugin {
    def this(options: DependencyExtractionWebpackPluginOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  trait DependencyExtractionWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object DependencyExtractionWebpackPlugin {
    
    inline def apply(apply: Compiler => Unit): DependencyExtractionWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[DependencyExtractionWebpackPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependencyExtractionWebpackPlugin] (val x: Self) extends AnyVal {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait DependencyExtractionWebpackPluginOptions extends StObject {
    
    var combineAssets: js.UndefOr[Boolean] = js.undefined
    
    var combinedOutputFile: js.UndefOr[String | Null] = js.undefined
    
    var externalizedReportFile: js.UndefOr[String] = js.undefined
    
    var injectPolyfill: js.UndefOr[Boolean] = js.undefined
    
    var outputFilename: js.UndefOr[String | js.Function] = js.undefined
    
    var outputFormat: js.UndefOr[php | json] = js.undefined
    
    var requestToExternal: js.UndefOr[js.Function1[/* request */ String, js.UndefOr[String | js.Array[String]]]] = js.undefined
    
    var requestToHandle: js.UndefOr[js.Function1[/* request */ String, js.UndefOr[String]]] = js.undefined
    
    var useDefaults: js.UndefOr[Boolean] = js.undefined
  }
  object DependencyExtractionWebpackPluginOptions {
    
    inline def apply(): DependencyExtractionWebpackPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependencyExtractionWebpackPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependencyExtractionWebpackPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setCombineAssets(value: Boolean): Self = StObject.set(x, "combineAssets", value.asInstanceOf[js.Any])
      
      inline def setCombineAssetsUndefined: Self = StObject.set(x, "combineAssets", js.undefined)
      
      inline def setCombinedOutputFile(value: String): Self = StObject.set(x, "combinedOutputFile", value.asInstanceOf[js.Any])
      
      inline def setCombinedOutputFileNull: Self = StObject.set(x, "combinedOutputFile", null)
      
      inline def setCombinedOutputFileUndefined: Self = StObject.set(x, "combinedOutputFile", js.undefined)
      
      inline def setExternalizedReportFile(value: String): Self = StObject.set(x, "externalizedReportFile", value.asInstanceOf[js.Any])
      
      inline def setExternalizedReportFileUndefined: Self = StObject.set(x, "externalizedReportFile", js.undefined)
      
      inline def setInjectPolyfill(value: Boolean): Self = StObject.set(x, "injectPolyfill", value.asInstanceOf[js.Any])
      
      inline def setInjectPolyfillUndefined: Self = StObject.set(x, "injectPolyfill", js.undefined)
      
      inline def setOutputFilename(value: String | js.Function): Self = StObject.set(x, "outputFilename", value.asInstanceOf[js.Any])
      
      inline def setOutputFilenameUndefined: Self = StObject.set(x, "outputFilename", js.undefined)
      
      inline def setOutputFormat(value: php | json): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      inline def setRequestToExternal(value: /* request */ String => js.UndefOr[String | js.Array[String]]): Self = StObject.set(x, "requestToExternal", js.Any.fromFunction1(value))
      
      inline def setRequestToExternalUndefined: Self = StObject.set(x, "requestToExternal", js.undefined)
      
      inline def setRequestToHandle(value: /* request */ String => js.UndefOr[String]): Self = StObject.set(x, "requestToHandle", js.Any.fromFunction1(value))
      
      inline def setRequestToHandleUndefined: Self = StObject.set(x, "requestToHandle", js.undefined)
      
      inline def setUseDefaults(value: Boolean): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
    }
  }
}
