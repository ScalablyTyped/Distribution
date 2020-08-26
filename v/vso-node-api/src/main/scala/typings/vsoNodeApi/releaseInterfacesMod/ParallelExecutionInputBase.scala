package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelExecutionInputBase extends ExecutionInput {
  var continueOnError: Boolean = js.native
  var maxNumberOfAgents: Double = js.native
}

object ParallelExecutionInputBase {
  @scala.inline
  def apply(continueOnError: Boolean, maxNumberOfAgents: Double, parallelExecutionType: ParallelExecutionTypes): ParallelExecutionInputBase = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxNumberOfAgents = maxNumberOfAgents.asInstanceOf[js.Any], parallelExecutionType = parallelExecutionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelExecutionInputBase]
  }
  @scala.inline
  implicit class ParallelExecutionInputBaseOps[Self <: ParallelExecutionInputBase] (val x: Self) extends AnyVal {
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
    def setContinueOnError(value: Boolean): Self = this.set("continueOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxNumberOfAgents(value: Double): Self = this.set("maxNumberOfAgents", value.asInstanceOf[js.Any])
  }
  
}

