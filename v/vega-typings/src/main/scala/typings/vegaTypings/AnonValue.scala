package typings.vegaTypings

import typings.vegaTypings.encodeMod.BaseValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[T] extends BaseValueRef[T] {
  var value: T | Null
}

object AnonValue {
  @scala.inline
  def apply[T](value: T = null): AnonValue[T] = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue[T]]
  }
}

