package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JsxChild
import typings.typescript.mod.JsxClosingElement
import typings.typescript.mod.JsxElement
import typings.typescript.mod.JsxOpeningElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateJsxElement")
@js.native
object updateJsxElement extends js.Object {
  
  /** @deprecated Use `factory.updateJsxElement` or the factory supplied by your transformation context instead. */
  def apply(
    node: JsxElement,
    openingElement: JsxOpeningElement,
    children: js.Array[JsxChild],
    closingElement: JsxClosingElement
  ): JsxElement = js.native
}
