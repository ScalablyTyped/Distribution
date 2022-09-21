package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastUrlValue extends StObject {
  
  var id: String | Null
  
  var url: String
}
object VastUrlValue {
  
  inline def apply(url: String): VastUrlValue = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], id = null)
    __obj.asInstanceOf[VastUrlValue]
  }
  
  extension [Self <: VastUrlValue](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
