package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDocTemplateTag
  extends JSDocTag
     with DeclarationWithTypeParameterChildren {
  var constraint: js.UndefOr[JSDocTypeExpression] = js.native
  @JSName("kind")
  var kind_JSDocTemplateTag: typings.typescript.typescriptMod.SyntaxKind.JSDocTemplateTag = js.native
  var typeParameters: NodeArray[TypeParameterDeclaration] = js.native
}

