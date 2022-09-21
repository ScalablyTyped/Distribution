package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceUnit
  extends StObject
     with AST {
  
  /* private */ var _fileName: Any
  
  var endOfFileTokenLeadingComments: js.Array[Comment]
  
  var moduleElements: ISyntaxList2
  
  def structuralEquals(ast: SourceUnit, includingPosition: Boolean): Boolean
}
object SourceUnit {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _fileName: Any,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    endOfFileTokenLeadingComments: js.Array[Comment],
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    moduleElements: ISyntaxList2,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (SourceUnit, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): SourceUnit = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), endOfFileTokenLeadingComments = endOfFileTokenLeadingComments.asInstanceOf[js.Any], fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), moduleElements = moduleElements.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[SourceUnit]
  }
  
  extension [Self <: SourceUnit](x: Self) {
    
    inline def setEndOfFileTokenLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "endOfFileTokenLeadingComments", value.asInstanceOf[js.Any])
    
    inline def setEndOfFileTokenLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "endOfFileTokenLeadingComments", js.Array(value*))
    
    inline def setModuleElements(value: ISyntaxList2): Self = StObject.set(x, "moduleElements", value.asInstanceOf[js.Any])
    
    inline def setStructuralEquals(value: (SourceUnit, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
  }
}
