package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValuesChange extends js.Object {
  var enumValues: Change
}

object EnumValuesChange {
  @scala.inline
  def apply(enumValues: Change): EnumValuesChange = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesChange]
  }
}

