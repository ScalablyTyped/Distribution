package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a save event context
  * @deprecated Use {@link Xrm.Events.SaveEventContext} instead.
  */
trait SaveEventContext
  extends xrmLib.XrmNs.EventsNs.SaveEventContext

object SaveEventContext {
  @scala.inline
  def apply(
    getContext: js.Function0[xrmLib.XrmNs.GlobalContext],
    getDepth: js.Function0[scala.Double],
    getEventArgs: js.Function0[xrmLib.XrmNs.EventsNs.SaveEventArguments],
    getEventSource: js.Function0[
      xrmLib.XrmNs.AttributesNs.Attribute | xrmLib.XrmNs.ControlsNs.Control | xrmLib.XrmNs.Entity
    ],
    getFormContext: js.Function0[xrmLib.XrmNs.FormContext],
    getSharedVariable: js.Function1[java.lang.String, js.Any],
    setSharedVariable: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): SaveEventContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getDepth")(getDepth)
    __obj.updateDynamic("getEventArgs")(getEventArgs)
    __obj.updateDynamic("getEventSource")(getEventSource)
    __obj.updateDynamic("getFormContext")(getFormContext)
    __obj.updateDynamic("getSharedVariable")(getSharedVariable)
    __obj.updateDynamic("setSharedVariable")(setSharedVariable)
    __obj.asInstanceOf[SaveEventContext]
  }
}

