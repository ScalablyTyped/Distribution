package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastAdAttributes extends StObject {
  
  var fallback_index: String | Null
  
  var `type`: String
}
object VastAdAttributes {
  
  inline def apply(`type`: String): VastAdAttributes = {
    val __obj = js.Dynamic.literal(fallback_index = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdAttributes]
  }
  
  extension [Self <: VastAdAttributes](x: Self) {
    
    inline def setFallback_index(value: String): Self = StObject.set(x, "fallback_index", value.asInstanceOf[js.Any])
    
    inline def setFallback_indexNull: Self = StObject.set(x, "fallback_index", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
