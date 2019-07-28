package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

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
  var body: String
  /**
  		* User id - author of the message
  		*/
  var from: String
  /**
  		* Message id
  		*/
  var id: String
  /**
  		* Message creation time
  		*/
  var time: String
}

object IMHistoryMessage {
  @scala.inline
  def apply(body: String, from: String, id: String, time: String): IMHistoryMessage = {
    val __obj = js.Dynamic.literal(body = body, from = from, id = id, time = time)
  
    __obj.asInstanceOf[IMHistoryMessage]
  }
}

