package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message received
		*/
trait MessageReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			*	Message content
  			*/
  var content: java.lang.String
  /**
  			*	User id (of the user who sent the message)
  			*/
  var id: java.lang.String
  /**
  			*	Message id
  			*/
  var message_id: java.lang.String
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[java.lang.String] = js.undefined
  /**
  			*	User id (of the user to whom the message was sent)
  			*/
  var to: java.lang.String
}

object MessageReceived {
  @scala.inline
  def apply(
    content: java.lang.String,
    id: java.lang.String,
    message_id: java.lang.String,
    to: java.lang.String,
    resource: java.lang.String = null
  ): MessageReceived = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message_id")(message_id)
    __obj.updateDynamic("to")(to)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[MessageReceived]
  }
}

