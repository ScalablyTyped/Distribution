package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEDevice
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GATT Primary Service on a Bluetooth device. */
@js.native
trait GattDeviceService extends js.Object {
  
  /** Gets the handle used to uniquely identify GATT-based service attributes as declared on the Bluetooth LE device. */
  var attributeHandle: Double = js.native
  
  /** Releases the resources associated with the GattDeviceService class. This allows other apps to access the resources of the GattDeviceService in question. A GattDeviceService object should not be used after Close is invoked, instead a new GattDeviceService object should be instantiated using the FromIdAsync method. */
  def close(): Unit = js.native
  
  /** Gets the BluetoothLEDevice object describing the device associated with the current GattDeviceService object. */
  var device: BluetoothLEDevice = js.native
  
  /** Get the string that represents the GATT service instance path used to instantiate the GattDeviceService. */
  var deviceId: String = js.native
  
  /**
    * Gets the collection of all characteristics belonging to this GattDeviceService instance.
    * @return The collection of all characteristics belonging to this GattDeviceService instance.
    */
  def getAllCharacteristics(): IVectorView[GattCharacteristic] = js.native
  
  /**
    * Gets the collection of all included services belonging to this GattDeviceService instance.
    * @return The collection of all included services belonging to this GattDeviceService instance.
    */
  def getAllIncludedServices(): IVectorView[GattDeviceService] = js.native
  
  /**
    * Returns a vector of characteristics, that are identified by the specified UUID and belong to this GattDeviceService instance.
    * @param characteristicUuid The UUID for the characteristics to be retrieved.
    * @return A vector of GattCharacteristic objects whose UUIDs match characteristicUuid.
    */
  def getCharacteristics(characteristicUuid: String): IVectorView[GattCharacteristic] = js.native
  
  /**
    * Returns a vector of included services, that are identified by the specified UUID and belong to this GattDeviceService instance.
    * @param serviceUuid The UUID for the included services to be retrieved.
    * @return A vector of included services whose UUIDs match serviceUuid.
    */
  def getIncludedServices(serviceUuid: String): IVectorView[GattDeviceService] = js.native
  
  /** Gets the read-only list of parent services for this service. */
  var parentServices: IVectorView[GattDeviceService] = js.native
  
  /** The GATT Service UUID associated with this GattDeviceService. */
  var uuid: String = js.native
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
  implicit class GattDeviceServiceOps[Self <: GattDeviceService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeHandle(value: Double): Self = this.set("attributeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDevice(value: BluetoothLEDevice): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllCharacteristics(value: () => IVectorView[GattCharacteristic]): Self = this.set("getAllCharacteristics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllIncludedServices(value: () => IVectorView[GattDeviceService]): Self = this.set("getAllIncludedServices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCharacteristics(value: String => IVectorView[GattCharacteristic]): Self = this.set("getCharacteristics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIncludedServices(value: String => IVectorView[GattDeviceService]): Self = this.set("getIncludedServices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParentServices(value: IVectorView[GattDeviceService]): Self = this.set("parentServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
