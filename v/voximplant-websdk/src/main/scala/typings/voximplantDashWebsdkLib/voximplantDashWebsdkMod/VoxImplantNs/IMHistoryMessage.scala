package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Message received from history
	*/

trait IMHistoryMessage extends js.Object {
  /**
  		* Message body
  		*/
  var body: java.lang.String
  /**
  		* User id - author of the message
  		*/
  var from: java.lang.String
  /**
  		* Message id
  		*/
  var id: java.lang.String
  /**
  		* Message creation time
  		*/
  var time: java.lang.String
}

