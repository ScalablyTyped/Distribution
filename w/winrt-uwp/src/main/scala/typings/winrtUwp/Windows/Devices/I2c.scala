package typings.winrtUwp.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types that you can use to communicate with peripheral devices connected through a inter-integrated circuit (I²C) bus from an application. */
object I2c {
  
  @js.native
  sealed trait I2cBusSpeed extends StObject
  /** Describes the bus speeds that are available for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
  @JSGlobal("Windows.Devices.I2c.I2cBusSpeed")
  @js.native
  object I2cBusSpeed extends StObject {
    
    /** A fast speed of 400 kHz. */
    @js.native
    sealed trait fastMode extends I2cBusSpeed
    
    /** The standard speed of 100 kilohertz (kHz). This speed is the default. */
    @js.native
    sealed trait standardMode extends I2cBusSpeed
  }
  
  @js.native
  sealed trait I2cSharingMode extends StObject
  /** Describes the modes in which you can connect to an inter-integrated circuit (I²C) bus address. These modes determine whether other connections to the I²C bus address can be opened while you are connected to the I²C bus address. */
  @JSGlobal("Windows.Devices.I2c.I2cSharingMode")
  @js.native
  object I2cSharingMode extends StObject {
    
    /** Connects to the I²C bus address exclusively, so that no other connection to the I²C bus address can be made while you remain connected. This mode is the default mode. */
    @js.native
    sealed trait exclusive extends I2cSharingMode
    
    /** Connects to the I²C bus address in shared mode, so that other connections to the I²C bus address can be made while you remain connected. */
    @js.native
    sealed trait shared extends I2cSharingMode
  }
  
  @js.native
  sealed trait I2cTransferStatus extends StObject
  /** Describes whether the data transfers that the ReadPartial , WritePartial , or WriteReadPartial method performed succeeded, or provides the reason that the transfers did not succeed. */
  @JSGlobal("Windows.Devices.I2c.I2cTransferStatus")
  @js.native
  object I2cTransferStatus extends StObject {
    
    /** The data was entirely transferred. For WriteReadPartial , the data for both the write and the read operations was entirely transferred. */
    @js.native
    sealed trait fullTransfer extends I2cTransferStatus
    
    /** The I²C device negatively acknowledged the data transfer before all of the data was transferred. */
    @js.native
    sealed trait partialTransfer extends I2cTransferStatus
    
    /** The bus address was not acknowledged. */
    @js.native
    sealed trait slaveAddressNotAcknowledged extends I2cTransferStatus
  }
  
  /** Represents the connection settings you want to use for an inter-integrated circuit (I²C) device. */
  @js.native
  trait I2cConnectionSettings extends StObject {
    
    /** Gets or sets the bus speed to use for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
    var busSpeed: I2cBusSpeed = js.native
    
    /** Gets or sets the sharing mode to use to connect to the inter-integrated circuit (I²C) bus address. This mode determines whether other connections to the I²C bus address can be opened while you are connect to the I²C bus address. */
    var sharingMode: I2cSharingMode = js.native
    
    /** Gets or sets the bus address of the inter-integrated circuit (I²C) device. */
    var slaveAddress: Double = js.native
  }
  object I2cConnectionSettings {
    
    @scala.inline
    def apply(busSpeed: I2cBusSpeed, sharingMode: I2cSharingMode, slaveAddress: Double): I2cConnectionSettings = {
      val __obj = js.Dynamic.literal(busSpeed = busSpeed.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any], slaveAddress = slaveAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[I2cConnectionSettings]
    }
    
    @scala.inline
    implicit class I2cConnectionSettingsMutableBuilder[Self <: I2cConnectionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusSpeed(value: I2cBusSpeed): Self = StObject.set(x, "busSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharingMode(value: I2cSharingMode): Self = StObject.set(x, "sharingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlaveAddress(value: Double): Self = StObject.set(x, "slaveAddress", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the I²C controller for the system. */
  @js.native
  trait I2cController extends StObject {
    
    /**
      * Gets the I²C device with the specified settings.
      * @param settings The desired connection settings.
      * @return The I²C device.
      */
    def getDevice(settings: I2cConnectionSettings): I2cDevice = js.native
  }
  object I2cController {
    
    @scala.inline
    def apply(getDevice: I2cConnectionSettings => I2cDevice): I2cController = {
      val __obj = js.Dynamic.literal(getDevice = js.Any.fromFunction1(getDevice))
      __obj.asInstanceOf[I2cController]
    }
    
    @scala.inline
    implicit class I2cControllerMutableBuilder[Self <: I2cController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDevice(value: I2cConnectionSettings => I2cDevice): Self = StObject.set(x, "getDevice", js.Any.fromFunction1(value))
    }
  }
  
  /** Represents a communications channel to a device on an inter-integrated circuit (I²C) bus. */
  @js.native
  trait I2cDevice extends StObject {
    
    /** Closes the connection to the inter-integrated circuit (I²C) device. */
    def close(): Unit = js.native
    
    /** Gets the connection settings used for communication with the inter-integrated circuit (I²C) device. */
    var connectionSettings: I2cConnectionSettings = js.native
    
    /** Gets the plug and play device identifier of the inter-integrated circuit (I²C) bus controller for the device. */
    var deviceId: String = js.native
    
    /**
      * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer.
      * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      */
    def read(buffer: js.Array[Double]): Unit = js.native
    
    /**
      * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer, and returns information about the success of the operation that you can use for error handling.
      * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      * @return A structure that contains information about the success of the read operation and the actual number of bytes that the operation read into the buffer.
      */
    def readPartial(buffer: js.Array[Double]): I2cTransferResult = js.native
    
    /**
      * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, based on the bus address specified in the I2cConnectionSetting s object that you used to create the I2cDevice object.
      * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      */
    def write(buffer: js.Array[Double]): Unit = js.native
    
    /**
      * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
      * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      * @return A structure that contains information about the success of the write operation and the actual number of bytes that the operation wrote into the buffer.
      */
    def writePartial(buffer: js.Array[Double]): I2cTransferResult = js.native
    
    /**
      * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and sends a restart condition between the write and read operations.
      * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      */
    def writeRead(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): Unit = js.native
    
    /**
      * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
      * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      * @return A structure that contains information about whether both the read and write parts of the operation succeeded and the sum of the actual number of bytes that the operation wrote and the actual number of bytes that the operation read.
      */
    def writeReadPartial(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): I2cTransferResult = js.native
  }
  object I2cDevice {
    
    @scala.inline
    def apply(
      close: () => Unit,
      connectionSettings: I2cConnectionSettings,
      deviceId: String,
      read: js.Array[Double] => Unit,
      readPartial: js.Array[Double] => I2cTransferResult,
      write: js.Array[Double] => Unit,
      writePartial: js.Array[Double] => I2cTransferResult,
      writeRead: (js.Array[Double], js.Array[Double]) => Unit,
      writeReadPartial: (js.Array[Double], js.Array[Double]) => I2cTransferResult
    ): I2cDevice = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connectionSettings = connectionSettings.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), readPartial = js.Any.fromFunction1(readPartial), write = js.Any.fromFunction1(write), writePartial = js.Any.fromFunction1(writePartial), writeRead = js.Any.fromFunction2(writeRead), writeReadPartial = js.Any.fromFunction2(writeReadPartial))
      __obj.asInstanceOf[I2cDevice]
    }
    
    @scala.inline
    implicit class I2cDeviceMutableBuilder[Self <: I2cDevice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConnectionSettings(value: I2cConnectionSettings): Self = StObject.set(x, "connectionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: js.Array[Double] => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadPartial(value: js.Array[Double] => I2cTransferResult): Self = StObject.set(x, "readPartial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: js.Array[Double] => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWritePartial(value: js.Array[Double] => I2cTransferResult): Self = StObject.set(x, "writePartial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteRead(value: (js.Array[Double], js.Array[Double]) => Unit): Self = StObject.set(x, "writeRead", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWriteReadPartial(value: (js.Array[Double], js.Array[Double]) => I2cTransferResult): Self = StObject.set(x, "writeReadPartial", js.Any.fromFunction2(value))
    }
  }
  
  /** Provides information about whether the data transfers that the ReadPartial , WritePartial , or WriteReadPartial method performed succeeded, and the actual number of bytes the method transferred. */
  @js.native
  trait I2cTransferResult extends StObject {
    
    /** The actual number of bytes that the operation actually transferred. The following table describes what this value represents for each method. */
    var bytesTransferred: Double = js.native
    
    /** An enumeration value that indicates if the read or write operation transferred the full number of bytes that the method requested, or the reason that the full transfer did not succeed. For WriteReadPartial , the value indicates whether the data for both the write and the read operations was entirely transferred. */
    var status: I2cTransferStatus = js.native
  }
  object I2cTransferResult {
    
    @scala.inline
    def apply(bytesTransferred: Double, status: I2cTransferStatus): I2cTransferResult = {
      val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[I2cTransferResult]
    }
    
    @scala.inline
    implicit class I2cTransferResultMutableBuilder[Self <: I2cTransferResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesTransferred(value: Double): Self = StObject.set(x, "bytesTransferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: I2cTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The I2C API needs a I²C Provider implementation to talk to the I²C controller. */
  object Provider {
    
    /** Represents actions common to all I²C providers. */
    @js.native
    trait II2cProvider extends StObject {
      
      var getControllersAsync: js.Any = js.native
    }
    object II2cProvider {
      
      @scala.inline
      def apply(getControllersAsync: js.Any): II2cProvider = {
        val __obj = js.Dynamic.literal(getControllersAsync = getControllersAsync.asInstanceOf[js.Any])
        __obj.asInstanceOf[II2cProvider]
      }
      
      @scala.inline
      implicit class II2cProviderMutableBuilder[Self <: II2cProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetControllersAsync(value: js.Any): Self = StObject.set(x, "getControllersAsync", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ProviderI2cConnectionSettings extends StObject {
      
      var busSpeed: js.Any = js.native
      
      /* unmapped type */
      var sharingMode: js.Any = js.native
      
      /* unmapped type */
      var slaveAddress: js.Any = js.native
    }
    object ProviderI2cConnectionSettings {
      
      @scala.inline
      def apply(busSpeed: js.Any, sharingMode: js.Any, slaveAddress: js.Any): ProviderI2cConnectionSettings = {
        val __obj = js.Dynamic.literal(busSpeed = busSpeed.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any], slaveAddress = slaveAddress.asInstanceOf[js.Any])
        __obj.asInstanceOf[ProviderI2cConnectionSettings]
      }
      
      @scala.inline
      implicit class ProviderI2cConnectionSettingsMutableBuilder[Self <: ProviderI2cConnectionSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBusSpeed(value: js.Any): Self = StObject.set(x, "busSpeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSharingMode(value: js.Any): Self = StObject.set(x, "sharingMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlaveAddress(value: js.Any): Self = StObject.set(x, "slaveAddress", value.asInstanceOf[js.Any])
      }
    }
  }
}
