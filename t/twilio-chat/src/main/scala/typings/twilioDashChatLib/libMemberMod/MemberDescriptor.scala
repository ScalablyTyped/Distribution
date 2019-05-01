package typings
package twilioDashChatLib.libMemberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberDescriptor extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var dateCreated: js.Any
  var dateUpdated: js.Any
  var identity: java.lang.String
  var lastConsumedMessageIndex: scala.Double
  var lastConsumptionTimestamp: scala.Double
  var roleSid: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[twilioDashChatLib.libMemberMod.MemberNs.Type] = js.undefined
  var userInfo: java.lang.String
}

object MemberDescriptor {
  @scala.inline
  def apply(
    dateCreated: js.Any,
    dateUpdated: js.Any,
    identity: java.lang.String,
    lastConsumedMessageIndex: scala.Double,
    lastConsumptionTimestamp: scala.Double,
    userInfo: java.lang.String,
    attributes: js.Object = null,
    roleSid: java.lang.String = null,
    `type`: twilioDashChatLib.libMemberMod.MemberNs.Type = null
  ): MemberDescriptor = {
    val __obj = js.Dynamic.literal(dateCreated = dateCreated, dateUpdated = dateUpdated, identity = identity, lastConsumedMessageIndex = lastConsumedMessageIndex, lastConsumptionTimestamp = lastConsumptionTimestamp, userInfo = userInfo)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (roleSid != null) __obj.updateDynamic("roleSid")(roleSid)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MemberDescriptor]
  }
}

