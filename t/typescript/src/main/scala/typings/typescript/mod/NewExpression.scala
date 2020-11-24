package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewExpression
  extends PrimaryExpression
     with Declaration
     with CallLikeExpression
     with HasTypeArguments {
  
  val arguments: js.UndefOr[NodeArray[Expression]] = js.native
  
  val expression: LeftHandSideExpression = js.native
  
  @JSName("kind")
  val kind_NewExpression: typings.typescript.mod.SyntaxKind.NewExpression = js.native
  
  val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
