package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		* Event dispatched in case of error while chat room operation
		*/
trait ChatRoomError extends js.Object {
  /**
  			* Error code
  			*/
  var code: java.lang.String
  /**
  			* Operation name
  			*/
  var operation: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
  /**
  			* Error description
  			*/
  var text: java.lang.String
}

