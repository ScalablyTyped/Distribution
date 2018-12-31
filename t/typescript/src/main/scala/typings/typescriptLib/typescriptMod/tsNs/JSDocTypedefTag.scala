package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptLib.typescriptMod.tsNs.JSDocTag because Would inherit conflicting mutable fields List(decorators, end, flags, kind, modifiers, parent, pos))*/
@js.native
trait JSDocTypedefTag extends NamedDeclaration {
  var fullName: js.UndefOr[JSDocNamespaceDeclaration | Identifier] = js.native
  @JSName("name")
  var name_JSDocTypedefTag: js.UndefOr[Identifier] = js.native
  @JSName("parent")
  var parent_JSDocTypedefTag: JSDoc = js.native
  var typeExpression: js.UndefOr[JSDocTypeExpression | JSDocTypeLiteral] = js.native
}

