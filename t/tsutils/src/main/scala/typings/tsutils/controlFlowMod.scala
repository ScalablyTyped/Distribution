package typings.tsutils

import typings.tsutils.anon.ExpressionStatementexpres
import typings.typescript.mod.BlockLike
import typings.typescript.mod.BreakStatement
import typings.typescript.mod.CallExpression
import typings.typescript.mod.ContinueStatement
import typings.typescript.mod.ReturnStatement
import typings.typescript.mod.Statement
import typings.typescript.mod.ThrowStatement
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlFlowMod {
  
  @JSImport("tsutils/util/control-flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SignatureEffect extends StObject
  @JSImport("tsutils/util/control-flow", "SignatureEffect")
  @js.native
  object SignatureEffect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SignatureEffect & Double] = js.native
    
    @js.native
    sealed trait Asserts
      extends StObject
         with SignatureEffect
    /* 2 */ val Asserts: typings.tsutils.controlFlowMod.SignatureEffect.Asserts & Double = js.native
    
    @js.native
    sealed trait Never
      extends StObject
         with SignatureEffect
    /* 1 */ val Never: typings.tsutils.controlFlowMod.SignatureEffect.Never & Double = js.native
  }
  
  inline def callExpressionAffectsControlFlow(node: CallExpression, checker: TypeChecker): js.UndefOr[SignatureEffect] = (^.asInstanceOf[js.Dynamic].applyDynamic("callExpressionAffectsControlFlow")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SignatureEffect]]
  
  inline def endsControlFlow(statement: BlockLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: BlockLike, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: Statement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: Statement, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getControlFlowEnd(statement: BlockLike): ControlFlowEnd = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any]).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: BlockLike, checker: TypeChecker): ControlFlowEnd = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: Statement): ControlFlowEnd = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any]).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: Statement, checker: TypeChecker): ControlFlowEnd = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[ControlFlowEnd]
  
  trait ControlFlowEnd extends StObject {
    
    /** `true` if control flow definitely ends. */
    val end: Boolean
    
    /**
      * Statements that may end control flow at this statement.
      * Does not contain control flow statements that jump only inside the statement, for example a `continue` inside a nested for loop.
      */
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
      
      inline def setStatementsVarargs(value: ControlFlowStatement*): Self = StObject.set(x, "statements", js.Array(value*))
    }
  }
  
  type ControlFlowStatement = BreakStatement | ContinueStatement | ReturnStatement | ThrowStatement | ExpressionStatementexpres
}
