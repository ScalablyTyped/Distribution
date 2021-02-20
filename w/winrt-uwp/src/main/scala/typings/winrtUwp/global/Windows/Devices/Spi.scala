package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Spi.Provider.ISpiProvider
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SPI is a high speed interface used to communicate among integrated components on the same board. */
object Spi {
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The SPI API needs a SPI Provider implementation to talk to the SPI controller. */
  object Provider {
    
    @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiConnectionSettings")
    @js.native
    abstract class ProviderSpiConnectionSettings ()
      extends typings.winrtUwp.Windows.Devices.Spi.Provider.ProviderSpiConnectionSettings
    
    object ProviderSpiMode {
      
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode.mode0")
      @js.native
      def mode0: js.Any = js.native
      @scala.inline
      def mode0_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode0")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode.mode1")
      @js.native
      def mode1: js.Any = js.native
      @scala.inline
      def mode1_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode1")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode.mode2")
      @js.native
      def mode2: js.Any = js.native
      @scala.inline
      def mode2_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode2")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode.mode3")
      @js.native
      def mode3: js.Any = js.native
      @scala.inline
      def mode3_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode3")(x.asInstanceOf[js.Any])
    }
    
    object ProviderSpiSharingMode {
      
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiSharingMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiSharingMode.exclusive")
      @js.native
      def exclusive: js.Any = js.native
      @scala.inline
      def exclusive_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiSharingMode.shared")
      @js.native
      def shared: js.Any = js.native
      @scala.inline
      def shared_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shared")(x.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the info about a SPI bus. */
  @JSGlobal("Windows.Devices.Spi.SpiBusInfo")
  @js.native
  abstract class SpiBusInfo ()
    extends typings.winrtUwp.Windows.Devices.Spi.SpiBusInfo
  
  /** Represents the settings for the connection with a device. */
  @JSGlobal("Windows.Devices.Spi.SpiConnectionSettings")
  @js.native
  class SpiConnectionSettings protected ()
    extends typings.winrtUwp.Windows.Devices.Spi.SpiConnectionSettings {
    /**
      * Initializes new instance of SpiConnectionSettings .
      * @param chipSelectLine The chip select line on which the connection will be made.
      */
    def this(chipSelectLine: Double) = this()
  }
  
  /** Represents the SPI controller on the system. */
  @JSGlobal("Windows.Devices.Spi.SpiController")
  @js.native
  abstract class SpiController ()
    extends typings.winrtUwp.Windows.Devices.Spi.SpiController
  object SpiController {
    
    /**
      * Gets all the SPI controllers that are on the system.
      * @param provider The SPI provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the available SPI controllers on the system.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Spi.SpiController.getControllersAsync")
    @js.native
    def getControllersAsync(provider: ISpiProvider): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets the default SPI controller on the system.
      * @return The default SPI controller on the system, or null if the system has no SPI controller.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Spi.SpiController.getDefaultAsync")
    @js.native
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Spi.SpiController] = js.native
  }
  
  /** Represents a device connected through the SPI bus. */
  @JSGlobal("Windows.Devices.Spi.SpiDevice")
  @js.native
  abstract class SpiDevice ()
    extends typings.winrtUwp.Windows.Devices.Spi.SpiDevice
  object SpiDevice {
    
    /**
      * Opens a device with the connection settings provided.
      * @param busId The id of the bus.
      * @param settings The connection settings.
      * @return The SPI device requested.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Spi.SpiDevice.fromIdAsync")
    @js.native
    def fromIdAsync(busId: String, settings: typings.winrtUwp.Windows.Devices.Spi.SpiConnectionSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Spi.SpiDevice] = js.native
    
    /**
      * Retrieves the info about a certain bus.
      * @param busId The id of the bus.
      * @return The bus info requested.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Spi.SpiDevice.getBusInfo")
    @js.native
    def getBusInfo(busId: String): typings.winrtUwp.Windows.Devices.Spi.SpiBusInfo = js.native
    
    /**
      * Gets all the SPI buses found on the system.
      * @return String containing all the buses found on the system.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Spi.SpiDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
    /**
      * Gets all the SPI buses found on the system that match the input parameter.
      * @param friendlyName Input parameter specifying an identifying name for the desired bus. This usually corresponds to a name on the schematic.
      * @return String containing all the buses that have the input in the name.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Spi.SpiDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(friendlyName: String): String = js.native
  }
  
  /** Defines the SPI communication mode. The communication mode defines the clock edge on which the master out line toggles, the master in line samples, and the signal clock's signal steady level (named SCLK). Each mode is defined with a pair of parameters called clock polarity (CPOL) and clock phase (CPHA). */
  @JSGlobal("Windows.Devices.Spi.SpiMode")
  @js.native
  object SpiMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Spi.SpiMode with Double] = js.native
    
    /* 0 */ val mode0: typings.winrtUwp.Windows.Devices.Spi.SpiMode.mode0 with Double = js.native
    
    /* 1 */ val mode1: typings.winrtUwp.Windows.Devices.Spi.SpiMode.mode1 with Double = js.native
    
    /* 2 */ val mode2: typings.winrtUwp.Windows.Devices.Spi.SpiMode.mode2 with Double = js.native
    
    /* 3 */ val mode3: typings.winrtUwp.Windows.Devices.Spi.SpiMode.mode3 with Double = js.native
  }
  
  /** Defines the sharing mode for the SPI bus. */
  @JSGlobal("Windows.Devices.Spi.SpiSharingMode")
  @js.native
  object SpiSharingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Spi.SpiSharingMode with Double] = js.native
    
    /* 0 */ val exclusive: typings.winrtUwp.Windows.Devices.Spi.SpiSharingMode.exclusive with Double = js.native
    
    /* 1 */ val shared: typings.winrtUwp.Windows.Devices.Spi.SpiSharingMode.shared with Double = js.native
  }
}
