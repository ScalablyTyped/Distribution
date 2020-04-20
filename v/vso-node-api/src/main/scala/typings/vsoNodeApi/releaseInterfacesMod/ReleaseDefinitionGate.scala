package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionGate extends js.Object {
  var tasks: js.Array[WorkflowTask]
}

object ReleaseDefinitionGate {
  @scala.inline
  def apply(tasks: js.Array[WorkflowTask]): ReleaseDefinitionGate = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionGate]
  }
}

