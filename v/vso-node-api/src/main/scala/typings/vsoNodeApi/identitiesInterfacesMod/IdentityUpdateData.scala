package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityUpdateData extends StObject {
  
  var id: String
  
  var index: Double
  
  var updated: Boolean
}
object IdentityUpdateData {
  
  inline def apply(id: String, index: Double, updated: Boolean): IdentityUpdateData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityUpdateData]
  }
  
  extension [Self <: IdentityUpdateData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: Boolean): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
