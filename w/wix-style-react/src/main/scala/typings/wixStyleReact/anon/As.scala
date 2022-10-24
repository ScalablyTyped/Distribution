package typings.wixStyleReact.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.wixStyleReact.wixStyleReactStrings.a
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As extends StObject {
  
  var as: a
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
}
object As {
  
  inline def apply(): As = {
    val __obj = js.Dynamic.literal(as = "a")
    __obj.asInstanceOf[As]
  }
  
  extension [Self <: As](x: Self) {
    
    inline def setAs(value: a): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
