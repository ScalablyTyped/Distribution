package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JsxAttribute
import typings.typescript.mod.JsxExpression
import typings.typescript.mod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateJsxAttribute")
@js.native
object updateJsxAttribute extends js.Object {
  
  /** @deprecated Use `factory.updateJsxAttribute` or the factory supplied by your transformation context instead. */
  def apply(node: JsxAttribute, name: Identifier): JsxAttribute = js.native
  def apply(node: JsxAttribute, name: Identifier, initializer: JsxExpression): JsxAttribute = js.native
  def apply(node: JsxAttribute, name: Identifier, initializer: StringLiteral): JsxAttribute = js.native
}
