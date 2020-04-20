package typings.winrt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSucceededValue extends js.Object {
  var succeeded: Boolean
  var value: Double
}

object AnonSucceededValue {
  @scala.inline
  def apply(succeeded: Boolean, value: Double): AnonSucceededValue = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSucceededValue]
  }
}

