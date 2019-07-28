package typings.xmlcreate.libNodesXmlProcInstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlProcInst[Parent] extends js.Object {
  var _content: js.Any
  val _parent: js.Any
  var _target: js.Any
  val _validation: js.Any
  /**
    * Gets the content of this processing instruction.
    */
  /**
    * Sets the content of this processing instruction.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * Gets the target of this processing instruction.
    */
  /**
    * Sets the content of this processing instruction.
    */
  var target: String
  /**
    * Returns the parent of this processing instruction.
    */
  def up(): Parent
}

object XmlProcInst {
  @scala.inline
  def apply[Parent](
    _content: js.Any,
    _parent: js.Any,
    _target: js.Any,
    _validation: js.Any,
    target: String,
    toString: () => String,
    up: () => Parent,
    content: String = null
  ): XmlProcInst[Parent] = {
    val __obj = js.Dynamic.literal(_content = _content, _parent = _parent, _target = _target, _validation = _validation, target = target, toString = js.Any.fromFunction0(toString), up = js.Any.fromFunction0(up))
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[XmlProcInst[Parent]]
  }
}

