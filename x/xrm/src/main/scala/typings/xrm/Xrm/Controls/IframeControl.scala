package typings.xrm.Xrm.Controls

import typings.std.HTMLIFrameElement
import typings.xrm.Window
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
  def getInitialUrl(): String
}

object IframeControl {
  @scala.inline
  def apply(
    getContentWindow: () => js.Promise[Window],
    getControlType: () => ControlType | String,
    getInitialUrl: () => String,
    getLabel: () => String,
    getName: () => String,
    getObject: () => HTMLIFrameElement,
    getParent: () => Section,
    getSrc: () => String,
    getVisible: () => Boolean,
    setLabel: String => Unit,
    setSrc: String => Unit,
    setVisible: Boolean => Unit
  ): IframeControl = {
    val __obj = js.Dynamic.literal(getContentWindow = js.Any.fromFunction0(getContentWindow), getControlType = js.Any.fromFunction0(getControlType), getInitialUrl = js.Any.fromFunction0(getInitialUrl), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getSrc = js.Any.fromFunction0(getSrc), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setSrc = js.Any.fromFunction1(setSrc), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[IframeControl]
  }
}

