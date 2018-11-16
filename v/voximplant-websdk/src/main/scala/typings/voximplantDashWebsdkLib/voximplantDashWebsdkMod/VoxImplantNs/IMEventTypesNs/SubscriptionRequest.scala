package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when some user tries to add current user into his roster. Current user can confirm or reject the subscription, then VoxImplant.IMEvents.RosterItemChange will be dispatched on for user that made the request
		*/

trait SubscriptionRequest extends js.Object {
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

