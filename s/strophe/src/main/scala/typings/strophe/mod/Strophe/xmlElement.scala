package typings.strophe.mod.Strophe

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe", "Strophe.xmlElement")
@js.native
object xmlElement extends js.Object {
  /** Function: xmlElement
    *  Create an XML DOM element.
    *
    *  This function creates an XML DOM element correctly across all
    *  implementations. Note that these are not HTML DOM elements, which
    *  aren't appropriate for XMPP stanzas.
    *
    *  Parameters:
    *    (String) name - The name for the element.
    *    (Array|Object) attrs - An optional array or object containing
    *      key/value pairs to use as element attributes. The object should
    *      be in the format {'key': 'value'} or {key: 'value'}. The array
    *      should have the format [['key1', 'value1'], ['key2', 'value2']].
    *    (String) text - The text child data for the element.
    *
    *  Returns:
    *    A new XML DOM element.
    */
  def apply(name: String): Element = js.native
  def apply(name: String, attrs: js.Any): Element = js.native
  def apply(name: String, attrs: js.Any, text: String): Element = js.native
  def apply(name: String, text: String): Element = js.native
  def apply(name: String, text: String, attrs: js.Any): Element = js.native
}

