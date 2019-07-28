package typings.xmlcreate.libNodesXmlCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlComment[Parent] extends js.Object {
  var _charData: js.Any
  val _parent: js.Any
  val _replaceInvalidCharsInCharData: js.Any
  val _validation: js.Any
  /**
    * Gets the text of this comment.
    */
  /**
    * Sets the text of this comment.
    */
  var charData: String
  /**
    * Returns the parent of this comment.
    */
  def up(): Parent
}

object XmlComment {
  @scala.inline
  def apply[Parent](
    _charData: js.Any,
    _parent: js.Any,
    _replaceInvalidCharsInCharData: js.Any,
    _validation: js.Any,
    charData: String,
    toString: () => String,
    up: () => Parent
  ): XmlComment[Parent] = {
    val __obj = js.Dynamic.literal(_charData = _charData, _parent = _parent, _replaceInvalidCharsInCharData = _replaceInvalidCharsInCharData, _validation = _validation, charData = charData, toString = js.Any.fromFunction0(toString), up = js.Any.fromFunction0(up))
  
    __obj.asInstanceOf[XmlComment[Parent]]
  }
}

