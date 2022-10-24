package typings.wixStyleReact.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.wixStyleReact.wixStyleReactStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  var as: js.UndefOr[button] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
}
object OnClick {
  
  inline def apply(): OnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setAs(value: button): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
