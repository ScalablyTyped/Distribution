package typings.strophe.mod.Strophe.MUC

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
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (jid != null) __obj.updateDynamic("jid")(jid.asInstanceOf[js.Any])
    if (nick != null) __obj.updateDynamic("nick")(nick.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OccupantInfo]
  }
}

