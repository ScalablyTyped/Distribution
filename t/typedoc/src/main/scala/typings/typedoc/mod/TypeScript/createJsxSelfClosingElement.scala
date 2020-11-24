package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JsxAttributes
import typings.typescript.mod.JsxSelfClosingElement
import typings.typescript.mod.JsxTagNameExpression
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJsxSelfClosingElement")
@js.native
object createJsxSelfClosingElement extends js.Object {
  
  def apply(tagName: JsxTagNameExpression, typeArguments: js.UndefOr[scala.Nothing], attributes: JsxAttributes): JsxSelfClosingElement = js.native
  /** @deprecated Use `factory.createJsxSelfClosingElement` or the factory supplied by your transformation context instead. */
  def apply(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxSelfClosingElement = js.native
}
