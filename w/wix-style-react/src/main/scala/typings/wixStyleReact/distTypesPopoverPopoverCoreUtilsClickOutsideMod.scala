package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.HTMLElement
import typings.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverPopoverCoreUtilsClickOutsideMod {
  
  @JSImport("wix-style-react/dist/types/Popover/PopoverCore/utils/ClickOutside", "ClickOutside")
  @js.native
  open class ClickOutside protected ()
    extends PureComponent[ClickOutsideProps, js.Object, Any] {
    def this(props: ClickOutsideProps) = this()
    
    /* private */ val _boundEvents: Any = js.native
    
    /**
      * Check whether the click is inside the element or excluded
      * @param event - Click event
      */
    /**
      * Check whether the click is inside the element or excluded
      * @param event - Click event
      */
    def _isInsideClick(event: Any): js.UndefOr[`true`] = js.native
    
    /**
      * Triggers onClickOutside callback when clicked outside child
      * @param event - Click event
      */
    def _onClickOutside(event: Event): Unit = js.native
    
    /**
      * Register ClickOutside events
      */
    def _registerEvents(): Unit = js.native
    
    /**
      * Unregister ClickOutside events
      */
    def _unregisterEvents(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MClickOutside(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MClickOutside(prevProps: ClickOutsideProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MClickOutside(): Unit = js.native
  }
  
  trait ClickOutsideProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Elements with this class will not trigger onClickOutside callback */
    var excludeClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** A callback to be triggered when all requirements for "outside click" are met */
    var onClickOutside: js.UndefOr[js.Function] = js.undefined
    
    /** useCapture | options object, specifies characteristics about the event listener */
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.undefined
    
    /** A reference to the child root element */
    var rootRef: RefObject[HTMLElement]
  }
  object ClickOutsideProps {
    
    inline def apply(rootRef: RefObject[HTMLElement]): ClickOutsideProps = {
      val __obj = js.Dynamic.literal(rootRef = rootRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickOutsideProps]
    }
    
    extension [Self <: ClickOutsideProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setExcludeClass(value: String | js.Array[String]): Self = StObject.set(x, "excludeClass", value.asInstanceOf[js.Any])
      
      inline def setExcludeClassUndefined: Self = StObject.set(x, "excludeClass", js.undefined)
      
      inline def setExcludeClassVarargs(value: String*): Self = StObject.set(x, "excludeClass", js.Array(value*))
      
      inline def setOnClickOutside(value: js.Function): Self = StObject.set(x, "onClickOutside", value.asInstanceOf[js.Any])
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRootRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
    }
  }
}
