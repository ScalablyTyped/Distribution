package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.NamedDeclaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined name */ @js.native
trait PropertyAccessExpression
  extends MemberExpression
     with BindingOrAssignmentElementTarget
     with _BindingOrAssignmentElement {
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_PropertyAccessExpression: typings.typescript.typescriptMod.SyntaxKind.PropertyAccessExpression = js.native
  var name: js.UndefOr[DeclarationName | Identifier] = js.native
}

