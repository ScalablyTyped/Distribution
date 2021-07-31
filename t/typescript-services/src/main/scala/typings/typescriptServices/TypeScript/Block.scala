package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block
  extends StObject
     with AST {
  
  var closeBraceLeadingComments: js.Array[Comment]
  
  var closeBraceToken: IASTSpan
  
  var statements: ISyntaxList2
  
  def structuralEquals(ast: Block, includingPosition: Boolean): Boolean
}
object Block {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    closeBraceLeadingComments: js.Array[Comment],
    closeBraceToken: IASTSpan,
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
    statements: ISyntaxList2,
    structuralEquals: (Block, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): Block = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], closeBraceLeadingComments = closeBraceLeadingComments.asInstanceOf[js.Any], closeBraceToken = closeBraceToken.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), statements = statements.asInstanceOf[js.Any], structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseBraceLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "closeBraceLeadingComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseBraceLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "closeBraceLeadingComments", js.Array(value :_*))
    
    @scala.inline
    def setCloseBraceToken(value: IASTSpan): Self = StObject.set(x, "closeBraceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatements(value: ISyntaxList2): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuralEquals(value: (Block, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
  }
}
