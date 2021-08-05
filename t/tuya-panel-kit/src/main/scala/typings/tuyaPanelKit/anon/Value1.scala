package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value1 extends StObject {
  
  var value1: Double
  
  var value2: Double
}
object Value1 {
  
  inline def apply(value1: Double, value2: Double): Value1 = {
    val __obj = js.Dynamic.literal(value1 = value1.asInstanceOf[js.Any], value2 = value2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value1]
  }
  
  extension [Self <: Value1](x: Self) {
    
    inline def setValue1(value: Double): Self = StObject.set(x, "value1", value.asInstanceOf[js.Any])
    
    inline def setValue2(value: Double): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
  }
}
