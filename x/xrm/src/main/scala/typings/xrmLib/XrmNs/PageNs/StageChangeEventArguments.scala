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
    getDirection: js.Function0[xrmLib.XrmNs.ProcessFlowNs.StageChangeDirection],
    getStage: js.Function0[xrmLib.XrmNs.ProcessFlowNs.Stage]
  ): StageChangeEventArguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDirection")(getDirection)
    __obj.updateDynamic("getStage")(getStage)
    __obj.asInstanceOf[StageChangeEventArguments]
  }
}

