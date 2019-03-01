package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message was removed by user
		*/
trait MessageRemoved
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			*	User id (of the user who sent the message)
  			*/
  var id: java.lang.String
  /**
  			*	Message id
  			*/
  var message_id: java.lang.String
  /**
  			*	User id (of the user to whom the message was sent)
  			*/
  var to: java.lang.String
}

object MessageRemoved {
  @scala.inline
  def apply(id: java.lang.String, message_id: java.lang.String, to: java.lang.String): MessageRemoved = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message_id")(message_id)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[MessageRemoved]
  }
}

