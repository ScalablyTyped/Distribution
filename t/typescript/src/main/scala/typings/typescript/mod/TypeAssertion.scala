package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.TypeAssertionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAssertion
  extends UnaryExpression
     with AssertionExpression {
  
  val expression: UnaryExpression = js.native
  
  @JSName("kind")
  val kind_TypeAssertion: TypeAssertionExpression = js.native
  
  val `type`: TypeNode = js.native
}
