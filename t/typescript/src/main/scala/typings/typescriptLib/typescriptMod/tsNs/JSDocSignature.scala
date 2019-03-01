package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.tsNs.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait JSDocSignature
  extends JSDocType
     with DeclarationWithTypeParameters {
  var _declarationBrand: js.Any = js.native
  var parameters: js.Array[JSDocParameterTag] = js.native
  var `type`: js.UndefOr[JSDocReturnTag] = js.native
  var typeParameters: js.UndefOr[js.Array[JSDocTemplateTag]] = js.native
}

