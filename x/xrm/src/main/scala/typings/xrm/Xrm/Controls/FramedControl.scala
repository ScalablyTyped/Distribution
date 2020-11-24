package typings.xrm.Xrm.Controls

import typings.std.HTMLIFrameElement
import typings.xrm.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a framed control, which is either a Web Resource or an Iframe.
  * @see {@link Control}
  * @remarks     An Iframe control provides additional methods, so use {@link IframeControl} where
  *              appropriate.  Silverlight controls should use {@link SilverlightControl}.
  */
@js.native
trait FramedControl extends Control {
  
  /**
    * Returns the content window that represents an IFRAME or web resource.
    * @returns A promise that contains a content window instance representing an IFRAME or web resource.
    * @remarks This method is supported only on Unified Interface.  The implementer is expected to call
    * a custom function within the returned window that will receive the Xrm and formContext objects as
    * parameters.
    */
  def getContentWindow(): js.Promise[Window] = js.native
  
  /**
    * Gets the DOM element containing the control.
    * @returns The container object.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getObject(): HTMLIFrameElement = js.native
  
  /**
    * Gets the URL value of the control.
    * @returns The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getSrc(): String = js.native
  
  /**
    * Sets the URL value of the control.
    * @param src The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setSrc(src: String): Unit = js.native
}
object FramedControl {
  
  @scala.inline
  def apply(
    getContentWindow: () => js.Promise[Window],
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
    val __obj = js.Dynamic.literal(getContentWindow = js.Any.fromFunction0(getContentWindow), getControlType = js.Any.fromFunction0(getControlType), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getSrc = js.Any.fromFunction0(getSrc), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setSrc = js.Any.fromFunction1(setSrc))
    __obj.asInstanceOf[FramedControl]
  }
  
  @scala.inline
  implicit class FramedControlOps[Self <: FramedControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetContentWindow(value: () => js.Promise[Window]): Self = this.set("getContentWindow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObject(value: () => HTMLIFrameElement): Self = this.set("getObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSrc(value: () => String): Self = this.set("getSrc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSrc(value: String => Unit): Self = this.set("setSrc", js.Any.fromFunction1(value))
  }
}
