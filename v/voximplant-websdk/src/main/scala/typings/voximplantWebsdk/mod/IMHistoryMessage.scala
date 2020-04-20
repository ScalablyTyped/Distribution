package typings.voximplantWebsdk.mod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMHistoryMessage]
  }
}

