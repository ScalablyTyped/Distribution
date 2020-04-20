package typings.ts3NodejsLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCfid extends js.Object {
  var cfid: Double
  var clid: Double
  var ctid: Double
  var reasonid: Double
  var reasonmsg: String
}

object AnonCfid {
  @scala.inline
  def apply(cfid: Double, clid: Double, ctid: Double, reasonid: Double, reasonmsg: String): AnonCfid = {
    val __obj = js.Dynamic.literal(cfid = cfid.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], ctid = ctid.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any], reasonmsg = reasonmsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCfid]
  }
}

