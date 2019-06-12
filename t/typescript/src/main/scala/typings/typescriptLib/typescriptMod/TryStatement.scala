package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryStatement extends Statement {
  var catchClause: js.UndefOr[CatchClause] = js.native
  var finallyBlock: js.UndefOr[Block] = js.native
  @JSName("kind")
  var kind_TryStatement: typescriptLib.typescriptMod.SyntaxKind.TryStatement = js.native
  var tryBlock: Block = js.native
}

