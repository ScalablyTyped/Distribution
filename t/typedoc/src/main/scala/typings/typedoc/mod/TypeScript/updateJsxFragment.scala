package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JsxChild
import typings.typescript.mod.JsxClosingFragment
import typings.typescript.mod.JsxFragment
import typings.typescript.mod.JsxOpeningFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateJsxFragment")
@js.native
object updateJsxFragment extends js.Object {
  
  /** @deprecated Use `factory.updateJsxFragment` or the factory supplied by your transformation context instead. */
  def apply(
    node: JsxFragment,
    openingFragment: JsxOpeningFragment,
    children: js.Array[JsxChild],
    closingFragment: JsxClosingFragment
  ): JsxFragment = js.native
}
