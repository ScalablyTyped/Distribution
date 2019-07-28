package typings.strophe.mucMod.stropheMod.StropheNs.MUCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OccupantInfo extends js.Object {
  var affiliation: js.UndefOr[String] = js.undefined
  var jid: js.UndefOr[String] = js.undefined
  var nick: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object OccupantInfo {
  @scala.inline
  def apply(
    affiliation: String = null,
    jid: String = null,
    nick: String = null,
    role: String = null,
    show: String = null,
    status: String = null
  ): OccupantInfo = {
    val __obj = js.Dynamic.literal()
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation)
    if (jid != null) __obj.updateDynamic("jid")(jid)
    if (nick != null) __obj.updateDynamic("nick")(nick)
    if (role != null) __obj.updateDynamic("role")(role)
    if (show != null) __obj.updateDynamic("show")(show)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[OccupantInfo]
  }
}

