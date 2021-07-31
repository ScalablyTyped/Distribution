package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEDevice
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GATT Primary Service on a Bluetooth device. */
trait GattDeviceService extends StObject {
  
  /** Gets the handle used to uniquely identify GATT-based service attributes as declared on the Bluetooth LE device. */
  var attributeHandle: Double
  
  /** Releases the resources associated with the GattDeviceService class. This allows other apps to access the resources of the GattDeviceService in question. A GattDeviceService object should not be used after Close is invoked, instead a new GattDeviceService object should be instantiated using the FromIdAsync method. */
  def close(): Unit
  
  /** Gets the BluetoothLEDevice object describing the device associated with the current GattDeviceService object. */
  var device: BluetoothLEDevice
  
  /** Get the string that represents the GATT service instance path used to instantiate the GattDeviceService. */
  var deviceId: String
  
  /**
    * Gets the collection of all characteristics belonging to this GattDeviceService instance.
    * @return The collection of all characteristics belonging to this GattDeviceService instance.
    */
  def getAllCharacteristics(): IVectorView[GattCharacteristic]
  
  /**
    * Gets the collection of all included services belonging to this GattDeviceService instance.
    * @return The collection of all included services belonging to this GattDeviceService instance.
    */
  def getAllIncludedServices(): IVectorView[GattDeviceService]
  
  /**
    * Returns a vector of characteristics, that are identified by the specified UUID and belong to this GattDeviceService instance.
    * @param characteristicUuid The UUID for the characteristics to be retrieved.
    * @return A vector of GattCharacteristic objects whose UUIDs match characteristicUuid.
    */
  def getCharacteristics(characteristicUuid: String): IVectorView[GattCharacteristic]
  
  /**
    * Returns a vector of included services, that are identified by the specified UUID and belong to this GattDeviceService instance.
    * @param serviceUuid The UUID for the included services to be retrieved.
    * @return A vector of included services whose UUIDs match serviceUuid.
    */
  def getIncludedServices(serviceUuid: String): IVectorView[GattDeviceService]
  
  /** Gets the read-only list of parent services for this service. */
  var parentServices: IVectorView[GattDeviceService]
  
  /** The GATT Service UUID associated with this GattDeviceService. */
  var uuid: String
}
object GattDeviceService {
  
  @scala.inline
  def apply(
    attributeHandle: Double,
    close: () => Unit,
    device: BluetoothLEDevice,
    deviceId: String,
    getAllCharacteristics: () => IVectorView[GattCharacteristic],
    getAllIncludedServices: () => IVectorView[GattDeviceService],
    getCharacteristics: String => IVectorView[GattCharacteristic],
    getIncludedServices: String => IVectorView[GattDeviceService],
    parentServices: IVectorView[GattDeviceService],
    uuid: String
  ): GattDeviceService = {
    val __obj = js.Dynamic.literal(attributeHandle = attributeHandle.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), device = device.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], getAllCharacteristics = js.Any.fromFunction0(getAllCharacteristics), getAllIncludedServices = js.Any.fromFunction0(getAllIncludedServices), getCharacteristics = js.Any.fromFunction1(getCharacteristics), getIncludedServices = js.Any.fromFunction1(getIncludedServices), parentServices = parentServices.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattDeviceService]
  }
  
  @scala.inline
  implicit class GattDeviceServiceMutableBuilder[Self <: GattDeviceService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeHandle(value: Double): Self = StObject.set(x, "attributeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDevice(value: BluetoothLEDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllCharacteristics(value: () => IVectorView[GattCharacteristic]): Self = StObject.set(x, "getAllCharacteristics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllIncludedServices(value: () => IVectorView[GattDeviceService]): Self = StObject.set(x, "getAllIncludedServices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCharacteristics(value: String => IVectorView[GattCharacteristic]): Self = StObject.set(x, "getCharacteristics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIncludedServices(value: String => IVectorView[GattDeviceService]): Self = StObject.set(x, "getIncludedServices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParentServices(value: IVectorView[GattDeviceService]): Self = StObject.set(x, "parentServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
