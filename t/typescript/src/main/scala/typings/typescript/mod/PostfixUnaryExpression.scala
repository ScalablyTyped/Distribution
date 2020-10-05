package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostfixUnaryExpression extends UpdateExpression {
  @JSName("kind")
  var kind_PostfixUnaryExpression: typings.typescript.mod.SyntaxKind.PostfixUnaryExpression = js.native
  var operand: LeftHandSideExpression = js.native
  var operator: PostfixUnaryOperator = js.native
}

