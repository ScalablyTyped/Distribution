package typings.winrtUwp.Windows.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Analog-Digital Converter, or ADC, is an electrical component that converts an analog electrical signal (usually voltage) to a digital representation. ADCs usually interface a digital circuit that processes signals from analog world. */
object Adc {
  
  @js.native
  sealed trait AdcChannelMode extends StObject
  /** Describes the channel modes that the ADC controller can use for input. */
  @JSGlobal("Windows.Devices.Adc.AdcChannelMode")
  @js.native
  object AdcChannelMode extends StObject {
    
    /** Difference between two pins. */
    @js.native
    sealed trait differential
      extends StObject
         with AdcChannelMode
    
    /** Simple value of a particular pin. */
    @js.native
    sealed trait singleEnded
      extends StObject
         with AdcChannelMode
  }
  
  /** This API exposes a Provider interface for the user to implement for a specific controller. The ADC API needs a ADC Provider implementation to talk to the ADC controller. */
  object Provider {
    
    @js.native
    sealed trait ProviderAdcChannelMode extends StObject
    /** Determines how the pin value is represented. Implementation of specifics are decided by the provider, so differential may be fully or pseudo differential. */
    @JSGlobal("Windows.Devices.Adc.Provider.ProviderAdcChannelMode")
    @js.native
    object ProviderAdcChannelMode extends StObject {
      
      /** Difference between two pins. */
      @js.native
      sealed trait differential
        extends StObject
           with ProviderAdcChannelMode
      
      /** Simple value of a particular pin. */
      @js.native
      sealed trait singleEnded
        extends StObject
           with ProviderAdcChannelMode
    }
    
    /** Represents properties and methods common to all ADC controllers. */
    trait IAdcControllerProvider extends StObject {
      
      /**
        * Acquires a connection to the specified channel.
        * @param channel Which channel to connect to.
        */
      def acquireChannel(channel: Double): Unit
      
      /** Gets the number of channels available on for the controller. */
      var channelCount: Double
      
      /** Gets or sets the controller channel mode. */
      var channelMode: ProviderAdcChannelMode
      
      /**
        * Determines if the specified channel mode is supported by the controller.
        * @param channelMode The channel mode in question.
        * @return True if the specified channel mode is supported, otherwise false.
        */
      def isChannelModeSupported(channelMode: ProviderAdcChannelMode): Boolean
      
      /** Gets the maximum value that the controller can return. */
      var maxValue: Double
      
      /** Gets the minimum value that the controller can return. */
      var minValue: Double
      
      /**
        * Gets the digital representation of the analog value on the specified channel.
        * @param channelNumber Which channel to read from.
        * @return The digital representation of the analog value.
        */
      def readValue(channelNumber: Double): Double
      
      /**
        * Releases the channel connection, opening that channel for others to use.
        * @param channel Which channel to close the connection to.
        */
      def releaseChannel(channel: Double): Unit
      
      /** Gets the resolution of the controller as number of bits it has. */
      var resolutionInBits: Double
    }
    object IAdcControllerProvider {
      
      inline def apply(
        acquireChannel: Double => Unit,
        channelCount: Double,
        channelMode: ProviderAdcChannelMode,
        isChannelModeSupported: ProviderAdcChannelMode => Boolean,
        maxValue: Double,
        minValue: Double,
        readValue: Double => Double,
        releaseChannel: Double => Unit,
        resolutionInBits: Double
      ): IAdcControllerProvider = {
        val __obj = js.Dynamic.literal(acquireChannel = js.Any.fromFunction1(acquireChannel), channelCount = channelCount.asInstanceOf[js.Any], channelMode = channelMode.asInstanceOf[js.Any], isChannelModeSupported = js.Any.fromFunction1(isChannelModeSupported), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], readValue = js.Any.fromFunction1(readValue), releaseChannel = js.Any.fromFunction1(releaseChannel), resolutionInBits = resolutionInBits.asInstanceOf[js.Any])
        __obj.asInstanceOf[IAdcControllerProvider]
      }
      
      extension [Self <: IAdcControllerProvider](x: Self) {
        
        inline def setAcquireChannel(value: Double => Unit): Self = StObject.set(x, "acquireChannel", js.Any.fromFunction1(value))
        
        inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
        
        inline def setChannelMode(value: ProviderAdcChannelMode): Self = StObject.set(x, "channelMode", value.asInstanceOf[js.Any])
        
        inline def setIsChannelModeSupported(value: ProviderAdcChannelMode => Boolean): Self = StObject.set(x, "isChannelModeSupported", js.Any.fromFunction1(value))
        
        inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
        
        inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
        
        inline def setReadValue(value: Double => Double): Self = StObject.set(x, "readValue", js.Any.fromFunction1(value))
        
        inline def setReleaseChannel(value: Double => Unit): Self = StObject.set(x, "releaseChannel", js.Any.fromFunction1(value))
        
        inline def setResolutionInBits(value: Double): Self = StObject.set(x, "resolutionInBits", value.asInstanceOf[js.Any])
      }
    }
    
    /** Represents methods common to all ADC providers. */
    trait IAdcProvider extends StObject {
      
      /**
        * Gets the ADC controllers available on the system.
        * @return When this method completes it returns a list of all the available controllers on the system.
        */
      def getControllers(): IVectorView[IAdcControllerProvider]
    }
    object IAdcProvider {
      
      inline def apply(getControllers: () => IVectorView[IAdcControllerProvider]): IAdcProvider = {
        val __obj = js.Dynamic.literal(getControllers = js.Any.fromFunction0(getControllers))
        __obj.asInstanceOf[IAdcProvider]
      }
      
      extension [Self <: IAdcProvider](x: Self) {
        
        inline def setGetControllers(value: () => IVectorView[IAdcControllerProvider]): Self = StObject.set(x, "getControllers", js.Any.fromFunction0(value))
      }
    }
  }
  
  /** Represents a single ADC channel. */
  trait AdcChannel extends StObject {
    
    /** Closes the connection on this channel, making it available to be opened by others. */
    def close(): Unit
    
    /** Gets the ADC controller for this channel. */
    var controller: AdcController
    
    /**
      * Reads the value as a percentage of the max value possible for this controller.
      * @return The value as percentage of the max value.
      */
    def readRatio(): Double
    
    /**
      * Reads the digital representation of the analog value from the ADC.
      * @return The digital value.
      */
    def readValue(): Double
  }
  object AdcChannel {
    
    inline def apply(close: () => Unit, controller: AdcController, readRatio: () => Double, readValue: () => Double): AdcChannel = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), controller = controller.asInstanceOf[js.Any], readRatio = js.Any.fromFunction0(readRatio), readValue = js.Any.fromFunction0(readValue))
      __obj.asInstanceOf[AdcChannel]
    }
    
    extension [Self <: AdcChannel](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setController(value: AdcController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setReadRatio(value: () => Double): Self = StObject.set(x, "readRatio", js.Any.fromFunction0(value))
      
      inline def setReadValue(value: () => Double): Self = StObject.set(x, "readValue", js.Any.fromFunction0(value))
    }
  }
  
  /** Represents an ADC controller on the system */
  trait AdcController extends StObject {
    
    /** The number of channels available on the ADC controller. */
    var channelCount: Double
    
    /** Gets or sets the channel mode for the ADC controller. */
    var channelMode: AdcChannelMode
    
    /**
      * Verifies that the specified channel mode is supported by the controller.
      * @param channelMode The channel mode.
      * @return True if the specified channel mode is supported, otherwise false.
      */
    def isChannelModeSupported(channelMode: AdcChannelMode): Boolean
    
    /** Gets the maximum value that the controller can report. */
    var maxValue: Double
    
    /** The minimum value the controller can report. */
    var minValue: Double
    
    /**
      * Opens a connection to the specified ADC channel.
      * @param channelNumber The channel to connect to.
      * @return The ADC channel.
      */
    def openChannel(channelNumber: Double): AdcChannel
    
    /** Gets the resolution of the controller as number of bits it has. For example, if we have a 10-bit ADC, that means it can detect 1024 (2^10) discrete levels. */
    var resolutionInBits: Double
  }
  object AdcController {
    
    inline def apply(
      channelCount: Double,
      channelMode: AdcChannelMode,
      isChannelModeSupported: AdcChannelMode => Boolean,
      maxValue: Double,
      minValue: Double,
      openChannel: Double => AdcChannel,
      resolutionInBits: Double
    ): AdcController = {
      val __obj = js.Dynamic.literal(channelCount = channelCount.asInstanceOf[js.Any], channelMode = channelMode.asInstanceOf[js.Any], isChannelModeSupported = js.Any.fromFunction1(isChannelModeSupported), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], openChannel = js.Any.fromFunction1(openChannel), resolutionInBits = resolutionInBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdcController]
    }
    
    extension [Self <: AdcController](x: Self) {
      
      inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
      
      inline def setChannelMode(value: AdcChannelMode): Self = StObject.set(x, "channelMode", value.asInstanceOf[js.Any])
      
      inline def setIsChannelModeSupported(value: AdcChannelMode => Boolean): Self = StObject.set(x, "isChannelModeSupported", js.Any.fromFunction1(value))
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setOpenChannel(value: Double => AdcChannel): Self = StObject.set(x, "openChannel", js.Any.fromFunction1(value))
      
      inline def setResolutionInBits(value: Double): Self = StObject.set(x, "resolutionInBits", value.asInstanceOf[js.Any])
    }
  }
}
