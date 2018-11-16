package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message was sent to chat room
		*/

trait ChatRoomMessageReceived extends js.Object {
  /**
  			* Message content
  			*/
  var content: java.lang.String
  /**
  			* User id
  			*/
  var from: java.lang.String
  /**
  			* Modified message id
  			*/
  var message_id: java.lang.String
  /**
  			* Private/public message flag
  			*/
  var private_message: java.lang.String
  /**
  			* Resource name
  			*/
  var resource: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
  /**
  			* Message timestamp
  			*/
  var timestamp: java.lang.String
}

