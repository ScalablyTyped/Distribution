package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Adc.Provider.IAdcProvider
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Analog-Digital Converter, or ADC, is an electrical component that converts an analog electrical signal (usually voltage) to a digital representation. ADCs usually interface a digital circuit that processes signals from analog world. */
object Adc {
  
  /** Represents a single ADC channel. */
  @JSGlobal("Windows.Devices.Adc.AdcChannel")
  @js.native
  abstract class AdcChannel ()
    extends typings.winrtUwp.Windows.Devices.Adc.AdcChannel
  
  /** Describes the channel modes that the ADC controller can use for input. */
  @JSGlobal("Windows.Devices.Adc.AdcChannelMode")
  @js.native
  object AdcChannelMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Adc.AdcChannelMode with Double] = js.native
    
    /* 1 */ val differential: typings.winrtUwp.Windows.Devices.Adc.AdcChannelMode.differential with Double = js.native
    
    /* 0 */ val singleEnded: typings.winrtUwp.Windows.Devices.Adc.AdcChannelMode.singleEnded with Double = js.native
  }
  
  /** Represents an ADC controller on the system */
  @JSGlobal("Windows.Devices.Adc.AdcController")
  @js.native
  abstract class AdcController ()
    extends typings.winrtUwp.Windows.Devices.Adc.AdcController
  object AdcController {
    
    /**
      * Gets all the controllers that are connected to the system asynchronously .
      * @param provider The ADC provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the controllers available on the system.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Adc.AdcController.getControllersAsync")
    @js.native
    def getControllersAsync(provider: IAdcProvider): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets the default ADC controller on the system.
      * @return The default ADC controller on the system, or null if the system has no ADC controller.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Adc.AdcController.getDefaultAsync")
    @js.native
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Adc.AdcController] = js.native
  }
  
  /** This API exposes a Provider interface for the user to implement for a specific controller. The ADC API needs a ADC Provider implementation to talk to the ADC controller. */
  object Provider {
    
    /** Determines how the pin value is represented. Implementation of specifics are decided by the provider, so differential may be fully or pseudo differential. */
    @JSGlobal("Windows.Devices.Adc.Provider.ProviderAdcChannelMode")
    @js.native
    object ProviderAdcChannelMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode with Double] = js.native
      
      /* 1 */ val differential: typings.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode.differential with Double = js.native
      
      /* 0 */ val singleEnded: typings.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode.singleEnded with Double = js.native
    }
  }
}
