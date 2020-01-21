package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultValue extends js.Object {
  var defaultValue: AnonAnyOf
  var end: AnonType
  var name: AnonType
  var notSupported: AnonType
  var start: AnonType
  var `type`: AnonRef
}

object AnonDefaultValue {
  @scala.inline
  def apply(
    defaultValue: AnonAnyOf,
    end: AnonType,
    name: AnonType,
    notSupported: AnonType,
    start: AnonType,
    `type`: AnonRef
  ): AnonDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultValue]
  }
}

