package typings.xmlcreate.libNodesXmlCharRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlCharRef[Parent] extends js.Object {
  var _char: js.Any
  var _hex: js.Any
  val _parent: js.Any
  val _validation: js.Any
  /**
    * Gets the character of this character reference.
    */
  /**
    * Sets the character of this character reference.
    */
  var char: String
  /**
    * Gets whether the decimal or hexadecimal representation should be used
    * for this character reference.
    */
  /**
    * Sets whether the decimal or hexadecimal representation should be used
    * for this character reference.
    */
  var hex: Boolean
  /**
    * Returns the parent of this character reference.
    */
  def up(): Parent
}

object XmlCharRef {
  @scala.inline
  def apply[Parent](
    _char: js.Any,
    _hex: js.Any,
    _parent: js.Any,
    _validation: js.Any,
    char: String,
    hex: Boolean,
    toString: () => String,
    up: () => Parent
  ): XmlCharRef[Parent] = {
    val __obj = js.Dynamic.literal(_char = _char, _hex = _hex, _parent = _parent, _validation = _validation, char = char, hex = hex, toString = js.Any.fromFunction0(toString), up = js.Any.fromFunction0(up))
  
    __obj.asInstanceOf[XmlCharRef[Parent]]
  }
}

