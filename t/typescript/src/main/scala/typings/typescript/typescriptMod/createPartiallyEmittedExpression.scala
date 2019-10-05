package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createPartiallyEmittedExpression")
@js.native
object createPartiallyEmittedExpression extends js.Object {
  /**
    * Creates a synthetic expression to act as a placeholder for a not-emitted expression in
    * order to preserve comments or sourcemap positions.
    *
    * @param expression The inner expression to emit.
    * @param original The original outer expression.
    * @param location The location for the expression. Defaults to the positions from "original" if provided.
    */
  def apply(expression: Expression): PartiallyEmittedExpression = js.native
  def apply(expression: Expression, original: Node): PartiallyEmittedExpression = js.native
}

