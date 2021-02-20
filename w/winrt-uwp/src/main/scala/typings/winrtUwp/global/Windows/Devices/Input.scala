package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for identifying the input devices available (pointer, touch, mouse, and keyboard) and retrieving information about those devices. */
object Input {
  
  /** Supports the ability to determine the capabilities of any connected hardware keyboards. */
  @JSGlobal("Windows.Devices.Input.KeyboardCapabilities")
  @js.native
  /** Initializes a new instance of the KeyboardCapabilities class. */
  class KeyboardCapabilities ()
    extends typings.winrtUwp.Windows.Devices.Input.KeyboardCapabilities
  
  /** Supports the ability to determine the capabilities of any connected mouse devices. */
  @JSGlobal("Windows.Devices.Input.MouseCapabilities")
  @js.native
  /** Initializes a new instance of the MouseCapabilities class. */
  class MouseCapabilities ()
    extends typings.winrtUwp.Windows.Devices.Input.MouseCapabilities
  
  /** Supports the ability to identify and track connected mouse devices. */
  @JSGlobal("Windows.Devices.Input.MouseDevice")
  @js.native
  abstract class MouseDevice ()
    extends typings.winrtUwp.Windows.Devices.Input.MouseDevice
  object MouseDevice {
    
    /**
      * Retrieves the mouse device that is associated with the current view.
      * @return The mouse device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Input.MouseDevice.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrtUwp.Windows.Devices.Input.MouseDevice = js.native
  }
  
  /** Contains event data for the MouseMoved event. */
  @JSGlobal("Windows.Devices.Input.MouseEventArgs")
  @js.native
  abstract class MouseEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Input.MouseEventArgs
  
  /** Supports the ability to identify the connected pointer devices and determine their capabilities. */
  @JSGlobal("Windows.Devices.Input.PointerDevice")
  @js.native
  abstract class PointerDevice ()
    extends typings.winrtUwp.Windows.Devices.Input.PointerDevice
  object PointerDevice {
    
    /**
      * Gets information about the pointer device associated with the specified input pointer ID.
      * @param pointerId The ID of the pointer input.
      * @return The PointerDevice object that represents the associated pointer device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Input.PointerDevice.getPointerDevice")
    @js.native
    def getPointerDevice(pointerId: Double): typings.winrtUwp.Windows.Devices.Input.PointerDevice = js.native
    
    /**
      * Gets information about the pointer devices attached to the system.
      * @return The collection of PointerDevice objects that represent the pointer devices attached to the system.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Input.PointerDevice.getPointerDevices")
    @js.native
    def getPointerDevices(): IVectorView[typings.winrtUwp.Windows.Devices.Input.PointerDevice] = js.native
  }
  
  /** Enumerates pointer device types. */
  @JSGlobal("Windows.Devices.Input.PointerDeviceType")
  @js.native
  object PointerDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Input.PointerDeviceType with Double] = js.native
    
    /* 2 */ val mouse: typings.winrtUwp.Windows.Devices.Input.PointerDeviceType.mouse with Double = js.native
    
    /* 1 */ val pen: typings.winrtUwp.Windows.Devices.Input.PointerDeviceType.pen with Double = js.native
    
    /* 0 */ val touch: typings.winrtUwp.Windows.Devices.Input.PointerDeviceType.touch with Double = js.native
  }
  
  /** Supports the ability to determine the touch capabilities of any connected touch digitizers. */
  @JSGlobal("Windows.Devices.Input.TouchCapabilities")
  @js.native
  /** Initializes a new instance of the TouchCapabilities class. */
  class TouchCapabilities ()
    extends typings.winrtUwp.Windows.Devices.Input.TouchCapabilities
}
