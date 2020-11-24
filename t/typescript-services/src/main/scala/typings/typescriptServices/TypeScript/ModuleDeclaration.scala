package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleDeclaration extends AST {
  
  var endingToken: ASTSpan = js.native
  
  var modifiers: js.Array[PullElementFlags] = js.native
  
  var moduleElements: ISyntaxList2 = js.native
  
  var name: AST = js.native
  
  var stringLiteral: StringLiteral = js.native
  
  def structuralEquals(ast: ModuleDeclaration, includingPosition: Boolean): Boolean = js.native
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
  implicit class ModuleDeclarationOps[Self <: ModuleDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndingToken(value: ASTSpan): Self = this.set("endingToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersVarargs(value: PullElementFlags*): Self = this.set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[PullElementFlags]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleElements(value: ISyntaxList2): Self = this.set("moduleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AST): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringLiteral(value: StringLiteral): Self = this.set("stringLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuralEquals(value: (ModuleDeclaration, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
  }
}
