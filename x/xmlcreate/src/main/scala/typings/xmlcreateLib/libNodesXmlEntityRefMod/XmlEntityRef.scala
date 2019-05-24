package typings
package xmlcreateLib.libNodesXmlEntityRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlEntityRef[Parent] extends js.Object {
  var _name: js.Any
  val _parent: js.Any
  val _validation: js.Any
  /**
    * Gets the name of this entity reference.
    */
  /**
    * Sets the name of this entity reference.
    */
  var name: java.lang.String
  /**
    * Returns the parent of this entity reference.
    */
  def up(): Parent
}

object XmlEntityRef {
  @scala.inline
  def apply[Parent](
    _name: js.Any,
    _parent: js.Any,
    _validation: js.Any,
    name: java.lang.String,
    toString: () => java.lang.String,
    up: () => Parent
  ): XmlEntityRef[Parent] = {
    val __obj = js.Dynamic.literal(_name = _name, _parent = _parent, _validation = _validation, name = name, toString = js.Any.fromFunction0(toString), up = js.Any.fromFunction0(up))
  
    __obj.asInstanceOf[XmlEntityRef[Parent]]
  }
}

