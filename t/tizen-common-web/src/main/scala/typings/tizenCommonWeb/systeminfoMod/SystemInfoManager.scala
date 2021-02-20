package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.ADS
import typings.tizenCommonWeb.tizenCommonWebStrings.BATTERY
import typings.tizenCommonWeb.tizenCommonWebStrings.BUILD
import typings.tizenCommonWeb.tizenCommonWebStrings.CAMERA_FLASH
import typings.tizenCommonWeb.tizenCommonWebStrings.CELLULAR_NETWORK
import typings.tizenCommonWeb.tizenCommonWebStrings.CPU
import typings.tizenCommonWeb.tizenCommonWebStrings.DEVICE_ORIENTATION
import typings.tizenCommonWeb.tizenCommonWebStrings.DISPLAY
import typings.tizenCommonWeb.tizenCommonWebStrings.ETHERNET_NETWORK
import typings.tizenCommonWeb.tizenCommonWebStrings.LOCALE
import typings.tizenCommonWeb.tizenCommonWebStrings.MEMORY
import typings.tizenCommonWeb.tizenCommonWebStrings.NETWORK
import typings.tizenCommonWeb.tizenCommonWebStrings.NET_PROXY_NETWORK
import typings.tizenCommonWeb.tizenCommonWebStrings.PANEL
import typings.tizenCommonWeb.tizenCommonWebStrings.PERIPHERAL
import typings.tizenCommonWeb.tizenCommonWebStrings.SERVICE_COUNTRY
import typings.tizenCommonWeb.tizenCommonWebStrings.SIM
import typings.tizenCommonWeb.tizenCommonWebStrings.SOURCE_INFO
import typings.tizenCommonWeb.tizenCommonWebStrings.STORAGE
import typings.tizenCommonWeb.tizenCommonWebStrings.VIDEOSOURCE
import typings.tizenCommonWeb.tizenCommonWebStrings.WIFI_NETWORK
import typings.tizenCommonWeb.tizenMod.ErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoManager extends StObject {
  
  /**
    * Adds a listener to allow tracking of changes in one or more values of a system property.
    *
    * The `ErrorCallback` function can be launched with these error types:
    *   - `NotSupportedError` - If the given `property` is not supported (since Tizen 2.3).
    *   For example, monitoring `CELLULAR_NETWORK` changes is not supported on a device which does not support the telephony feature.
    *
    * There are device properties which never change (for example "BUILD") and properties which do not change on the current platform
    * (for example "DEVICE_ORIENTATION" for some platforms). The `addPropertyValueChangeListener()` method accepts
    * any identifier of these properties, but the listener added for them will not be invoked.
    *
    * @since 2.3
    *
    *
    * @param property The name of the property to retrieve.
    * @condparamprivilege CELLULAR_NETWORK http://tizen.org/privilege/telephony public 2.4
    * @param successCallback Callback function called when the properties are successfully retrieved.
    * @param options An object containing the various options for fetching the properties requested.
    * @param errorCallback Callback function called when an error occurs.
    *
    * @returns An identifier used to clear the watch subscription.
    * @throw WebAPIException `InvalidValuesError`, `SecurityError`, `TypeMismatchError`, `UnknownError`.
    */
  def addPropertyValueArrayChangeListener(
    property: SystemInfoPropertyId | BATTERY | CPU | STORAGE | DISPLAY | DEVICE_ORIENTATION | BUILD | LOCALE | NETWORK | WIFI_NETWORK | ETHERNET_NETWORK | CELLULAR_NETWORK | NET_PROXY_NETWORK | SIM | PERIPHERAL | MEMORY | VIDEOSOURCE | CAMERA_FLASH | ADS | SERVICE_COUNTRY | SOURCE_INFO | PANEL,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    options: js.UndefOr[SystemInfoOptions],
    errorCallback: js.UndefOr[ErrorCallback]
  ): Double = js.native
  
  /**
    * Adds a listener to allow tracking changes in one or more system properties.
    *
    * When called, it immediately returns and then asynchronously starts a watch process defined by the following steps:
    *
    * 1. Register the successCallback to receive system events that the status of the requested properties may have changed.
    * 2. When a system event is successfully received, invoke the associated successCallback with an object containing the property values.
    * 3. Repeat step 2 until removePropertyValueChangeListener function is called.
    *
    * There are device properties which are never changed (e.g. "BUILD") and properties which are not changed on some devices
    * (e.g. "DEVICE_ORIENTATION" in Tizen TV device). The <a href="#SystemInfo::addPropertyValueChangeListener">addPropertyValueChangeListener()</a> method accepts
    * any identifier of these properties, but the listener added for them will not be invoked.
    *
    * The `errorCallback` can be launched with any of these error types:
    *   - NotSupportedError - If the given ***property*** is not supported (since Tizen 2.3).
    *
    *   For example, monitoring ***CELLULAR_NETWORK*** changes is not supported on a device which does not support the telephony feature.
    *
    * @remark The `errorCallback()` is newly added as an optional parameter since Tizen 2.3.
    *
    * @param property The name of the property to retrieve.
    * @condparamprivilege CELLULAR_NETWORK http://tizen.org/privilege/telephony public 2.4
    * @param successCallback Callback function called when the properties are successfully retrieved.
    * @param options An object containing the various options for fetching the properties requested. See <a href="./systeminfo.html#::SystemInfo::SystemInfoOptions">details</a>.
    * @param errorCallback Callback function called when an error occurs.
    *
    * @returns An identifier used to clear the watch subscription.
    *
    * @throw WebAPIException `InvalidValuesError`,`SecurityError`,`TypeMismatchError`,`UnknownError`.
    */
  def addPropertyValueChangeListener(
    property: SystemInfoPropertyId | BATTERY | CPU | STORAGE | DISPLAY | DEVICE_ORIENTATION | BUILD | LOCALE | NETWORK | WIFI_NETWORK | ETHERNET_NETWORK | CELLULAR_NETWORK | NET_PROXY_NETWORK | SIM | PERIPHERAL | MEMORY | VIDEOSOURCE | CAMERA_FLASH | ADS | SERVICE_COUNTRY | SOURCE_INFO | PANEL,
    successCallback: SystemInfoPropertySuccessCallback,
    options: js.UndefOr[SystemInfoOptions],
    errorCallback: js.UndefOr[ErrorCallback]
  ): Double = js.native
  
  /**
    * Gets the amount of memory that is not in use (in bytes).
    *
    * @since 2.3
    *
    * @returns Not used memory in bytes.
    * @throw WebAPIException `UnknownError`.
    */
  def getAvailableMemory(): Double = js.native
  
  /**
    * Gets the capabilities of the device.
    * The function must synchronously acquire the capabilities of the device.
    * @note `deprecated` 2.3 Deprecated since 2.3. Instead, use `getCapability()`.
    *
    * @since 2.0
    * @returns Capabilities of the device.
    * @throw WebAPIException `UnknownError`
    */
  def getCapabilities(): SystemInfoDeviceCapability = js.native
  
  /**
    * Gets a device capability related to a given key.
    *
    * See the available <device capability keys>.
    * The additional keys for the custom device capability are specified by OEMs and vendors.
    *
    * @version 2.3
    *
    * @param key The device capability key for the device or additional custom device capability key specified by OEM.
    * @returns The value of the specified device capability.
    * @throw WebAPIException `UnknownError`
    */
  def getCapability(key: String): js.Any = js.native
  
  /**
    * Gets the number of system property information provided for a particular system property.
    *
    * That is the length of array retrieved by the `getPropertyValueArray()` method for the given property.
    *
    * @since 2.3
    *
    * @param property The name of the system property.
    * @returns The number of property values for the given property. If the property is not supported, 0 is returned.
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    *
    */
  def getCount(property: SystemInfoPropertyId): Double = js.native
  @JSName("getCount")
  def getCount_ADS(property: ADS): Double = js.native
  @JSName("getCount")
  def getCount_BATTERY(property: BATTERY): Double = js.native
  @JSName("getCount")
  def getCount_BUILD(property: BUILD): Double = js.native
  @JSName("getCount")
  def getCount_CAMERAFLASH(property: CAMERA_FLASH): Double = js.native
  @JSName("getCount")
  def getCount_CELLULARNETWORK(property: CELLULAR_NETWORK): Double = js.native
  @JSName("getCount")
  def getCount_CPU(property: CPU): Double = js.native
  @JSName("getCount")
  def getCount_DEVICEORIENTATION(property: DEVICE_ORIENTATION): Double = js.native
  @JSName("getCount")
  def getCount_DISPLAY(property: DISPLAY): Double = js.native
  @JSName("getCount")
  def getCount_ETHERNETNETWORK(property: ETHERNET_NETWORK): Double = js.native
  @JSName("getCount")
  def getCount_LOCALE(property: LOCALE): Double = js.native
  @JSName("getCount")
  def getCount_MEMORY(property: MEMORY): Double = js.native
  @JSName("getCount")
  def getCount_NETPROXYNETWORK(property: NET_PROXY_NETWORK): Double = js.native
  @JSName("getCount")
  def getCount_NETWORK(property: NETWORK): Double = js.native
  @JSName("getCount")
  def getCount_PANEL(property: PANEL): Double = js.native
  @JSName("getCount")
  def getCount_PERIPHERAL(property: PERIPHERAL): Double = js.native
  @JSName("getCount")
  def getCount_SERVICECOUNTRY(property: SERVICE_COUNTRY): Double = js.native
  @JSName("getCount")
  def getCount_SIM(property: SIM): Double = js.native
  @JSName("getCount")
  def getCount_SOURCEINFO(property: SOURCE_INFO): Double = js.native
  @JSName("getCount")
  def getCount_STORAGE(property: STORAGE): Double = js.native
  @JSName("getCount")
  def getCount_VIDEOSOURCE(property: VIDEOSOURCE): Double = js.native
  @JSName("getCount")
  def getCount_WIFINETWORK(property: WIFI_NETWORK): Double = js.native
  
  /**
    * Gets the current value of a specified system property.
    *
    * The function must asynchronously acquire the current value of the requested property. If it is successful,
    * the successCallback must be invoked with an object containing the information provided by the property.
    *
    * The `ErrorCallback` function can be launched with these error types:
    * - `NotSupportedError` - If the given ***property*** is not supported (since Tizen 2.3).
    *
    * @remark If the given ***property*** is not supported, `NotSupportedError` would be passed through a `ErrorCallback()` since Tizen 2.3.
    * @remark If system provides more than one value for the system property, the primary (first) system property is returned through SystemInfoSuccessCallback.
    *
    * @param property The name of the property to retrieve.
    * @condparamprivilege CELLULAR_NETWORK http://tizen.org/privilege/telephony public 2.4
    * @param successCallback Callback function called when the properties are successfully retrieved.
    * @param errorCallback Callback function called when an error occurs while retrieving the properties.
    *
    * @throw WebAPIException `SecurityError`,`TypeMismatchError`,`UnknownError`
    *
    */
  def getPropertyValue(property: SystemInfoPropertyId, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  def getPropertyValue(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Gets the current values of a specified system property.
    * It is recommended that you check if a device provides one or more than one value for a particular system property via `getCount()`
    * If one particular system property is provided on a device, it returns an array containing one SystemInfoProperty object through `SystemInfoPropertyArraySuccessCallback` method.
    * If more than one particular system property is provided, multiple SystemInfoProperty objects are returned.
    * The `ErrorCallback` function can be launched with these error types:
    * - `NotSupportedError` : If the given ***property*** is not supported.
    *
    * @since 2.3
    *
    * @remark See `getCount()`
    *
    * @param property The name of the property to retrieve.
    * @condparamprivilege CELLULAR_NETWORK http://tizen.org/privilege/telephony public 2.4
    * @param successCallback Callback function called when the properties are successfully retrieved.
    * @param errorCallback Callback function called when an error occurs while retrieving the properties.
    * @throw WebAPIException `SecurityError`, `TypeMismatchError`.
    */
  def getPropertyValueArray(property: SystemInfoPropertyId, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  def getPropertyValueArray(
    property: SystemInfoPropertyId,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_ADS(property: ADS, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_ADS(
    property: ADS,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_BATTERY(property: BATTERY, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_BATTERY(
    property: BATTERY,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_BUILD(property: BUILD, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_BUILD(
    property: BUILD,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_CAMERAFLASH(property: CAMERA_FLASH, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_CAMERAFLASH(
    property: CAMERA_FLASH,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_CELLULARNETWORK(property: CELLULAR_NETWORK, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_CELLULARNETWORK(
    property: CELLULAR_NETWORK,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_CPU(property: CPU, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_CPU(
    property: CPU,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_DEVICEORIENTATION(property: DEVICE_ORIENTATION, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_DEVICEORIENTATION(
    property: DEVICE_ORIENTATION,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_DISPLAY(property: DISPLAY, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_DISPLAY(
    property: DISPLAY,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_ETHERNETNETWORK(property: ETHERNET_NETWORK, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_ETHERNETNETWORK(
    property: ETHERNET_NETWORK,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_LOCALE(property: LOCALE, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_LOCALE(
    property: LOCALE,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_MEMORY(property: MEMORY, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_MEMORY(
    property: MEMORY,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_NETPROXYNETWORK(property: NET_PROXY_NETWORK, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_NETPROXYNETWORK(
    property: NET_PROXY_NETWORK,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_NETWORK(property: NETWORK, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_NETWORK(
    property: NETWORK,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_PANEL(property: PANEL, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_PANEL(
    property: PANEL,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_PERIPHERAL(property: PERIPHERAL, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_PERIPHERAL(
    property: PERIPHERAL,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_SERVICECOUNTRY(property: SERVICE_COUNTRY, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_SERVICECOUNTRY(
    property: SERVICE_COUNTRY,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_SIM(property: SIM, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_SIM(
    property: SIM,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_SOURCEINFO(property: SOURCE_INFO, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_SOURCEINFO(
    property: SOURCE_INFO,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_STORAGE(property: STORAGE, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_STORAGE(
    property: STORAGE,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_VIDEOSOURCE(property: VIDEOSOURCE, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_VIDEOSOURCE(
    property: VIDEOSOURCE,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_WIFINETWORK(property: WIFI_NETWORK, successCallback: SystemInfoPropertyArraySuccessCallback): Unit = js.native
  @JSName("getPropertyValueArray")
  def getPropertyValueArray_WIFINETWORK(
    property: WIFI_NETWORK,
    successCallback: SystemInfoPropertyArraySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  @JSName("getPropertyValue")
  def getPropertyValue_ADS(property: ADS, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_ADS(property: ADS, successCallback: SystemInfoPropertySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_BATTERY(property: BATTERY, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_BATTERY(
    property: BATTERY,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_BUILD(property: BUILD, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_BUILD(property: BUILD, successCallback: SystemInfoPropertySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_CAMERAFLASH(property: CAMERA_FLASH, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_CAMERAFLASH(
    property: CAMERA_FLASH,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_CELLULARNETWORK(property: CELLULAR_NETWORK, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_CELLULARNETWORK(
    property: CELLULAR_NETWORK,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_CPU(property: CPU, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_CPU(property: CPU, successCallback: SystemInfoPropertySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_DEVICEORIENTATION(property: DEVICE_ORIENTATION, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_DEVICEORIENTATION(
    property: DEVICE_ORIENTATION,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_DISPLAY(property: DISPLAY, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_DISPLAY(
    property: DISPLAY,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_ETHERNETNETWORK(property: ETHERNET_NETWORK, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_ETHERNETNETWORK(
    property: ETHERNET_NETWORK,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_LOCALE(property: LOCALE, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_LOCALE(property: LOCALE, successCallback: SystemInfoPropertySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_MEMORY(property: MEMORY, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_MEMORY(property: MEMORY, successCallback: SystemInfoPropertySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_NETPROXYNETWORK(property: NET_PROXY_NETWORK, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_NETPROXYNETWORK(
    property: NET_PROXY_NETWORK,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_NETWORK(property: NETWORK, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_NETWORK(
    property: NETWORK,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_PANEL(property: PANEL, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_PANEL(property: PANEL, successCallback: SystemInfoPropertySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_PERIPHERAL(property: PERIPHERAL, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_PERIPHERAL(
    property: PERIPHERAL,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_SERVICECOUNTRY(property: SERVICE_COUNTRY, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_SERVICECOUNTRY(
    property: SERVICE_COUNTRY,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_SIM(property: SIM, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_SIM(property: SIM, successCallback: SystemInfoPropertySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_SOURCEINFO(property: SOURCE_INFO, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_SOURCEINFO(
    property: SOURCE_INFO,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_STORAGE(property: STORAGE, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_STORAGE(
    property: STORAGE,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_VIDEOSOURCE(property: VIDEOSOURCE, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_VIDEOSOURCE(
    property: VIDEOSOURCE,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_WIFINETWORK(property: WIFI_NETWORK, successCallback: SystemInfoPropertySuccessCallback): Unit = js.native
  @JSName("getPropertyValue")
  def getPropertyValue_WIFINETWORK(
    property: WIFI_NETWORK,
    successCallback: SystemInfoPropertySuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Gets the total amount of system memory (in bytes).
    *
    * @since 2.3
    *
    * @returns Total system memory.
    * @throw WebAPIException `UnknownError`.
    */
  def getTotalMemory(): Double = js.native
  
  /**
    * Unsubscribes notifications for property changes.
    *
    * If a valid listenerId argument is passed that corresponds to an existing subscription,
    * then the watch process must immediately terminate and no further
    * callback is invoked.
    *
    *
    * @param listenerId An identifier of the subscription returned by the `addPropertyValueChangeListener()` or
    * `addPropertyValueArrayChangeListener()` method.
    *
    * @throw WebAPIException `InvalidValuesError`, `TypeMismatchError`, `UnknownError`.
    */
  def removePropertyValueChangeListener(listenerId: Double): Unit = js.native
}
