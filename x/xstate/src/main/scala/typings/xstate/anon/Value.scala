package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[TC] extends StObject {
  
  var context: TC
  
  var value: Any
}
object Value {
  
  inline def apply[TC](context: TC, value: Any): Value[TC] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[TC]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value[?], TC] (val x: Self & Value[TC]) extends AnyVal {
    
    inline def setContext(value: TC): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
