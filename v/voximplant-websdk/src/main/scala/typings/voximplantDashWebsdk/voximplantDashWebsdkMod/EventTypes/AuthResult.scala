package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.EventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after login , loginWithOneTimeKey, requestOneTimeLoginKey or loginWithCode function call
		*/
trait AuthResult extends VoxImplantEvent {
  /**
  			*	Auth error code, possible values are: 301 - code for 'code' auth type was sent, 302 - key for 'onetimekey' auth type received, 401 - invalid password, 404 - invalid username, 403 - user account is frozen, 500 - internal error
  			*/
  var code: js.UndefOr[Double] = js.undefined
  /**
  			*	Authorized user's display name
  			*/
  var displayName: js.UndefOr[String] = js.undefined
  /**
  			*	This parameter is used to calculate hash parameter for loginWithOneTimeKey method. AuthResult with the key dispatched after requestOneTimeLoginKey method was called
  			*/
  var key: js.UndefOr[String] = js.undefined
  /**
  			*	Application options
  			*/
  var options: js.UndefOr[js.Object] = js.undefined
  /**
  			*	True in case of successful authorization, false - otherwise
  			*/
  var result: Boolean
}

object AuthResult {
  @scala.inline
  def apply(
    result: Boolean,
    code: Int | Double = null,
    displayName: String = null,
    key: String = null,
    options: js.Object = null
  ): AuthResult = {
    val __obj = js.Dynamic.literal(result = result)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (key != null) __obj.updateDynamic("key")(key)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AuthResult]
  }
}

