package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Block
import typings.typescript.mod.CatchClause
import typings.typescript.mod.TryStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTry")
@js.native
object createTry extends js.Object {
  
  /** @deprecated Use `factory.createTry` or the factory supplied by your transformation context instead. */
  def apply(tryBlock: Block): TryStatement = js.native
  def apply(tryBlock: Block, catchClause: js.UndefOr[scala.Nothing], finallyBlock: Block): TryStatement = js.native
  def apply(tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def apply(tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
}
