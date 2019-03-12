package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for process stage change event arguments.
  * @deprecated Use {@link Xrm.Events.StageChangeEventArguments} instead.
  */
trait StageChangeEventArguments
  extends xrmLib.XrmNs.EventsNs.StageChangeEventArguments

object StageChangeEventArguments {
  @scala.inline
  def apply(
    getDirection: () => xrmLib.XrmNs.ProcessFlowNs.StageChangeDirection,
    getStage: () => xrmLib.XrmNs.ProcessFlowNs.Stage
  ): StageChangeEventArguments = {
    val __obj = js.Dynamic.literal(getDirection = js.Any.fromFunction0(getDirection), getStage = js.Any.fromFunction0(getStage))
  
    __obj.asInstanceOf[StageChangeEventArguments]
  }
}

