package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CallChain
import typings.typescript.mod.Expression
import typings.typescript.mod.QuestionDotToken
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createCallChain")
@js.native
object createCallChain extends js.Object {
  
  /** @deprecated Use `factory.createCallChain` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: js.UndefOr[scala.Nothing],
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: js.UndefOr[scala.Nothing],
    typeArguments: js.Array[TypeNode]
  ): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: js.UndefOr[scala.Nothing],
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def apply(expression: Expression, questionDotToken: QuestionDotToken): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: QuestionDotToken,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def apply(expression: Expression, questionDotToken: QuestionDotToken, typeArguments: js.Array[TypeNode]): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: QuestionDotToken,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
}
