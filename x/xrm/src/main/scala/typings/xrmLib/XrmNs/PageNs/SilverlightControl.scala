package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Silverlight control.
  * @see {@link Control}
  * @deprecated Use {@link Xrm.Controls.SilverlightControl} instead.
  */
trait SilverlightControl
  extends xrmLib.XrmNs.ControlsNs.SilverlightControl

object SilverlightControl {
  @scala.inline
  def apply(
    getControlType: () => xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String,
    getData: () => java.lang.String,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getObject: () => stdLib.HTMLObjectElement,
    getParent: () => xrmLib.XrmNs.ControlsNs.Section,
    getVisible: () => scala.Boolean,
    setData: java.lang.String => scala.Unit,
    setLabel: java.lang.String => scala.Unit
  ): SilverlightControl = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getData = js.Any.fromFunction0(getData), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), setData = js.Any.fromFunction1(setData), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[SilverlightControl]
  }
}

