package typings.voximplantWebsdk.mod.EventTypes

import typings.voximplantWebsdk.mod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched after login , loginWithOneTimeKey, requestOneTimeLoginKey or loginWithCode function call
  */
@js.native
trait AuthResult extends VoxImplantEvent {
  /**
    *    Auth error code, possible values are: 301 - code for 'code' auth type was sent, 302 - key for 'onetimekey' auth type received, 401 - invalid password, 404 - invalid username, 403 - user account is frozen, 500 - internal error
    */
  var code: js.UndefOr[Double] = js.native
  /**
    *    Authorized user's display name
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    *    This parameter is used to calculate hash parameter for loginWithOneTimeKey method. AuthResult with the key dispatched after requestOneTimeLoginKey method was called
    */
  var key: js.UndefOr[String] = js.native
  /**
    *    Application options
    */
  var options: js.UndefOr[js.Object] = js.native
  /**
    *    True in case of successful authorization, false - otherwise
    */
  var result: Boolean = js.native
}

object AuthResult {
  @scala.inline
  def apply(result: Boolean): AuthResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResult]
  }
  @scala.inline
  implicit class AuthResultOps[Self <: AuthResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResult(value: Boolean): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

