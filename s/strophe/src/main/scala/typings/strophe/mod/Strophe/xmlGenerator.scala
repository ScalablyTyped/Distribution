package typings.strophe.mod.Strophe

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe", "Strophe.xmlGenerator")
@js.native
object xmlGenerator extends js.Object {
  /** Function: xmlGenerator
    *  Get the DOM document to generate elements.
    *
    *  Returns:
    *    The currently used DOM document.
    */
  def apply(): Document = js.native
}

