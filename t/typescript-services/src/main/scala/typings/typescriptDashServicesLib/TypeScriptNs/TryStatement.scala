package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TryStatement")
@js.native
class TryStatement protected () extends AST {
  def this(block: Block, catchClause: CatchClause, finallyClause: FinallyClause) = this()
  var block: Block = js.native
  var catchClause: CatchClause = js.native
  var finallyClause: FinallyClause = js.native
  def structuralEquals(ast: TryStatement, includingPosition: scala.Boolean): scala.Boolean = js.native
}

