package typings.xrm.Xrm.Events

import typings.xrm.Xrm.ProcessFlow.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for process stage selected event arguments.
  */
@js.native
trait StageSelectedEventArguments extends js.Object {
  /**
    * Gets the selected stage object
    * @returns The stage object
    */
  def getStage(): Stage = js.native
}

object StageSelectedEventArguments {
  @scala.inline
  def apply(getStage: () => Stage): StageSelectedEventArguments = {
    val __obj = js.Dynamic.literal(getStage = js.Any.fromFunction0(getStage))
    __obj.asInstanceOf[StageSelectedEventArguments]
  }
  @scala.inline
  implicit class StageSelectedEventArgumentsOps[Self <: StageSelectedEventArguments] (val x: Self) extends AnyVal {
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
    def setGetStage(value: () => Stage): Self = this.set("getStage", js.Any.fromFunction0(value))
  }
  
}

