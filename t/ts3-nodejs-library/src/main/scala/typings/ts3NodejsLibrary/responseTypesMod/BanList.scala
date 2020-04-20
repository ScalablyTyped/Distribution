package typings.ts3NodejsLibrary.responseTypesMod

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
    val __obj = js.Dynamic.literal(banid = banid.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], enforcements = enforcements.asInstanceOf[js.Any], invokercldbid = invokercldbid.asInstanceOf[js.Any], invokername = invokername.asInstanceOf[js.Any], invokeruid = invokeruid.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lastnickname = lastnickname.asInstanceOf[js.Any], mytsid = mytsid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanList]
  }
}

