package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValuesDeferred extends js.Object {
  var enumValues: Deferred
}

object EnumValuesDeferred {
  @scala.inline
  def apply(enumValues: Deferred): EnumValuesDeferred = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDeferred]
  }
}

