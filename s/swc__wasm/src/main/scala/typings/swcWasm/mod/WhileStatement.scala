package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhileStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  var body: Statement
  
  var test: Expression
  
  @JSName("type")
  var type_WhileStatement: typings.swcWasm.swcWasmStrings.WhileStatement
}
object WhileStatement {
  
  inline def apply(body: Statement, span: Span, test: Expression): WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[WhileStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhileStatement] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
