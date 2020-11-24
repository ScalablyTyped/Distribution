package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Gpio.Provider.IGpioProvider
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types for using general-purpose I/O (GPIO) pins in user mode. */
@JSGlobal("Windows.Devices.Gpio")
@js.native
object Gpio extends js.Object {
  
  /** Represents the default general-purpose I/O (GPIO) controller for the system. */
  @js.native
  abstract class GpioController ()
    extends typings.winrtUwp.Windows.Devices.Gpio.GpioController
  /* static members */
  @js.native
  object GpioController extends js.Object {
    
    /**
      * Gets all the controllers that are connected to the system asynchronously.
      * @param provider The GPIO provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the controllers available on the system.
      */
    def getControllersAsync(provider: IGpioProvider): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets the default general-purpose I/O (GPIO) controller for the system.
      * @return The default GPIO controller for the system, or null if the system has no GPIO controller.
      */
    def getDefault(): typings.winrtUwp.Windows.Devices.Gpio.GpioController = js.native
    
    /**
      * Gets the default general-purpose I/O (GPIO) controller for the system.
      * @return The default GPIO controller for the system, or null if the system has no GPIO controller.
      */
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Gpio.GpioController] = js.native
  }
  
  /** Describes the possible results of opening a pin with the GpioPin.TryOpenPin method. */
  @js.native
  object GpioOpenStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus with Double] = js.native
    
    /* 0 */ val pinOpened: typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus.pinOpened with Double = js.native
    
    /* 1 */ val pinUnavailable: typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus.pinUnavailable with Double = js.native
    
    /* 2 */ val sharingViolation: typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus.sharingViolation with Double = js.native
  }
  
  /** Represents a general-purpose I/O (GPIO) pin. */
  @js.native
  abstract class GpioPin ()
    extends typings.winrtUwp.Windows.Devices.Gpio.GpioPin
  
  /** Describes whether a general-purpose I/O (GPIO) pin is configured as an input or an output, and how values are driven onto the pin. */
  @js.native
  object GpioPinDriveMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode with Double] = js.native
    
    /* 0 */ val input: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.input with Double = js.native
    
    /* 3 */ val inputPullDown: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.inputPullDown with Double = js.native
    
    /* 2 */ val inputPullUp: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.inputPullUp with Double = js.native
    
    /* 1 */ val output: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.output with Double = js.native
    
    /* 4 */ val outputOpenDrain: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenDrain with Double = js.native
    
    /* 5 */ val outputOpenDrainPullUp: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenDrainPullUp with Double = js.native
    
    /* 6 */ val outputOpenSource: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenSource with Double = js.native
    
    /* 7 */ val outputOpenSourcePullDown: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenSourcePullDown with Double = js.native
  }
  
  /** Describes the possible types of change that can occur to the value of the general-purpose I/O (GPIO) pin for the GpioPin.ValueChanged event. */
  @js.native
  object GpioPinEdge extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioPinEdge with Double] = js.native
    
    /* 0 */ val fallingEdge: typings.winrtUwp.Windows.Devices.Gpio.GpioPinEdge.fallingEdge with Double = js.native
    
    /* 1 */ val risingEdge: typings.winrtUwp.Windows.Devices.Gpio.GpioPinEdge.risingEdge with Double = js.native
  }
  
  /** Describes the possible values for a general-purpose I/O (GPIO) pin. */
  @js.native
  object GpioPinValue extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioPinValue with Double] = js.native
    
    /* 1 */ val high: typings.winrtUwp.Windows.Devices.Gpio.GpioPinValue.high with Double = js.native
    
    /* 0 */ val low: typings.winrtUwp.Windows.Devices.Gpio.GpioPinValue.low with Double = js.native
  }
  
  /** Provides data about the GpioPin.ValueChanged event that occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
  @js.native
  abstract class GpioPinValueChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Gpio.GpioPinValueChangedEventArgs
  
  /** Describes the modes in which you can open a general-purpose I/O (GPIO) pin. These modes determine whether other connections to the GPIO pin can be opened while you have the pin open. */
  @js.native
  object GpioSharingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioSharingMode with Double] = js.native
    
    /* 0 */ val exclusive: typings.winrtUwp.Windows.Devices.Gpio.GpioSharingMode.exclusive with Double = js.native
    
    /* 1 */ val sharedReadOnly: typings.winrtUwp.Windows.Devices.Gpio.GpioSharingMode.sharedReadOnly with Double = js.native
  }
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The GPIO API needs a GPIO Provider implementation to talk to the GPIO controller. */
  @js.native
  object Provider extends js.Object {
    
    @js.native
    abstract class GpioPinProviderValueChangedEventArgs ()
      extends typings.winrtUwp.Windows.Devices.Gpio.Provider.GpioPinProviderValueChangedEventArgs
    
    @js.native
    object ProviderGpioPinDriveMode extends js.Object {
      
      var input: js.Any = js.native
      
      var inputPullDown: js.Any = js.native
      
      var inputPullUp: js.Any = js.native
      
      var output: js.Any = js.native
      
      var outputOpenDrain: js.Any = js.native
      
      var outputOpenDrainPullUp: js.Any = js.native
      
      var outputOpenSource: js.Any = js.native
      
      var outputOpenSourcePullDown: js.Any = js.native
    }
    
    @js.native
    object ProviderGpioPinEdge extends js.Object {
      
      var fallingEdge: js.Any = js.native
      
      var risingEdge: js.Any = js.native
    }
    
    @js.native
    object ProviderGpioPinValue extends js.Object {
      
      var high: js.Any = js.native
      
      var low: js.Any = js.native
    }
    
    @js.native
    object ProviderGpioSharingMode extends js.Object {
      
      var exclusive: js.Any = js.native
      
      var sharedReadOnly: js.Any = js.native
    }
  }
}
