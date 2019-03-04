package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a process stage select event context
  * @deprecated  Use {@link Xrm.Events.StageSelectedEventContext} instead.
  */ trait StageSelectedEventContext
  extends xrmLib.XrmNs.EventsNs.StageSelectedEventContext

object StageSelectedEventContext {
  @scala.inline
  def apply(
    getContext: js.Function0[xrmLib.XrmNs.GlobalContext],
    getDepth: js.Function0[scala.Double],
    getEventArgs: js.Function0[xrmLib.XrmNs.EventsNs.StageSelectedEventArguments],
    getEventSource: js.Function0[
      xrmLib.XrmNs.AttributesNs.Attribute | xrmLib.XrmNs.ControlsNs.Control | xrmLib.XrmNs.Entity
    ],
    getFormContext: js.Function0[xrmLib.XrmNs.FormContext],
    getSharedVariable: js.Function1[java.lang.String, js.Any],
    setSharedVariable: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): StageSelectedEventContext = {
    val __obj = js.Dynamic.literal(getContext = getContext, getDepth = getDepth, getEventArgs = getEventArgs, getEventSource = getEventSource, getFormContext = getFormContext, getSharedVariable = getSharedVariable, setSharedVariable = setSharedVariable)
  
    __obj.asInstanceOf[StageSelectedEventContext]
  }
}

