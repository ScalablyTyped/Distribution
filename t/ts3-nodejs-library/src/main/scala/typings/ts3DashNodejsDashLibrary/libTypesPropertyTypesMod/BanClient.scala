package typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanClient extends js.Object {
  /** ban reason */
  var banreason: String
  var clid: Double
  /** myteamspeak id, use "empty" to ban all clients without connected myteamspeak */
  var mytsid: js.UndefOr[String] = js.undefined
  /** bantime in seconds, if left empty it will result in a permaban */
  var time: js.UndefOr[Double] = js.undefined
}

object BanClient {
  @scala.inline
  def apply(banreason: String, clid: Double, mytsid: String = null, time: Int | Double = null): BanClient = {
    val __obj = js.Dynamic.literal(banreason = banreason, clid = clid)
    if (mytsid != null) __obj.updateDynamic("mytsid")(mytsid)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanClient]
  }
}

