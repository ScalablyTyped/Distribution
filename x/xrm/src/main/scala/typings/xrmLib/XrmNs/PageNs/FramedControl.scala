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
    getControlType: js.Function0[xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getObject: js.Function0[stdLib.HTMLIFrameElement],
    getParent: js.Function0[xrmLib.XrmNs.ControlsNs.Section],
    getSrc: js.Function0[java.lang.String],
    getVisible: js.Function0[scala.Boolean],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setSrc: js.Function1[java.lang.String, scala.Unit]
  ): FramedControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getControlType")(getControlType)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getObject")(getObject)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getSrc")(getSrc)
    __obj.updateDynamic("getVisible")(getVisible)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.updateDynamic("setSrc")(setSrc)
    __obj.asInstanceOf[FramedControl]
  }
}

