package typings.xrm.Xrm.Events

import typings.xrm.Xrm.ProcessFlow.Stage
import typings.xrm.Xrm.ProcessFlow.StageChangeDirection
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
  def getDirection(): StageChangeDirection
  /**
    * Gets the destination stage object
    * @returns The stage object. For switching between entities, returns the previous stage object
    */
  def getStage(): Stage
}

object StageChangeEventArguments {
  @scala.inline
  def apply(getDirection: () => StageChangeDirection, getStage: () => Stage): StageChangeEventArguments = {
    val __obj = js.Dynamic.literal(getDirection = js.Any.fromFunction0(getDirection), getStage = js.Any.fromFunction0(getStage))
  
    __obj.asInstanceOf[StageChangeEventArguments]
  }
}

