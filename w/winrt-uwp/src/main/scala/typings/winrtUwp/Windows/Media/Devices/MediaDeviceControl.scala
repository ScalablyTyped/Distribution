package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.anon.ReturnValueValue
import typings.winrtUwp.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets or sets a device setting on a camera. */
trait MediaDeviceControl extends StObject {
  
  /** Gets the capabilities of the camera for this camera setting. */
  var capabilities: MediaDeviceControlCapabilities
  
  /**
    * Indicates whether automatic adjustment of the camera setting is enabled.
    */
  def tryGetAuto(): Value
  
  /**
    * Gets the value of the camera setting.
    */
  def tryGetValue(): ReturnValueValue
  
  /**
    * Enables or disables automatic adjustment of the camera setting.
    * @param value True to enable automatic adjustment; or false to disable automatic adjustment. If false, call TrySetValue to adjust the setting.
    * @return Returns true if the method succeeds, or false otherwise.
    */
  def trySetAuto(value: Boolean): Boolean
  
  /**
    * Sets the camera setting.
    * @param value The new value of the camera setting. The units depend on the setting.
    * @return Returns true if the method succeeds, or false otherwise.
    */
  def trySetValue(value: Double): Boolean
}
object MediaDeviceControl {
  
  inline def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => Value,
    tryGetValue: () => ReturnValueValue,
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): MediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[MediaDeviceControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaDeviceControl] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: MediaDeviceControlCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setTryGetAuto(value: () => Value): Self = StObject.set(x, "tryGetAuto", js.Any.fromFunction0(value))
    
    inline def setTryGetValue(value: () => ReturnValueValue): Self = StObject.set(x, "tryGetValue", js.Any.fromFunction0(value))
    
    inline def setTrySetAuto(value: Boolean => Boolean): Self = StObject.set(x, "trySetAuto", js.Any.fromFunction1(value))
    
    inline def setTrySetValue(value: Double => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
  }
}
