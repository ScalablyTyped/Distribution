package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: Double
  var duration: Double
  var timingFunction: String
  var transformOrigin: String
}

object Anon_Delay {
  @scala.inline
  def apply(delay: Double, duration: Double, timingFunction: String, transformOrigin: String): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timingFunction = timingFunction.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Delay]
  }
}

