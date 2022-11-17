package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeReferenceNode
  extends StObject
     with NodeWithTypeArguments {
  
  @JSName("kind")
  val kind_TypeReferenceNode: typings.typescript.mod.SyntaxKind.TypeReference = js.native
  
  val typeName: EntityName = js.native
}
