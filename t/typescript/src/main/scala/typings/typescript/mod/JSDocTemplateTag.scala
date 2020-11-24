package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocTemplateTag
  extends JSDocTag
     with DeclarationWithTypeParameterChildren {
  
  val constraint: js.UndefOr[JSDocTypeExpression] = js.native
  
  @JSName("kind")
  val kind_JSDocTemplateTag: typings.typescript.mod.SyntaxKind.JSDocTemplateTag = js.native
  
  val typeParameters: NodeArray[TypeParameterDeclaration] = js.native
}
