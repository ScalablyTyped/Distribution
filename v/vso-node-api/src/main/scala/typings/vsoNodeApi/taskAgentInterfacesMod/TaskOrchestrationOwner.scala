package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationOwner extends js.Object {
  var _links: js.Any
  var id: Double
  var name: String
}

object TaskOrchestrationOwner {
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String): TaskOrchestrationOwner = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskOrchestrationOwner]
  }
}

