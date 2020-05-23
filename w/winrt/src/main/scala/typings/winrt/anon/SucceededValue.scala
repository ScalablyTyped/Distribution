package typings.winrt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SucceededValue extends js.Object {
  var succeeded: Boolean
  var value: Double
}

object SucceededValue {
  @scala.inline
  def apply(succeeded: Boolean, value: Double): SucceededValue = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SucceededValue]
  }
}

