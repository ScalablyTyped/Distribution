package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastAdvertiser extends StObject {
  
  var id: String | Null
  
  var value: String
}
object VastAdvertiser {
  
  inline def apply(value: String): VastAdvertiser = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], id = null)
    __obj.asInstanceOf[VastAdvertiser]
  }
  
  extension [Self <: VastAdvertiser](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
