package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TryStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  var block: BlockStatement
  
  var finalizer: js.UndefOr[BlockStatement] = js.undefined
  
  var handler: js.UndefOr[CatchClause] = js.undefined
  
  @JSName("type")
  var type_TryStatement: typings.swcWasm.swcWasmStrings.TryStatement
}
object TryStatement {
  
  inline def apply(block: BlockStatement, span: Span): TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[TryStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TryStatement] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: BlockStatement): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setFinalizer(value: BlockStatement): Self = StObject.set(x, "finalizer", value.asInstanceOf[js.Any])
    
    inline def setFinalizerUndefined: Self = StObject.set(x, "finalizer", js.undefined)
    
    inline def setHandler(value: CatchClause): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TryStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
