package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticResource extends StObject {
  
  var creativeType: String | Null
  
  var url: String
}
object StaticResource {
  
  inline def apply(url: String): StaticResource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], creativeType = null)
    __obj.asInstanceOf[StaticResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticResource] (val x: Self) extends AnyVal {
    
    inline def setCreativeType(value: String): Self = StObject.set(x, "creativeType", value.asInstanceOf[js.Any])
    
    inline def setCreativeTypeNull: Self = StObject.set(x, "creativeType", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
