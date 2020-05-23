package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Input.MouseDelta
import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Devices.Input.PointerDeviceUsage
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for identifying the input devices available (pointer, touch, mouse, and keyboard) and retrieving information about those devices. */
@JSGlobal("Windows.Devices.Input")
@js.native
object Input extends js.Object {
  /** Supports the ability to determine the capabilities of any connected hardware keyboards. */
  @js.native
  /** Initializes a new instance of the KeyboardCapabilities class. */
  class KeyboardCapabilities ()
    extends typings.winrtUwp.Windows.Devices.Input.KeyboardCapabilities {
    /** Gets a value that indicates whether a hardware keyboard is detected. */
    /* CompleteClass */
    override var keyboardPresent: Double = js.native
  }
  
  /** Supports the ability to determine the capabilities of any connected mouse devices. */
  @js.native
  /** Initializes a new instance of the MouseCapabilities class. */
  class MouseCapabilities ()
    extends typings.winrtUwp.Windows.Devices.Input.MouseCapabilities {
    /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that tilts left and right (usually for horizontal scrolling). */
    /* CompleteClass */
    override var horizontalWheelPresent: Double = js.native
    /** Gets a value that indicates whether a mouse device is detected. */
    /* CompleteClass */
    override var mousePresent: Double = js.native
    /** Gets a value representing the number of buttons on the mouse. If multiple mice are present, it returns the number of buttons of the mouse which has maximum number of buttons. */
    /* CompleteClass */
    override var numberOfButtons: Double = js.native
    /** Gets a value indicating whether any of the mice connected to the computer has swapped left and right buttons. */
    /* CompleteClass */
    override var swapButtons: Double = js.native
    /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that rolls up and down (usually for vertical scrolling). */
    /* CompleteClass */
    override var verticalWheelPresent: Double = js.native
  }
  
  /** Supports the ability to identify and track connected mouse devices. */
  @js.native
  abstract class MouseDevice ()
    extends typings.winrtUwp.Windows.Devices.Input.MouseDevice
  
  /** Contains event data for the MouseMoved event. */
  @js.native
  abstract class MouseEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Input.MouseEventArgs {
    /** Gets a value that indicates the change in the screen location of the mouse pointer since the last mouse event. */
    /* CompleteClass */
    override var mouseDelta: MouseDelta = js.native
  }
  
  /** Supports the ability to identify the connected pointer devices and determine their capabilities. */
  @js.native
  abstract class PointerDevice ()
    extends typings.winrtUwp.Windows.Devices.Input.PointerDevice {
    /** Gets a value indicating whether the pointer device is an integrated device. For example, a video display with an integrated touch digitizer compared to an external pen/stylus digitizer. */
    /* CompleteClass */
    override var isIntegrated: Boolean = js.native
    /** Gets a value indicating the maximum number of contacts supported by the input device. */
    /* CompleteClass */
    override var maxContacts: Double = js.native
    /* CompleteClass */
    override var maxPointersWithZDistance: js.Any = js.native
     /* unmapped type */ /** Gets the coordinates of the bounding rectangle supported by the input device. */
    /* CompleteClass */
    override var physicalDeviceRect: Rect = js.native
    /** Gets the pointer device type. */
    /* CompleteClass */
    override var pointerDeviceType: PointerDeviceType = js.native
    /** Gets the screen coordinates that are mapped to the bounding rectangle supported by the input device. */
    /* CompleteClass */
    override var screenRect: Rect = js.native
    /** Gets a collection containing the supported pointer device usages . */
    /* CompleteClass */
    override var supportedUsages: IVectorView[PointerDeviceUsage] = js.native
  }
  
  /** Supports the ability to determine the touch capabilities of any connected touch digitizers. */
  @js.native
  /** Initializes a new instance of the TouchCapabilities class. */
  class TouchCapabilities ()
    extends typings.winrtUwp.Windows.Devices.Input.TouchCapabilities {
    /** Gets the minimum number of contacts supported by all the digitizers. */
    /* CompleteClass */
    override var contacts: Double = js.native
    /** Gets a value that indicates whether a touch digitizer is detected. */
    /* CompleteClass */
    override var touchPresent: Double = js.native
  }
  
  /* static members */
  @js.native
  object MouseDevice extends js.Object {
    /**
      * Retrieves the mouse device that is associated with the current view.
      * @return The mouse device.
      */
    def getForCurrentView(): typings.winrtUwp.Windows.Devices.Input.MouseDevice = js.native
  }
  
  /* static members */
  @js.native
  object PointerDevice extends js.Object {
    /**
      * Gets information about the pointer device associated with the specified input pointer ID.
      * @param pointerId The ID of the pointer input.
      * @return The PointerDevice object that represents the associated pointer device.
      */
    def getPointerDevice(pointerId: Double): typings.winrtUwp.Windows.Devices.Input.PointerDevice = js.native
    /**
      * Gets information about the pointer devices attached to the system.
      * @return The collection of PointerDevice objects that represent the pointer devices attached to the system.
      */
    def getPointerDevices(): IVectorView[typings.winrtUwp.Windows.Devices.Input.PointerDevice] = js.native
  }
  
  /** Enumerates pointer device types. */
  @js.native
  object PointerDeviceType extends js.Object {
    /* 2 */ val mouse: typings.winrtUwp.Windows.Devices.Input.PointerDeviceType.mouse with Double = js.native
    /* 1 */ val pen: typings.winrtUwp.Windows.Devices.Input.PointerDeviceType.pen with Double = js.native
    /* 0 */ val touch: typings.winrtUwp.Windows.Devices.Input.PointerDeviceType.touch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Input.PointerDeviceType with Double] = js.native
  }
  
}

