package typings.twilioDashChat.libMemberMod

import typings.twilioDashChat.libMemberMod.MemberNs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberDescriptor extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var dateCreated: js.Any
  var dateUpdated: js.Any
  var identity: String
  var lastConsumedMessageIndex: Double
  var lastConsumptionTimestamp: Double
  var roleSid: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
  var userInfo: String
}

object MemberDescriptor {
  @scala.inline
  def apply(
    dateCreated: js.Any,
    dateUpdated: js.Any,
    identity: String,
    lastConsumedMessageIndex: Double,
    lastConsumptionTimestamp: Double,
    userInfo: String,
    attributes: js.Object = null,
    roleSid: String = null,
    `type`: Type = null
  ): MemberDescriptor = {
    val __obj = js.Dynamic.literal(dateCreated = dateCreated, dateUpdated = dateUpdated, identity = identity, lastConsumedMessageIndex = lastConsumedMessageIndex, lastConsumptionTimestamp = lastConsumptionTimestamp, userInfo = userInfo)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (roleSid != null) __obj.updateDynamic("roleSid")(roleSid)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MemberDescriptor]
  }
}

