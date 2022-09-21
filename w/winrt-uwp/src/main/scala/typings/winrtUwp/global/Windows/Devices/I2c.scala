package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.I2c.I2cBusSpeed
import typings.winrtUwp.Windows.Devices.I2c.I2cSharingMode
import typings.winrtUwp.Windows.Devices.I2c.I2cTransferResult
import typings.winrtUwp.Windows.Devices.I2c.Provider.II2cProvider
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types that you can use to communicate with peripheral devices connected through a inter-integrated circuit (I²C) bus from an application. */
object I2c {
  
  /** Describes the bus speeds that are available for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
  @JSGlobal("Windows.Devices.I2c.I2cBusSpeed")
  @js.native
  object I2cBusSpeed extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.I2c.I2cBusSpeed & Double] = js.native
    
    /* 1 */ val fastMode: typings.winrtUwp.Windows.Devices.I2c.I2cBusSpeed.fastMode & Double = js.native
    
    /* 0 */ val standardMode: typings.winrtUwp.Windows.Devices.I2c.I2cBusSpeed.standardMode & Double = js.native
  }
  
  /** Represents the connection settings you want to use for an inter-integrated circuit (I²C) device. */
  @JSGlobal("Windows.Devices.I2c.I2cConnectionSettings")
  @js.native
  open class I2cConnectionSettings protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings {
    /**
      * Creates and initializes a new instance of the I2cConnectionSettings class for inter-integrated circuit (I²C) device with specified bus address, using the default settings of the standard mode for the bus speed and exclusive sharing mode.
      * @param slaveAddress The bus address of the inter-integrated circuit (I²C) device to which the settings of the I2cConnectionSettings should apply. Only 7-bit addressing is supported, so the range of values that are valid is from 8 to 119.
      */
    def this(slaveAddress: Double) = this()
    
    /** Gets or sets the bus speed to use for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
    /* CompleteClass */
    var busSpeed: I2cBusSpeed = js.native
    
    /** Gets or sets the sharing mode to use to connect to the inter-integrated circuit (I²C) bus address. This mode determines whether other connections to the I²C bus address can be opened while you are connect to the I²C bus address. */
    /* CompleteClass */
    var sharingMode: I2cSharingMode = js.native
    
    /** Gets or sets the bus address of the inter-integrated circuit (I²C) device. */
    /* CompleteClass */
    var slaveAddress: Double = js.native
  }
  
  /** Represents the I²C controller for the system. */
  @JSGlobal("Windows.Devices.I2c.I2cController")
  @js.native
  abstract class I2cController ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.I2c.I2cController {
    
    /**
      * Gets the I²C device with the specified settings.
      * @param settings The desired connection settings.
      * @return The I²C device.
      */
    /* CompleteClass */
    override def getDevice(settings: typings.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings): typings.winrtUwp.Windows.Devices.I2c.I2cDevice = js.native
  }
  object I2cController {
    
    @JSGlobal("Windows.Devices.I2c.I2cController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets all the I²C controllers that are on the system.
      * @param provider The I²C provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the available I²C controllers on the system.
      */
    /* static member */
    inline def getControllersAsync(provider: II2cProvider): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllersAsync")(provider.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    
    /**
      * Gets the default I²C controller on the system.
      * @return The default I²C controller on the system, or null if the system has no I²C controller.
      */
    /* static member */
    inline def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.I2c.I2cController] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.I2c.I2cController]]
  }
  
  /** Represents a communications channel to a device on an inter-integrated circuit (I²C) bus. */
  @JSGlobal("Windows.Devices.I2c.I2cDevice")
  @js.native
  abstract class I2cDevice ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.I2c.I2cDevice {
    
    /** Closes the connection to the inter-integrated circuit (I²C) device. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets the connection settings used for communication with the inter-integrated circuit (I²C) device. */
    /* CompleteClass */
    var connectionSettings: typings.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings = js.native
    
    /** Gets the plug and play device identifier of the inter-integrated circuit (I²C) bus controller for the device. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /**
      * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer.
      * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      */
    /* CompleteClass */
    override def read(buffer: js.Array[Double]): Unit = js.native
    
    /**
      * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer, and returns information about the success of the operation that you can use for error handling.
      * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      * @return A structure that contains information about the success of the read operation and the actual number of bytes that the operation read into the buffer.
      */
    /* CompleteClass */
    override def readPartial(buffer: js.Array[Double]): I2cTransferResult = js.native
    
    /**
      * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, based on the bus address specified in the I2cConnectionSetting s object that you used to create the I2cDevice object.
      * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      */
    /* CompleteClass */
    override def write(buffer: js.Array[Double]): Unit = js.native
    
    /**
      * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
      * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      * @return A structure that contains information about the success of the write operation and the actual number of bytes that the operation wrote into the buffer.
      */
    /* CompleteClass */
    override def writePartial(buffer: js.Array[Double]): I2cTransferResult = js.native
    
    /**
      * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and sends a restart condition between the write and read operations.
      * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      */
    /* CompleteClass */
    override def writeRead(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): Unit = js.native
    
    /**
      * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
      * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      * @return A structure that contains information about whether both the read and write parts of the operation succeeded and the sum of the actual number of bytes that the operation wrote and the actual number of bytes that the operation read.
      */
    /* CompleteClass */
    override def writeReadPartial(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): I2cTransferResult = js.native
  }
  object I2cDevice {
    
    @JSGlobal("Windows.Devices.I2c.I2cDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieves an I2cDevice object asynchronously for the inter-integrated circuit (I²C) bus controller that has the specified plug and play device identifier, using the specified connection settings.
      * @param deviceId The plug and play device identifier of the I²C bus controller for which you want to create an I2cDevice object.
      * @param settings The connection settings to use for communication with the I²C bus controller that deviceId specifies.
      * @return An asynchronous operation that returns the I2cDevice object.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String, settings: typings.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.I2c.I2cDevice] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.I2c.I2cDevice]]
    
    /**
      * Retrieves an Advanced Query Syntax (AQS) string for all of the inter-integrated circuit (I²C) bus controllers on the system. You can use this string with the DeviceInformation.FindAllAsync method to get DeviceInformation objects for those bus controllers.
      * @return An AQS string for all of the I²C bus controllers on the system, which you can use with the DeviceInformation.FindAllAsync method to get DeviceInformation objects for those bus controllers.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
    /**
      * Retrieves an Advanced Query Syntax (AQS) string for the inter-integrated circuit (I²C) bus that has the specified friendly name. You can use this string with the DeviceInformation.FindAllAsync method to get a DeviceInformation object for that bus.
      * @param friendlyName A friendly name for the particular I²C bus on a particular hardware platform for which you want to get the AQS string.
      * @return An AQS string for the I²C bus that friendlyName specifies, which you can use with the DeviceInformation.FindAllAsync method to get a DeviceInformation object for that bus.
      */
    /* static member */
    inline def getDeviceSelector(friendlyName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(friendlyName.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** Describes the modes in which you can connect to an inter-integrated circuit (I²C) bus address. These modes determine whether other connections to the I²C bus address can be opened while you are connected to the I²C bus address. */
  @JSGlobal("Windows.Devices.I2c.I2cSharingMode")
  @js.native
  object I2cSharingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.I2c.I2cSharingMode & Double] = js.native
    
    /* 0 */ val exclusive: typings.winrtUwp.Windows.Devices.I2c.I2cSharingMode.exclusive & Double = js.native
    
    /* 1 */ val shared: typings.winrtUwp.Windows.Devices.I2c.I2cSharingMode.shared & Double = js.native
  }
  
  /** Describes whether the data transfers that the ReadPartial , WritePartial , or WriteReadPartial method performed succeeded, or provides the reason that the transfers did not succeed. */
  @JSGlobal("Windows.Devices.I2c.I2cTransferStatus")
  @js.native
  object I2cTransferStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.I2c.I2cTransferStatus & Double] = js.native
    
    /* 0 */ val fullTransfer: typings.winrtUwp.Windows.Devices.I2c.I2cTransferStatus.fullTransfer & Double = js.native
    
    /* 1 */ val partialTransfer: typings.winrtUwp.Windows.Devices.I2c.I2cTransferStatus.partialTransfer & Double = js.native
    
    /* 2 */ val slaveAddressNotAcknowledged: typings.winrtUwp.Windows.Devices.I2c.I2cTransferStatus.slaveAddressNotAcknowledged & Double = js.native
  }
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The I2C API needs a I²C Provider implementation to talk to the I²C controller. */
  object Provider {
    
    object ProviderI2cBusSpeed {
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cBusSpeed")
      @js.native
      val ^ : js.Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cBusSpeed.fastMode")
      @js.native
      def fastMode: Any = js.native
      inline def fastMode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fastMode")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cBusSpeed.standardMode")
      @js.native
      def standardMode: Any = js.native
      inline def standardMode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("standardMode")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cConnectionSettings")
    @js.native
    abstract class ProviderI2cConnectionSettings ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.I2c.Provider.ProviderI2cConnectionSettings {
      
      /* CompleteClass */
      var busSpeed: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var sharingMode: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var slaveAddress: Any = js.native
    }
    
    object ProviderI2cSharingMode {
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cSharingMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cSharingMode.exclusive")
      @js.native
      def exclusive: Any = js.native
      inline def exclusive_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cSharingMode.shared")
      @js.native
      def shared: Any = js.native
      inline def shared_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shared")(x.asInstanceOf[js.Any])
    }
    
    object ProviderI2cTransferStatus {
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cTransferStatus")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cTransferStatus.fullTransfer")
      @js.native
      def fullTransfer: Any = js.native
      inline def fullTransfer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullTransfer")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cTransferStatus.partialTransfer")
      @js.native
      def partialTransfer: Any = js.native
      inline def partialTransfer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partialTransfer")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cTransferStatus.slaveAddressNotAcknowledged")
      @js.native
      def slaveAddressNotAcknowledged: Any = js.native
      inline def slaveAddressNotAcknowledged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slaveAddressNotAcknowledged")(x.asInstanceOf[js.Any])
    }
  }
}
