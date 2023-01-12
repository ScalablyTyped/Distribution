package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeritageClause
  extends StObject
     with AST {
  
  /* private */ var _nodeType: Any
  
  def structuralEquals(ast: HeritageClause, includingPosition: Boolean): Boolean
  
  var typeNames: ISeparatedSyntaxList2
}
object HeritageClause {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _nodeType: Any,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
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
    structuralEquals: (HeritageClause, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    typeNames: ISeparatedSyntaxList2,
    width: () => Double
  ): HeritageClause = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _nodeType = _nodeType.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeNames = typeNames.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[HeritageClause]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeritageClause] (val x: Self) extends AnyVal {
    
    inline def setStructuralEquals(value: (HeritageClause, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def setTypeNames(value: ISeparatedSyntaxList2): Self = StObject.set(x, "typeNames", value.asInstanceOf[js.Any])
    
    inline def set_nodeType(value: Any): Self = StObject.set(x, "_nodeType", value.asInstanceOf[js.Any])
  }
}
