package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueArray extends StObject {
  
  var label: String
  
  var value: js.Array[typings.react.mod.global.JSX.Element]
}
object ValueArray {
  
  inline def apply(label: String, value: js.Array[typings.react.mod.global.JSX.Element]): ValueArray = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueArray]
  }
  
  extension [Self <: ValueArray](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[typings.react.mod.global.JSX.Element]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: typings.react.mod.global.JSX.Element*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
