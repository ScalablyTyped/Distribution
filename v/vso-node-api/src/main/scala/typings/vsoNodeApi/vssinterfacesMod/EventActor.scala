package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventActor extends js.Object {
  /**
    * Required: This is the identity of the user for the specified role.
    */
  var id: String
  /**
    * Required: The event specific name of a role.
    */
  var role: String
}

object EventActor {
  @scala.inline
  def apply(id: String, role: String): EventActor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventActor]
  }
}

