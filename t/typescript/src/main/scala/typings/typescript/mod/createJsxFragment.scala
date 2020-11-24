package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createJsxFragment")
@js.native
object createJsxFragment extends js.Object {
  
  /** @deprecated Use `factory.createJsxFragment` or the factory supplied by your transformation context instead. */
  def apply(
    openingFragment: JsxOpeningFragment,
    children: js.Array[JsxChild],
    closingFragment: JsxClosingFragment
  ): JsxFragment = js.native
}
