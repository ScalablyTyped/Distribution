package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Spi.Provider.ISpiProvider
import typings.winrtUwp.Windows.Devices.Spi.SpiMode
import typings.winrtUwp.Windows.Devices.Spi.SpiSharingMode
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SPI is a high speed interface used to communicate among integrated components on the same board. */
object Spi {
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The SPI API needs a SPI Provider implementation to talk to the SPI controller. */
  object Provider {
    
    @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiConnectionSettings")
    @js.native
    abstract class ProviderSpiConnectionSettings ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Spi.Provider.ProviderSpiConnectionSettings {
      
      /* CompleteClass */
      var chipSelectLine: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var clockFrequency: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var dataBitLength: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var mode: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var sharingMode: Any = js.native
    }
    
    object ProviderSpiMode {
      
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode.mode0")
      @js.native
      def mode0: Any = js.native
      inline def mode0_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode0")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode.mode1")
      @js.native
      def mode1: Any = js.native
      inline def mode1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode1")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode.mode2")
      @js.native
      def mode2: Any = js.native
      inline def mode2_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode2")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiMode.mode3")
      @js.native
      def mode3: Any = js.native
      inline def mode3_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode3")(x.asInstanceOf[js.Any])
    }
    
    object ProviderSpiSharingMode {
      
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiSharingMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiSharingMode.exclusive")
      @js.native
      def exclusive: Any = js.native
      inline def exclusive_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.Spi.Provider.ProviderSpiSharingMode.shared")
      @js.native
      def shared: Any = js.native
      inline def shared_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shared")(x.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the info about a SPI bus. */
  @JSGlobal("Windows.Devices.Spi.SpiBusInfo")
  @js.native
  abstract class SpiBusInfo ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Spi.SpiBusInfo {
    
    /** Gets the number of chip select lines available on the bus. */
    /* CompleteClass */
    var chipSelectLineCount: Double = js.native
    
    /** Maximum clock cycle frequency of the bus. */
    /* CompleteClass */
    var maxClockFrequency: Double = js.native
    
    /** Minimum clock cycle frequency of the bus. */
    /* CompleteClass */
    var minClockFrequency: Double = js.native
    
    /** Gets the bit lengths that can be used on the bus for transmitting data. */
    /* CompleteClass */
    var supportedDataBitLengths: IVectorView[Double] = js.native
  }
  
  /** Represents the settings for the connection with a device. */
  @JSGlobal("Windows.Devices.Spi.SpiConnectionSettings")
  @js.native
  open class SpiConnectionSettings protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Spi.SpiConnectionSettings {
    /**
      * Initializes new instance of SpiConnectionSettings .
      * @param chipSelectLine The chip select line on which the connection will be made.
      */
    def this(chipSelectLine: Double) = this()
    
    /** Gets or sets the chip select line for the connection to the SPI device. */
    /* CompleteClass */
    var chipSelectLine: Double = js.native
    
    /** Gets or sets the clock frequency for the connection. */
    /* CompleteClass */
    var clockFrequency: Double = js.native
    
    /** Gets or sets the bit length for data on this connection. */
    /* CompleteClass */
    var dataBitLength: Double = js.native
    
    /** Gets or sets the SpiMode for this connection. */
    /* CompleteClass */
    var mode: SpiMode = js.native
    
    /** Gets or sets the sharing mode for the SPI connection. */
    /* CompleteClass */
    var sharingMode: SpiSharingMode = js.native
  }
  
  /** Represents the SPI controller on the system. */
  @JSGlobal("Windows.Devices.Spi.SpiController")
  @js.native
  abstract class SpiController ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Spi.SpiController {
    
    /**
      * Gets the SPI device with the specified settings.
      * @param settings The desired connection settings.
      * @return The SPI device.
      */
    /* CompleteClass */
    override def getDevice(settings: typings.winrtUwp.Windows.Devices.Spi.SpiConnectionSettings): typings.winrtUwp.Windows.Devices.Spi.SpiDevice = js.native
  }
  object SpiController {
    
    @JSGlobal("Windows.Devices.Spi.SpiController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets all the SPI controllers that are on the system.
      * @param provider The SPI provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the available SPI controllers on the system.
      */
    /* static member */
    inline def getControllersAsync(provider: ISpiProvider): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllersAsync")(provider.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    
    /**
      * Gets the default SPI controller on the system.
      * @return The default SPI controller on the system, or null if the system has no SPI controller.
      */
    /* static member */
    inline def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Spi.SpiController] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Spi.SpiController]]
  }
  
  /** Represents a device connected through the SPI bus. */
  @JSGlobal("Windows.Devices.Spi.SpiDevice")
  @js.native
  abstract class SpiDevice ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Spi.SpiDevice {
    
    /** Closes the connection to the device. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets the connection settings for the device. */
    /* CompleteClass */
    var connectionSettings: typings.winrtUwp.Windows.Devices.Spi.SpiConnectionSettings = js.native
    
    /** Gets the unique ID associated with the device. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /**
      * Reads from the connected device.
      * @return Array containing data read from the device.
      */
    /* CompleteClass */
    override def read(): js.Array[Double] = js.native
    
    /**
      * Transfer data using a full duplex communication system. Full duplex allows both the master and the slave to communicate simultaneously.
      * @param writeBuffer Array containing data to write to the device.
      * @return Array containing data read from the device.
      */
    /* CompleteClass */
    override def transferFullDuplex(writeBuffer: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * Transfer data sequentially to the device.
      * @param writeBuffer Array containing data to write to the device.
      * @return Array containing data read from the device.
      */
    /* CompleteClass */
    override def transferSequential(writeBuffer: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * Writes to the connected device.
      * @param buffer Array containing the data to write to the device.
      */
    /* CompleteClass */
    override def write(buffer: js.Array[Double]): Unit = js.native
  }
  object SpiDevice {
    
    @JSGlobal("Windows.Devices.Spi.SpiDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Opens a device with the connection settings provided.
      * @param busId The id of the bus.
      * @param settings The connection settings.
      * @return The SPI device requested.
      */
    /* static member */
    inline def fromIdAsync(busId: String, settings: typings.winrtUwp.Windows.Devices.Spi.SpiConnectionSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Spi.SpiDevice] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(busId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Spi.SpiDevice]]
    
    /**
      * Retrieves the info about a certain bus.
      * @param busId The id of the bus.
      * @return The bus info requested.
      */
    /* static member */
    inline def getBusInfo(busId: String): typings.winrtUwp.Windows.Devices.Spi.SpiBusInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getBusInfo")(busId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Spi.SpiBusInfo]
    
    /**
      * Gets all the SPI buses found on the system.
      * @return String containing all the buses found on the system.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
    /**
      * Gets all the SPI buses found on the system that match the input parameter.
      * @param friendlyName Input parameter specifying an identifying name for the desired bus. This usually corresponds to a name on the schematic.
      * @return String containing all the buses that have the input in the name.
      */
    /* static member */
    inline def getDeviceSelector(friendlyName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(friendlyName.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** Defines the SPI communication mode. The communication mode defines the clock edge on which the master out line toggles, the master in line samples, and the signal clock's signal steady level (named SCLK). Each mode is defined with a pair of parameters called clock polarity (CPOL) and clock phase (CPHA). */
  @JSGlobal("Windows.Devices.Spi.SpiMode")
  @js.native
  object SpiMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Spi.SpiMode & Double] = js.native
    
    /* 0 */ val mode0: typings.winrtUwp.Windows.Devices.Spi.SpiMode.mode0 & Double = js.native
    
    /* 1 */ val mode1: typings.winrtUwp.Windows.Devices.Spi.SpiMode.mode1 & Double = js.native
    
    /* 2 */ val mode2: typings.winrtUwp.Windows.Devices.Spi.SpiMode.mode2 & Double = js.native
    
    /* 3 */ val mode3: typings.winrtUwp.Windows.Devices.Spi.SpiMode.mode3 & Double = js.native
  }
  
  /** Defines the sharing mode for the SPI bus. */
  @JSGlobal("Windows.Devices.Spi.SpiSharingMode")
  @js.native
  object SpiSharingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Spi.SpiSharingMode & Double] = js.native
    
    /* 0 */ val exclusive: typings.winrtUwp.Windows.Devices.Spi.SpiSharingMode.exclusive & Double = js.native
    
    /* 1 */ val shared: typings.winrtUwp.Windows.Devices.Spi.SpiSharingMode.shared & Double = js.native
  }
}
