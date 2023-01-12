package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value2x extends StObject {
  
  var value1: Double
  
  var value2x: Double
}
object Value2x {
  
  inline def apply(value1: Double, value2x: Double): Value2x = {
    val __obj = js.Dynamic.literal(value1 = value1.asInstanceOf[js.Any], value2x = value2x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value2x]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value2x] (val x: Self) extends AnyVal {
    
    inline def setValue1(value: Double): Self = StObject.set(x, "value1", value.asInstanceOf[js.Any])
    
    inline def setValue2x(value: Double): Self = StObject.set(x, "value2x", value.asInstanceOf[js.Any])
  }
}
