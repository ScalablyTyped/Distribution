package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.PrefixUnaryExpression
import typings.typescript.mod.PrefixUnaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createPrefix")
@js.native
object createPrefix extends js.Object {
  
  /** @deprecated Use `factory.createPrefix` or the factory supplied by your transformation context instead. */
  def apply(operator: PrefixUnaryOperator, operand: Expression): PrefixUnaryExpression = js.native
}
