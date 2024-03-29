package typings.wixStyleReact.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.wixStyleReact.wixStyleReactStrings.a
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagName extends StObject {
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  
  var tagName: a
}
object TagName {
  
  inline def apply(): TagName = {
    val __obj = js.Dynamic.literal(tagName = "a")
    __obj.asInstanceOf[TagName]
  }
  
  extension [Self <: TagName](x: Self) {
    
    inline def setOnClick(value: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTagName(value: a): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
