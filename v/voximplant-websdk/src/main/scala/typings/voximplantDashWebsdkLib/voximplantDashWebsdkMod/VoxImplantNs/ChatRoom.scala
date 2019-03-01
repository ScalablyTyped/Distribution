package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

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
  var id: java.lang.String
  /**
  		* Chat room password
  		*/
  var pass: java.lang.String
}

object ChatRoom {
  @scala.inline
  def apply(id: java.lang.String, pass: java.lang.String): ChatRoom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("pass")(pass)
    __obj.asInstanceOf[ChatRoom]
  }
}

