package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisconnectEvent extends js.Object {
  var cfid: scala.Double
  var clid: scala.Double
  var ctid: scala.Double
  var reasonid: scala.Double
  var reasonmsg: java.lang.String
}

object DisconnectEvent {
  @scala.inline
  def apply(
    cfid: scala.Double,
    clid: scala.Double,
    ctid: scala.Double,
    reasonid: scala.Double,
    reasonmsg: java.lang.String
  ): DisconnectEvent = {
    val __obj = js.Dynamic.literal(cfid = cfid, clid = clid, ctid = ctid, reasonid = reasonid, reasonmsg = reasonmsg)
  
    __obj.asInstanceOf[DisconnectEvent]
  }
}

