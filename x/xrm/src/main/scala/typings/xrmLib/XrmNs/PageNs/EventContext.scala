package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the event context.
  * @deprecated Use {@link Xrm.Events.EventContext} instead.
  */
trait EventContext
  extends xrmLib.XrmNs.EventsNs.EventContext

object EventContext {
  @scala.inline
  def apply(
    getContext: () => xrmLib.XrmNs.GlobalContext,
    getDepth: () => scala.Double,
    getEventSource: () => xrmLib.XrmNs.AttributesNs.Attribute | xrmLib.XrmNs.ControlsNs.Control | xrmLib.XrmNs.Entity,
    getFormContext: () => xrmLib.XrmNs.FormContext,
    getSharedVariable: java.lang.String => js.Any,
    setSharedVariable: (java.lang.String, js.Any) => scala.Unit
  ): EventContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
  
    __obj.asInstanceOf[EventContext]
  }
}

