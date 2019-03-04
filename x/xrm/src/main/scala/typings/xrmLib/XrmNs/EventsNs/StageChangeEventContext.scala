package typings
package xrmLib.XrmNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a process stage change event context
  */
trait StageChangeEventContext extends EventContext {
  /**
    * Gets process stage change event arguments.
    * @returns The event arguments.
    */
  def getEventArgs(): StageChangeEventArguments
}

object StageChangeEventContext {
  @scala.inline
  def apply(
    getContext: js.Function0[xrmLib.XrmNs.GlobalContext],
    getDepth: js.Function0[scala.Double],
    getEventArgs: js.Function0[StageChangeEventArguments],
    getEventSource: js.Function0[
      xrmLib.XrmNs.AttributesNs.Attribute | xrmLib.XrmNs.ControlsNs.Control | xrmLib.XrmNs.Entity
    ],
    getFormContext: js.Function0[xrmLib.XrmNs.FormContext],
    getSharedVariable: js.Function1[java.lang.String, js.Any],
    setSharedVariable: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): StageChangeEventContext = {
    val __obj = js.Dynamic.literal(getContext = getContext, getDepth = getDepth, getEventArgs = getEventArgs, getEventSource = getEventSource, getFormContext = getFormContext, getSharedVariable = getSharedVariable, setSharedVariable = setSharedVariable)
  
    __obj.asInstanceOf[StageChangeEventContext]
  }
}

