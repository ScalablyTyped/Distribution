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

trait DictadditionalPropsAs
  extends StObject
     with /* additionalProps */ StringDictionary[js.Any] {
  
  var as: ComponentType[js.Any]
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}
object DictadditionalPropsAs {
  
  inline def apply(as: ComponentType[js.Any]): DictadditionalPropsAs = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictadditionalPropsAs]
  }
  
  extension [Self <: DictadditionalPropsAs](x: Self) {
    
    inline def setAs(value: ComponentType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
