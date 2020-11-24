package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.PostfixUnaryExpression
import typings.typescript.mod.PostfixUnaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createPostfix")
@js.native
object createPostfix extends js.Object {
  
  /** @deprecated Use `factory.createPostfix` or the factory supplied by your transformation context instead. */
  def apply(operand: Expression, operator: PostfixUnaryOperator): PostfixUnaryExpression = js.native
}
