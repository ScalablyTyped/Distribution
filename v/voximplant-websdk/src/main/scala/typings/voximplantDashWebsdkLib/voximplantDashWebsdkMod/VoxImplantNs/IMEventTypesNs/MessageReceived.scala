package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message received
		*/
trait MessageReceived extends js.Object {
  /**
  			*	Message content
  			*/
  var content: java.lang.String
  /**
  			*	User id (of the user who sent the message)
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
  			*	User id (of the user to whom the message was sent)
  			*/
  var to: java.lang.String
}

