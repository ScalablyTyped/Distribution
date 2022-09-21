package typings.winrt.global.Windows.Devices

import typings.winrt.Windows.Devices.Input.MouseDelta
import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Devices.Input.PointerDeviceUsage
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSGlobal("Windows.Devices.Input.KeyboardCapabilities")
  @js.native
  open class KeyboardCapabilities ()
    extends StObject
       with typings.winrt.Windows.Devices.Input.KeyboardCapabilities {
    
    /* CompleteClass */
    var keyboardPresent: Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.MouseCapabilities")
  @js.native
  open class MouseCapabilities ()
    extends StObject
       with typings.winrt.Windows.Devices.Input.MouseCapabilities {
    
    /* CompleteClass */
    var horizontalWheelPresent: Double = js.native
    
    /* CompleteClass */
    var mousePresent: Double = js.native
    
    /* CompleteClass */
    var numberOfButtons: Double = js.native
    
    /* CompleteClass */
    var swapButtons: Double = js.native
    
    /* CompleteClass */
    var verticalWheelPresent: Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.MouseDevice")
  @js.native
  open class MouseDevice ()
    extends StObject
       with typings.winrt.Windows.Devices.Input.MouseDevice {
    
    /* CompleteClass */
    var onmousemoved: Any = js.native
  }
  /* static members */
  object MouseDevice {
    
    @JSGlobal("Windows.Devices.Input.MouseDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typings.winrt.Windows.Devices.Input.MouseDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.Devices.Input.MouseDevice]
  }
  
  @JSGlobal("Windows.Devices.Input.MouseEventArgs")
  @js.native
  open class MouseEventArgs ()
    extends StObject
       with typings.winrt.Windows.Devices.Input.MouseEventArgs {
    
    /* CompleteClass */
    var mouseDelta: MouseDelta = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.PointerDevice")
  @js.native
  open class PointerDevice ()
    extends StObject
       with typings.winrt.Windows.Devices.Input.PointerDevice {
    
    /* CompleteClass */
    var isIntegrated: Boolean = js.native
    
    /* CompleteClass */
    var maxContacts: Double = js.native
    
    /* CompleteClass */
    var physicalDeviceRect: Rect = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var screenRect: Rect = js.native
    
    /* CompleteClass */
    var supportedUsages: IVectorView[PointerDeviceUsage] = js.native
  }
  /* static members */
  object PointerDevice {
    
    @JSGlobal("Windows.Devices.Input.PointerDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPointerDevice(pointerId: Double): typings.winrt.Windows.Devices.Input.PointerDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerDevice")(pointerId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Devices.Input.PointerDevice]
    
    inline def getPointerDevices(): IVectorView[typings.winrt.Windows.Devices.Input.PointerDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerDevices")().asInstanceOf[IVectorView[typings.winrt.Windows.Devices.Input.PointerDevice]]
  }
  
  @JSGlobal("Windows.Devices.Input.PointerDeviceType")
  @js.native
  object PointerDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Input.PointerDeviceType & Double] = js.native
    
    /* 2 */ val mouse: typings.winrt.Windows.Devices.Input.PointerDeviceType.mouse & Double = js.native
    
    /* 1 */ val pen: typings.winrt.Windows.Devices.Input.PointerDeviceType.pen & Double = js.native
    
    /* 0 */ val touch: typings.winrt.Windows.Devices.Input.PointerDeviceType.touch & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.TouchCapabilities")
  @js.native
  open class TouchCapabilities ()
    extends StObject
       with typings.winrt.Windows.Devices.Input.TouchCapabilities {
    
    /* CompleteClass */
    var contacts: Double = js.native
    
    /* CompleteClass */
    var touchPresent: Double = js.native
  }
}
