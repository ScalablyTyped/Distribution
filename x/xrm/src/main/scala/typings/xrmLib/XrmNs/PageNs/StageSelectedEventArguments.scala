package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for process stage selected event arguments.
  * @deprecated Use {@link Xrm.Events.StageSelectedEventArguments} instead.
  */
trait StageSelectedEventArguments
  extends xrmLib.XrmNs.EventsNs.StageSelectedEventArguments

object StageSelectedEventArguments {
  @scala.inline
  def apply(getStage: () => xrmLib.XrmNs.ProcessFlowNs.Stage): StageSelectedEventArguments = {
    val __obj = js.Dynamic.literal(getStage = js.Any.fromFunction0(getStage))
  
    __obj.asInstanceOf[StageSelectedEventArguments]
  }
}

