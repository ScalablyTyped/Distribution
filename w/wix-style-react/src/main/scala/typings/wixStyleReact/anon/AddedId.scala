package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedId extends StObject {
  
  var addedId: Double | String
  
  var removedId: Double | String
}
object AddedId {
  
  inline def apply(addedId: Double | String, removedId: Double | String): AddedId = {
    val __obj = js.Dynamic.literal(addedId = addedId.asInstanceOf[js.Any], removedId = removedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedId]
  }
  
  extension [Self <: AddedId](x: Self) {
    
    inline def setAddedId(value: Double | String): Self = StObject.set(x, "addedId", value.asInstanceOf[js.Any])
    
    inline def setRemovedId(value: Double | String): Self = StObject.set(x, "removedId", value.asInstanceOf[js.Any])
  }
}
