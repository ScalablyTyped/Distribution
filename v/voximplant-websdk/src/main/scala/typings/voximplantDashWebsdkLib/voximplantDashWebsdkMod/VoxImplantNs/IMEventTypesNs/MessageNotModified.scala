package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if error happened during instant message modification
		*/
trait MessageNotModified
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			*	Message new content
  			*/
  var code: scala.Double
  /**
  			*	Message id
  			*/
  var message_id: java.lang.String
  /**
  			*	User id (of the user to whom the message was sent)
  			*/
  var to: java.lang.String
}

object MessageNotModified {
  @scala.inline
  def apply(code: scala.Double, message_id: java.lang.String, to: java.lang.String): MessageNotModified = {
    val __obj = js.Dynamic.literal(code = code, message_id = message_id, to = to)
  
    __obj.asInstanceOf[MessageNotModified]
  }
}

