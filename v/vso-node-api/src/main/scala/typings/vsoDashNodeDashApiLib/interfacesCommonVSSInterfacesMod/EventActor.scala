package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventActor extends js.Object {
  /**
    * Required: This is the identity of the user for the specified role.
    */
  var id: java.lang.String
  /**
    * Required: The event specific name of a role.
    */
  var role: java.lang.String
}

object EventActor {
  @scala.inline
  def apply(id: java.lang.String, role: java.lang.String): EventActor = {
    val __obj = js.Dynamic.literal(id = id, role = role)
  
    __obj.asInstanceOf[EventActor]
  }
}

