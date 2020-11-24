package typings.wordpressComponents.modalMod.Modal

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.wordpressComponents.anon.Describedby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  
  var aria: js.UndefOr[Describedby] = js.native
  
  /**
    * `className` that is applied to the `document.body` while the modal is open.
    * @defaultValue "modal-open"
    */
  var bodyOpenClassName: js.UndefOr[String] = js.native
  
  @JSName("children")
  var children_Props: ReactNode = js.native
  
  /**
    * Label for the close button.
    * @defaultValue "Close dialog"
    */
  var closeButtonLabel: js.UndefOr[String] = js.native
  
  /**
    * If this property is true, it will focus the first tabbable element
    * rendered in the modal.
    * @defaultValue true
    */
  var focusOnMount: js.UndefOr[Boolean] = js.native
  
  /**
    * Icon component to render before the title.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  
  /**
    * If this property is set to false, the modal will not display a close
    * icon and cannot be dismissed.
    * @defaultValue true
    * @deprecated Use isDismissible
    */
  var isDismissable: js.UndefOr[Boolean] = js.native
  
  /**
    * If this property is set to false, the modal will not display a close
    * icon and cannot be dismissed.
    * @defaultValue true
    */
  var isDismissible: js.UndefOr[Boolean] = js.native
  
  /**
    * This function is called to indicate that the modal should be closed.
    */
  def onRequestClose(): Unit = js.native
  
  /**
    * If this property is added, it will an additional class name to the
    * modal overlay div.
    */
  var overlayClassName: js.UndefOr[String] = js.native
  
  /**
    * If this property is added, it will determine whether the modal
    * requests to close when a mouse click occurs outside of the modal
    * content.
    * @defaultValue true
    */
  var shouldCloseOnClickOutside: js.UndefOr[Boolean] = js.native
  
  /**
    * If this property is added, it will determine whether the modal
    * requests to close when the escape key is pressed.
    * @defaultValue true
    */
  var shouldCloseOnEsc: js.UndefOr[Boolean] = js.native
  
  /**
    * This property is used as the modal header's title. It is required
    * for a11y reasons.
    */
  @JSName("title")
  var title_Props: String = js.native
}
object Props {
  
  @scala.inline
  def apply(onRequestClose: () => Unit, title: String): Props = {
    val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction0(onRequestClose), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setOnRequestClose(value: () => Unit): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAria(value: Describedby): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setBodyOpenClassName(value: String): Self = this.set("bodyOpenClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyOpenClassName: Self = this.set("bodyOpenClassName", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCloseButtonLabel(value: String): Self = this.set("closeButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButtonLabel: Self = this.set("closeButtonLabel", js.undefined)
    
    @scala.inline
    def setFocusOnMount(value: Boolean): Self = this.set("focusOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnMount: Self = this.set("focusOnMount", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIsDismissable(value: Boolean): Self = this.set("isDismissable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDismissable: Self = this.set("isDismissable", js.undefined)
    
    @scala.inline
    def setIsDismissible(value: Boolean): Self = this.set("isDismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDismissible: Self = this.set("isDismissible", js.undefined)
    
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    
    @scala.inline
    def setShouldCloseOnClickOutside(value: Boolean): Self = this.set("shouldCloseOnClickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldCloseOnClickOutside: Self = this.set("shouldCloseOnClickOutside", js.undefined)
    
    @scala.inline
    def setShouldCloseOnEsc(value: Boolean): Self = this.set("shouldCloseOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldCloseOnEsc: Self = this.set("shouldCloseOnEsc", js.undefined)
  }
}
