package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedId extends StObject {
  
  var addedId: Double | String
  
  var removedId: Double | String
}
object AddedId {
  
  @scala.inline
  def apply(addedId: Double | String, removedId: Double | String): AddedId = {
    val __obj = js.Dynamic.literal(addedId = addedId.asInstanceOf[js.Any], removedId = removedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedId]
  }
  
  @scala.inline
  implicit class AddedIdMutableBuilder[Self <: AddedId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedId(value: Double | String): Self = StObject.set(x, "addedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedId(value: Double | String): Self = StObject.set(x, "removedId", value.asInstanceOf[js.Any])
  }
}
