package typings.xrm.XrmNs.ControlsNs

import typings.std.HTMLIFrameElement
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
  def getObject(): HTMLIFrameElement
  /**
    * Gets the URL value of the control.
    * @returns The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getSrc(): String
  /**
    * Sets the URL value of the control.
    * @param src The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setSrc(src: String): Unit
}

object FramedControl {
  @scala.inline
  def apply(
    getControlType: () => ControlType | String,
    getLabel: () => String,
    getName: () => String,
    getObject: () => HTMLIFrameElement,
    getParent: () => Section,
    getSrc: () => String,
    getVisible: () => Boolean,
    setLabel: String => Unit,
    setSrc: String => Unit
  ): FramedControl = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getSrc = js.Any.fromFunction0(getSrc), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setSrc = js.Any.fromFunction1(setSrc))
  
    __obj.asInstanceOf[FramedControl]
  }
}

