package typings.winrt.Windows.Media.Devices

import typings.winrt.anon.SucceededBoolean
import typings.winrt.anon.SucceededValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaDeviceControl extends js.Object {
  
  var capabilities: MediaDeviceControlCapabilities = js.native
  
  def tryGetAuto(): SucceededBoolean = js.native
  
  def tryGetValue(): SucceededValue = js.native
  
  def trySetAuto(value: Boolean): Boolean = js.native
  
  def trySetValue(value: Double): Boolean = js.native
}
object IMediaDeviceControl {
  
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => SucceededBoolean,
    tryGetValue: () => SucceededValue,
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): IMediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[IMediaDeviceControl]
  }
  
  @scala.inline
  implicit class IMediaDeviceControlOps[Self <: IMediaDeviceControl] (val x: Self) extends AnyVal {
    
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
    def setCapabilities(value: MediaDeviceControlCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetAuto(value: () => SucceededBoolean): Self = this.set("tryGetAuto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTryGetValue(value: () => SucceededValue): Self = this.set("tryGetValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrySetAuto(value: Boolean => Boolean): Self = this.set("trySetAuto", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrySetValue(value: Double => Boolean): Self = this.set("trySetValue", js.Any.fromFunction1(value))
  }
}
