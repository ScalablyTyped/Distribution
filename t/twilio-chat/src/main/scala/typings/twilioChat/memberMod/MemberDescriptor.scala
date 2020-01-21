package typings.twilioChat.memberMod

import typings.twilioChat.memberMod.Member.Type
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
    val __obj = js.Dynamic.literal(dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], lastConsumptionTimestamp = lastConsumptionTimestamp.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (roleSid != null) __obj.updateDynamic("roleSid")(roleSid.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDescriptor]
  }
}

