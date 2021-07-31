package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleDeclaration
  extends StObject
     with AST {
  
  var endingToken: ASTSpan
  
  var modifiers: js.Array[PullElementFlags]
  
  var moduleElements: ISyntaxList2
  
  var name: AST
  
  var stringLiteral: StringLiteral
  
  def structuralEquals(ast: ModuleDeclaration, includingPosition: Boolean): Boolean
}
object ModuleDeclaration {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    endingToken: ASTSpan,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    modifiers: js.Array[PullElementFlags],
    moduleElements: ISyntaxList2,
    name: AST,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    stringLiteral: StringLiteral,
    structuralEquals: (ModuleDeclaration, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), endingToken = endingToken.asInstanceOf[js.Any], fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), modifiers = modifiers.asInstanceOf[js.Any], moduleElements = moduleElements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), stringLiteral = stringLiteral.asInstanceOf[js.Any], structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ModuleDeclaration]
  }
  
  @scala.inline
  implicit class ModuleDeclarationMutableBuilder[Self <: ModuleDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndingToken(value: ASTSpan): Self = StObject.set(x, "endingToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiers(value: js.Array[PullElementFlags]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersVarargs(value: PullElementFlags*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModuleElements(value: ISyntaxList2): Self = StObject.set(x, "moduleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AST): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringLiteral(value: StringLiteral): Self = StObject.set(x, "stringLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuralEquals(value: (ModuleDeclaration, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
  }
}
