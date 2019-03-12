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
    getContext: () => xrmLib.XrmNs.GlobalContext,
    getDepth: () => scala.Double,
    getEventArgs: () => xrmLib.XrmNs.EventsNs.StageSelectedEventArguments,
    getEventSource: () => xrmLib.XrmNs.AttributesNs.Attribute | xrmLib.XrmNs.ControlsNs.Control | xrmLib.XrmNs.Entity,
    getFormContext: () => xrmLib.XrmNs.FormContext,
    getSharedVariable: java.lang.String => js.Any,
    setSharedVariable: (java.lang.String, js.Any) => scala.Unit
  ): StageSelectedEventContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
  
    __obj.asInstanceOf[StageSelectedEventContext]
  }
}

