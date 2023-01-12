package typings.winrt.Windows.Media.Devices

import typings.winrt.anon.SucceededBoolean
import typings.winrt.anon.SucceededValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaDeviceControl extends StObject {
  
  var capabilities: MediaDeviceControlCapabilities
  
  def tryGetAuto(): SucceededBoolean
  
  def tryGetValue(): SucceededValue
  
  def trySetAuto(value: Boolean): Boolean
  
  def trySetValue(value: Double): Boolean
}
object IMediaDeviceControl {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IMediaDeviceControl] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: MediaDeviceControlCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setTryGetAuto(value: () => SucceededBoolean): Self = StObject.set(x, "tryGetAuto", js.Any.fromFunction0(value))
    
    inline def setTryGetValue(value: () => SucceededValue): Self = StObject.set(x, "tryGetValue", js.Any.fromFunction0(value))
    
    inline def setTrySetAuto(value: Boolean => Boolean): Self = StObject.set(x, "trySetAuto", js.Any.fromFunction1(value))
    
    inline def setTrySetValue(value: Double => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
  }
}
