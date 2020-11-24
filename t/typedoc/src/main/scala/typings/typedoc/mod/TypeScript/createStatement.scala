package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.ExpressionStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createStatement")
@js.native
object createStatement extends js.Object {
  
  /** @deprecated Use `factory.createExpressionStatement` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression): ExpressionStatement = js.native
}
