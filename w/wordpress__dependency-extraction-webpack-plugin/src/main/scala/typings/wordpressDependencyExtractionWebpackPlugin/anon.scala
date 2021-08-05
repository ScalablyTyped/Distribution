package typings.wordpressDependencyExtractionWebpackPlugin

import typings.wordpressDependencyExtractionWebpackPlugin.mod.RequestToExternal
import typings.wordpressDependencyExtractionWebpackPlugin.mod.RequestToHandle
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.json
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.php
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@wordpress/dependency-extraction-webpack-plugin.@wordpress/dependency-extraction-webpack-plugin.Options> */
  trait PartialOptions extends StObject {
    
    var combineAssets: js.UndefOr[Boolean] = js.undefined
    
    var combinedOutputFile: js.UndefOr[String | Null] = js.undefined
    
    var injectPolyfill: js.UndefOr[Boolean] = js.undefined
    
    var outputFormat: js.UndefOr[json | php] = js.undefined
    
    var requestToExternal: js.UndefOr[RequestToExternal] = js.undefined
    
    var requestToHandle: js.UndefOr[RequestToHandle] = js.undefined
    
    var useDefaults: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setCombineAssets(value: Boolean): Self = StObject.set(x, "combineAssets", value.asInstanceOf[js.Any])
      
      inline def setCombineAssetsUndefined: Self = StObject.set(x, "combineAssets", js.undefined)
      
      inline def setCombinedOutputFile(value: String): Self = StObject.set(x, "combinedOutputFile", value.asInstanceOf[js.Any])
      
      inline def setCombinedOutputFileNull: Self = StObject.set(x, "combinedOutputFile", null)
      
      inline def setCombinedOutputFileUndefined: Self = StObject.set(x, "combinedOutputFile", js.undefined)
      
      inline def setInjectPolyfill(value: Boolean): Self = StObject.set(x, "injectPolyfill", value.asInstanceOf[js.Any])
      
      inline def setInjectPolyfillUndefined: Self = StObject.set(x, "injectPolyfill", js.undefined)
      
      inline def setOutputFormat(value: json | php): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      inline def setRequestToExternal(value: /* request */ String => String | Unit | js.Array[String]): Self = StObject.set(x, "requestToExternal", js.Any.fromFunction1(value))
      
      inline def setRequestToExternalUndefined: Self = StObject.set(x, "requestToExternal", js.undefined)
      
      inline def setRequestToHandle(value: /* request */ String => String | Unit): Self = StObject.set(x, "requestToHandle", js.Any.fromFunction1(value))
      
      inline def setRequestToHandleUndefined: Self = StObject.set(x, "requestToHandle", js.undefined)
      
      inline def setUseDefaults(value: Boolean): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
    }
  }
}
