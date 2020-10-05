package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixUnaryExpression extends UpdateExpression {
  @JSName("kind")
  var kind_PrefixUnaryExpression: typings.typescript.mod.SyntaxKind.PrefixUnaryExpression = js.native
  var operand: UnaryExpression = js.native
  var operator: PrefixUnaryOperator = js.native
}

