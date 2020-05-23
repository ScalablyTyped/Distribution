package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Online extends js.Object {
  var offline: scala.Double
  var online: scala.Double
}

object Online {
  @scala.inline
  def apply(offline: scala.Double, online: scala.Double): Online = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[Online]
  }
}

