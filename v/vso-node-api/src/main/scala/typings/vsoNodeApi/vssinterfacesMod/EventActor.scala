package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventActor extends StObject {
  
  /**
    * Required: This is the identity of the user for the specified role.
    */
  var id: String = js.native
  
  /**
    * Required: The event specific name of a role.
    */
  var role: String = js.native
}
object EventActor {
  
  @scala.inline
  def apply(id: String, role: String): EventActor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventActor]
  }
  
  @scala.inline
  implicit class EventActorMutableBuilder[Self <: EventActor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
