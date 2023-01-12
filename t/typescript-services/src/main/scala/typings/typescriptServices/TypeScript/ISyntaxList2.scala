package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxList2
  extends StObject
     with AST {
  
  /* private */ var _fileName: Any
  
  def any(func: js.Function1[/* v */ AST, Boolean]): Boolean
  
  def childAt(index: Double): AST
  
  def childCount(): Double
  
  def firstOrDefault(func: js.Function2[/* v */ AST, /* index */ Double, Boolean]): AST
  
  def lastOrDefault(func: js.Function2[/* v */ AST, /* index */ Double, Boolean]): AST
  
  /* private */ var members: Any
  
  def structuralEquals(ast: ISyntaxList2, includingPosition: Boolean): Boolean
}
object ISyntaxList2 {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _fileName: Any,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    any: js.Function1[/* v */ AST, Boolean] => Boolean,
    childAt: Double => AST,
    childCount: () => Double,
    end: () => Double,
    fileName: () => String,
    firstOrDefault: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    lastOrDefault: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST,
    members: Any,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (ISyntaxList2, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ISyntaxList2 = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], any = js.Any.fromFunction1(any), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), firstOrDefault = js.Any.fromFunction1(firstOrDefault), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), lastOrDefault = js.Any.fromFunction1(lastOrDefault), members = members.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ISyntaxList2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISyntaxList2] (val x: Self) extends AnyVal {
    
    inline def setAny(value: js.Function1[/* v */ AST, Boolean] => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction1(value))
    
    inline def setChildAt(value: Double => AST): Self = StObject.set(x, "childAt", js.Any.fromFunction1(value))
    
    inline def setChildCount(value: () => Double): Self = StObject.set(x, "childCount", js.Any.fromFunction0(value))
    
    inline def setFirstOrDefault(value: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST): Self = StObject.set(x, "firstOrDefault", js.Any.fromFunction1(value))
    
    inline def setLastOrDefault(value: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST): Self = StObject.set(x, "lastOrDefault", js.Any.fromFunction1(value))
    
    inline def setMembers(value: Any): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setStructuralEquals(value: (ISyntaxList2, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
  }
}
