package typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanAdd extends js.Object {
  /** ban reason */
  var banreason: String
  /** ip regular expression */
  var ip: js.UndefOr[String] = js.undefined
  /** myteamspeak id, use "empty" to ban all clients without connected myteamspeak */
  var mytsid: js.UndefOr[String] = js.undefined
  /** name regular expression */
  var name: js.UndefOr[String] = js.undefined
  /** bantime in seconds, if left empty it will result in a permaban */
  var time: js.UndefOr[Double] = js.undefined
  /** uid regular expression */
  var uid: js.UndefOr[String] = js.undefined
}

object BanAdd {
  @scala.inline
  def apply(
    banreason: String,
    ip: String = null,
    mytsid: String = null,
    name: String = null,
    time: Int | Double = null,
    uid: String = null
  ): BanAdd = {
    val __obj = js.Dynamic.literal(banreason = banreason.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (mytsid != null) __obj.updateDynamic("mytsid")(mytsid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanAdd]
  }
}

