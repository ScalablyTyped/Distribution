package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Script
  extends StObject
     with Node
     with HasSpan
     with HasInterpreter
     with Program {
  
  var body: js.Array[Statement]
  
  @JSName("type")
  var type_Script: typings.swcCore.swcCoreStrings.Script
}
object Script {
  
  inline def apply(body: js.Array[Statement], interpreter: String, span: Span): Script = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], interpreter = interpreter.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Script")
    __obj.asInstanceOf[Script]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Script] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.Script): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
