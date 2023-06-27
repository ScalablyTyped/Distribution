package typings.tizenTvWebapis.mod

import typings.tizenTvWebapis.anon.CONFIGKEYDATASERVICE
import typings.tizenTvWebapis.anon.NOGLASS3DNOTSUPPORTED
import typings.tizenTvWebapis.anon.SITYPEDEVELOPINGSERVER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductInfoManager extends StObject {
  
  /**
    * Defines constants for product info configuration keys.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  var ProductInfoConfigKey: CONFIGKEYDATASERVICE = js.native
  
  /**
    * Defines constants for glasses-free 3D support.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  var ProductInfoNoGlass3dSupport: NOGLASS3DNOTSUPPORTED = js.native
  
  /**
    * Defines constants for infolink server types.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  var ProductInfoSiServerType: SITYPEDEVELOPINGSERVER = js.native
  
  /**
    * Registers a system configuration change listener.
    *
    * @param key Productinfo configuration key
    *
    * @param listener ProductInfoConfigChangeCallback listener
    *
    * @returns Listener ID
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value. (Since plugin version 3.0)
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    *
    */
  def addSystemConfigChangeListener(key: ProductInfoConfigKey, listener: ProductInfoConfigChangeCallback): Double = js.native
  
  /**
    * Retrieves the DUID.
    *
    * @returns DUID
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getDuid(): String = js.native
  
  /**
    * Retrieves the firmware information.
    *
    * @returns Firmware version
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getFirmware(): String = js.native
  
  /**
    * Retrieves the local set.
    *
    * @returns LocalSet value
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getLocalSet(): String = js.native
  
  /**
    * Retrieves the model name, such as "UJS9500".
    *
    * @returns Model name
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getModel(): String = js.native
  
  /**
    * Retrieves the model code, such as "15_HAWKP".
    *
    * @returns Model code
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getModelCode(): String = js.native
  
  /**
    * Checks whether glasses-free 3D is supported.
    *
    * @returns NoGlass3dSupport value
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type NotSupportedError, if the device is a BD device.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getNoGlass3dSupport(): ProductInfoNoGlass3dSupport = js.native
  
  /**
    * Retrieves the full model name, such as UN65JS9500.
    *
    * @returns Model name
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getRealModel(): String = js.native
  
  /**
    * Retrieves the infolink server type.
    *
    * @returns Infolink server type
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getSmartTVServerType(): ProductInfoSiServerType = js.native
  
  /**
    * Retrieves the infolink server version, such as "T-INFOLINK2014-1002".
    *
    * @returns Infolink server version
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getSmartTVServerVersion(): String = js.native
  
  /**
    * Retrieves the value for the specified system configuration key, such as service country code.
    *
    * @param key Product info configuration key
    *
    * @returns System configuration value
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value. (Since plugin version 3.0)
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    *
    */
  def getSystemConfig(key: ProductInfoConfigKey): String = js.native
  
  /**
    * Retrieves the tuner value from factory information.
    *
    * @returns Tuner value
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type NotSupportedError, if the device is a BD device.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getTunerEpop(): String = js.native
  
  /**
    * Retrieves the plugin version number.
    *
    * @returns Plugin version
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getVersion(): String = js.native
  
  /**
    * Checks whether 8K panel is supported.
    *
    * @returns Boolean value:
    * true: Supported
    * false: Not supported
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 4.0
    *
    * @version 3.2
    *
    */
  def is8KPanelSupported(): Boolean = js.native
  
  /**
    * This method check whether display rotator is supported or not.
    *
    * @returns true if display rotator is supported, else false
    *
    * @privilegeLevel non-privilege
    *
    * @privilegeName N
    *
    * @throws None N/A
    *
    * @since 5.5
    *
    * @version 3.3
    *
    */
  def isDisplayRotatorSupported(): Boolean = js.native
  
  /**
    * Checks whether the TV Soccer Mode is enabled.
    *
    * @returns Boolean value:
    * true: Enabled
    * false: Disabled
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type NotSupportedError, if the device is a BD device.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def isSoccerModeEnabled(): Boolean = js.native
  
  /**
    * Checks whether TTV is supported.
    *
    * @returns Boolean value:
    * true: Supported
    * false: Not supported
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def isTtvSupported(): Boolean = js.native
  
  /**
    * Checks whether the device supports Ultra HD Premium features.
    *
    * @returns Boolean value:
    * - true: Supported
    * - false: Not supported
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 3.0
    *
    * @version 1.3
    *
    */
  def isUHDAModel(): Boolean = js.native
  
  /**
    * Checks whether UdPanel is supported.
    *
    * @returns Boolean value:
    * true: Supported
    * false: Not supported
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def isUdPanelSupported(): Boolean = js.native
  
  /**
    * Checks whether the product model is WALL.
    *
    * @returns Boolean value:
    * true: Wall Model
    * false: Not Wall Model
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 5.0
    *
    * @version 3.1
    *
    */
  def isWallModel(): Boolean = js.native
  
  /**
    * Unregisters a system configuration change listener.
    *
    * @param listenerId ProductInfoConfigChangeCallback ID
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value. (Since plugin version 3.0)
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def removeSystemConfigChangeListener(listenerId: Double): Unit = js.native
  
  /**
    * Sets the value for the specified system configuration key.
    *
    * @param key Product info configuration key
    *
    * @param value Value to set
    *
    * @param onsuccess Callback method to invoke when the system configuration key value is successfully set
    *
    * @param onerror Callback method to invoke if an error has occurred
    * SecurityError, if the application does not have the privilege to call this method.
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/productinfo
    *
    * @throws WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * If only setSystemConfig can set CONFIG_KEY_DATA_SERVICE or CONFIG_KEY_ACTIVE_CATEGORY (Since plugin version 3.0)
    *
    * @throws WebAPIException with error type NotSupportedError, if 'CONFIG_KEY_SERVICE_COUNTRY' is readonly (Deprecated since plugin version 3.0)
    *
    * @throws WebAPIException with error type NotSupportedError, if 'CONFIG_KEY_SHOPLOGO' is readonly (Deprecated since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    *
    */
  def setSystemConfig(key: ProductInfoConfigKey, value: String): Unit = js.native
  def setSystemConfig(key: ProductInfoConfigKey, value: String, onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def setSystemConfig(key: ProductInfoConfigKey, value: String, onsuccess: SuccessCallback): Unit = js.native
  def setSystemConfig(key: ProductInfoConfigKey, value: String, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
}
