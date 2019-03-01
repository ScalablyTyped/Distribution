package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OfflineOnline extends js.Object {
  var offline: scala.Double
  var online: scala.Double
}

object Anon_OfflineOnline {
  @scala.inline
  def apply(offline: scala.Double, online: scala.Double): Anon_OfflineOnline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offline")(offline)
    __obj.updateDynamic("online")(online)
    __obj.asInstanceOf[Anon_OfflineOnline]
  }
}

