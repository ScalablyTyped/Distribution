package typings.winrtUwp.Windows.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SPI is a high speed interface used to communicate among integrated components on the same board. */
object Spi {
  
  @js.native
  sealed trait SpiMode extends StObject
  /** Defines the SPI communication mode. The communication mode defines the clock edge on which the master out line toggles, the master in line samples, and the signal clock's signal steady level (named SCLK). Each mode is defined with a pair of parameters called clock polarity (CPOL) and clock phase (CPHA). */
  @JSGlobal("Windows.Devices.Spi.SpiMode")
  @js.native
  object SpiMode extends StObject {
    
    /** CPOL = 0, CPHA = 0. */
    @js.native
    sealed trait mode0 extends SpiMode
    
    /** CPOL = 0, CPHA = 1. */
    @js.native
    sealed trait mode1 extends SpiMode
    
    /** CPOL = 1, CPHA = 0. */
    @js.native
    sealed trait mode2 extends SpiMode
    
    /** CPOL = 1, CPHA = 1. */
    @js.native
    sealed trait mode3 extends SpiMode
  }
  
  @js.native
  sealed trait SpiSharingMode extends StObject
  /** Defines the sharing mode for the SPI bus. */
  @JSGlobal("Windows.Devices.Spi.SpiSharingMode")
  @js.native
  object SpiSharingMode extends StObject {
    
    /** SPI bus segment is not shared. */
    @js.native
    sealed trait exclusive extends SpiSharingMode
    
    /** SPI bus is shared. */
    @js.native
    sealed trait shared extends SpiSharingMode
  }
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The SPI API needs a SPI Provider implementation to talk to the SPI controller. */
  object Provider {
    
    /** Represents actions common to SPI controller providers. */
    @js.native
    trait ISpiProvider extends StObject {
      
      var getControllersAsync: js.Any = js.native
    }
    object ISpiProvider {
      
      @scala.inline
      def apply(getControllersAsync: js.Any): ISpiProvider = {
        val __obj = js.Dynamic.literal(getControllersAsync = getControllersAsync.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISpiProvider]
      }
      
      @scala.inline
      implicit class ISpiProviderMutableBuilder[Self <: ISpiProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetControllersAsync(value: js.Any): Self = StObject.set(x, "getControllersAsync", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ProviderSpiConnectionSettings extends StObject {
      
      var chipSelectLine: js.Any = js.native
      
      /* unmapped type */
      var clockFrequency: js.Any = js.native
      
      /* unmapped type */
      var dataBitLength: js.Any = js.native
      
      /* unmapped type */
      var mode: js.Any = js.native
      
      /* unmapped type */
      var sharingMode: js.Any = js.native
    }
    object ProviderSpiConnectionSettings {
      
      @scala.inline
      def apply(
        chipSelectLine: js.Any,
        clockFrequency: js.Any,
        dataBitLength: js.Any,
        mode: js.Any,
        sharingMode: js.Any
      ): ProviderSpiConnectionSettings = {
        val __obj = js.Dynamic.literal(chipSelectLine = chipSelectLine.asInstanceOf[js.Any], clockFrequency = clockFrequency.asInstanceOf[js.Any], dataBitLength = dataBitLength.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any])
        __obj.asInstanceOf[ProviderSpiConnectionSettings]
      }
      
      @scala.inline
      implicit class ProviderSpiConnectionSettingsMutableBuilder[Self <: ProviderSpiConnectionSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChipSelectLine(value: js.Any): Self = StObject.set(x, "chipSelectLine", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClockFrequency(value: js.Any): Self = StObject.set(x, "clockFrequency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataBitLength(value: js.Any): Self = StObject.set(x, "dataBitLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMode(value: js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSharingMode(value: js.Any): Self = StObject.set(x, "sharingMode", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /** Represents the info about a SPI bus. */
  @js.native
  trait SpiBusInfo extends StObject {
    
    /** Gets the number of chip select lines available on the bus. */
    var chipSelectLineCount: Double = js.native
    
    /** Maximum clock cycle frequency of the bus. */
    var maxClockFrequency: Double = js.native
    
    /** Minimum clock cycle frequency of the bus. */
    var minClockFrequency: Double = js.native
    
    /** Gets the bit lengths that can be used on the bus for transmitting data. */
    var supportedDataBitLengths: IVectorView[Double] = js.native
  }
  object SpiBusInfo {
    
    @scala.inline
    def apply(
      chipSelectLineCount: Double,
      maxClockFrequency: Double,
      minClockFrequency: Double,
      supportedDataBitLengths: IVectorView[Double]
    ): SpiBusInfo = {
      val __obj = js.Dynamic.literal(chipSelectLineCount = chipSelectLineCount.asInstanceOf[js.Any], maxClockFrequency = maxClockFrequency.asInstanceOf[js.Any], minClockFrequency = minClockFrequency.asInstanceOf[js.Any], supportedDataBitLengths = supportedDataBitLengths.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpiBusInfo]
    }
    
    @scala.inline
    implicit class SpiBusInfoMutableBuilder[Self <: SpiBusInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChipSelectLineCount(value: Double): Self = StObject.set(x, "chipSelectLineCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxClockFrequency(value: Double): Self = StObject.set(x, "maxClockFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinClockFrequency(value: Double): Self = StObject.set(x, "minClockFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedDataBitLengths(value: IVectorView[Double]): Self = StObject.set(x, "supportedDataBitLengths", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the settings for the connection with a device. */
  @js.native
  trait SpiConnectionSettings extends StObject {
    
    /** Gets or sets the chip select line for the connection to the SPI device. */
    var chipSelectLine: Double = js.native
    
    /** Gets or sets the clock frequency for the connection. */
    var clockFrequency: Double = js.native
    
    /** Gets or sets the bit length for data on this connection. */
    var dataBitLength: Double = js.native
    
    /** Gets or sets the SpiMode for this connection. */
    var mode: SpiMode = js.native
    
    /** Gets or sets the sharing mode for the SPI connection. */
    var sharingMode: SpiSharingMode = js.native
  }
  object SpiConnectionSettings {
    
    @scala.inline
    def apply(
      chipSelectLine: Double,
      clockFrequency: Double,
      dataBitLength: Double,
      mode: SpiMode,
      sharingMode: SpiSharingMode
    ): SpiConnectionSettings = {
      val __obj = js.Dynamic.literal(chipSelectLine = chipSelectLine.asInstanceOf[js.Any], clockFrequency = clockFrequency.asInstanceOf[js.Any], dataBitLength = dataBitLength.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpiConnectionSettings]
    }
    
    @scala.inline
    implicit class SpiConnectionSettingsMutableBuilder[Self <: SpiConnectionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChipSelectLine(value: Double): Self = StObject.set(x, "chipSelectLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockFrequency(value: Double): Self = StObject.set(x, "clockFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBitLength(value: Double): Self = StObject.set(x, "dataBitLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: SpiMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharingMode(value: SpiSharingMode): Self = StObject.set(x, "sharingMode", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the SPI controller on the system. */
  @js.native
  trait SpiController extends StObject {
    
    /**
      * Gets the SPI device with the specified settings.
      * @param settings The desired connection settings.
      * @return The SPI device.
      */
    def getDevice(settings: SpiConnectionSettings): SpiDevice = js.native
  }
  object SpiController {
    
    @scala.inline
    def apply(getDevice: SpiConnectionSettings => SpiDevice): SpiController = {
      val __obj = js.Dynamic.literal(getDevice = js.Any.fromFunction1(getDevice))
      __obj.asInstanceOf[SpiController]
    }
    
    @scala.inline
    implicit class SpiControllerMutableBuilder[Self <: SpiController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDevice(value: SpiConnectionSettings => SpiDevice): Self = StObject.set(x, "getDevice", js.Any.fromFunction1(value))
    }
  }
  
  /** Represents a device connected through the SPI bus. */
  @js.native
  trait SpiDevice extends StObject {
    
    /** Closes the connection to the device. */
    def close(): Unit = js.native
    
    /** Gets the connection settings for the device. */
    var connectionSettings: SpiConnectionSettings = js.native
    
    /** Gets the unique ID associated with the device. */
    var deviceId: String = js.native
    
    /**
      * Reads from the connected device.
      * @return Array containing data read from the device.
      */
    def read(): js.Array[Double] = js.native
    
    /**
      * Transfer data using a full duplex communication system. Full duplex allows both the master and the slave to communicate simultaneously.
      * @param writeBuffer Array containing data to write to the device.
      * @return Array containing data read from the device.
      */
    def transferFullDuplex(writeBuffer: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * Transfer data sequentially to the device.
      * @param writeBuffer Array containing data to write to the device.
      * @return Array containing data read from the device.
      */
    def transferSequential(writeBuffer: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * Writes to the connected device.
      * @param buffer Array containing the data to write to the device.
      */
    def write(buffer: js.Array[Double]): Unit = js.native
  }
  object SpiDevice {
    
    @scala.inline
    def apply(
      close: () => Unit,
      connectionSettings: SpiConnectionSettings,
      deviceId: String,
      read: () => js.Array[Double],
      transferFullDuplex: js.Array[Double] => js.Array[Double],
      transferSequential: js.Array[Double] => js.Array[Double],
      write: js.Array[Double] => Unit
    ): SpiDevice = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connectionSettings = connectionSettings.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), transferFullDuplex = js.Any.fromFunction1(transferFullDuplex), transferSequential = js.Any.fromFunction1(transferSequential), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[SpiDevice]
    }
    
    @scala.inline
    implicit class SpiDeviceMutableBuilder[Self <: SpiDevice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConnectionSettings(value: SpiConnectionSettings): Self = StObject.set(x, "connectionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: () => js.Array[Double]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTransferFullDuplex(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "transferFullDuplex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransferSequential(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "transferSequential", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: js.Array[Double] => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
