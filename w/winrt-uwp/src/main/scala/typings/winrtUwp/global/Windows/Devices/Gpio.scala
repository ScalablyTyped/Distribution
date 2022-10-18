package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Gpio.GpioPinEdge
import typings.winrtUwp.Windows.Devices.Gpio.Provider.IGpioProvider
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types for using general-purpose I/O (GPIO) pins in user mode. */
object Gpio {
  
  /** Represents the default general-purpose I/O (GPIO) controller for the system. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Gpio.GpioController")
  @js.native
  open class GpioController ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Gpio.GpioController
  object GpioController {
    
    @JSGlobal("Windows.Devices.Gpio.GpioController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets all the controllers that are connected to the system asynchronously.
      * @param provider The GPIO provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the controllers available on the system.
      */
    /* static member */
    inline def getControllersAsync(provider: IGpioProvider): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllersAsync")(provider.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    
    /**
      * Gets the default general-purpose I/O (GPIO) controller for the system.
      * @return The default GPIO controller for the system, or null if the system has no GPIO controller.
      */
    /* static member */
    inline def getDefault(): typings.winrtUwp.Windows.Devices.Gpio.GpioController = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Gpio.GpioController]
    
    /**
      * Gets the default general-purpose I/O (GPIO) controller for the system.
      * @return The default GPIO controller for the system, or null if the system has no GPIO controller.
      */
    /* static member */
    inline def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Gpio.GpioController] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Gpio.GpioController]]
  }
  
  /** Describes the possible results of opening a pin with the GpioPin.TryOpenPin method. */
  @JSGlobal("Windows.Devices.Gpio.GpioOpenStatus")
  @js.native
  object GpioOpenStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus & Double] = js.native
    
    /* 0 */ val pinOpened: typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus.pinOpened & Double = js.native
    
    /* 1 */ val pinUnavailable: typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus.pinUnavailable & Double = js.native
    
    /* 2 */ val sharingViolation: typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus.sharingViolation & Double = js.native
  }
  
  /** Represents a general-purpose I/O (GPIO) pin. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Gpio.GpioPin")
  @js.native
  open class GpioPin ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Gpio.GpioPin
  
  /** Describes whether a general-purpose I/O (GPIO) pin is configured as an input or an output, and how values are driven onto the pin. */
  @JSGlobal("Windows.Devices.Gpio.GpioPinDriveMode")
  @js.native
  object GpioPinDriveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode & Double] = js.native
    
    /* 0 */ val input: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.input & Double = js.native
    
    /* 3 */ val inputPullDown: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.inputPullDown & Double = js.native
    
    /* 2 */ val inputPullUp: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.inputPullUp & Double = js.native
    
    /* 1 */ val output: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.output & Double = js.native
    
    /* 4 */ val outputOpenDrain: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenDrain & Double = js.native
    
    /* 5 */ val outputOpenDrainPullUp: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenDrainPullUp & Double = js.native
    
    /* 6 */ val outputOpenSource: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenSource & Double = js.native
    
    /* 7 */ val outputOpenSourcePullDown: typings.winrtUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenSourcePullDown & Double = js.native
  }
  
  /** Describes the possible types of change that can occur to the value of the general-purpose I/O (GPIO) pin for the GpioPin.ValueChanged event. */
  @JSGlobal("Windows.Devices.Gpio.GpioPinEdge")
  @js.native
  object GpioPinEdge extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioPinEdge & Double] = js.native
    
    /* 0 */ val fallingEdge: typings.winrtUwp.Windows.Devices.Gpio.GpioPinEdge.fallingEdge & Double = js.native
    
    /* 1 */ val risingEdge: typings.winrtUwp.Windows.Devices.Gpio.GpioPinEdge.risingEdge & Double = js.native
  }
  
  /** Describes the possible values for a general-purpose I/O (GPIO) pin. */
  @JSGlobal("Windows.Devices.Gpio.GpioPinValue")
  @js.native
  object GpioPinValue extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioPinValue & Double] = js.native
    
    /* 1 */ val high: typings.winrtUwp.Windows.Devices.Gpio.GpioPinValue.high & Double = js.native
    
    /* 0 */ val low: typings.winrtUwp.Windows.Devices.Gpio.GpioPinValue.low & Double = js.native
  }
  
  /** Provides data about the GpioPin.ValueChanged event that occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Gpio.GpioPinValueChangedEventArgs")
  @js.native
  open class GpioPinValueChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Gpio.GpioPinValueChangedEventArgs {
    
    /** Gets the type of change that occurred to the value of the general-purpose I/O (GPIO) pin for the GpioPin.ValueChanged event. */
    /* CompleteClass */
    var edge: GpioPinEdge = js.native
  }
  
  /** Describes the modes in which you can open a general-purpose I/O (GPIO) pin. These modes determine whether other connections to the GPIO pin can be opened while you have the pin open. */
  @JSGlobal("Windows.Devices.Gpio.GpioSharingMode")
  @js.native
  object GpioSharingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Gpio.GpioSharingMode & Double] = js.native
    
    /* 0 */ val exclusive: typings.winrtUwp.Windows.Devices.Gpio.GpioSharingMode.exclusive & Double = js.native
    
    /* 1 */ val sharedReadOnly: typings.winrtUwp.Windows.Devices.Gpio.GpioSharingMode.sharedReadOnly & Double = js.native
  }
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The GPIO API needs a GPIO Provider implementation to talk to the GPIO controller. */
  object Provider {
    
    /* note: abstract class */ @JSGlobal("Windows.Devices.Gpio.Provider.GpioPinProviderValueChangedEventArgs")
    @js.native
    open class GpioPinProviderValueChangedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Gpio.Provider.GpioPinProviderValueChangedEventArgs {
      
      /* CompleteClass */
      var edge: Any = js.native
    }
    
    object ProviderGpioPinDriveMode {
      
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode.input")
      @js.native
      def input: Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode.inputPullDown")
      @js.native
      def inputPullDown: Any = js.native
      inline def inputPullDown_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputPullDown")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode.inputPullUp")
      @js.native
      def inputPullUp: Any = js.native
      inline def inputPullUp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputPullUp")(x.asInstanceOf[js.Any])
      
      inline def input_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode.output")
      @js.native
      def output: Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode.outputOpenDrain")
      @js.native
      def outputOpenDrain: Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode.outputOpenDrainPullUp")
      @js.native
      def outputOpenDrainPullUp: Any = js.native
      inline def outputOpenDrainPullUp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputOpenDrainPullUp")(x.asInstanceOf[js.Any])
      
      inline def outputOpenDrain_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputOpenDrain")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode.outputOpenSource")
      @js.native
      def outputOpenSource: Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode.outputOpenSourcePullDown")
      @js.native
      def outputOpenSourcePullDown: Any = js.native
      inline def outputOpenSourcePullDown_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputOpenSourcePullDown")(x.asInstanceOf[js.Any])
      
      inline def outputOpenSource_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputOpenSource")(x.asInstanceOf[js.Any])
      
      inline def output_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("output")(x.asInstanceOf[js.Any])
    }
    
    object ProviderGpioPinEdge {
      
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinEdge")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinEdge.fallingEdge")
      @js.native
      def fallingEdge: Any = js.native
      inline def fallingEdge_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallingEdge")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinEdge.risingEdge")
      @js.native
      def risingEdge: Any = js.native
      inline def risingEdge_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("risingEdge")(x.asInstanceOf[js.Any])
    }
    
    object ProviderGpioPinValue {
      
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinValue")
      @js.native
      val ^ : js.Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinValue.high")
      @js.native
      def high: Any = js.native
      inline def high_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("high")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioPinValue.low")
      @js.native
      def low: Any = js.native
      inline def low_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("low")(x.asInstanceOf[js.Any])
    }
    
    object ProviderGpioSharingMode {
      
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioSharingMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioSharingMode.exclusive")
      @js.native
      def exclusive: Any = js.native
      inline def exclusive_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Gpio.Provider.ProviderGpioSharingMode.sharedReadOnly")
      @js.native
      def sharedReadOnly: Any = js.native
      inline def sharedReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sharedReadOnly")(x.asInstanceOf[js.Any])
    }
  }
}
