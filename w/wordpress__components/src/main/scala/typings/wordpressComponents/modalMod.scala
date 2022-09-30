package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.HTMLProps
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLDivElement
import typings.wordpressComponents.anon.Describedby
import typings.wordpressComponents.modalMod.Modal.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    trait Props
      extends StObject
         with HTMLProps[HTMLDivElement] {
      
      var aria: js.UndefOr[Describedby] = js.undefined
      
      /**
        * `className` that is applied to the `document.body` while the modal is open.
        * @defaultValue "modal-open"
        */
      var bodyOpenClassName: js.UndefOr[String] = js.undefined
      
      @JSName("children")
      var children_Props: ReactNode
      
      /**
        * Label for the close button.
        * @defaultValue "Close dialog"
        */
      var closeButtonLabel: js.UndefOr[String] = js.undefined
      
      /**
        * If this property is true, it will focus the first tabbable element
        * rendered in the modal.
        * @defaultValue true
        */
      var focusOnMount: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Icon component to render before the title.
        */
      var icon: js.UndefOr[ReactNode] = js.undefined
      
      /**
        * If this property is set to false, the modal will not display a close
        * icon and cannot be dismissed.
        * @defaultValue true
        * @deprecated Use isDismissible
        */
      var isDismissable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If this property is set to false, the modal will not display a close
        * icon and cannot be dismissed.
        * @defaultValue true
        */
      var isDismissible: js.UndefOr[Boolean] = js.undefined
      
      /**
        * This function is called to indicate that the modal should be closed.
        *
        * The originating event might be different depending on how the modal
        * is closed.
        */
      var onRequestClose: KeyboardEventHandler[Element] | MouseEventHandler[Element] | FocusEventHandler[Element]
      
      /**
        * If this property is added, it will an additional class name to the
        * modal overlay div.
        */
      var overlayClassName: js.UndefOr[String] = js.undefined
      
      /**
        * If this property is added, it will determine whether the modal
        * requests to close when a mouse click occurs outside of the modal
        * content.
        * @defaultValue true
        */
      var shouldCloseOnClickOutside: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If this property is added, it will determine whether the modal
        * requests to close when the escape key is pressed.
        * @defaultValue true
        */
      var shouldCloseOnEsc: js.UndefOr[Boolean] = js.undefined
      
      /**
        * This property is used as the modal header's title. It is required
        * for a11y reasons.
        */
      @JSName("title")
      var title_Props: String
    }
    object Props {
      
      inline def apply(
        onRequestClose: (FocusEvent[Element, Element]) | KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]) => Unit,
        title: String
      ): Props = {
        val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction1(onRequestClose), title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAria(value: Describedby): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
        
        inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
        
        inline def setBodyOpenClassName(value: String): Self = StObject.set(x, "bodyOpenClassName", value.asInstanceOf[js.Any])
        
        inline def setBodyOpenClassNameUndefined: Self = StObject.set(x, "bodyOpenClassName", js.undefined)
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setCloseButtonLabel(value: String): Self = StObject.set(x, "closeButtonLabel", value.asInstanceOf[js.Any])
        
        inline def setCloseButtonLabelUndefined: Self = StObject.set(x, "closeButtonLabel", js.undefined)
        
        inline def setFocusOnMount(value: Boolean): Self = StObject.set(x, "focusOnMount", value.asInstanceOf[js.Any])
        
        inline def setFocusOnMountUndefined: Self = StObject.set(x, "focusOnMount", js.undefined)
        
        inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setIsDismissable(value: Boolean): Self = StObject.set(x, "isDismissable", value.asInstanceOf[js.Any])
        
        inline def setIsDismissableUndefined: Self = StObject.set(x, "isDismissable", js.undefined)
        
        inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
        
        inline def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
        
        inline def setOnRequestClose(
          value: (FocusEvent[Element, Element]) | KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]) => Unit
        ): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
        
        inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
        
        inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
        
        inline def setShouldCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "shouldCloseOnClickOutside", value.asInstanceOf[js.Any])
        
        inline def setShouldCloseOnClickOutsideUndefined: Self = StObject.set(x, "shouldCloseOnClickOutside", js.undefined)
        
        inline def setShouldCloseOnEsc(value: Boolean): Self = StObject.set(x, "shouldCloseOnEsc", value.asInstanceOf[js.Any])
        
        inline def setShouldCloseOnEscUndefined: Self = StObject.set(x, "shouldCloseOnEsc", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
  }
}
