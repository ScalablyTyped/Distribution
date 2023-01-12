package typings.winrtUwp.Windows.Devices

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.anon.OpenStatus
import typings.winrtUwp.winrtUwpStrings.valuechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types for using general-purpose I/O (GPIO) pins in user mode. */
object Gpio {
  
  @js.native
  sealed trait GpioOpenStatus extends StObject
  /** Describes the possible results of opening a pin with the GpioPin.TryOpenPin method. */
  @JSGlobal("Windows.Devices.Gpio.GpioOpenStatus")
  @js.native
  object GpioOpenStatus extends StObject {
    
    /** The GPIO pin was successfully opened. */
    @js.native
    sealed trait pinOpened
      extends StObject
         with GpioOpenStatus
    
    /** The pin is reserved by the system and is not available to apps that run in user mode. */
    @js.native
    sealed trait pinUnavailable
      extends StObject
         with GpioOpenStatus
    
    /** The pin is currently open in an incompatible sharing mode. For example: */
    @js.native
    sealed trait sharingViolation
      extends StObject
         with GpioOpenStatus
  }
  
  @js.native
  sealed trait GpioPinDriveMode extends StObject
  /** Describes whether a general-purpose I/O (GPIO) pin is configured as an input or an output, and how values are driven onto the pin. */
  @JSGlobal("Windows.Devices.Gpio.GpioPinDriveMode")
  @js.native
  object GpioPinDriveMode extends StObject {
    
    /** Configures the GPIO pin in floating mode, with high impedance. */
    @js.native
    sealed trait input
      extends StObject
         with GpioPinDriveMode
    
    /** Configures the GPIO pin as high impedance with a pull-down resistor to ground. */
    @js.native
    sealed trait inputPullDown
      extends StObject
         with GpioPinDriveMode
    
    /** Configures the GPIO pin as high impedance with a pull-up resistor to the voltage charge connection (VCC). */
    @js.native
    sealed trait inputPullUp
      extends StObject
         with GpioPinDriveMode
    
    /** Configures the GPIO pin in strong drive mode, with low impedance. */
    @js.native
    sealed trait output
      extends StObject
         with GpioPinDriveMode
    
    /** Configures the GPIO in open drain mode. */
    @js.native
    sealed trait outputOpenDrain
      extends StObject
         with GpioPinDriveMode
    
    /** Configures the GPIO pin in open drain mode with resistive pull-up mode. */
    @js.native
    sealed trait outputOpenDrainPullUp
      extends StObject
         with GpioPinDriveMode
    
    /** Configures the GPIO pin in open collector mode. */
    @js.native
    sealed trait outputOpenSource
      extends StObject
         with GpioPinDriveMode
    
    /** Configures the GPIO pin in open collector mode with resistive pull-down mode. */
    @js.native
    sealed trait outputOpenSourcePullDown
      extends StObject
         with GpioPinDriveMode
  }
  
  @js.native
  sealed trait GpioPinEdge extends StObject
  /** Describes the possible types of change that can occur to the value of the general-purpose I/O (GPIO) pin for the GpioPin.ValueChanged event. */
  @JSGlobal("Windows.Devices.Gpio.GpioPinEdge")
  @js.native
  object GpioPinEdge extends StObject {
    
    /** The value of the GPIO pin changed from high to low. */
    @js.native
    sealed trait fallingEdge
      extends StObject
         with GpioPinEdge
    
    /** The value of the GPIO pin changed from low to high. */
    @js.native
    sealed trait risingEdge
      extends StObject
         with GpioPinEdge
  }
  
  @js.native
  sealed trait GpioPinValue extends StObject
  /** Describes the possible values for a general-purpose I/O (GPIO) pin. */
  @JSGlobal("Windows.Devices.Gpio.GpioPinValue")
  @js.native
  object GpioPinValue extends StObject {
    
    /** The value of the GPIO pin is high. */
    @js.native
    sealed trait high
      extends StObject
         with GpioPinValue
    
    /** The value of the GPIO pin is low. */
    @js.native
    sealed trait low
      extends StObject
         with GpioPinValue
  }
  
  @js.native
  sealed trait GpioSharingMode extends StObject
  /** Describes the modes in which you can open a general-purpose I/O (GPIO) pin. These modes determine whether other connections to the GPIO pin can be opened while you have the pin open. */
  @JSGlobal("Windows.Devices.Gpio.GpioSharingMode")
  @js.native
  object GpioSharingMode extends StObject {
    
    /** Opens the GPIO pin exclusively, so that no other connection to the pin can be opened. */
    @js.native
    sealed trait exclusive
      extends StObject
         with GpioSharingMode
    
    /** Opens the GPIO pin as shared, so that other connections in SharedReadOnly mode to the pin can be opened. */
    @js.native
    sealed trait sharedReadOnly
      extends StObject
         with GpioSharingMode
  }
  
  /** Represents the default general-purpose I/O (GPIO) controller for the system. */
  @js.native
  trait GpioController extends StObject {
    
    /**
      * Opens a connection to the specified general-purpose I/O (GPIO) pin in exclusive mode.
      * @param pinNumber The pin number of the GPIO pin that you want to open. Some pins may not be available in user mode. For information about how the pin numbers correspond to physical pins, see the documentation for your circuit board.
      * @return The opened GPIO pin.
      */
    def openPin(pinNumber: Double): GpioPin = js.native
    /**
      * Opens the specified general-purpose I/O (GPIO) pin in the specified mode.
      * @param pinNumber The pin number of the GPIO pin that you want to open. Some pins may not be available in user mode. For information about how the pin numbers correspond to physical pins, see the documentation for your circuit board.
      * @param sharingMode The mode in which you want to open the GPIO pin, which determines whether other connections to the pin can be opened while you have the pin open.
      * @return The opened GPIO pin.
      */
    def openPin(pinNumber: Double, sharingMode: GpioSharingMode): GpioPin = js.native
    
    /** Gets the number of pins on the general-purpose I/O (GPIO) controller. */
    var pinCount: Double = js.native
    
    /**
      * Opens the specified general-purpose I/O (GPIO) pin in the specified mode, and gets a status value that you can use to handle a failure to open the pin programmatically.
      * @param pinNumber The pin number of the GPIO pin that you want to open. Some pins may not be available in user mode. For information about how the pin numbers correspond to physical pins, see the documentation for your circuit board.
      * @param sharingMode The mode in which you want to open the GPIO pin, which determines whether other connections to the pin can be opened while you have the pin open.
      */
    def tryOpenPin(pinNumber: Double, sharingMode: GpioSharingMode): OpenStatus = js.native
  }
  
  /** Represents a general-purpose I/O (GPIO) pin. */
  @js.native
  trait GpioPin extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_valuechanged(`type`: valuechanged, listener: TypedEventHandler[GpioPin, GpioPinValueChangedEventArgs]): Unit = js.native
    
    /** Closes the general-purpose I/O (GPIO) pin and releases the resources associated with it. */
    def close(): Unit = js.native
    
    /** Gets or sets the debounce timeout for the general-purpose I/O (GPIO) pin, which is an interval during which changes to the value of the pin are filtered out and do not generate ValueChanged events. */
    var debounceTimeout: Double = js.native
    
    /**
      * Gets the current drive mode for the general-purpose I/O (GPIO) pin. The drive mode specifies whether the pin is configured as an input or an output, and determines how values are driven onto the pin.
      * @return An enumeration value that indicates the current drive mode for the GPIO pin. The drive mode specifies whether the pin is configured as an input or an output, and determines how values are driven onto the pin.
      */
    def getDriveMode(): GpioPinDriveMode = js.native
    
    /**
      * Gets whether the general-purpose I/O (GPIO) pin supports the specified drive mode.
      * @param driveMode The drive mode that you want to check for support.
      * @return True if the GPIO pin supports the drive mode that driveMode specifies; otherwise false. If you specify a drive mode for which this method returns false when you call SetDriveMode , SetDriveMode generates an exception.
      */
    def isDriveModeSupported(driveMode: GpioPinDriveMode): Boolean = js.native
    
    /** Occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
    def onvaluechanged(ev: GpioPinValueChangedEventArgs & WinRTEvent[GpioPin]): Unit = js.native
    /** Occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
    @JSName("onvaluechanged")
    var onvaluechanged_Original: TypedEventHandler[GpioPin, GpioPinValueChangedEventArgs] = js.native
    
    /** Gets the pin number of the general-purpose I/O (GPIO) pin. */
    var pinNumber: Double = js.native
    
    /**
      * Reads the current value of the general-purpose I/O (GPIO) pin.
      * @return The current value of the GPIO pin. If the pin is configured as an output, this value is the last value written to the pin.
      */
    def read(): GpioPinValue = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_valuechanged(`type`: valuechanged, listener: TypedEventHandler[GpioPin, GpioPinValueChangedEventArgs]): Unit = js.native
    
    /**
      * Sets the drive mode of the general-purpose I/O (GPIO) pin. The drive mode specifies whether the pin is configured as an input or an output, and determines how values are driven onto the pin.
      * @param value An enumeration value that specifies drive mode to use for the GPIO pin. The drive mode specifies whether the pin is configured as an input or an output, and determines how values are driven onto the pin.
      */
    def setDriveMode(value: GpioPinDriveMode): Unit = js.native
    
    /** Gets the sharing mode in which the general-purpose I/O (GPIO) pin is open. */
    var sharingMode: GpioSharingMode = js.native
    
    /**
      * Drives the specified value onto the general purpose I/O (GPIO) pin according to the current drive mode for the pin if the pin is configured as an output, or updates the latched output value for the pin if the pin is configured as an input.
      * @param value The enumeration value to write to the GPIO pin.
      */
    def write(value: GpioPinValue): Unit = js.native
  }
  
  /** Provides data about the GpioPin.ValueChanged event that occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
  trait GpioPinValueChangedEventArgs extends StObject {
    
    /** Gets the type of change that occurred to the value of the general-purpose I/O (GPIO) pin for the GpioPin.ValueChanged event. */
    var edge: GpioPinEdge
  }
  object GpioPinValueChangedEventArgs {
    
    inline def apply(edge: GpioPinEdge): GpioPinValueChangedEventArgs = {
      val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any])
      __obj.asInstanceOf[GpioPinValueChangedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GpioPinValueChangedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setEdge(value: GpioPinEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    }
  }
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The GPIO API needs a GPIO Provider implementation to talk to the GPIO controller. */
  object Provider {
    
    trait GpioPinProviderValueChangedEventArgs extends StObject {
      
      var edge: Any
    }
    object GpioPinProviderValueChangedEventArgs {
      
      inline def apply(edge: Any): GpioPinProviderValueChangedEventArgs = {
        val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any])
        __obj.asInstanceOf[GpioPinProviderValueChangedEventArgs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GpioPinProviderValueChangedEventArgs] (val x: Self) extends AnyVal {
        
        inline def setEdge(value: Any): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      }
    }
    
    /** Represents actions common to general-purpose I/O (GPIO) controller providers. */
    trait IGpioProvider extends StObject {
      
      var getControllers: Any
    }
    object IGpioProvider {
      
      inline def apply(getControllers: Any): IGpioProvider = {
        val __obj = js.Dynamic.literal(getControllers = getControllers.asInstanceOf[js.Any])
        __obj.asInstanceOf[IGpioProvider]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IGpioProvider] (val x: Self) extends AnyVal {
        
        inline def setGetControllers(value: Any): Self = StObject.set(x, "getControllers", value.asInstanceOf[js.Any])
      }
    }
  }
}
