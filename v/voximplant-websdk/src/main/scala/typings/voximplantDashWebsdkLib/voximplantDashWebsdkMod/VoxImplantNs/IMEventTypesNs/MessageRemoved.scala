package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message was removed by user
		*/

trait MessageRemoved extends js.Object {
  /**
  			*	User id (of the user who sent the message)
  			*/
  var id: java.lang.String
  /**
  			*	Message id
  			*/
  var message_id: java.lang.String
  /**
  			*	User id (of the user to whom the message was sent)
  			*/
  var to: java.lang.String
}

