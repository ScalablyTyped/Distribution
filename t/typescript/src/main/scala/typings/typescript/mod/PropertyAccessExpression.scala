package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand
- typings.typescript.mod.NamedDeclaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined name */ @js.native
trait PropertyAccessExpression
  extends MemberExpression
     with BindingOrAssignmentElementTarget
     with _BindingOrAssignmentElement {
  var _declarationBrand: js.Any = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_PropertyAccessExpression: typings.typescript.mod.SyntaxKind.PropertyAccessExpression = js.native
  var name: js.UndefOr[DeclarationName | Identifier | PrivateIdentifier] = js.native
  var questionDotToken: js.UndefOr[QuestionDotToken] = js.native
}

