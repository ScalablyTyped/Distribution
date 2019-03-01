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

object IMHistoryMessage {
  @scala.inline
  def apply(body: java.lang.String, from: java.lang.String, id: java.lang.String, time: java.lang.String): IMHistoryMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[IMHistoryMessage]
  }
}

