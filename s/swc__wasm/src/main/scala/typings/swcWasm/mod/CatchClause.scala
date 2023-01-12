package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatchClause
  extends StObject
     with Node
     with HasSpan {
  
  var body: BlockStatement
  
  /**
    * The param is `undefined` if the catch binding is omitted. E.g., `try { foo() } catch {}`
    */
  var param: js.UndefOr[Pattern] = js.undefined
  
  @JSName("type")
  var type_CatchClause: typings.swcWasm.swcWasmStrings.CatchClause
}
object CatchClause {
  
  inline def apply(body: BlockStatement, span: Span): CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[CatchClause]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatchClause] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setParam(value: Pattern): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
