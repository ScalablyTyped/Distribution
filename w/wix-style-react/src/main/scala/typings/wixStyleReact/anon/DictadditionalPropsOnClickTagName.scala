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

trait DictadditionalPropsOnClickTagName
  extends StObject
     with /* additionalProps */ StringDictionary[js.Any] {
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  var tagName: ComponentType[js.Any]
}
object DictadditionalPropsOnClickTagName {
  
  inline def apply(tagName: ComponentType[js.Any]): DictadditionalPropsOnClickTagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictadditionalPropsOnClickTagName]
  }
  
  extension [Self <: DictadditionalPropsOnClickTagName](x: Self) {
    
    inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTagName(value: ComponentType[js.Any]): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
