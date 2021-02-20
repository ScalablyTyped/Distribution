package typings.wordpressDependencyExtractionWebpackPlugin

import typings.wordpressDependencyExtractionWebpackPlugin.mod.RequestToExternal
import typings.wordpressDependencyExtractionWebpackPlugin.mod.RequestToHandle
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.json
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.php
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@wordpress/dependency-extraction-webpack-plugin.@wordpress/dependency-extraction-webpack-plugin.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var combineAssets: js.UndefOr[Boolean] = js.native
    
    var combinedOutputFile: js.UndefOr[String | Null] = js.native
    
    var injectPolyfill: js.UndefOr[Boolean] = js.native
    
    var outputFormat: js.UndefOr[json | php] = js.native
    
    var requestToExternal: js.UndefOr[RequestToExternal] = js.native
    
    var requestToHandle: js.UndefOr[RequestToHandle] = js.native
    
    var useDefaults: js.UndefOr[Boolean] = js.native
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
      def setCombineAssets(value: Boolean): Self = StObject.set(x, "combineAssets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombineAssetsUndefined: Self = StObject.set(x, "combineAssets", js.undefined)
      
      @scala.inline
      def setCombinedOutputFile(value: String): Self = StObject.set(x, "combinedOutputFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombinedOutputFileNull: Self = StObject.set(x, "combinedOutputFile", null)
      
      @scala.inline
      def setCombinedOutputFileUndefined: Self = StObject.set(x, "combinedOutputFile", js.undefined)
      
      @scala.inline
      def setInjectPolyfill(value: Boolean): Self = StObject.set(x, "injectPolyfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectPolyfillUndefined: Self = StObject.set(x, "injectPolyfill", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: json | php): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      @scala.inline
      def setRequestToExternal(value: /* request */ String => String | Unit | js.Array[String]): Self = StObject.set(x, "requestToExternal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestToExternalUndefined: Self = StObject.set(x, "requestToExternal", js.undefined)
      
      @scala.inline
      def setRequestToHandle(value: /* request */ String => String | Unit): Self = StObject.set(x, "requestToHandle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestToHandleUndefined: Self = StObject.set(x, "requestToHandle", js.undefined)
      
      @scala.inline
      def setUseDefaults(value: Boolean): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
    }
  }
}
