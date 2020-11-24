package typings.trezorConnect.anon

import typings.trezorConnect.mod.LoginChallenge
import typings.trezorConnect.mod.RequestLoginParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect.CommonParams & {callback (): trezor-connect.trezor-connect.LoginChallenge} */
@js.native
trait CommonParamscallbackLogin extends RequestLoginParams {
  
  var allowSeedlessDevice: js.UndefOr[Boolean] = js.native
  
  def callback(): LoginChallenge = js.native
  
  var device: js.UndefOr[Instance] = js.native
  
  var keepSession: js.UndefOr[Boolean] = js.native
  
  var useEmptyPassphrase: js.UndefOr[Boolean] = js.native
}
object CommonParamscallbackLogin {
  
  @scala.inline
  def apply(callback: () => LoginChallenge): CommonParamscallbackLogin = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
    __obj.asInstanceOf[CommonParamscallbackLogin]
  }
  
  @scala.inline
  implicit class CommonParamscallbackLoginOps[Self <: CommonParamscallbackLogin] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: () => LoginChallenge): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllowSeedlessDevice(value: Boolean): Self = this.set("allowSeedlessDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSeedlessDevice: Self = this.set("allowSeedlessDevice", js.undefined)
    
    @scala.inline
    def setDevice(value: Instance): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setKeepSession(value: Boolean): Self = this.set("keepSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepSession: Self = this.set("keepSession", js.undefined)
    
    @scala.inline
    def setUseEmptyPassphrase(value: Boolean): Self = this.set("useEmptyPassphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEmptyPassphrase: Self = this.set("useEmptyPassphrase", js.undefined)
  }
}
