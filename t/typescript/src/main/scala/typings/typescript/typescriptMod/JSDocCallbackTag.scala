package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.JSDocTag because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined tagName, comment */ @js.native
trait JSDocCallbackTag
  extends NamedDeclaration
     with DeclarationWithTypeParameters {
  var comment: js.UndefOr[String] = js.native
  var fullName: js.UndefOr[JSDocNamespaceDeclaration | Identifier] = js.native
  @JSName("kind")
  var kind_JSDocCallbackTag: typings.typescript.typescriptMod.SyntaxKind.JSDocCallbackTag = js.native
  @JSName("name")
  var name_JSDocCallbackTag: js.UndefOr[Identifier] = js.native
  @JSName("parent")
  var parent_JSDocCallbackTag: JSDoc = js.native
  var tagName: Identifier = js.native
  var typeExpression: JSDocSignature = js.native
}

