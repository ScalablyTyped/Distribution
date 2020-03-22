package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JsxAttributes
import typings.typescript.mod.JsxSelfClosingElement
import typings.typescript.mod.JsxTagNameExpression
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateJsxSelfClosingElement")
@js.native
object updateJsxSelfClosingElement extends js.Object {
  def apply(
    node: JsxSelfClosingElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: JsxAttributes
  ): JsxSelfClosingElement = js.native
  def apply(
    node: JsxSelfClosingElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.Array[TypeNode],
    attributes: JsxAttributes
  ): JsxSelfClosingElement = js.native
}

