package typings.winrt

import typings.winrt.Windows.Media.Capture.PowerlineFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var succeeded: Boolean
  var value: PowerlineFrequency
}

object AnonValue {
  @scala.inline
  def apply(succeeded: Boolean, value: PowerlineFrequency): AnonValue = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

