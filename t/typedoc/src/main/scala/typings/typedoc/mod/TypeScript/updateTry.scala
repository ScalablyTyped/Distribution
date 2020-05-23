package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Block
import typings.typescript.mod.CatchClause
import typings.typescript.mod.TryStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateTry")
@js.native
object updateTry extends js.Object {
  def apply(node: TryStatement, tryBlock: Block): TryStatement = js.native
  def apply(node: TryStatement, tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def apply(node: TryStatement, tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
}

