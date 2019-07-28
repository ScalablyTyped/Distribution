package typings.updateDashNotifier.updateDashNotifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  var current: String
  var latest: String
  var name: String
  var `type`: String
}

object UpdateInfo {
  @scala.inline
  def apply(current: String, latest: String, name: String, `type`: String): UpdateInfo = {
    val __obj = js.Dynamic.literal(current = current, latest = latest, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateInfo]
  }
}

