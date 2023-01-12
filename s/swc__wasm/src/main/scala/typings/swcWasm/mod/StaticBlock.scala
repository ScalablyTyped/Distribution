package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticBlock
  extends StObject
     with Node
     with HasSpan
     with ClassMember {
  
  var body: BlockStatement
  
  @JSName("type")
  var type_StaticBlock: typings.swcWasm.swcWasmStrings.StaticBlock
}
object StaticBlock {
  
  inline def apply(body: BlockStatement, span: Span): StaticBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[StaticBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticBlock] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.StaticBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
