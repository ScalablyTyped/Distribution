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
    getControlType: () => ControlType | java.lang.String,
    getInitialUrl: () => java.lang.String,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getObject: () => stdLib.HTMLIFrameElement,
    getParent: () => Section,
    getSrc: () => java.lang.String,
    getVisible: () => scala.Boolean,
    setLabel: java.lang.String => scala.Unit,
    setSrc: java.lang.String => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): IframeControl = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getInitialUrl = js.Any.fromFunction0(getInitialUrl), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getSrc = js.Any.fromFunction0(getSrc), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setSrc = js.Any.fromFunction1(setSrc), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[IframeControl]
  }
}

