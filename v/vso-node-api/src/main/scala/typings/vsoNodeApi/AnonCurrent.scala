package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: Double
  var future: Double
  var past: Double
}

object AnonCurrent {
  @scala.inline
  def apply(current: Double, future: Double, past: Double): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrent]
  }
}

