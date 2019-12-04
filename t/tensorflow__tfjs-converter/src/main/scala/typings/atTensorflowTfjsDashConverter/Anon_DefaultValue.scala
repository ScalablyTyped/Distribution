package typings.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: Anon_AnyOf
  var end: Anon_Type
  var name: Anon_Type
  var notSupported: Anon_Type
  var start: Anon_Type
  var `type`: Anon_Ref
}

object Anon_DefaultValue {
  @scala.inline
  def apply(
    defaultValue: Anon_AnyOf,
    end: Anon_Type,
    name: Anon_Type,
    notSupported: Anon_Type,
    start: Anon_Type,
    `type`: Anon_Ref
  ): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

