package typings.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueName extends js.Object {
  var defaultValue: Anon_AnyOf
  var name: Anon_Type
  var notSupported: Anon_Type
  var tfDeprecatedName: Anon_Type
  var tfName: Anon_Type
  var `type`: Anon_Ref
}

object Anon_DefaultValueName {
  @scala.inline
  def apply(
    defaultValue: Anon_AnyOf,
    name: Anon_Type,
    notSupported: Anon_Type,
    tfDeprecatedName: Anon_Type,
    tfName: Anon_Type,
    `type`: Anon_Ref
  ): Anon_DefaultValueName = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], tfDeprecatedName = tfDeprecatedName.asInstanceOf[js.Any], tfName = tfName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValueName]
  }
}

