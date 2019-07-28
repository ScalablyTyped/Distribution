package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if chat room subject was changed
		*/
trait ChatRoomSubjectChange extends VoxImplantIMEvent {
  /**
  			* User id who changed the subject
  			*/
  var id: String
  /**
  			* Resource name
  			*/
  var resource: String
  /**
  			* Room id
  			*/
  var room: String
  /**
  			* New subject
  			*/
  var subject: String
}

object ChatRoomSubjectChange {
  @scala.inline
  def apply(id: String, resource: String, room: String, subject: String): ChatRoomSubjectChange = {
    val __obj = js.Dynamic.literal(id = id, resource = resource, room = room, subject = subject)
  
    __obj.asInstanceOf[ChatRoomSubjectChange]
  }
}

