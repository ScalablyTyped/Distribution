package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerTarget extends PhaseTarget {
  /**
    * The execution options.
    */
  var executionOptions: ServerTargetExecutionOptions = js.native
}

object ServerTarget {
  @scala.inline
  def apply(executionOptions: ServerTargetExecutionOptions, `type`: Double): ServerTarget = {
    val __obj = js.Dynamic.literal(executionOptions = executionOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTarget]
  }
  @scala.inline
  implicit class ServerTargetOps[Self <: ServerTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecutionOptions(value: ServerTargetExecutionOptions): Self = this.set("executionOptions", value.asInstanceOf[js.Any])
  }
  
}

