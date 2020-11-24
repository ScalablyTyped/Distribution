package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeReferenceNode
  extends NodeWithTypeArguments
     with TypeReferenceType {
  
  @JSName("kind")
  val kind_TypeReferenceNode: typings.typescript.mod.SyntaxKind.TypeReference = js.native
  
  val typeName: EntityName = js.native
}
