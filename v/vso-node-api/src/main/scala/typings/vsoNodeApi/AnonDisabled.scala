package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Double
  var enabled: Double
  var paused: Double
}

object AnonDisabled {
  @scala.inline
  def apply(disabled: Double, enabled: Double, paused: Double): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabled]
  }
}

