package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.ForInStatement
import typings.typescript.mod.ForInitializer
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createForIn")
@js.native
object createForIn extends js.Object {
  
  /** @deprecated Use `factory.createForIn` or the factory supplied by your transformation context instead. */
  def apply(initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement = js.native
}
