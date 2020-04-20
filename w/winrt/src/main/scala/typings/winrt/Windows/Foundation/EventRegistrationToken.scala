package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRegistrationToken extends js.Object {
  var value: Double
}

object EventRegistrationToken {
  @scala.inline
  def apply(value: Double): EventRegistrationToken = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRegistrationToken]
  }
}

