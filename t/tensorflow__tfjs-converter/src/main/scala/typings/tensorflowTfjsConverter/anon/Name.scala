package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var defaultValue: AnyOf
  var name: Type
  var notSupported: Type
  var tfDeprecatedName: Type
  var tfName: Type
  var `type`: Ref
}

object Name {
  @scala.inline
  def apply(
    defaultValue: AnyOf,
    name: Type,
    notSupported: Type,
    tfDeprecatedName: Type,
    tfName: Type,
    `type`: Ref
  ): Name = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], tfDeprecatedName = tfDeprecatedName.asInstanceOf[js.Any], tfName = tfName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

