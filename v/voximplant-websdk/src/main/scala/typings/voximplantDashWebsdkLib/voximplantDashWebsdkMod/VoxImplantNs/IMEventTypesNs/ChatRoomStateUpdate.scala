package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat session state updated
		*/
trait ChatRoomStateUpdate extends js.Object {
  /**
  			* User id
  			*/
  var from: java.lang.String
  /**
  			* Resource name
  			*/
  var resource: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
  /**
  			* Current chat session state
  			*/
  var state: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
}

