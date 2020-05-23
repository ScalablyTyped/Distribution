package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValuesError extends js.Object {
  var enumValues: Error
}

object EnumValuesError {
  @scala.inline
  def apply(enumValues: Error): EnumValuesError = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesError]
  }
}

