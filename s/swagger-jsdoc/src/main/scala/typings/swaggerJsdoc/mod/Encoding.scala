package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var allowReserved: js.UndefOr[Boolean] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var explode: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[Header | Reference]] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
}
object Encoding {
  
  inline def apply(): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
    
    inline def setAllowReserved(value: Boolean): Self = StObject.set(x, "allowReserved", value.asInstanceOf[js.Any])
    
    inline def setAllowReservedUndefined: Self = StObject.set(x, "allowReserved", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setExplode(value: Boolean): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
    
    inline def setExplodeUndefined: Self = StObject.set(x, "explode", js.undefined)
    
    inline def setHeaders(value: StringDictionary[Header | Reference]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
