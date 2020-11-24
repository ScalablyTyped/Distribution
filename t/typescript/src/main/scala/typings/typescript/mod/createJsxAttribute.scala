package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createJsxAttribute")
@js.native
object createJsxAttribute extends js.Object {
  
  /** @deprecated Use `factory.createJsxAttribute` or the factory supplied by your transformation context instead. */
  def apply(name: Identifier): JsxAttribute = js.native
  def apply(name: Identifier, initializer: JsxExpression): JsxAttribute = js.native
  def apply(name: Identifier, initializer: StringLiteral): JsxAttribute = js.native
}
