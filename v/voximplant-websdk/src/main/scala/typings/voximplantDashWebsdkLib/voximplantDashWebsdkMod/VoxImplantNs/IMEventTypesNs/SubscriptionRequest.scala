package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when some user tries to add current user into his roster. Current user can confirm or reject the subscription, then VoxImplant.IMEvents.RosterItemChange will be dispatched on for user that made the request
		*/
trait SubscriptionRequest
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: java.lang.String
  /**
  			*	Optional message
  			*/
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[java.lang.String] = js.undefined
  /**
  			*	Message event type. See VoxImplant.SubscriptionRequestType enum
  			*/
  var `type`: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.SubscriptionRequestType
}

object SubscriptionRequest {
  @scala.inline
  def apply(
    id: java.lang.String,
    `type`: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.SubscriptionRequestType,
    message: java.lang.String = null,
    resource: java.lang.String = null
  ): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (message != null) __obj.updateDynamic("message")(message)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[SubscriptionRequest]
  }
}

