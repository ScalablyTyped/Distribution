package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  var stmts: js.Array[Statement]
  
  @JSName("type")
  var type_BlockStatement: typings.swcCore.swcCoreStrings.BlockStatement
}
object BlockStatement {
  
  inline def apply(span: Span, stmts: js.Array[Statement]): BlockStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[BlockStatement]
  }
  
  extension [Self <: BlockStatement](x: Self) {
    
    inline def setStmts(value: js.Array[Statement]): Self = StObject.set(x, "stmts", value.asInstanceOf[js.Any])
    
    inline def setStmtsVarargs(value: Statement*): Self = StObject.set(x, "stmts", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.BlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
