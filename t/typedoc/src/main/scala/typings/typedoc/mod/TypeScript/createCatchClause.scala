package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Block
import typings.typescript.mod.CatchClause
import typings.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createCatchClause")
@js.native
object createCatchClause extends js.Object {
  
  def apply(variableDeclaration: js.UndefOr[scala.Nothing], block: Block): CatchClause = js.native
  /** @deprecated Use `factory.createCatchClause` or the factory supplied by your transformation context instead. */
  def apply(variableDeclaration: String, block: Block): CatchClause = js.native
  def apply(variableDeclaration: VariableDeclaration, block: Block): CatchClause = js.native
}
