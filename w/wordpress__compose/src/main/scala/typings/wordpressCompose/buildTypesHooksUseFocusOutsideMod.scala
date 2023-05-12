package typings.wordpressCompose

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseFocusOutsideMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-focus-outside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(onFocusOutside: js.Function1[/* event */ FocusEvent[Element, Element], Unit]): UseFocusOutsideReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(onFocusOutside.asInstanceOf[js.Any]).asInstanceOf[UseFocusOutsideReturn]
  
  trait UseFocusOutsideReturn extends StObject {
    
    var onBlur: FocusEventHandler[Element]
    
    var onFocus: FocusEventHandler[Element]
    
    var onMouseDown: MouseEventHandler[Element]
    
    var onMouseUp: MouseEventHandler[Element]
    
    var onTouchEnd: TouchEventHandler[Element]
    
    var onTouchStart: TouchEventHandler[Element]
  }
  object UseFocusOutsideReturn {
    
    inline def apply(
      onBlur: FocusEvent[Element, Element] => Unit,
      onFocus: FocusEvent[Element, Element] => Unit,
      onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
      onMouseUp: MouseEvent[Element, NativeMouseEvent] => Unit,
      onTouchEnd: TouchEvent[Element] => Unit,
      onTouchStart: TouchEvent[Element] => Unit
    ): UseFocusOutsideReturn = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart))
      __obj.asInstanceOf[UseFocusOutsideReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseFocusOutsideReturn] (val x: Self) extends AnyVal {
      
      inline def setOnBlur(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseUp(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnTouchEnd(value: TouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchStart(value: TouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    }
  }
}
