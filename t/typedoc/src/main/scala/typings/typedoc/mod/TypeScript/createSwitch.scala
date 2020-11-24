package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CaseBlock
import typings.typescript.mod.Expression
import typings.typescript.mod.SwitchStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createSwitch")
@js.native
object createSwitch extends js.Object {
  
  /** @deprecated Use `factory.createSwitch` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression, caseBlock: CaseBlock): SwitchStatement = js.native
}
