package typings
package stropheLib.mucMod.stropheMod.StropheNs.MUCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OccupantInfo extends js.Object {
  var affiliation: js.UndefOr[java.lang.String] = js.undefined
  var jid: js.UndefOr[java.lang.String] = js.undefined
  var nick: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object OccupantInfo {
  @scala.inline
  def apply(
    affiliation: java.lang.String = null,
    jid: java.lang.String = null,
    nick: java.lang.String = null,
    role: java.lang.String = null,
    show: java.lang.String = null,
    status: java.lang.String = null
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

