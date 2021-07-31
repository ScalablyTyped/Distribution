package typings.wixUiCore

import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.std.AddEventListenerOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsClickOutsideClickOutsideMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/click-outside/ClickOutside", "ClickOutside")
  @js.native
  class ClickOutside protected ()
    extends PureComponent[ClickOutsideProps, js.Object, js.Any] {
    def this(props: js.Any) = this()
    
    val _boundEvents: js.Any = js.native
    
    /**
      * Check whether the click is inside the element or excluded
      * @param event - Click event
      */
    def _isInsideClick(event: js.Any): Boolean = js.native
    
    /**
      * Triggers onClickOutside callback when clicked outside child
      * @param event - Click event
      */
    def _onClickOutside(event: js.Any): Unit = js.native
    
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
    def componentDidUpdate_MClickOutside(prevProps: js.Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MClickOutside(): Unit = js.native
  }
  
  trait ClickOutsideProps extends StObject {
    
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
    
    @scala.inline
    def apply(rootRef: RefObject[HTMLElement]): ClickOutsideProps = {
      val __obj = js.Dynamic.literal(rootRef = rootRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickOutsideProps]
    }
    
    @scala.inline
    implicit class ClickOutsidePropsMutableBuilder[Self <: ClickOutsideProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeClass(value: String | js.Array[String]): Self = StObject.set(x, "excludeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeClassUndefined: Self = StObject.set(x, "excludeClass", js.undefined)
      
      @scala.inline
      def setExcludeClassVarargs(value: String*): Self = StObject.set(x, "excludeClass", js.Array(value :_*))
      
      @scala.inline
      def setOnClickOutside(value: js.Function): Self = StObject.set(x, "onClickOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      @scala.inline
      def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRootRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
    }
  }
}
