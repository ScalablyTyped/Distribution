package typings.tampermonkey

import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_addStyle")
@js.native
object GMAddStyle extends js.Object {
  // Styles
  /**
    * Adds the given style to the document and returns the injected style element.
    */
  def apply(css: String): HTMLStyleElement = js.native
}

