package typings
package xmlcreateLib.libNodesXmlDtdParamEntityRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlDtdParamEntityRef[Parent] extends js.Object {
  var _name: js.Any
  val _parent: js.Any
  val _validation: js.Any
  /**
    * Gets the name of this parameter entity reference.
    */
  /**
    * Sets the name of this parameter entity reference.
    */
  var name: java.lang.String
  /**
    * Returns the parent of this parameter entity reference.
    */
  def up(): Parent
}

object XmlDtdParamEntityRef {
  @scala.inline
  def apply[Parent](
    _name: js.Any,
    _parent: js.Any,
    _validation: js.Any,
    name: java.lang.String,
    toString: () => java.lang.String,
    up: () => Parent
  ): XmlDtdParamEntityRef[Parent] = {
    val __obj = js.Dynamic.literal(_name = _name, _parent = _parent, _validation = _validation, name = name, toString = js.Any.fromFunction0(toString), up = js.Any.fromFunction0(up))
  
    __obj.asInstanceOf[XmlDtdParamEntityRef[Parent]]
  }
}

