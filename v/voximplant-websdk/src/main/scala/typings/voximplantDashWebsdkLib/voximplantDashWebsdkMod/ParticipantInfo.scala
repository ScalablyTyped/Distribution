package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Participant info
	*/
trait ParticipantInfo extends js.Object {
  /**
  		* The participant's affiliation with the room
  		*/
  var affiliation: scala.Double
  /**
  		* Indicate conditions like: user has been kicked or banned from the room
  		*/
  var flags: scala.Double
  /**
  		* User id
  		*/
  var id: java.lang.String
  /**
  		* Reason
  		*/
  var reason: java.lang.String
  /**
  		* Resource name
  		*/
  var resource: java.lang.String
  /**
  		* The participant's role with the room
  		*/
  var role: scala.Double
}

object ParticipantInfo {
  @scala.inline
  def apply(
    affiliation: scala.Double,
    flags: scala.Double,
    id: java.lang.String,
    reason: java.lang.String,
    resource: java.lang.String,
    role: scala.Double
  ): ParticipantInfo = {
    val __obj = js.Dynamic.literal(affiliation = affiliation, flags = flags, id = id, reason = reason, resource = resource, role = role)
  
    __obj.asInstanceOf[ParticipantInfo]
  }
}

