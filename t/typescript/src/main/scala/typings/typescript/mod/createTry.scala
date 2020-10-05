package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTry")
@js.native
object createTry extends js.Object {
  def apply(tryBlock: Block): TryStatement = js.native
  def apply(tryBlock: Block, catchClause: js.UndefOr[scala.Nothing], finallyBlock: Block): TryStatement = js.native
  def apply(tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def apply(tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
}

