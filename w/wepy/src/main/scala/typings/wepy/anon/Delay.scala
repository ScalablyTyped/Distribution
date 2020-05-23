package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var delay: Double
  var duration: Double
  var timingFunction: String
  var transformOrigin: String
}

object Delay {
  @scala.inline
  def apply(delay: Double, duration: Double, timingFunction: String, transformOrigin: String): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timingFunction = timingFunction.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
}

