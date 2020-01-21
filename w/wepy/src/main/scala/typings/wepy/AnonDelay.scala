package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelay extends js.Object {
  var delay: Double
  var duration: Double
  var timingFunction: String
  var transformOrigin: String
}

object AnonDelay {
  @scala.inline
  def apply(delay: Double, duration: Double, timingFunction: String, transformOrigin: String): AnonDelay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timingFunction = timingFunction.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDelay]
  }
}

