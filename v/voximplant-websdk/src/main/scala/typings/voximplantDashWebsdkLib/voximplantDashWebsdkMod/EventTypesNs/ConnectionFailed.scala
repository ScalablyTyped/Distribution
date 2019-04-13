package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.EventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if connection to VoxImplant Cloud couldn't be established. See connect function
		*/
trait ConnectionFailed
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantEvent {
  /**
  			*	Failure reason description
  			*/
  var message: java.lang.String
}

object ConnectionFailed {
  @scala.inline
  def apply(message: java.lang.String): ConnectionFailed = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[ConnectionFailed]
  }
}

