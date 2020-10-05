package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocTemplateTag
  extends JSDocTag
     with DeclarationWithTypeParameterChildren {
  var constraint: js.UndefOr[JSDocTypeExpression] = js.native
  @JSName("kind")
  var kind_JSDocTemplateTag: typings.typescript.mod.SyntaxKind.JSDocTemplateTag = js.native
  var typeParameters: NodeArray[TypeParameterDeclaration] = js.native
}

