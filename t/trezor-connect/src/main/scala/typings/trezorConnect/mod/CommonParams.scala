package typings.trezorConnect.mod

import typings.trezorConnect.anon.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonParams extends StObject {
  
  var allowSeedlessDevice: js.UndefOr[Boolean] = js.native
  
  var device: js.UndefOr[Instance] = js.native
  
  var keepSession: js.UndefOr[Boolean] = js.native
  
  var useEmptyPassphrase: js.UndefOr[Boolean] = js.native
}
object CommonParams {
  
  @scala.inline
  def apply(): CommonParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonParams]
  }
  
  @scala.inline
  implicit class CommonParamsMutableBuilder[Self <: CommonParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSeedlessDevice(value: Boolean): Self = StObject.set(x, "allowSeedlessDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSeedlessDeviceUndefined: Self = StObject.set(x, "allowSeedlessDevice", js.undefined)
    
    @scala.inline
    def setDevice(value: Instance): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setKeepSession(value: Boolean): Self = StObject.set(x, "keepSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepSessionUndefined: Self = StObject.set(x, "keepSession", js.undefined)
    
    @scala.inline
    def setUseEmptyPassphrase(value: Boolean): Self = StObject.set(x, "useEmptyPassphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEmptyPassphraseUndefined: Self = StObject.set(x, "useEmptyPassphrase", js.undefined)
  }
}
