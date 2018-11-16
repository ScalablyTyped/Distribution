package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched in case of error during chat room message modification
		*/

trait ChatRoomMessageNotModified extends js.Object {
  /**
  			* Error code
  			*/
  var code: scala.Double
  /**
  			* Message id
  			*/
  var message_id: java.lang.String
  /**
  			* Private/public message flag
  			*/
  var private_message: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

