package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AST
  extends StObject
     with IASTSpan {
  
  /* private */ var _astID: Any
  
  /* private */ var _postComments: Any
  
  /* private */ var _preComments: Any
  
  var _trailingTriviaWidth: Double
  
  def fileName(): String
  
  def isExpression(): Boolean
  
  def kind(): SyntaxKind
  
  var parent: AST
  
  def postComments(): js.Array[Comment]
  
  def preComments(): js.Array[Comment]
  
  def setPostComments(comments: js.Array[Comment]): Unit
  
  def setPreComments(comments: js.Array[Comment]): Unit
  
  def structuralEquals(ast: AST, includingPosition: Boolean): Boolean
  
  def syntaxID(): Double
  
  def trailingTriviaWidth(): Double
  
  def width(): Double
}
object AST {
  
  inline def apply(
    _astID: Any,
    _end: Double,
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
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): AST = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[AST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AST] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: () => String): Self = StObject.set(x, "fileName", js.Any.fromFunction0(value))
    
    inline def setIsExpression(value: () => Boolean): Self = StObject.set(x, "isExpression", js.Any.fromFunction0(value))
    
    inline def setKind(value: () => SyntaxKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    inline def setParent(value: AST): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPostComments(value: () => js.Array[Comment]): Self = StObject.set(x, "postComments", js.Any.fromFunction0(value))
    
    inline def setPreComments(value: () => js.Array[Comment]): Self = StObject.set(x, "preComments", js.Any.fromFunction0(value))
    
    inline def setSetPostComments(value: js.Array[Comment] => Unit): Self = StObject.set(x, "setPostComments", js.Any.fromFunction1(value))
    
    inline def setSetPreComments(value: js.Array[Comment] => Unit): Self = StObject.set(x, "setPreComments", js.Any.fromFunction1(value))
    
    inline def setStructuralEquals(value: (AST, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def setSyntaxID(value: () => Double): Self = StObject.set(x, "syntaxID", js.Any.fromFunction0(value))
    
    inline def setTrailingTriviaWidth(value: () => Double): Self = StObject.set(x, "trailingTriviaWidth", js.Any.fromFunction0(value))
    
    inline def setWidth(value: () => Double): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    
    inline def set_astID(value: Any): Self = StObject.set(x, "_astID", value.asInstanceOf[js.Any])
    
    inline def set_postComments(value: Any): Self = StObject.set(x, "_postComments", value.asInstanceOf[js.Any])
    
    inline def set_preComments(value: Any): Self = StObject.set(x, "_preComments", value.asInstanceOf[js.Any])
    
    inline def set_trailingTriviaWidth(value: Double): Self = StObject.set(x, "_trailingTriviaWidth", value.asInstanceOf[js.Any])
  }
}
