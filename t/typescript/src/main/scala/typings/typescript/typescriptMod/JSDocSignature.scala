package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait JSDocSignature
  extends JSDocType
     with DeclarationWithTypeParameters {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_JSDocSignature: typings.typescript.typescriptMod.SyntaxKind.JSDocSignature = js.native
  var parameters: js.Array[JSDocParameterTag] = js.native
  var `type`: js.UndefOr[JSDocReturnTag] = js.native
  var typeParameters: js.UndefOr[js.Array[JSDocTemplateTag]] = js.native
}

