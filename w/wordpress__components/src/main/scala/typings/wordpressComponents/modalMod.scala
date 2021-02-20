package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.wordpressComponents.anon.Describedby
import typings.wordpressComponents.modalMod.Modal.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/modal", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Modal {
    
    @js.native
    trait Props extends HTMLProps[HTMLDivElement] {
      
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
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAria(value: Describedby): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
        
        @scala.inline
        def setBodyOpenClassName(value: String): Self = StObject.set(x, "bodyOpenClassName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBodyOpenClassNameUndefined: Self = StObject.set(x, "bodyOpenClassName", js.undefined)
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setCloseButtonLabel(value: String): Self = StObject.set(x, "closeButtonLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloseButtonLabelUndefined: Self = StObject.set(x, "closeButtonLabel", js.undefined)
        
        @scala.inline
        def setFocusOnMount(value: Boolean): Self = StObject.set(x, "focusOnMount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFocusOnMountUndefined: Self = StObject.set(x, "focusOnMount", js.undefined)
        
        @scala.inline
        def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setIsDismissable(value: Boolean): Self = StObject.set(x, "isDismissable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDismissableUndefined: Self = StObject.set(x, "isDismissable", js.undefined)
        
        @scala.inline
        def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
        
        @scala.inline
        def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
        
        @scala.inline
        def setShouldCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "shouldCloseOnClickOutside", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldCloseOnClickOutsideUndefined: Self = StObject.set(x, "shouldCloseOnClickOutside", js.undefined)
        
        @scala.inline
        def setShouldCloseOnEsc(value: Boolean): Self = StObject.set(x, "shouldCloseOnEsc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldCloseOnEscUndefined: Self = StObject.set(x, "shouldCloseOnEsc", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
  }
}
