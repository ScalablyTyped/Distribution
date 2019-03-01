package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a framed control, which is either a Web Resource or an Iframe.
  * @see {@link Control}
  * @remarks     An Iframe control provides additional methods, so use {@link IframeControl} where
  *              appropriate.  Silverlight controls should use {@link SilverlightControl}.
  */
trait FramedControl extends Control {
  /**
    * Gets the DOM element containing the control.
    * @returns The container object.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getObject(): stdLib.HTMLIFrameElement
  /**
    * Gets the URL value of the control.
    * @returns The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getSrc(): java.lang.String
  /**
    * Sets the URL value of the control.
    * @param src The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setSrc(src: java.lang.String): scala.Unit
}

object FramedControl {
  @scala.inline
  def apply(
    getControlType: js.Function0[ControlType | java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getObject: js.Function0[stdLib.HTMLIFrameElement],
    getParent: js.Function0[Section],
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

