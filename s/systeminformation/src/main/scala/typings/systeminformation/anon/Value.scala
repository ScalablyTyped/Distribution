package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var passed: Boolean
  
  var string: java.lang.String
  
  var value: Double
}
object Value {
  
  inline def apply(passed: Boolean, string: java.lang.String, value: Double): Value = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
