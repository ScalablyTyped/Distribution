package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanListEntry extends js.Object {
  var banid: String
  var created: String
  var duration: String
  var enforcements: String
  var invokercldbid: String
  var invokername: String
  var invokeruid: String
  var ip: js.UndefOr[String] = js.undefined
  var lastnickname: js.UndefOr[String] = js.undefined
  var mytsid: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var reason: String
  var uid: js.UndefOr[String] = js.undefined
}

object BanListEntry {
  @scala.inline
  def apply(
    banid: String,
    created: String,
    duration: String,
    enforcements: String,
    invokercldbid: String,
    invokername: String,
    invokeruid: String,
    reason: String,
    ip: String = null,
    lastnickname: String = null,
    mytsid: String = null,
    name: String = null,
    uid: String = null
  ): BanListEntry = {
    val __obj = js.Dynamic.literal(banid = banid, created = created, duration = duration, enforcements = enforcements, invokercldbid = invokercldbid, invokername = invokername, invokeruid = invokeruid, reason = reason)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (lastnickname != null) __obj.updateDynamic("lastnickname")(lastnickname)
    if (mytsid != null) __obj.updateDynamic("mytsid")(mytsid)
    if (name != null) __obj.updateDynamic("name")(name)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[BanListEntry]
  }
}

