package typings.vanillaSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientX extends js.Object {
  var clientX: Double
  var clientY: Double
}

object AnonClientX {
  @scala.inline
  def apply(clientX: Double, clientY: Double): AnonClientX = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientX]
  }
}

