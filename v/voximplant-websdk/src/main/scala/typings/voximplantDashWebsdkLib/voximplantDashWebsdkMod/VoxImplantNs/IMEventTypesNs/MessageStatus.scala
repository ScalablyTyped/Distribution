package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when sent message status changed
		*/

trait MessageStatus extends js.Object {
  /**
  			*	User id
  			*/
  var id: java.lang.String
  /**
  			*	Message id
  			*/
  var message_id: java.lang.String
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[java.lang.String] = js.undefined
  /**
  			*	Message event type. See VoxImplant.MessageEventType enum
  			*/
  var `type`: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.MessageEventType
}

