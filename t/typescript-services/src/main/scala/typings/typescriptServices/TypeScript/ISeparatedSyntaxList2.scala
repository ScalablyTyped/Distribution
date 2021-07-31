package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISeparatedSyntaxList2
  extends StObject
     with AST {
  
  var _fileName: js.Any
  
  var _separatorCount: js.Any
  
  var members: js.Any
  
  def nonSeparatorAt(index: Double): AST
  
  def nonSeparatorCount(): Double
  
  def nonSeparatorIndexOf(ast: AST): Double
  
  def separatorCount(): Double
  
  def structuralEquals(ast: ISeparatedSyntaxList2, includingPosition: Boolean): Boolean
}
object ISeparatedSyntaxList2 {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _fileName: js.Any,
    _postComments: js.Any,
    _preComments: js.Any,
    _separatorCount: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    members: js.Any,
    nonSeparatorAt: Double => AST,
    nonSeparatorCount: () => Double,
    nonSeparatorIndexOf: AST => Double,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    separatorCount: () => Double,
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (ISeparatedSyntaxList2, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ISeparatedSyntaxList2 = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _separatorCount = _separatorCount.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), members = members.asInstanceOf[js.Any], nonSeparatorAt = js.Any.fromFunction1(nonSeparatorAt), nonSeparatorCount = js.Any.fromFunction0(nonSeparatorCount), nonSeparatorIndexOf = js.Any.fromFunction1(nonSeparatorIndexOf), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), separatorCount = js.Any.fromFunction0(separatorCount), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ISeparatedSyntaxList2]
  }
  
  @scala.inline
  implicit class ISeparatedSyntaxList2MutableBuilder[Self <: ISeparatedSyntaxList2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Any): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonSeparatorAt(value: Double => AST): Self = StObject.set(x, "nonSeparatorAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNonSeparatorCount(value: () => Double): Self = StObject.set(x, "nonSeparatorCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNonSeparatorIndexOf(value: AST => Double): Self = StObject.set(x, "nonSeparatorIndexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeparatorCount(value: () => Double): Self = StObject.set(x, "separatorCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStructuralEquals(value: (ISeparatedSyntaxList2, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_fileName(value: js.Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_separatorCount(value: js.Any): Self = StObject.set(x, "_separatorCount", value.asInstanceOf[js.Any])
  }
}
