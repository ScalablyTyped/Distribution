package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfo_ extends StObject {
  
  /**
    * Adds a listener to allow tracking of changes in one or more values of a system property.
    *
    * The _ErrorCallback_ function can be launched with these error types:
    *
    * *   NotSupportedError - If the given property is not supported (since Tizen 2.3).
    * For example, monitoring CELLULAR\_NETWORK changes is not supported on a device which does not support the telephony feature.
    *
    *
    *
    * There are device properties which never change (for example "BUILD") and properties which do not change on the current platform
    * (for example "DEVICE\_ORIENTATION" for some platforms). The [addPropertyValueChangeListener()](#SystemInfo::addPropertyValueChangeListener) method accepts
    * any identifier of these properties, but the listener added for them will not be invoked.
    *
    * @since 2.3
    *
    * @param property The name of the property to retrieve.
    * @condparamprivilege CELLULAR\_NETWORK http://tizen.org/privilege/telephony public 2.4
    * @param successCallback Callback function called when the properties are successfully retrieved.
    * @param options An object containing the various options for fetching the properties requested.
    * @param errorCallback Callback function called when an error occurs.
    *
    * @returns An identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value (e.g. the invalid value for _options_).
    * @throw WebAPIException with error type SecurityError, this error is only thrown for CELLULAR\_NETWORK property when an application does not declare _http://tizen.org/privilege/telephony_ privilege in _config.xml_.
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def addPropertyValueArrayChangeListener(property: SystemInfoPropertyId, successCallback: SystemInfoPropertyArraySuccessCallback): Double = js.native
  def addPropertyValueArrayChangeListener(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    options: Null,
    errorCallback: ErrorCallback
  ): Double = js.native
  def addPropertyValueArrayChangeListener(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    options: Unit,
    errorCallback: ErrorCallback
  ): Double = js.native
  def addPropertyValueArrayChangeListener(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    options: SystemInfoOptions
  ): Double = js.native
  def addPropertyValueArrayChangeListener(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    options: SystemInfoOptions,
    errorCallback: ErrorCallback
  ): Double = js.native
  
  /**
    * Adds a listener to allow tracking changes in one or more system properties.
    *
    * When called, it immediately returns and then asynchronously starts a watch process defined by the following steps:
    *
    * 1\. Register the successCallback to receive system events that the status of the requested properties may have changed.
    *
    * 2\. When a system event is successfully received, invoke the associated successCallback with an object containing the property
    * values.
    *
    * 3\. Repeat step 2 until removePropertyValueChangeListener function is called.
    *
    * There are device properties which are never changed (e.g. "BUILD") and properties which are not changed on some devices
    * (e.g. "DEVICE\_ORIENTATION" in Tizen TV device). The [addPropertyValueChangeListener()](#SystemInfo::addPropertyValueChangeListener) method accepts
    * any identifier of these properties, but the listener added for them will not be invoked.
    *
    * The _errorCallback_ can be launched with any of these error types:
    *
    * *   NotSupportedError - If the given property is not supported (since Tizen 2.3).
    * For example, monitoring CELLULAR\_NETWORK changes is not supported on a device which does not support the telephony feature.
    *
    *
    *
    * @remark The _errorCallback()_ is newly added as an optional parameter since Tizen 2.3.
    *
    * @param property The name of the property to retrieve.
    * @condparamprivilege CELLULAR\_NETWORK http://tizen.org/privilege/telephony public 2.4
    * @param successCallback Callback function called when the properties are successfully retrieved.
    * @param options An object containing the various options for fetching the properties requested. See [details](./systeminfo.html#::SystemInfo::SystemInfoOptions).
    * @param errorCallback Callback function called when an error occurs.
    *
    * @returns An identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value (e.g. the invalid value for _options_).
    * @throw WebAPIException with error type SecurityError, this error is only thrown for CELLULAR\_NETWORK property when an application does not declare _http://tizen.org/privilege/telephony_ privilege in _config.xml_.
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def addPropertyValueChangeListener(property: SystemInfoPropertyId, successCallback: SystemInfoPropertySuccessCallback): Double = js.native
  def addPropertyValueChangeListener(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertySuccessCallback,
    options: Null,
    errorCallback: ErrorCallback
  ): Double = js.native
  def addPropertyValueChangeListener(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertySuccessCallback,
    options: Unit,
    errorCallback: ErrorCallback
  ): Double = js.native
  def addPropertyValueChangeListener(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertySuccessCallback,
    options: SystemInfoOptions
  ): Double = js.native
  def addPropertyValueChangeListener(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertySuccessCallback,
    options: SystemInfoOptions,
    errorCallback: ErrorCallback
  ): Double = js.native
  
  /**
    * Gets the amount of memory that is not in use (in bytes).
    *
    * @since 2.3
    *
    * @returns Not used memory in bytes.
    *
    * @throw WebAPIException with error type UnknownError in any error case.
    */
  def getAvailableMemory(): Double = js.native
  
  /**
    * Gets the capabilities of the device.
    *
    * The function must synchronously acquire the capabilities of the device.
    *
    * @note _deprecated_ 2.3 Deprecated since 2.3. Instead, use [getCapability()](#SystemInfo::getCapability).
    *
    * @since 2.0
    *
    * @returns Capabilities of the device.
    *
    * @throw WebAPIException with error type UnknownError in any error case.
    */
  def getCapabilities(): SystemInfoDeviceCapability = js.native
  
  /**
    * Gets a device capability related to a given key.
    *
    * See the available [device capability keys](./systeminfo_capability_keys.html).
    * The additional keys for the custom device capability are specified by OEMs and vendors.
    *
    * @since 2.3
    *
    * @param key The device capability key for the device or additional custom device capability key specified by OEM.
    *
    * @returns The value of the specified device capability.
    *
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def getCapability(key: String): Any = js.native
  
  /**
    * Gets the number of system property information provided for a particular system property.
    *
    * That is the length of array retrieved by the [getPropertyValueArray()](#SystemInfo::getPropertyValueArray) method for the given property.
    *
    * @since 2.3
    *
    * @param property The name of the system property.
    *
    * @returns The number of property values for the given property. If the property is not supported, 0 is returned.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    */
  def getCount(property: SystemInfoPropertyId): Double = js.native
  
  /**
    * Gets the current value of a specified system property.
    *
    * The function must asynchronously acquire the current value of the requested property. If it is successful,
    * the successCallback must be invoked with an object containing the information provided by the property.
    *
    * The _ErrorCallback_ function can be launched with these error types:
    *
    * *   NotSupportedError - If the given property is not supported (since Tizen 2.3).
    *
    *
    * @remark If the given property is not supported, _NotSupportedError_ would be passed through a _ErrorCallback()_ since Tizen 2.3.
    * @remark If system provides more than one value for the system property, the primary (first) system property is returned through SystemInfoSuccessCallback.
    *
    * @param property The name of the property to retrieve.
    * @condparamprivilege CELLULAR\_NETWORK http://tizen.org/privilege/telephony public 2.4
    * @param successCallback Callback function called when the properties are successfully retrieved.
    * @param errorCallback Callback function called when an error occurs while retrieving the properties.
    *
    * @throw WebAPIException with error type SecurityError, this error is only thrown for CELLULAR\_NETWORK property when an application does not declare _http://tizen.org/privilege/telephony_ privilege in _config.xml_.
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def getPropertyValue(property: SystemInfoPropertyId, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  def getPropertyValue(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Gets the current values of a specified system property.
    *
    * It is recommended that you check if a device provides one or more than one value for a particular system property via [getCount()](#SystemInfo::getCount).
    *
    * If one particular system property is provided on a device, it returns an array containing one SystemInfoProperty object through _SystemInfoPropertyArraySuccessCallback_ method.
    * If more than one particular system property is provided, multiple SystemInfoProperty objects are returned.
    *
    * The _ErrorCallback_ function can be launched with these error types:
    *
    * *   NotSupportedError - If the given property is not supported.
    *
    *
    * @since 2.3
    *
    * @remark See [getCount()](#SystemInfo::getCount).
    *
    * @param property The name of the property to retrieve.
    * @condparamprivilege CELLULAR\_NETWORK http://tizen.org/privilege/telephony public 2.4
    * @param successCallback Callback function called when the properties are successfully retrieved.
    * @param errorCallback Callback function called when an error occurs while retrieving the properties.
    *
    * @throw WebAPIException with error type SecurityError, this error is only thrown for CELLULAR\_NETWORK property when an application does not declare _http://tizen.org/privilege/telephony_ privilege in _config.xml_.
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    */
  def getPropertyValueArray(property: SystemInfoPropertyId, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  def getPropertyValueArray(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Gets the total amount of system memory (in bytes).
    *
    * @since 2.3
    *
    * @returns Total system memory.
    *
    * @throw WebAPIException with error type UnknownError in any error case.
    */
  def getTotalMemory(): Double = js.native
  
  /**
    * Unsubscribes notifications for property changes.
    *
    * If a valid listenerId argument is passed that corresponds to an existing subscription,
    * then the watch process must immediately terminate and no further
    * callback is invoked.
    *
    * @param listenerId An identifier of the subscription returned by the [addPropertyValueChangeListener()](#SystemInfo::addPropertyValueChangeListener) or
    * [addPropertyValueArrayChangeListener()](#SystemInfo::addPropertyValueArrayChangeListener) method.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value.
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def removePropertyValueChangeListener(listenerId: Double): Unit = js.native
}
