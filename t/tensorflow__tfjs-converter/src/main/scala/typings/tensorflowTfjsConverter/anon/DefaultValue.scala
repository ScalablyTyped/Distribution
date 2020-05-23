package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValue extends js.Object {
  var defaultValue: AnyOf
  var end: Type
  var name: Type
  var notSupported: Type
  var start: Type
  var `type`: Ref
}

object DefaultValue {
  @scala.inline
  def apply(defaultValue: AnyOf, end: Type, name: Type, notSupported: Type, start: Type, `type`: Ref): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
}

