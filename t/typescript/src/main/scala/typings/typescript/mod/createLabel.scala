package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createLabel")
@js.native
object createLabel extends js.Object {
  
  /** @deprecated Use `factory.createLabel` or the factory supplied by your transformation context instead. */
  def apply(label: java.lang.String, statement: Statement): LabeledStatement = js.native
  def apply(label: Identifier, statement: Statement): LabeledStatement = js.native
}
