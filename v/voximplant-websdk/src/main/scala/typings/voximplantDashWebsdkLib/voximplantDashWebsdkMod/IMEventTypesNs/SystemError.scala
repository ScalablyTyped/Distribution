package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched in case of instant messaging subsystem error
		*/
trait SystemError
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			*	Error data object, contains the error details
  			*/
  var errorData: js.Object
  /**
  			*	Error type
  			*/
  var errorType: voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMErrorType
}

object SystemError {
  @scala.inline
  def apply(errorData: js.Object, errorType: voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMErrorType): SystemError = {
    val __obj = js.Dynamic.literal(errorData = errorData, errorType = errorType)
  
    __obj.asInstanceOf[SystemError]
  }
}

