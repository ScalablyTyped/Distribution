package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a CRM grid control.
  *
  * @see {@link Control}
  * @deprecated  Use {@link Xrm.Controls.GridControl} instead.
  */
trait GridControl
  extends xrmLib.XrmNs.ControlsNs.GridControl

object GridControl {
  @scala.inline
  def apply(
    addOnLoad: js.Function0[scala.Unit] => scala.Unit,
    getContextType: () => xrmLib.XrmEnumNs.GridControlContext,
    getControlType: () => xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String,
    getEntityName: () => java.lang.String,
    getGrid: () => xrmLib.XrmNs.ControlsNs.Grid,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getParent: () => xrmLib.XrmNs.ControlsNs.Section,
    getViewSelector: () => xrmLib.XrmNs.ControlsNs.ViewSelector,
    getVisible: () => scala.Boolean,
    refresh: () => scala.Unit,
    removeOnLoad: js.Function0[scala.Unit] => scala.Unit,
    setLabel: java.lang.String => scala.Unit
  ): GridControl = {
    val __obj = js.Dynamic.literal(addOnLoad = js.Any.fromFunction1(addOnLoad), getContextType = js.Any.fromFunction0(getContextType), getControlType = js.Any.fromFunction0(getControlType), getEntityName = js.Any.fromFunction0(getEntityName), getGrid = js.Any.fromFunction0(getGrid), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getViewSelector = js.Any.fromFunction0(getViewSelector), getVisible = js.Any.fromFunction0(getVisible), refresh = js.Any.fromFunction0(refresh), removeOnLoad = js.Any.fromFunction1(removeOnLoad), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[GridControl]
  }
}

