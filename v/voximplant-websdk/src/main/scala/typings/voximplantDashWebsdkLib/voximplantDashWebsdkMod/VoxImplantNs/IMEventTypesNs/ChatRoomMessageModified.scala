package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room message modified
		*/
trait ChatRoomMessageModified extends js.Object {
  /**
  			* New message content
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

