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
    getContext: js.Function0[xrmLib.XrmNs.GlobalContext],
    getDepth: js.Function0[scala.Double],
    getEventSource: js.Function0[
      xrmLib.XrmNs.AttributesNs.Attribute | xrmLib.XrmNs.ControlsNs.Control | xrmLib.XrmNs.Entity
    ],
    getFormContext: js.Function0[xrmLib.XrmNs.FormContext],
    getSharedVariable: js.Function1[java.lang.String, js.Any],
    setSharedVariable: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): EventContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getDepth")(getDepth)
    __obj.updateDynamic("getEventSource")(getEventSource)
    __obj.updateDynamic("getFormContext")(getFormContext)
    __obj.updateDynamic("getSharedVariable")(getSharedVariable)
    __obj.updateDynamic("setSharedVariable")(setSharedVariable)
    __obj.asInstanceOf[EventContext]
  }
}

