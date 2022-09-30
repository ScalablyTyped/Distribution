package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageParams
  extends StObject
     with _FormatterParams {
  
  // Image
  var height: js.UndefOr[String] = js.undefined
  
  var urlPrefix: js.UndefOr[String] = js.undefined
  
  var urlSuffix: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object ImageParams {
  
  inline def apply(): ImageParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageParams]
  }
  
  extension [Self <: ImageParams](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
    
    inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
    
    inline def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
    
    inline def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
