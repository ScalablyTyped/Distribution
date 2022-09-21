package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.TypeQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeQueryNode
  extends StObject
     with NodeWithTypeArguments {
  
  val exprName: EntityName = js.native
  
  @JSName("kind")
  val kind_TypeQueryNode: TypeQuery = js.native
}
