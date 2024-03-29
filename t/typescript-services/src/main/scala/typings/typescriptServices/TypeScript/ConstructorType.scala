package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorType
  extends StObject
     with AST {
  
  var parameterList: ParameterList
  
  var `type`: AST
  
  var typeParameterList: TypeParameterList
}
object ConstructorType {
  
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
    parameterList: ParameterList,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    `type`: AST,
    typeParameterList: TypeParameterList,
    width: () => Double
  ): ConstructorType = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parameterList = parameterList.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeParameterList = typeParameterList.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstructorType] (val x: Self) extends AnyVal {
    
    inline def setParameterList(value: ParameterList): Self = StObject.set(x, "parameterList", value.asInstanceOf[js.Any])
    
    inline def setType(value: AST): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameterList(value: TypeParameterList): Self = StObject.set(x, "typeParameterList", value.asInstanceOf[js.Any])
  }
}
