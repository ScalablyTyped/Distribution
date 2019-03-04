package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if chat room subject was changed
		*/
trait ChatRoomSubjectChange
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* User id who changed the subject
  			*/
  var id: java.lang.String
  /**
  			* Resource name
  			*/
  var resource: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
  /**
  			* New subject
  			*/
  var subject: java.lang.String
}

object ChatRoomSubjectChange {
  @scala.inline
  def apply(
    id: java.lang.String,
    resource: java.lang.String,
    room: java.lang.String,
    subject: java.lang.String
  ): ChatRoomSubjectChange = {
    val __obj = js.Dynamic.literal(id = id, resource = resource, room = room, subject = subject)
  
    __obj.asInstanceOf[ChatRoomSubjectChange]
  }
}

