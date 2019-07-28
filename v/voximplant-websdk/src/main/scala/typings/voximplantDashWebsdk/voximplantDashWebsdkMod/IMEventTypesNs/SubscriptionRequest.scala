package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.SubscriptionRequestType
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when some user tries to add current user into his roster. Current user can confirm or reject the subscription, then VoxImplant.IMEvents.RosterItemChange will be dispatched on for user that made the request
		*/
trait SubscriptionRequest extends VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: String
  /**
  			*	Optional message
  			*/
  var message: js.UndefOr[String] = js.undefined
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[String] = js.undefined
  /**
  			*	Message event type. See VoxImplant.SubscriptionRequestType enum
  			*/
  var `type`: SubscriptionRequestType
}

object SubscriptionRequest {
  @scala.inline
  def apply(id: String, `type`: SubscriptionRequestType, message: String = null, resource: String = null): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (message != null) __obj.updateDynamic("message")(message)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[SubscriptionRequest]
  }
}

