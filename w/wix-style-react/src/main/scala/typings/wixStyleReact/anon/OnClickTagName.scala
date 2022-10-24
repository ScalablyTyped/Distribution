package typings.wixStyleReact.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import typings.wixStyleReact.wixStyleReactStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClickTagName extends StObject {
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  var tagName: js.UndefOr[span] = js.undefined
}
object OnClickTagName {
  
  inline def apply(): OnClickTagName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClickTagName]
  }
  
  extension [Self <: OnClickTagName](x: Self) {
    
    inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTagName(value: span): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
