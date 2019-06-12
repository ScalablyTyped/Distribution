package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchStatement extends Statement {
  var caseBlock: CaseBlock = js.native
  var expression: Expression = js.native
  @JSName("kind")
  var kind_SwitchStatement: typescriptLib.typescriptMod.SyntaxKind.SwitchStatement = js.native
  var possiblyExhaustive: js.UndefOr[scala.Boolean] = js.native
}

