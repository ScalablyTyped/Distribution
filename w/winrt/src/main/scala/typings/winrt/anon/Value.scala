package typings.winrt.anon

import typings.winrt.Windows.Media.Capture.PowerlineFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var succeeded: Boolean
  var value: PowerlineFrequency
}

object Value {
  @scala.inline
  def apply(succeeded: Boolean, value: PowerlineFrequency): Value = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

