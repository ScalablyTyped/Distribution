package typings.wixStyleReact.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var label: Validator[String]
  
  var value: Validator[Double]
}
object Value {
  
  inline def apply(label: Validator[String], value: Validator[Double]): Value = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setLabel(value: Validator[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Validator[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
