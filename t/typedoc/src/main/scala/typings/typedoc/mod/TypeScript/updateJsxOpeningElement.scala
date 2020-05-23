package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JsxAttributes
import typings.typescript.mod.JsxOpeningElement
import typings.typescript.mod.JsxTagNameExpression
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateJsxOpeningElement")
@js.native
object updateJsxOpeningElement extends js.Object {
  def apply(
    node: JsxOpeningElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.UndefOr[js.Array[TypeNode]],
    attributes: JsxAttributes
  ): JsxOpeningElement = js.native
}

