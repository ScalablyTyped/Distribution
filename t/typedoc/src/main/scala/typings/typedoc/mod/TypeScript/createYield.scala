package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AsteriskToken
import typings.typescript.mod.Expression
import typings.typescript.mod.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createYield")
@js.native
object createYield extends js.Object {
  
  /** @deprecated Use `factory.createYield` or the factory supplied by your transformation context instead. */
  def apply(): YieldExpression = js.native
  def apply(asteriskToken: js.UndefOr[scala.Nothing], expression: Expression): YieldExpression = js.native
  /** @deprecated Use `factory.createYield` or the factory supplied by your transformation context instead. */
  def apply(asteriskToken: AsteriskToken, expression: Expression): YieldExpression = js.native
  def apply(expression: Expression): YieldExpression = js.native
}
