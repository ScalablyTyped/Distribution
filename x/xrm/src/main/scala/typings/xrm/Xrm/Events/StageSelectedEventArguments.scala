package typings.xrm.Xrm.Events

import typings.xrm.Xrm.ProcessFlow.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for process stage selected event arguments.
  */
trait StageSelectedEventArguments extends js.Object {
  /**
    * Gets the selected stage object
    * @returns The stage object
    */
  def getStage(): Stage
}

object StageSelectedEventArguments {
  @scala.inline
  def apply(getStage: () => Stage): StageSelectedEventArguments = {
    val __obj = js.Dynamic.literal(getStage = js.Any.fromFunction0(getStage))
    __obj.asInstanceOf[StageSelectedEventArguments]
  }
}

