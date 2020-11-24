package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createBlock")
@js.native
object createBlock extends js.Object {
  
  /** @deprecated Use `factory.createBlock` or the factory supplied by your transformation context instead. */
  def apply(statements: js.Array[Statement]): Block = js.native
  def apply(statements: js.Array[Statement], multiLine: Boolean): Block = js.native
}
