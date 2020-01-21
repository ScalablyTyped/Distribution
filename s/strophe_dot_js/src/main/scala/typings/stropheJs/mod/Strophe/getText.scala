package typings.stropheJs.mod.Strophe

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe.js", "Strophe.getText")
@js.native
object getText extends js.Object {
  /** Function: getText
    *  Get the concatenation of all text children of an element.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    A String with the concatenated text of all text element children.
    */
  def apply(elem: Element): String = js.native
}

