package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait JSDocSignature
  extends JSDocType
     with DeclarationWithTypeParameters {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_JSDocSignature: typings.typescript.mod.SyntaxKind.JSDocSignature = js.native
  var parameters: js.Array[JSDocParameterTag] = js.native
  var `type`: js.UndefOr[JSDocReturnTag] = js.native
  var typeParameters: js.UndefOr[js.Array[JSDocTemplateTag]] = js.native
}

