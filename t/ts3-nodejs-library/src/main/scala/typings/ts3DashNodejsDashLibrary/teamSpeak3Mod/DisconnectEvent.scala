package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisconnectEvent extends js.Object {
  var cfid: Double
  var clid: Double
  var ctid: Double
  var reasonid: Double
  var reasonmsg: String
}

object DisconnectEvent {
  @scala.inline
  def apply(cfid: Double, clid: Double, ctid: Double, reasonid: Double, reasonmsg: String): DisconnectEvent = {
    val __obj = js.Dynamic.literal(cfid = cfid, clid = clid, ctid = ctid, reasonid = reasonid, reasonmsg = reasonmsg)
  
    __obj.asInstanceOf[DisconnectEvent]
  }
}

