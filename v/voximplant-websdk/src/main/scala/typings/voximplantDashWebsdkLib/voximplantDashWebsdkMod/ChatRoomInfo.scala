package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Chat room info
	*/
trait ChatRoomInfo extends js.Object {
  /**
  		* Creation date
  		*/
  var creationdate: java.lang.String
  /**
  		* Room description
  		*/
  var description: java.lang.String
  /**
  		* Number of chat room participants
  		*/
  var occupants: scala.Double
  /**
  		* Room's name / subject
  		*/
  var subject: java.lang.String
}

object ChatRoomInfo {
  @scala.inline
  def apply(
    creationdate: java.lang.String,
    description: java.lang.String,
    occupants: scala.Double,
    subject: java.lang.String
  ): ChatRoomInfo = {
    val __obj = js.Dynamic.literal(creationdate = creationdate, description = description, occupants = occupants, subject = subject)
  
    __obj.asInstanceOf[ChatRoomInfo]
  }
}

