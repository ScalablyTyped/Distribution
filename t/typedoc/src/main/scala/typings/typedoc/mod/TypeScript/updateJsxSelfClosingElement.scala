package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JsxAttributes
import typings.typescript.mod.JsxSelfClosingElement
import typings.typescript.mod.JsxTagNameExpression
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateJsxSelfClosingElement")
@js.native
object updateJsxSelfClosingElement extends js.Object {
  
  def apply(
    node: JsxSelfClosingElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: JsxAttributes
  ): JsxSelfClosingElement = js.native
  /** @deprecated Use `factory.updateJsxSelfClosingElement` or the factory supplied by your transformation context instead. */
  def apply(
    node: JsxSelfClosingElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.Array[TypeNode],
    attributes: JsxAttributes
  ): JsxSelfClosingElement = js.native
}
