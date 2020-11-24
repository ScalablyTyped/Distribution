package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateJsxOpeningElement")
@js.native
object updateJsxOpeningElement extends js.Object {
  
  def apply(
    node: JsxOpeningElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: JsxAttributes
  ): JsxOpeningElement = js.native
  /** @deprecated Use `factory.updateJsxOpeningElement` or the factory supplied by your transformation context instead. */
  def apply(
    node: JsxOpeningElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.Array[TypeNode],
    attributes: JsxAttributes
  ): JsxOpeningElement = js.native
}
