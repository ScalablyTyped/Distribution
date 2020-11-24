package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.TypeAssertion
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTypeAssertion")
@js.native
object createTypeAssertion extends js.Object {
  
  /** @deprecated Use `factory.createTypeAssertion` or the factory supplied by your transformation context instead. */
  def apply(`type`: TypeNode, expression: Expression): TypeAssertion = js.native
}
