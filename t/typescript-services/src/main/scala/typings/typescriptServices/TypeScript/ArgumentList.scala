package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentList
  extends StObject
     with AST {
  
  var arguments: ISeparatedSyntaxList2
  
  var closeParenToken: ASTSpan
  
  var typeArgumentList: TypeArgumentList
}
object ArgumentList {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    arguments: ISeparatedSyntaxList2,
    closeParenToken: ASTSpan,
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
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    typeArgumentList: TypeArgumentList,
    width: () => Double
  ): ArgumentList = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], arguments = arguments.asInstanceOf[js.Any], closeParenToken = closeParenToken.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeArgumentList = typeArgumentList.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ArgumentList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgumentList] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: ISeparatedSyntaxList2): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCloseParenToken(value: ASTSpan): Self = StObject.set(x, "closeParenToken", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentList(value: TypeArgumentList): Self = StObject.set(x, "typeArgumentList", value.asInstanceOf[js.Any])
  }
}
