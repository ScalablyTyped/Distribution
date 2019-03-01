package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerTarget extends PhaseTarget {
  /**
    * The execution options.
    */
  var executionOptions: ServerTargetExecutionOptions
}

object ServerTarget {
  @scala.inline
  def apply(executionOptions: ServerTargetExecutionOptions, `type`: scala.Double): ServerTarget = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("executionOptions")(executionOptions)
    __obj.asInstanceOf[ServerTarget]
  }
}

