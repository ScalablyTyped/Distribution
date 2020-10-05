package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.TypeAssertionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAssertion
  extends UnaryExpression
     with AssertionExpression {
  var expression: UnaryExpression = js.native
  @JSName("kind")
  var kind_TypeAssertion: TypeAssertionExpression = js.native
  var `type`: TypeNode = js.native
}

