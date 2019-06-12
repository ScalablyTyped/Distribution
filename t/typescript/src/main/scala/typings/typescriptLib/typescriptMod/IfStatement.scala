package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatement extends Statement {
  var elseStatement: js.UndefOr[Statement] = js.native
  var expression: Expression = js.native
  @JSName("kind")
  var kind_IfStatement: typescriptLib.typescriptMod.SyntaxKind.IfStatement = js.native
  var thenStatement: Statement = js.native
}

