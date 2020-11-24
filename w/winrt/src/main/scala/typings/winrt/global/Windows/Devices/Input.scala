package typings.winrt.global.Windows.Devices

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Devices.Input")
@js.native
object Input extends js.Object {
  
  @js.native
  class KeyboardCapabilities ()
    extends typings.winrt.Windows.Devices.Input.KeyboardCapabilities
  
  @js.native
  class MouseCapabilities ()
    extends typings.winrt.Windows.Devices.Input.MouseCapabilities
  
  @js.native
  class MouseDevice ()
    extends typings.winrt.Windows.Devices.Input.MouseDevice
  /* static members */
  @js.native
  object MouseDevice extends js.Object {
    
    def getForCurrentView(): typings.winrt.Windows.Devices.Input.MouseDevice = js.native
  }
  
  @js.native
  class MouseEventArgs ()
    extends typings.winrt.Windows.Devices.Input.MouseEventArgs
  
  @js.native
  class PointerDevice ()
    extends typings.winrt.Windows.Devices.Input.PointerDevice
  /* static members */
  @js.native
  object PointerDevice extends js.Object {
    
    def getPointerDevice(pointerId: Double): typings.winrt.Windows.Devices.Input.PointerDevice = js.native
    
    def getPointerDevices(): IVectorView[typings.winrt.Windows.Devices.Input.PointerDevice] = js.native
  }
  
  @js.native
  object PointerDeviceType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Input.PointerDeviceType with Double] = js.native
    
    /* 2 */ val mouse: typings.winrt.Windows.Devices.Input.PointerDeviceType.mouse with Double = js.native
    
    /* 1 */ val pen: typings.winrt.Windows.Devices.Input.PointerDeviceType.pen with Double = js.native
    
    /* 0 */ val touch: typings.winrt.Windows.Devices.Input.PointerDeviceType.touch with Double = js.native
  }
  
  @js.native
  class TouchCapabilities ()
    extends typings.winrt.Windows.Devices.Input.TouchCapabilities
}
