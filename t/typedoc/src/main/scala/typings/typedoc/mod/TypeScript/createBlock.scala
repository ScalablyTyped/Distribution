package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Block
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createBlock")
@js.native
object createBlock extends js.Object {
  def apply(statements: js.Array[Statement]): Block = js.native
  def apply(statements: js.Array[Statement], multiLine: Boolean): Block = js.native
}

