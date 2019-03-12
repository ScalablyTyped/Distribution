package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a framed control, which is either a Web Resource or an Iframe.
  * @see {@link Control}
  * @remarks     An Iframe control provides additional methods, so use {@link IframeControl} where
  *              appropriate.  Silverlight controls should use {@link SilverlightControl}.
  * @deprecated  Use {@link Xrm.Controls.FramedControl} instead.
  */
trait FramedControl
  extends xrmLib.XrmNs.ControlsNs.FramedControl

object FramedControl {
  @scala.inline
  def apply(
    getControlType: () => xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getObject: () => stdLib.HTMLIFrameElement,
    getParent: () => xrmLib.XrmNs.ControlsNs.Section,
    getSrc: () => java.lang.String,
    getVisible: () => scala.Boolean,
    setLabel: java.lang.String => scala.Unit,
    setSrc: java.lang.String => scala.Unit
  ): FramedControl = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getSrc = js.Any.fromFunction0(getSrc), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setSrc = js.Any.fromFunction1(setSrc))
  
    __obj.asInstanceOf[FramedControl]
  }
}

