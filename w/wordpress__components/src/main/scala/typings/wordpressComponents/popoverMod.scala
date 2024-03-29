package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.wordpressComponents.anon.Slot
import typings.wordpressComponents.popoverMod.Popover.Props
import typings.wordpressComponents.wordpressComponentsBooleans.`false`
import typings.wordpressComponents.wordpressComponentsStrings.container
import typings.wordpressComponents.wordpressComponentsStrings.firstElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/popover", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] & Slot = js.native
    
    type _To = ComponentType[Props] & Slot
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] & Slot = ^
  }
  
  object Popover {
    
    /**
      * The direction in which the popover should open relative to its parent
      * node. Specify y- and x-axis as a space-separated string.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.wordpressComponentsStrings.`top left`
      - typings.wordpressComponents.wordpressComponentsStrings.`top right`
      - typings.wordpressComponents.wordpressComponentsStrings.`top center`
      - typings.wordpressComponents.wordpressComponentsStrings.`middle left`
      - typings.wordpressComponents.wordpressComponentsStrings.`middle right`
      - typings.wordpressComponents.wordpressComponentsStrings.`middle center`
      - typings.wordpressComponents.wordpressComponentsStrings.`bottom left`
      - typings.wordpressComponents.wordpressComponentsStrings.`bottom right`
      - typings.wordpressComponents.wordpressComponentsStrings.`bottom center`
    */
    trait Position extends StObject
    object Position {
      
      inline def `bottom center`: typings.wordpressComponents.wordpressComponentsStrings.`bottom center` = ("bottom center").asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`bottom center`]
      
      inline def `bottom left`: typings.wordpressComponents.wordpressComponentsStrings.`bottom left` = ("bottom left").asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`bottom left`]
      
      inline def `bottom right`: typings.wordpressComponents.wordpressComponentsStrings.`bottom right` = ("bottom right").asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`bottom right`]
      
      inline def `middle center`: typings.wordpressComponents.wordpressComponentsStrings.`middle center` = ("middle center").asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`middle center`]
      
      inline def `middle left`: typings.wordpressComponents.wordpressComponentsStrings.`middle left` = ("middle left").asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`middle left`]
      
      inline def `middle right`: typings.wordpressComponents.wordpressComponentsStrings.`middle right` = ("middle right").asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`middle right`]
      
      inline def `top center`: typings.wordpressComponents.wordpressComponentsStrings.`top center` = ("top center").asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`top center`]
      
      inline def `top left`: typings.wordpressComponents.wordpressComponentsStrings.`top left` = ("top left").asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`top left`]
      
      inline def `top right`: typings.wordpressComponents.wordpressComponentsStrings.`top right` = ("top right").asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`top right`]
    }
    
    trait Props
      extends StObject
         with HTMLProps[HTMLDivElement] {
      
      /**
        * A custom `DOMRect` object at which to position the popover.
        */
      var anchorRect: js.UndefOr[DOMRect | ClientRect] = js.undefined
      
      /**
        * Should the popover have an animation?
        * @defaultValue true
        */
      var animate: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The content to be displayed within the popover.
        */
      @JSName("children")
      var children_Props: ReactNode
      
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
        * Function that should return a `DOMRect` of where to position the
        * popover.
        */
      var getAnchorRect: js.UndefOr[
            js.Function1[
              /* currentAnchorElement */ HTMLSpanElement | Null, 
              js.UndefOr[DOMRect | ClientRect]
            ]
          ] = js.undefined
      
      /**
        * Set this to customize the text that is shown in popover's header
        * when it is fullscreen on mobile.
        */
      var headerTitle: js.UndefOr[String] = js.undefined
      
      /**
        * Set this to hide the arrow which visually indicates what the popover
        * is anchored to. Note that the arrow will not display if `position` is
        * set to `"middle center"`.
        */
      var noArrow: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A callback invoked when the user clicks outside the opened popover,
        * passing the click event. The popover should be closed in response to
        * this interaction.
        *
        * @deprecated  use `onFocusOutside`
        */
      var onClickOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * A callback invoked when the popover should be closed.
        */
      var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * A callback invoked when the focus leaves the opened popover. This
        * should only be provided in advanced use-cases when a Popover should
        * close under specific circumstances; for example, if the new
        * `document.activeElement` is content of or otherwise controlling
        * Popover visibility.
        *
        * Defaults to `onClose` when not provided.
        */
      var onFocusOutside: js.UndefOr[js.Function1[/* event */ FocusEvent[Element, Element], Unit]] = js.undefined
      
      /**
        * The direction in which the popover should open relative to its
        * parent node. Specify y- and x-axis as a space-separated string.
        * @defaultValue "top center"
        */
      var position: js.UndefOr[Position] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setAnchorRect(value: DOMRect | ClientRect): Self = StObject.set(x, "anchorRect", value.asInstanceOf[js.Any])
        
        inline def setAnchorRectUndefined: Self = StObject.set(x, "anchorRect", js.undefined)
        
        inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setExpandOnMobile(value: Boolean): Self = StObject.set(x, "expandOnMobile", value.asInstanceOf[js.Any])
        
        inline def setExpandOnMobileUndefined: Self = StObject.set(x, "expandOnMobile", js.undefined)
        
        inline def setFocusOnMount(value: firstElement | container | `false`): Self = StObject.set(x, "focusOnMount", value.asInstanceOf[js.Any])
        
        inline def setFocusOnMountUndefined: Self = StObject.set(x, "focusOnMount", js.undefined)
        
        inline def setGetAnchorRect(value: /* currentAnchorElement */ HTMLSpanElement | Null => js.UndefOr[DOMRect | ClientRect]): Self = StObject.set(x, "getAnchorRect", js.Any.fromFunction1(value))
        
        inline def setGetAnchorRectUndefined: Self = StObject.set(x, "getAnchorRect", js.undefined)
        
        inline def setHeaderTitle(value: String): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
        
        inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
        
        inline def setNoArrow(value: Boolean): Self = StObject.set(x, "noArrow", value.asInstanceOf[js.Any])
        
        inline def setNoArrowUndefined: Self = StObject.set(x, "noArrow", js.undefined)
        
        inline def setOnClickOutside(value: () => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction0(value))
        
        inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
        
        inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
        
        inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        inline def setOnFocusOutside(value: /* event */ FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onFocusOutside", js.Any.fromFunction1(value))
        
        inline def setOnFocusOutsideUndefined: Self = StObject.set(x, "onFocusOutside", js.undefined)
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
  }
}
