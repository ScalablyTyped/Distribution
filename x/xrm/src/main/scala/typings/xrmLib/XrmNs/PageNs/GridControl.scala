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
    addOnLoad: js.Function1[js.Function0[scala.Unit], scala.Unit],
    getContextType: js.Function0[xrmLib.XrmEnumNs.GridControlContext],
    getControlType: js.Function0[xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String],
    getEntityName: js.Function0[java.lang.String],
    getGrid: js.Function0[xrmLib.XrmNs.ControlsNs.Grid],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.ControlsNs.Section],
    getViewSelector: js.Function0[xrmLib.XrmNs.ControlsNs.ViewSelector],
    getVisible: js.Function0[scala.Boolean],
    refresh: js.Function0[scala.Unit],
    removeOnLoad: js.Function1[js.Function0[scala.Unit], scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit]
  ): GridControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addOnLoad")(addOnLoad)
    __obj.updateDynamic("getContextType")(getContextType)
    __obj.updateDynamic("getControlType")(getControlType)
    __obj.updateDynamic("getEntityName")(getEntityName)
    __obj.updateDynamic("getGrid")(getGrid)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getViewSelector")(getViewSelector)
    __obj.updateDynamic("getVisible")(getVisible)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("removeOnLoad")(removeOnLoad)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.asInstanceOf[GridControl]
  }
}

