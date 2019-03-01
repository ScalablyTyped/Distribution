package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.tsNs.JSDocTag because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined tagName, comment */ @js.native
trait JSDocCallbackTag
  extends NamedDeclaration
     with DeclarationWithTypeParameters {
  var comment: js.UndefOr[java.lang.String] = js.native
  var fullName: js.UndefOr[JSDocNamespaceDeclaration | Identifier] = js.native
  @JSName("name")
  var name_JSDocCallbackTag: js.UndefOr[Identifier] = js.native
  @JSName("parent")
  var parent_JSDocCallbackTag: JSDoc = js.native
  var tagName: Identifier = js.native
  var typeExpression: JSDocSignature = js.native
}

