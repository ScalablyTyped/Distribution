package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JsxChild
import typings.typescript.mod.JsxClosingFragment
import typings.typescript.mod.JsxFragment
import typings.typescript.mod.JsxOpeningFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJsxFragment")
@js.native
object createJsxFragment extends js.Object {
  
  /** @deprecated Use `factory.createJsxFragment` or the factory supplied by your transformation context instead. */
  def apply(
    openingFragment: JsxOpeningFragment,
    children: js.Array[JsxChild],
    closingFragment: JsxClosingFragment
  ): JsxFragment = js.native
}
