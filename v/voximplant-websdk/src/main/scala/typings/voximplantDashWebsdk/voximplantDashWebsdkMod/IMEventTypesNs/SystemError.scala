package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMErrorType
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched in case of instant messaging subsystem error
		*/
trait SystemError extends VoxImplantIMEvent {
  /**
  			*	Error data object, contains the error details
  			*/
  var errorData: js.Object
  /**
  			*	Error type
  			*/
  var errorType: IMErrorType
}

object SystemError {
  @scala.inline
  def apply(errorData: js.Object, errorType: IMErrorType): SystemError = {
    val __obj = js.Dynamic.literal(errorData = errorData, errorType = errorType)
  
    __obj.asInstanceOf[SystemError]
  }
}

