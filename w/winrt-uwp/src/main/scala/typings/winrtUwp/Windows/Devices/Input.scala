package typings.winrtUwp.Windows.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.mousemoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for identifying the input devices available (pointer, touch, mouse, and keyboard) and retrieving information about those devices. */
object Input {
  
  @js.native
  sealed trait PointerDeviceType extends StObject
  /** Enumerates pointer device types. */
  @JSGlobal("Windows.Devices.Input.PointerDeviceType")
  @js.native
  object PointerDeviceType extends StObject {
    
    /** Mouse */
    @js.native
    sealed trait mouse
      extends StObject
         with PointerDeviceType
    
    /** Pen */
    @js.native
    sealed trait pen
      extends StObject
         with PointerDeviceType
    
    /** A touch-enabled device */
    @js.native
    sealed trait touch
      extends StObject
         with PointerDeviceType
  }
  
  /** Supports the ability to determine the capabilities of any connected hardware keyboards. */
  trait KeyboardCapabilities extends StObject {
    
    /** Gets a value that indicates whether a hardware keyboard is detected. */
    var keyboardPresent: Double
  }
  object KeyboardCapabilities {
    
    inline def apply(keyboardPresent: Double): KeyboardCapabilities = {
      val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardCapabilities] (val x: Self) extends AnyVal {
      
      inline def setKeyboardPresent(value: Double): Self = StObject.set(x, "keyboardPresent", value.asInstanceOf[js.Any])
    }
  }
  
  /** Supports the ability to determine the capabilities of any connected mouse devices. */
  trait MouseCapabilities extends StObject {
    
    /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that tilts left and right (usually for horizontal scrolling). */
    var horizontalWheelPresent: Double
    
    /** Gets a value that indicates whether a mouse device is detected. */
    var mousePresent: Double
    
    /** Gets a value representing the number of buttons on the mouse. If multiple mice are present, it returns the number of buttons of the mouse which has maximum number of buttons. */
    var numberOfButtons: Double
    
    /** Gets a value indicating whether any of the mice connected to the computer has swapped left and right buttons. */
    var swapButtons: Double
    
    /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that rolls up and down (usually for vertical scrolling). */
    var verticalWheelPresent: Double
  }
  object MouseCapabilities {
    
    inline def apply(
      horizontalWheelPresent: Double,
      mousePresent: Double,
      numberOfButtons: Double,
      swapButtons: Double,
      verticalWheelPresent: Double
    ): MouseCapabilities = {
      val __obj = js.Dynamic.literal(horizontalWheelPresent = horizontalWheelPresent.asInstanceOf[js.Any], mousePresent = mousePresent.asInstanceOf[js.Any], numberOfButtons = numberOfButtons.asInstanceOf[js.Any], swapButtons = swapButtons.asInstanceOf[js.Any], verticalWheelPresent = verticalWheelPresent.asInstanceOf[js.Any])
      __obj.asInstanceOf[MouseCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseCapabilities] (val x: Self) extends AnyVal {
      
      inline def setHorizontalWheelPresent(value: Double): Self = StObject.set(x, "horizontalWheelPresent", value.asInstanceOf[js.Any])
      
      inline def setMousePresent(value: Double): Self = StObject.set(x, "mousePresent", value.asInstanceOf[js.Any])
      
      inline def setNumberOfButtons(value: Double): Self = StObject.set(x, "numberOfButtons", value.asInstanceOf[js.Any])
      
      inline def setSwapButtons(value: Double): Self = StObject.set(x, "swapButtons", value.asInstanceOf[js.Any])
      
      inline def setVerticalWheelPresent(value: Double): Self = StObject.set(x, "verticalWheelPresent", value.asInstanceOf[js.Any])
    }
  }
  
  /** Identifies the change in screen location of the mouse pointer, relative to the location of the last mouse event. */
  trait MouseDelta extends StObject {
    
    /** The x-coordinate of the mouse pointer, relative to the location of the last mouse event. */
    var x: Double
    
    /** The y-coordinate of the mouse pointer, relative to the location of the last mouse event. */
    var y: Double
  }
  object MouseDelta {
    
    inline def apply(x: Double, y: Double): MouseDelta = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MouseDelta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseDelta] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /** Supports the ability to identify and track connected mouse devices. */
  @js.native
  trait MouseDevice extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemoved(`type`: mousemoved, listener: TypedEventHandler[MouseDevice, MouseEventArgs]): Unit = js.native
    
    /** Occurs when the mouse pointer is moved. */
    def onmousemoved(ev: MouseEventArgs & WinRTEvent[MouseDevice]): Unit = js.native
    /** Occurs when the mouse pointer is moved. */
    @JSName("onmousemoved")
    var onmousemoved_Original: TypedEventHandler[MouseDevice, MouseEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemoved(`type`: mousemoved, listener: TypedEventHandler[MouseDevice, MouseEventArgs]): Unit = js.native
  }
  
  /** Contains event data for the MouseMoved event. */
  trait MouseEventArgs extends StObject {
    
    /** Gets a value that indicates the change in the screen location of the mouse pointer since the last mouse event. */
    var mouseDelta: MouseDelta
  }
  object MouseEventArgs {
    
    inline def apply(mouseDelta: MouseDelta): MouseEventArgs = {
      val __obj = js.Dynamic.literal(mouseDelta = mouseDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[MouseEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseEventArgs] (val x: Self) extends AnyVal {
      
      inline def setMouseDelta(value: MouseDelta): Self = StObject.set(x, "mouseDelta", value.asInstanceOf[js.Any])
    }
  }
  
  /** Supports the ability to identify the connected pointer devices and determine their capabilities. */
  trait PointerDevice extends StObject {
    
    /** Gets a value indicating whether the pointer device is an integrated device. For example, a video display with an integrated touch digitizer compared to an external pen/stylus digitizer. */
    var isIntegrated: Boolean
    
    /** Gets a value indicating the maximum number of contacts supported by the input device. */
    var maxContacts: Double
    
    var maxPointersWithZDistance: Any
    
    /* unmapped type */
    /** Gets the coordinates of the bounding rectangle supported by the input device. */
    var physicalDeviceRect: Rect
    
    /** Gets the pointer device type. */
    var pointerDeviceType: PointerDeviceType
    
    /** Gets the screen coordinates that are mapped to the bounding rectangle supported by the input device. */
    var screenRect: Rect
    
    /** Gets a collection containing the supported pointer device usages . */
    var supportedUsages: IVectorView[PointerDeviceUsage]
  }
  object PointerDevice {
    
    inline def apply(
      isIntegrated: Boolean,
      maxContacts: Double,
      maxPointersWithZDistance: Any,
      physicalDeviceRect: Rect,
      pointerDeviceType: PointerDeviceType,
      screenRect: Rect,
      supportedUsages: IVectorView[PointerDeviceUsage]
    ): PointerDevice = {
      val __obj = js.Dynamic.literal(isIntegrated = isIntegrated.asInstanceOf[js.Any], maxContacts = maxContacts.asInstanceOf[js.Any], maxPointersWithZDistance = maxPointersWithZDistance.asInstanceOf[js.Any], physicalDeviceRect = physicalDeviceRect.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], screenRect = screenRect.asInstanceOf[js.Any], supportedUsages = supportedUsages.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerDevice]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointerDevice] (val x: Self) extends AnyVal {
      
      inline def setIsIntegrated(value: Boolean): Self = StObject.set(x, "isIntegrated", value.asInstanceOf[js.Any])
      
      inline def setMaxContacts(value: Double): Self = StObject.set(x, "maxContacts", value.asInstanceOf[js.Any])
      
      inline def setMaxPointersWithZDistance(value: Any): Self = StObject.set(x, "maxPointersWithZDistance", value.asInstanceOf[js.Any])
      
      inline def setPhysicalDeviceRect(value: Rect): Self = StObject.set(x, "physicalDeviceRect", value.asInstanceOf[js.Any])
      
      inline def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
      
      inline def setScreenRect(value: Rect): Self = StObject.set(x, "screenRect", value.asInstanceOf[js.Any])
      
      inline def setSupportedUsages(value: IVectorView[PointerDeviceUsage]): Self = StObject.set(x, "supportedUsages", value.asInstanceOf[js.Any])
    }
  }
  
  /** Identifies the Human Interface Device (HID) usage details for the input device. */
  trait PointerDeviceUsage extends StObject {
    
    /** The maximum logical value for Usage. */
    var maxLogical: Double
    
    /** The maximum physical value for Usage. */
    var maxPhysical: Double
    
    /** The minimum logical value for Usage. */
    var minLogical: Double
    
    /** The minimum physical value for Usage. */
    var minPhysical: Double
    
    /** The multiplier used to convert the usage value reported by the device to a physical value in units of Unit. (Valid only for usages that indicate a static or dynamic value associated with a control, such as pressure or width and height of the touch contact.) */
    var physicalMultiplier: Double
    
    /** The HID unit of measure. */
    var unit: Double
    
    /** The HID pointer device usage ID that specifies a device or property in the UsagePage. For example, 0x04 indicates a touch screen device and 0x47 indicates touch confidence. */
    var usage: Double
    
    /** The HID usage page of the pointer device. */
    var usagePage: Double
  }
  object PointerDeviceUsage {
    
    inline def apply(
      maxLogical: Double,
      maxPhysical: Double,
      minLogical: Double,
      minPhysical: Double,
      physicalMultiplier: Double,
      unit: Double,
      usage: Double,
      usagePage: Double
    ): PointerDeviceUsage = {
      val __obj = js.Dynamic.literal(maxLogical = maxLogical.asInstanceOf[js.Any], maxPhysical = maxPhysical.asInstanceOf[js.Any], minLogical = minLogical.asInstanceOf[js.Any], minPhysical = minPhysical.asInstanceOf[js.Any], physicalMultiplier = physicalMultiplier.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerDeviceUsage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointerDeviceUsage] (val x: Self) extends AnyVal {
      
      inline def setMaxLogical(value: Double): Self = StObject.set(x, "maxLogical", value.asInstanceOf[js.Any])
      
      inline def setMaxPhysical(value: Double): Self = StObject.set(x, "maxPhysical", value.asInstanceOf[js.Any])
      
      inline def setMinLogical(value: Double): Self = StObject.set(x, "minLogical", value.asInstanceOf[js.Any])
      
      inline def setMinPhysical(value: Double): Self = StObject.set(x, "minPhysical", value.asInstanceOf[js.Any])
      
      inline def setPhysicalMultiplier(value: Double): Self = StObject.set(x, "physicalMultiplier", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
    }
  }
  
  /** Supports the ability to determine the touch capabilities of any connected touch digitizers. */
  trait TouchCapabilities extends StObject {
    
    /** Gets the minimum number of contacts supported by all the digitizers. */
    var contacts: Double
    
    /** Gets a value that indicates whether a touch digitizer is detected. */
    var touchPresent: Double
  }
  object TouchCapabilities {
    
    inline def apply(contacts: Double, touchPresent: Double): TouchCapabilities = {
      val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], touchPresent = touchPresent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TouchCapabilities] (val x: Self) extends AnyVal {
      
      inline def setContacts(value: Double): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
      
      inline def setTouchPresent(value: Double): Self = StObject.set(x, "touchPresent", value.asInstanceOf[js.Any])
    }
  }
}
