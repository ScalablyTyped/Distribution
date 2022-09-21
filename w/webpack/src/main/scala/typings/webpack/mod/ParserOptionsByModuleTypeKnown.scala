package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specify options for each parser.
  */
trait ParserOptionsByModuleTypeKnown extends StObject {
  
  /**
  	 * Parser options for asset modules.
  	 */
  var asset: js.UndefOr[AssetParserOptions] = js.undefined
  
  /**
  	 * No parser options are supported for this module type.
  	 */
  @JSName("asset/inline")
  var assetSlashinline: js.UndefOr[EmptyParserOptions] = js.undefined
  
  /**
  	 * No parser options are supported for this module type.
  	 */
  @JSName("asset/resource")
  var assetSlashresource: js.UndefOr[EmptyParserOptions] = js.undefined
  
  /**
  	 * No parser options are supported for this module type.
  	 */
  @JSName("asset/source")
  var assetSlashsource: js.UndefOr[EmptyParserOptions] = js.undefined
  
  /**
  	 * Parser options for javascript modules.
  	 */
  var javascript: js.UndefOr[JavascriptParserOptions] = js.undefined
  
  /**
  	 * Parser options for javascript modules.
  	 */
  @JSName("javascript/auto")
  var javascriptSlashauto: js.UndefOr[JavascriptParserOptions] = js.undefined
  
  /**
  	 * Parser options for javascript modules.
  	 */
  @JSName("javascript/dynamic")
  var javascriptSlashdynamic: js.UndefOr[JavascriptParserOptions] = js.undefined
  
  /**
  	 * Parser options for javascript modules.
  	 */
  @JSName("javascript/esm")
  var javascriptSlashesm: js.UndefOr[JavascriptParserOptions] = js.undefined
}
object ParserOptionsByModuleTypeKnown {
  
  inline def apply(): ParserOptionsByModuleTypeKnown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptionsByModuleTypeKnown]
  }
  
  extension [Self <: ParserOptionsByModuleTypeKnown](x: Self) {
    
    inline def setAsset(value: AssetParserOptions): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetSlashinline(value: EmptyParserOptions): Self = StObject.set(x, "asset/inline", value.asInstanceOf[js.Any])
    
    inline def setAssetSlashinlineUndefined: Self = StObject.set(x, "asset/inline", js.undefined)
    
    inline def setAssetSlashresource(value: EmptyParserOptions): Self = StObject.set(x, "asset/resource", value.asInstanceOf[js.Any])
    
    inline def setAssetSlashresourceUndefined: Self = StObject.set(x, "asset/resource", js.undefined)
    
    inline def setAssetSlashsource(value: EmptyParserOptions): Self = StObject.set(x, "asset/source", value.asInstanceOf[js.Any])
    
    inline def setAssetSlashsourceUndefined: Self = StObject.set(x, "asset/source", js.undefined)
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setJavascript(value: JavascriptParserOptions): Self = StObject.set(x, "javascript", value.asInstanceOf[js.Any])
    
    inline def setJavascriptSlashauto(value: JavascriptParserOptions): Self = StObject.set(x, "javascript/auto", value.asInstanceOf[js.Any])
    
    inline def setJavascriptSlashautoUndefined: Self = StObject.set(x, "javascript/auto", js.undefined)
    
    inline def setJavascriptSlashdynamic(value: JavascriptParserOptions): Self = StObject.set(x, "javascript/dynamic", value.asInstanceOf[js.Any])
    
    inline def setJavascriptSlashdynamicUndefined: Self = StObject.set(x, "javascript/dynamic", js.undefined)
    
    inline def setJavascriptSlashesm(value: JavascriptParserOptions): Self = StObject.set(x, "javascript/esm", value.asInstanceOf[js.Any])
    
    inline def setJavascriptSlashesmUndefined: Self = StObject.set(x, "javascript/esm", js.undefined)
    
    inline def setJavascriptUndefined: Self = StObject.set(x, "javascript", js.undefined)
  }
}
