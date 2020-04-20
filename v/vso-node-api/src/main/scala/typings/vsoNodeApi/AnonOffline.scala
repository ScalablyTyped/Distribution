package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffline extends js.Object {
  var offline: Double
  var online: Double
}

object AnonOffline {
  @scala.inline
  def apply(offline: Double, online: Double): AnonOffline = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffline]
  }
}

