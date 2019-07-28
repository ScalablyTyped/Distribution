package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskLogReference extends js.Object {
  var id: Double
  var location: String
}

object TaskLogReference {
  @scala.inline
  def apply(id: Double, location: String): TaskLogReference = {
    val __obj = js.Dynamic.literal(id = id, location = location)
  
    __obj.asInstanceOf[TaskLogReference]
  }
}

