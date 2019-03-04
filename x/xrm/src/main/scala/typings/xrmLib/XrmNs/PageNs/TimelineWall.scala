package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Timeline control.
  * @see {@link Control}
  * @deprecated Use {@link Xrm.Controls.TimelineWall} instead.
  */
trait TimelineWall
  extends xrmLib.XrmNs.ControlsNs.TimelineWall

object TimelineWall {
  @scala.inline
  def apply(
    getControlType: js.Function0[xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.ControlsNs.Section],
    getVisible: js.Function0[scala.Boolean],
    refresh: js.Function0[scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit]
  ): TimelineWall = {
    val __obj = js.Dynamic.literal(getControlType = getControlType, getLabel = getLabel, getName = getName, getParent = getParent, getVisible = getVisible, refresh = refresh, setLabel = setLabel)
  
    __obj.asInstanceOf[TimelineWall]
  }
}

