package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.LabeledStatement
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createLabel")
@js.native
object createLabel extends js.Object {
  
  /** @deprecated Use `factory.createLabel` or the factory supplied by your transformation context instead. */
  def apply(label: String, statement: Statement): LabeledStatement = js.native
  def apply(label: Identifier, statement: Statement): LabeledStatement = js.native
}
