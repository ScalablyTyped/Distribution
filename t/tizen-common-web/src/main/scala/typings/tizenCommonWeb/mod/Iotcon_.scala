package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iotcon_ extends StObject {
  
  /**
    * Adds a listener to receive generated random pin from provisioning tool.
    *
    * @remark Listener's callback only be invoked when provisioning tool tries to register this device using random pin based.
    *
    * If you want to know about provisioning tool and random pin, See [IoTivity provisioning](https://wiki.iotivity.org/provisioning#sample_application).
    *
    * @param successCallback The method to be invoked when random pin is generated.
    *
    * @returns The watchID which can be used to remove the listener.
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def addGeneratedPinListener(successCallback: GeneratedPinCallback): Double
  
  /**
    * The device name of this application.
    */
  var deviceName: String
  
  /**
    * Returns object of Client singleton, which provides methods for working with remote resources.
    *
    * @returns The _Client_ object.
    */
  def getClient(): Client
  
  /**
    * Returns the Server object, which provides methods for managing resources on current device.
    *
    * @returns The _Server_ object.
    */
  def getServer(): Server
  
  /**
    * Returns the number of seconds set as the timeout threshold of asynchronous API.
    *
    * This method returns the common timeout value for methods:
    *
    * [findDeviceInfo](iotcon.html#Client::findDeviceInfo)
    *
    * [findPlatformInfo](iotcon.html#Client::findPlatformInfo)
    *
    * [findResource](iotcon.html#Client::findResource)
    *
    * [methodGet](iotcon.html#RemoteResource::methodGet)
    *
    * [methodPut](iotcon.html#RemoteResource::methodPut)
    *
    * [methodPost](iotcon.html#RemoteResource::methodPost)
    *
    * [methodDelete](iotcon.html#RemoteResource::methodDelete)
    *
    * All asynchronous APIs have the same timeout value, there is no way to have different timeout values at each method.
    * Without a response after the specified time, the mentioned methods would trigger an error callback with TimeoutError.
    *
    * @returns The timeout value in seconds.
    */
  def getTimeout(): Double
  
  /**
    * Connects to the iotcon service. Call this function to start Iotcon.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @remark Recommends to use application local file for CBOR file path.
    *
    * If you want to know about IoTivity security in detail, See [IoTivity security](https://wiki.iotivity.org/iotivity_security).
    *
    * @param filePath The CBOR(Concise Binary Object Representation) file path for handling secure virtual resources.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def initialize(filePath: String): Unit
  
  /**
    * Unregisters the listener and stops receiving generated random pin.
    *
    * @remark Example of using can be find at [addGeneratedPinListener](iotcon.html#Iotcon::addGeneratedPinListener) code example.
    *
    * @param watchId The watchId identifier returned by the addGeneratedPinListener() method.
    *
    * @throws WebAPIException with error type AbortError, if the operation has been stopped or there is no listener with given watchId.
    */
  def removeGeneratedPinListener(watchId: Double): Unit
  
  /**
    * Sets the timeout value, in seconds, of asynchronous APIs.
    *
    * The timeout value is common for methods:
    *
    * [findDeviceInfo](iotcon.html#Client::findDeviceInfo)
    *
    * [findPlatformInfo](iotcon.html#Client::findPlatformInfo)
    *
    * [findResource](iotcon.html#Client::findResource)
    *
    * [methodGet](iotcon.html#RemoteResource::methodGet)
    *
    * [methodPut](iotcon.html#RemoteResource::methodPut)
    *
    * [methodPost](iotcon.html#RemoteResource::methodPost)
    *
    * [methodDelete](iotcon.html#RemoteResource::methodDelete)
    *
    * All asynchronous APIs have the same timeout value, there is no way to have different timeout values at each method.
    * Without a response after the specified time, the mentioned methods would trigger an error callback with TimeoutError.
    *
    * @param timeout Timeout value in seconds (value must range between 1 and 3600 inclusive). The default value is 30.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any input parameter does not contain a valid value.
    */
  def setTimeout(timeout: Double): Unit
}
object Iotcon_ {
  
  inline def apply(
    addGeneratedPinListener: GeneratedPinCallback => Double,
    deviceName: String,
    getClient: () => Client,
    getServer: () => Server,
    getTimeout: () => Double,
    initialize: String => Unit,
    removeGeneratedPinListener: Double => Unit,
    setTimeout: Double => Unit
  ): Iotcon_ = {
    val __obj = js.Dynamic.literal(addGeneratedPinListener = js.Any.fromFunction1(addGeneratedPinListener), deviceName = deviceName.asInstanceOf[js.Any], getClient = js.Any.fromFunction0(getClient), getServer = js.Any.fromFunction0(getServer), getTimeout = js.Any.fromFunction0(getTimeout), initialize = js.Any.fromFunction1(initialize), removeGeneratedPinListener = js.Any.fromFunction1(removeGeneratedPinListener), setTimeout = js.Any.fromFunction1(setTimeout))
    __obj.asInstanceOf[Iotcon_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Iotcon_] (val x: Self) extends AnyVal {
    
    inline def setAddGeneratedPinListener(value: GeneratedPinCallback => Double): Self = StObject.set(x, "addGeneratedPinListener", js.Any.fromFunction1(value))
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setGetClient(value: () => Client): Self = StObject.set(x, "getClient", js.Any.fromFunction0(value))
    
    inline def setGetServer(value: () => Server): Self = StObject.set(x, "getServer", js.Any.fromFunction0(value))
    
    inline def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: String => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setRemoveGeneratedPinListener(value: Double => Unit): Self = StObject.set(x, "removeGeneratedPinListener", js.Any.fromFunction1(value))
    
    inline def setSetTimeout(value: Double => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
  }
}
