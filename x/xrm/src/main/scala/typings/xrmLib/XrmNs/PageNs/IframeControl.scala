package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an Iframe control.
  * @see {@link FramedControl}
  * @deprecated  Use {@link Xrm.Controls.IframeControl} instead.
  */
trait IframeControl
  extends xrmLib.XrmNs.ControlsNs.IframeControl

object IframeControl {
  @scala.inline
  def apply(
    getControlType: js.Function0[xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String],
    getInitialUrl: js.Function0[java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getObject: js.Function0[stdLib.HTMLIFrameElement],
    getParent: js.Function0[xrmLib.XrmNs.ControlsNs.Section],
    getSrc: js.Function0[java.lang.String],
    getVisible: js.Function0[scala.Boolean],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setSrc: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): IframeControl = {
    val __obj = js.Dynamic.literal(getControlType = getControlType, getInitialUrl = getInitialUrl, getLabel = getLabel, getName = getName, getObject = getObject, getParent = getParent, getSrc = getSrc, getVisible = getVisible, setLabel = setLabel, setSrc = setSrc, setVisible = setVisible)
  
    __obj.asInstanceOf[IframeControl]
  }
}

