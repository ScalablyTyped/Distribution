package typings
package xmlcreateLib.libNodesXmlDtdElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlDtdElement[Parent] extends js.Object {
  var _charData: js.Any
  val _parent: js.Any
  val _validation: js.Any
  /**
    * Gets the text of this element declaration.
    */
  /**
    * Sets the text of this element declaration.
    */
  var charData: java.lang.String
  /**
    * Returns the parent of this element declaration.
    */
  def up(): Parent
}

object XmlDtdElement {
  @scala.inline
  def apply[Parent](
    _charData: js.Any,
    _parent: js.Any,
    _validation: js.Any,
    charData: java.lang.String,
    toString: () => java.lang.String,
    up: () => Parent
  ): XmlDtdElement[Parent] = {
    val __obj = js.Dynamic.literal(_charData = _charData, _parent = _parent, _validation = _validation, charData = charData, toString = js.Any.fromFunction0(toString), up = js.Any.fromFunction0(up))
  
    __obj.asInstanceOf[XmlDtdElement[Parent]]
  }
}

