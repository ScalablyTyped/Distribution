package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand
- typings.typescript.typescriptMod.NamedDeclaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined name */ @js.native
trait PropertyAccessExpression
  extends MemberExpression
     with BindingOrAssignmentElementTarget
     with _BindingOrAssignmentElement {
  var _declarationBrand: js.Any = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_PropertyAccessExpression: typings.typescript.typescriptMod.SyntaxKind.PropertyAccessExpression = js.native
  var name: js.UndefOr[DeclarationName | Identifier] = js.native
}

