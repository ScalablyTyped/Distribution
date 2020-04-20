package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvailable extends js.Object {
  var available: Double
  var offline: Double
  var unavailable: Double
}

object AnonAvailable {
  @scala.inline
  def apply(available: Double, offline: Double, unavailable: Double): AnonAvailable = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], unavailable = unavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvailable]
  }
}

