package typings
package xmlcreateLib.libNodesXmlAttributeTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlAttributeText[Parent] extends js.Object {
  var _charData: js.Any
  val _parent: js.Any
  val _replaceInvalidCharsInCharData: js.Any
  val _validation: js.Any
  /**
    * Gets this attribute text.
    */
  /**
    * Sets this attribute text.
    */
  var charData: java.lang.String
  /**
    * Returns the parent of this attribute text.
    */
  def up(): Parent
}

object XmlAttributeText {
  @scala.inline
  def apply[Parent](
    _charData: js.Any,
    _parent: js.Any,
    _replaceInvalidCharsInCharData: js.Any,
    _validation: js.Any,
    charData: java.lang.String,
    toString: () => java.lang.String,
    up: () => Parent
  ): XmlAttributeText[Parent] = {
    val __obj = js.Dynamic.literal(_charData = _charData, _parent = _parent, _replaceInvalidCharsInCharData = _replaceInvalidCharsInCharData, _validation = _validation, charData = charData, toString = js.Any.fromFunction0(toString), up = js.Any.fromFunction0(up))
  
    __obj.asInstanceOf[XmlAttributeText[Parent]]
  }
}

