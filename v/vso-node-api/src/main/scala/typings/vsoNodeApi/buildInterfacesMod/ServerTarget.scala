package typings.vsoNodeApi.buildInterfacesMod

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
  def apply(executionOptions: ServerTargetExecutionOptions, `type`: Double): ServerTarget = {
    val __obj = js.Dynamic.literal(executionOptions = executionOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTarget]
  }
}

