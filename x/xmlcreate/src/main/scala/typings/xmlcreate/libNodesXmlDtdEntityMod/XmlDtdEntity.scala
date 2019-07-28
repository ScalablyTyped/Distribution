package typings.xmlcreate.libNodesXmlDtdEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlDtdEntity[Parent] extends js.Object {
  var _charData: js.Any
  val _parent: js.Any
  val _validation: js.Any
  /**
    * Gets the text of this entity declaration.
    */
  /**
    * Sets the text of this entity declaration.
    */
  var charData: String
  /**
    * Returns the parent of this entity declaration.
    */
  def up(): Parent
}

object XmlDtdEntity {
  @scala.inline
  def apply[Parent](
    _charData: js.Any,
    _parent: js.Any,
    _validation: js.Any,
    charData: String,
    toString: () => String,
    up: () => Parent
  ): XmlDtdEntity[Parent] = {
    val __obj = js.Dynamic.literal(_charData = _charData, _parent = _parent, _validation = _validation, charData = charData, toString = js.Any.fromFunction0(toString), up = js.Any.fromFunction0(up))
  
    __obj.asInstanceOf[XmlDtdEntity[Parent]]
  }
}

