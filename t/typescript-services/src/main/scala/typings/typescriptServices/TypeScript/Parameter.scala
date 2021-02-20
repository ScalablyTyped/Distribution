package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter extends AST {
  
  var dotDotDotToken: ASTSpan = js.native
  
  var equalsValueClause: EqualsValueClause = js.native
  
  var identifier: Identifier = js.native
  
  var modifiers: js.Array[PullElementFlags] = js.native
  
  var questionToken: ASTSpan = js.native
  
  var typeAnnotation: TypeAnnotation = js.native
}
object Parameter {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    dotDotDotToken: ASTSpan,
    end: () => Double,
    equalsValueClause: EqualsValueClause,
    fileName: () => String,
    identifier: Identifier,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    modifiers: js.Array[PullElementFlags],
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    questionToken: ASTSpan,
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    typeAnnotation: TypeAnnotation,
    width: () => Double
  ): Parameter = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], dotDotDotToken = dotDotDotToken.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), equalsValueClause = equalsValueClause.asInstanceOf[js.Any], fileName = js.Any.fromFunction0(fileName), identifier = identifier.asInstanceOf[js.Any], isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), modifiers = modifiers.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), questionToken = questionToken.asInstanceOf[js.Any], setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeAnnotation = typeAnnotation.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDotDotDotToken(value: ASTSpan): Self = StObject.set(x, "dotDotDotToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualsValueClause(value: EqualsValueClause): Self = StObject.set(x, "equalsValueClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiers(value: js.Array[PullElementFlags]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersVarargs(value: PullElementFlags*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    @scala.inline
    def setQuestionToken(value: ASTSpan): Self = StObject.set(x, "questionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
