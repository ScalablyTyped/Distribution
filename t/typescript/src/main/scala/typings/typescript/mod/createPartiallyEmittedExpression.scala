package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createPartiallyEmittedExpression")
@js.native
object createPartiallyEmittedExpression extends js.Object {
  
  /** @deprecated Use `factory.createPartiallyEmittedExpression` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression): PartiallyEmittedExpression = js.native
  def apply(expression: Expression, original: Node): PartiallyEmittedExpression = js.native
}
