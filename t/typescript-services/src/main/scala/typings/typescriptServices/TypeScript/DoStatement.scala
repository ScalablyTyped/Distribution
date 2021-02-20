package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoStatement extends AST {
  
  var condition: AST = js.native
  
  var statement: AST = js.native
  
  def structuralEquals(ast: DoStatement, includingPosition: Boolean): Boolean = js.native
  
  var whileKeyword: ASTSpan = js.native
}
object DoStatement {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    condition: AST,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    statement: AST,
    structuralEquals: (DoStatement, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    whileKeyword: ASTSpan,
    width: () => Double
  ): DoStatement = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), statement = statement.asInstanceOf[js.Any], structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), whileKeyword = whileKeyword.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[DoStatement]
  }
  
  @scala.inline
  implicit class DoStatementMutableBuilder[Self <: DoStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: AST): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement(value: AST): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuralEquals(value: (DoStatement, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWhileKeyword(value: ASTSpan): Self = StObject.set(x, "whileKeyword", value.asInstanceOf[js.Any])
  }
}
