package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.tsNs.JSDocTag because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined tagName, comment */ @js.native
trait JSDocTypedefTag extends NamedDeclaration {
  var comment: js.UndefOr[java.lang.String] = js.native
  var fullName: js.UndefOr[JSDocNamespaceDeclaration | Identifier] = js.native
  @JSName("name")
  var name_JSDocTypedefTag: js.UndefOr[Identifier] = js.native
  @JSName("parent")
  var parent_JSDocTypedefTag: JSDoc = js.native
  var tagName: Identifier = js.native
  var typeExpression: js.UndefOr[JSDocTypeExpression | JSDocTypeLiteral] = js.native
}

