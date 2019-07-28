package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentTargetExecutionOptions extends js.Object {
  /**
    * Indicates the type of execution options.
    */
  var `type`: Double
}

object AgentTargetExecutionOptions {
  @scala.inline
  def apply(`type`: Double): AgentTargetExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AgentTargetExecutionOptions]
  }
}

