package typings
package updateDashNotifierLib.updateDashNotifierMod.UpdateNotifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  var current: java.lang.String
  var latest: java.lang.String
  var name: java.lang.String
  var `type`: java.lang.String
}

object UpdateInfo {
  @scala.inline
  def apply(
    current: java.lang.String,
    latest: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(current = current, latest = latest, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateInfo]
  }
}

