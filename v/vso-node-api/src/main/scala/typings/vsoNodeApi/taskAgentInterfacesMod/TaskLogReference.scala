package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskLogReference]
  }
}

