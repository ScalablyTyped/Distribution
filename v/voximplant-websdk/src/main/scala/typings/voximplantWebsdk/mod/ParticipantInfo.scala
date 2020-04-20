package typings.voximplantWebsdk.mod

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
  var affiliation: Double
  /**
  		* Indicate conditions like: user has been kicked or banned from the room
  		*/
  var flags: Double
  /**
  		* User id
  		*/
  var id: String
  /**
  		* Reason
  		*/
  var reason: String
  /**
  		* Resource name
  		*/
  var resource: String
  /**
  		* The participant's role with the room
  		*/
  var role: Double
}

object ParticipantInfo {
  @scala.inline
  def apply(affiliation: Double, flags: Double, id: String, reason: String, resource: String, role: Double): ParticipantInfo = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantInfo]
  }
}

