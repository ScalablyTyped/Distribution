package typings
package xrmLib.XrmNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for process stage change event arguments.
  */
trait StageChangeEventArguments extends js.Object {
  /**
    * Gets the direction of the stage change.
    * @returns The direction: "next" or "previous"
    */
  def getDirection(): xrmLib.XrmNs.ProcessFlowNs.StageChangeDirection
  /**
    * Gets the destination stage object
    * @returns The stage object. For switching between entities, returns the previous stage object
    */
  def getStage(): xrmLib.XrmNs.ProcessFlowNs.Stage
}

object StageChangeEventArguments {
  @scala.inline
  def apply(
    getDirection: js.Function0[xrmLib.XrmNs.ProcessFlowNs.StageChangeDirection],
    getStage: js.Function0[xrmLib.XrmNs.ProcessFlowNs.Stage]
  ): StageChangeEventArguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDirection")(getDirection)
    __obj.updateDynamic("getStage")(getStage)
    __obj.asInstanceOf[StageChangeEventArguments]
  }
}

