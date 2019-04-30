package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanListEntry extends js.Object {
  var banid: java.lang.String
  var created: java.lang.String
  var duration: java.lang.String
  var enforcements: java.lang.String
  var invokercldbid: java.lang.String
  var invokername: java.lang.String
  var invokeruid: java.lang.String
  var ip: js.UndefOr[java.lang.String] = js.undefined
  var lastnickname: js.UndefOr[java.lang.String] = js.undefined
  var mytsid: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var reason: java.lang.String
  var uid: js.UndefOr[java.lang.String] = js.undefined
}

object BanListEntry {
  @scala.inline
  def apply(
    banid: java.lang.String,
    created: java.lang.String,
    duration: java.lang.String,
    enforcements: java.lang.String,
    invokercldbid: java.lang.String,
    invokername: java.lang.String,
    invokeruid: java.lang.String,
    reason: java.lang.String,
    ip: java.lang.String = null,
    lastnickname: java.lang.String = null,
    mytsid: java.lang.String = null,
    name: java.lang.String = null,
    uid: java.lang.String = null
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

