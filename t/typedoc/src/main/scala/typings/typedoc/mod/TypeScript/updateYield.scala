package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AsteriskToken
import typings.typescript.mod.Expression
import typings.typescript.mod.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateYield")
@js.native
object updateYield extends js.Object {
  
  /** @deprecated Use `factory.updateYield` or the factory supplied by your transformation context instead. */
  def apply(node: YieldExpression): YieldExpression = js.native
  def apply(node: YieldExpression, asteriskToken: js.UndefOr[scala.Nothing], expression: Expression): YieldExpression = js.native
  def apply(node: YieldExpression, asteriskToken: AsteriskToken): YieldExpression = js.native
  def apply(node: YieldExpression, asteriskToken: AsteriskToken, expression: Expression): YieldExpression = js.native
}
