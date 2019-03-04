package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an Iframe control.
  * @see {@link FramedControl}
  */
trait IframeControl
  extends FramedControl
     with UiCanSetVisibleElement {
  /**
    * Gets initial URL defined for the Iframe.
    * @returns The initial URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getInitialUrl(): java.lang.String
}

object IframeControl {
  @scala.inline
  def apply(
    getControlType: js.Function0[ControlType | java.lang.String],
    getInitialUrl: js.Function0[java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getObject: js.Function0[stdLib.HTMLIFrameElement],
    getParent: js.Function0[Section],
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

