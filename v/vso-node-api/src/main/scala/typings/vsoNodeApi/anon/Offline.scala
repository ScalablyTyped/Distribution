package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offline extends js.Object {
  var offline: scala.Double
  var online: scala.Double
}

object Offline {
  @scala.inline
  def apply(offline: scala.Double, online: scala.Double): Offline = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offline]
  }
}

