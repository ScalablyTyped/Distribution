package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dropdownMod.Dropdown.Props
import typings.wordpressComponents.popoverMod.Popover.Position
import typings.wordpressComponents.wordpressComponentsBooleans.`false`
import typings.wordpressComponents.wordpressComponentsStrings.container
import typings.wordpressComponents.wordpressComponentsStrings.firstElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/dropdown", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Dropdown {
    
    trait Props extends StObject {
      
      /**
        * `className` of the global container.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * If you want to target the dropdown menu for styling purposes, you
        * need to provide a `contentClassName` because it's not being rendered
        * as a children of the container node.
        */
      var contentClassName: js.UndefOr[String] = js.undefined
      
      /**
        * Opt-in prop to show popovers fullscreen on mobile.
        */
      var expandOnMobile: js.UndefOr[Boolean] = js.undefined
      
      /**
        * By default, the first tabblable element in the popover will receive
        * focus when it mounts. This is the same as setting focusOnMount to
        * `"firstElement"`. If you want to focus the container instead, you can
        * set focusOnMount to `"container"`.
        *
        * Set this prop to `false` to disable focus changing entirely. This
        * should only be set when an appropriately accessible substitute
        * behavior exists.
        *
        * @defaultValue "firstElement"
        */
      var focusOnMount: js.UndefOr[firstElement | container | `false`] = js.undefined
      
      /**
        * Set this to customize the text that is shown in the dropdown's
        * header when it is fullscreen on mobile.
        */
      var headerTitle: js.UndefOr[ReactNode] = js.undefined
      
      /**
        * The direction in which the popover should open relative to its
        * parent node. Specify y- and x-axis as a space-separated string.
        * @defaultValue "top center"
        */
      var position: js.UndefOr[Position] = js.undefined
      
      def renderContent(props: RenderProps): Element
      
      def renderToggle(props: RenderProps): Element
    }
    object Props {
      
      inline def apply(renderContent: RenderProps => Element, renderToggle: RenderProps => Element): Props = {
        val __obj = js.Dynamic.literal(renderContent = js.Any.fromFunction1(renderContent), renderToggle = js.Any.fromFunction1(renderToggle))
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
        
        inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
        
        inline def setExpandOnMobile(value: Boolean): Self = StObject.set(x, "expandOnMobile", value.asInstanceOf[js.Any])
        
        inline def setExpandOnMobileUndefined: Self = StObject.set(x, "expandOnMobile", js.undefined)
        
        inline def setFocusOnMount(value: firstElement | container | `false`): Self = StObject.set(x, "focusOnMount", value.asInstanceOf[js.Any])
        
        inline def setFocusOnMountUndefined: Self = StObject.set(x, "focusOnMount", js.undefined)
        
        inline def setHeaderTitle(value: ReactNode): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
        
        inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setRenderContent(value: RenderProps => Element): Self = StObject.set(x, "renderContent", js.Any.fromFunction1(value))
        
        inline def setRenderToggle(value: RenderProps => Element): Self = StObject.set(x, "renderToggle", js.Any.fromFunction1(value))
      }
    }
    
    trait RenderProps extends StObject {
      
      /**
        * Whether the dropdown menu is opened or not.
        */
      var isOpen: Boolean
      
      /**
        * A function that closes the menu if invoked.
        */
      def onClose(): Unit
      
      /**
        * A function switching the dropdown menu's state from open to closed
        * and vice versa.
        */
      def onToggle(): Unit
    }
    object RenderProps {
      
      inline def apply(isOpen: Boolean, onClose: () => Unit, onToggle: () => Unit): RenderProps = {
        val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onToggle = js.Any.fromFunction0(onToggle))
        __obj.asInstanceOf[RenderProps]
      }
      
      extension [Self <: RenderProps](x: Self) {
        
        inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
        
        inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
        
        inline def setOnToggle(value: () => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction0(value))
      }
    }
  }
}
