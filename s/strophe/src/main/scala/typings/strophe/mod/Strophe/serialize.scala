package typings.strophe.mod.Strophe

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe", "Strophe.serialize")
@js.native
object serialize extends js.Object {
  /** Function: serialize
    *  Render a DOM element and all descendants to a String.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    The serialized element tree as a String.
    */
  def apply(elem: Element): String = js.native
  def apply(elem: Builder): String = js.native
}

