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

trait DictadditionalPropsOnClick
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  var tagName: ComponentType[Any]
}
object DictadditionalPropsOnClick {
  
  inline def apply(tagName: ComponentType[Any]): DictadditionalPropsOnClick = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictadditionalPropsOnClick]
  }
  
  extension [Self <: DictadditionalPropsOnClick](x: Self) {
    
    inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTagName(value: ComponentType[Any]): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
