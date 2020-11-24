package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CallExpression
import typings.typescript.mod.Expression
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createImmediatelyInvokedArrowFunction")
@js.native
object createImmediatelyInvokedArrowFunction extends js.Object {
  
  /** @deprecated Use `factory.createImmediatelyInvokedArrowFunction` or the factory supplied by your transformation context instead. */
  def apply(statements: js.Array[Statement]): CallExpression = js.native
  /** @deprecated Use `factory.createImmediatelyInvokedArrowFunction` or the factory supplied by your transformation context instead. */
  def apply(statements: js.Array[Statement], param: ParameterDeclaration, paramValue: Expression): CallExpression = js.native
}
