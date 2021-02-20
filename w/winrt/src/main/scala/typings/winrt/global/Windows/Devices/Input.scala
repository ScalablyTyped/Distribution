package typings.winrt.global.Windows.Devices

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSGlobal("Windows.Devices.Input.KeyboardCapabilities")
  @js.native
  class KeyboardCapabilities ()
    extends typings.winrt.Windows.Devices.Input.KeyboardCapabilities
  
  @JSGlobal("Windows.Devices.Input.MouseCapabilities")
  @js.native
  class MouseCapabilities ()
    extends typings.winrt.Windows.Devices.Input.MouseCapabilities
  
  @JSGlobal("Windows.Devices.Input.MouseDevice")
  @js.native
  class MouseDevice ()
    extends typings.winrt.Windows.Devices.Input.MouseDevice
  /* static members */
  object MouseDevice {
    
    @JSGlobal("Windows.Devices.Input.MouseDevice.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrt.Windows.Devices.Input.MouseDevice = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.MouseEventArgs")
  @js.native
  class MouseEventArgs ()
    extends typings.winrt.Windows.Devices.Input.MouseEventArgs
  
  @JSGlobal("Windows.Devices.Input.PointerDevice")
  @js.native
  class PointerDevice ()
    extends typings.winrt.Windows.Devices.Input.PointerDevice
  /* static members */
  object PointerDevice {
    
    @JSGlobal("Windows.Devices.Input.PointerDevice.getPointerDevice")
    @js.native
    def getPointerDevice(pointerId: Double): typings.winrt.Windows.Devices.Input.PointerDevice = js.native
    
    @JSGlobal("Windows.Devices.Input.PointerDevice.getPointerDevices")
    @js.native
    def getPointerDevices(): IVectorView[typings.winrt.Windows.Devices.Input.PointerDevice] = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.PointerDeviceType")
  @js.native
  object PointerDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Input.PointerDeviceType with Double] = js.native
    
    /* 2 */ val mouse: typings.winrt.Windows.Devices.Input.PointerDeviceType.mouse with Double = js.native
    
    /* 1 */ val pen: typings.winrt.Windows.Devices.Input.PointerDeviceType.pen with Double = js.native
    
    /* 0 */ val touch: typings.winrt.Windows.Devices.Input.PointerDeviceType.touch with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.TouchCapabilities")
  @js.native
  class TouchCapabilities ()
    extends typings.winrt.Windows.Devices.Input.TouchCapabilities
}
