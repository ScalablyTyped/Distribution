package typings.winrt

import typings.winrt.Windows.Media.Capture.PowerlineFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSucceeded extends js.Object {
  var succeeded: Boolean
  var value: PowerlineFrequency
}

object AnonSucceeded {
  @scala.inline
  def apply(succeeded: Boolean, value: PowerlineFrequency): AnonSucceeded = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSucceeded]
  }
}

