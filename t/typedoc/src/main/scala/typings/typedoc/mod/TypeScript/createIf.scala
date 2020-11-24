package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.IfStatement
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createIf")
@js.native
object createIf extends js.Object {
  
  /** @deprecated Use `factory.createIf` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression, thenStatement: Statement): IfStatement = js.native
  def apply(expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
}
