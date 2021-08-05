package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelString extends StObject {
  
  var label: String
  
  def value(extendedProps: js.Any): typings.react.mod.global.JSX.Element
}
object LabelString {
  
  inline def apply(label: String, value: js.Any => typings.react.mod.global.JSX.Element): LabelString = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[LabelString]
  }
  
  extension [Self <: LabelString](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
