package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeReferenceNode
  extends NodeWithTypeArguments
     with TypeReferenceType {
  @JSName("kind")
  var kind_TypeReferenceNode: typings.typescript.mod.SyntaxKind.TypeReference = js.native
  var typeName: EntityName = js.native
}

