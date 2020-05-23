package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CallExpression
import typings.typescript.mod.Expression
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createCall")
@js.native
object createCall extends js.Object {
  def apply(expression: Expression): CallExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode]): CallExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): CallExpression = js.native
}

