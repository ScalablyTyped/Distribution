package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.LabeledStatement
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createLabel")
@js.native
object createLabel extends js.Object {
  def apply(label: String, statement: Statement): LabeledStatement = js.native
  def apply(label: Identifier, statement: Statement): LabeledStatement = js.native
}

