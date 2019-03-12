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
    getControlType: () => xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getParent: () => xrmLib.XrmNs.ControlsNs.Section,
    getVisible: () => scala.Boolean,
    refresh: () => scala.Unit,
    setLabel: java.lang.String => scala.Unit
  ): TimelineWall = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), refresh = js.Any.fromFunction0(refresh), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[TimelineWall]
  }
}

