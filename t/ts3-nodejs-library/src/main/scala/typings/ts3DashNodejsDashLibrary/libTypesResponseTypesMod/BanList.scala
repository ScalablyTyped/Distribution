package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanList extends js.Object {
  var banid: Double
  var created: Double
  var duration: Double
  var enforcements: Double
  var invokercldbid: Double
  var invokername: String
  var invokeruid: String
  var ip: String
  var lastnickname: String
  var mytsid: String
  var name: String
  var reason: String
  var uid: String
}

object BanList {
  @scala.inline
  def apply(
    banid: Double,
    created: Double,
    duration: Double,
    enforcements: Double,
    invokercldbid: Double,
    invokername: String,
    invokeruid: String,
    ip: String,
    lastnickname: String,
    mytsid: String,
    name: String,
    reason: String,
    uid: String
  ): BanList = {
    val __obj = js.Dynamic.literal(banid = banid, created = created, duration = duration, enforcements = enforcements, invokercldbid = invokercldbid, invokername = invokername, invokeruid = invokeruid, ip = ip, lastnickname = lastnickname, mytsid = mytsid, name = name, reason = reason, uid = uid)
  
    __obj.asInstanceOf[BanList]
  }
}

