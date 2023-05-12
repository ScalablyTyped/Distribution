package typings.tonicUiReact.mod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInputProps
  extends StObject
     with InputProps {
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  var onClearInput: MouseEventHandler[Element]
}
object SearchInputProps {
  
  inline def apply(onClearInput: MouseEvent[Element, NativeMouseEvent] => Unit): SearchInputProps = {
    val __obj = js.Dynamic.literal(onClearInput = js.Any.fromFunction1(onClearInput))
    __obj.asInstanceOf[SearchInputProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchInputProps] (val x: Self) extends AnyVal {
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setOnClearInput(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClearInput", js.Any.fromFunction1(value))
  }
}
