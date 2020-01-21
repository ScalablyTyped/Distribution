package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Chat room
	*/
trait ChatRoom extends js.Object {
  /**
  		* Chat room id
  		*/
  var id: String
  /**
  		* Chat room password
  		*/
  var pass: String
}

object ChatRoom {
  @scala.inline
  def apply(id: String, pass: String): ChatRoom = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatRoom]
  }
}

