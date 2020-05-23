package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Adc.AdcChannelMode
import typings.winrtUwp.Windows.Devices.Adc.Provider.IAdcProvider
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Analog-Digital Converter, or ADC, is an electrical component that converts an analog electrical signal (usually voltage) to a digital representation. ADCs usually interface a digital circuit that processes signals from analog world. */
@JSGlobal("Windows.Devices.Adc")
@js.native
object Adc extends js.Object {
  /** Represents a single ADC channel. */
  @js.native
  abstract class AdcChannel ()
    extends typings.winrtUwp.Windows.Devices.Adc.AdcChannel {
    /** Gets the ADC controller for this channel. */
    /* CompleteClass */
    override var controller: typings.winrtUwp.Windows.Devices.Adc.AdcController = js.native
    /** Closes the connection on this channel, making it available to be opened by others. */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * Reads the value as a percentage of the max value possible for this controller.
      * @return The value as percentage of the max value.
      */
    /* CompleteClass */
    override def readRatio(): Double = js.native
    /**
      * Reads the digital representation of the analog value from the ADC.
      * @return The digital value.
      */
    /* CompleteClass */
    override def readValue(): Double = js.native
  }
  
  /** Represents an ADC controller on the system */
  @js.native
  abstract class AdcController ()
    extends typings.winrtUwp.Windows.Devices.Adc.AdcController {
    /** The number of channels available on the ADC controller. */
    /* CompleteClass */
    override var channelCount: Double = js.native
    /** Gets or sets the channel mode for the ADC controller. */
    /* CompleteClass */
    override var channelMode: AdcChannelMode = js.native
    /** Gets the maximum value that the controller can report. */
    /* CompleteClass */
    override var maxValue: Double = js.native
    /** The minimum value the controller can report. */
    /* CompleteClass */
    override var minValue: Double = js.native
    /** Gets the resolution of the controller as number of bits it has. For example, if we have a 10-bit ADC, that means it can detect 1024 (2^10) discrete levels. */
    /* CompleteClass */
    override var resolutionInBits: Double = js.native
    /**
      * Verifies that the specified channel mode is supported by the controller.
      * @param channelMode The channel mode.
      * @return True if the specified channel mode is supported, otherwise false.
      */
    /* CompleteClass */
    override def isChannelModeSupported(channelMode: AdcChannelMode): Boolean = js.native
    /**
      * Opens a connection to the specified ADC channel.
      * @param channelNumber The channel to connect to.
      * @return The ADC channel.
      */
    /* CompleteClass */
    override def openChannel(channelNumber: Double): typings.winrtUwp.Windows.Devices.Adc.AdcChannel = js.native
  }
  
  /** Describes the channel modes that the ADC controller can use for input. */
  @js.native
  object AdcChannelMode extends js.Object {
    /* 1 */ val differential: typings.winrtUwp.Windows.Devices.Adc.AdcChannelMode.differential with Double = js.native
    /* 0 */ val singleEnded: typings.winrtUwp.Windows.Devices.Adc.AdcChannelMode.singleEnded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Adc.AdcChannelMode with Double] = js.native
  }
  
  /* static members */
  @js.native
  object AdcController extends js.Object {
    /**
      * Gets all the controllers that are connected to the system asynchronously .
      * @param provider The ADC provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the controllers available on the system.
      */
    def getControllersAsync(provider: IAdcProvider): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Gets the default ADC controller on the system.
      * @return The default ADC controller on the system, or null if the system has no ADC controller.
      */
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Adc.AdcController] = js.native
  }
  
  /** This API exposes a Provider interface for the user to implement for a specific controller. The ADC API needs a ADC Provider implementation to talk to the ADC controller. */
  @js.native
  object Provider extends js.Object {
    /** Determines how the pin value is represented. Implementation of specifics are decided by the provider, so differential may be fully or pseudo differential. */
    @js.native
    object ProviderAdcChannelMode extends js.Object {
      /* 1 */ val differential: typings.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode.differential with Double = js.native
      /* 0 */ val singleEnded: typings.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode.singleEnded with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode with Double] = js.native
    }
    
  }
  
}

