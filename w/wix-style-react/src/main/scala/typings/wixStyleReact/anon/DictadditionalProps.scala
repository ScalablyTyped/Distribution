package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictadditionalProps
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var as: ComponentType[Any]
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}
object DictadditionalProps {
  
  inline def apply(as: ComponentType[Any]): DictadditionalProps = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictadditionalProps]
  }
  
  extension [Self <: DictadditionalProps](x: Self) {
    
    inline def setAs(value: ComponentType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
