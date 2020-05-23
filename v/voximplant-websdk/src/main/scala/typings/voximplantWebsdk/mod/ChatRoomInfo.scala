package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Chat room info
  */
trait ChatRoomInfo extends js.Object {
  /**
    * Creation date
    */
  var creationdate: String
  /**
    * Room description
    */
  var description: String
  /**
    * Number of chat room participants
    */
  var occupants: Double
  /**
    * Room's name / subject
    */
  var subject: String
}

object ChatRoomInfo {
  @scala.inline
  def apply(creationdate: String, description: String, occupants: Double, subject: String): ChatRoomInfo = {
    val __obj = js.Dynamic.literal(creationdate = creationdate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], occupants = occupants.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInfo]
  }
}

