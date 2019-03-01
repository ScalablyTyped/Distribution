package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskLogReference extends js.Object {
  var id: scala.Double
  var location: java.lang.String
}

object TaskLogReference {
  @scala.inline
  def apply(id: scala.Double, location: java.lang.String): TaskLogReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[TaskLogReference]
  }
}

