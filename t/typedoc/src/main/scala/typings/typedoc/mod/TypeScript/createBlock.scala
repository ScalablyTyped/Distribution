package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Block
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createBlock")
@js.native
object createBlock extends js.Object {
  
  /** @deprecated Use `factory.createBlock` or the factory supplied by your transformation context instead. */
  def apply(statements: js.Array[Statement]): Block = js.native
  def apply(statements: js.Array[Statement], multiLine: Boolean): Block = js.native
}
