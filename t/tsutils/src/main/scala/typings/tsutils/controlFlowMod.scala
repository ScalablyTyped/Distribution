package typings.tsutils

import typings.typescript.mod.BlockLike
import typings.typescript.mod.BreakStatement
import typings.typescript.mod.ContinueStatement
import typings.typescript.mod.ReturnStatement
import typings.typescript.mod.Statement
import typings.typescript.mod.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlFlowMod {
  
  @JSImport("tsutils/util/control-flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endsControlFlow(statement: BlockLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: Statement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getControlFlowEnd(statement: BlockLike): ControlFlowEnd = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any]).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: Statement): ControlFlowEnd = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any]).asInstanceOf[ControlFlowEnd]
  
  trait ControlFlowEnd extends StObject {
    
    val end: Boolean
    
    val statements: js.Array[ControlFlowStatement]
  }
  object ControlFlowEnd {
    
    inline def apply(end: Boolean, statements: js.Array[ControlFlowStatement]): ControlFlowEnd = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlFlowEnd]
    }
    
    extension [Self <: ControlFlowEnd](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: js.Array[ControlFlowStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsVarargs(value: ControlFlowStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
    }
  }
  
  type ControlFlowStatement = BreakStatement | ContinueStatement | ReturnStatement | ThrowStatement
}
