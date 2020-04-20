package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnline extends js.Object {
  var offline: Double
  var online: Double
}

object AnonOnline {
  @scala.inline
  def apply(offline: Double, online: Double): AnonOnline = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnline]
  }
}

