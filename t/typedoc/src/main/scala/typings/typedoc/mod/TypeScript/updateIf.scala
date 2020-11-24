package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.IfStatement
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateIf")
@js.native
object updateIf extends js.Object {
  
  /** @deprecated Use `factory.updateIf` or the factory supplied by your transformation context instead. */
  def apply(node: IfStatement, expression: Expression, thenStatement: Statement): IfStatement = js.native
  def apply(node: IfStatement, expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
}
