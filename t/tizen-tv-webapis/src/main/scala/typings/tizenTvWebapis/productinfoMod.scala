package typings.tizenTvWebapis

import typings.tizenTvWebapis.anon.CONFIGKEYDATASERVICE
import typings.tizenTvWebapis.anon.NOGLASS3DNOTSUPPORTED
import typings.tizenTvWebapis.anon.SITYPEDEVELOPINGSERVER
import typings.tizenTvWebapis.webapisMod.ErrorCallback
import typings.tizenTvWebapis.webapisMod.SuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productinfoMod {
  
  @js.native
  sealed trait ProductInfoConfigKey extends StObject
  @JSImport("tizen-tv-webapis/productinfo", "ProductInfoConfigKey")
  @js.native
  object ProductInfoConfigKey extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProductInfoConfigKey & Double] = js.native
    
    /**
      * Data service configuration, it can be set as string type with numbers
      * @since 2.3
      */
    @js.native
    sealed trait CONFIG_KEY_DATA_SERVICE
      extends StObject
         with ProductInfoConfigKey
    /* 0 */ val CONFIG_KEY_DATA_SERVICE: typings.tizenTvWebapis.productinfoMod.ProductInfoConfigKey.CONFIG_KEY_DATA_SERVICE & Double = js.native
    
    /**
      * Service country, readonly
      * @since 2.3
      */
    @js.native
    sealed trait CONFIG_KEY_SERVICE_COUNTRY
      extends StObject
         with ProductInfoConfigKey
    /* 1 */ val CONFIG_KEY_SERVICE_COUNTRY: typings.tizenTvWebapis.productinfoMod.ProductInfoConfigKey.CONFIG_KEY_SERVICE_COUNTRY & Double = js.native
  }
  
  @js.native
  sealed trait ProductInfoNoGlass3dSupport extends StObject
  @JSImport("tizen-tv-webapis/productinfo", "ProductInfoNoGlass3dSupport")
  @js.native
  object ProductInfoNoGlass3dSupport extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProductInfoNoGlass3dSupport & Double] = js.native
    
    /**
      * Glasses-free 3D is not supported
      * @since 2.3
      */
    @js.native
    sealed trait NO_GLASS_3D_NOT_SUPPORTED
      extends StObject
         with ProductInfoNoGlass3dSupport
    /* 0 */ val NO_GLASS_3D_NOT_SUPPORTED: typings.tizenTvWebapis.productinfoMod.ProductInfoNoGlass3dSupport.NO_GLASS_3D_NOT_SUPPORTED & Double = js.native
    
    /**
      * @descEng Glasses-free 3D is supported
      * @since 2.3
      */
    @js.native
    sealed trait NO_GLASS_3D_SUPPORTED
      extends StObject
         with ProductInfoNoGlass3dSupport
    /* 1 */ val NO_GLASS_3D_SUPPORTED: typings.tizenTvWebapis.productinfoMod.ProductInfoNoGlass3dSupport.NO_GLASS_3D_SUPPORTED & Double = js.native
  }
  
  @js.native
  sealed trait ProductInfoSiServerType extends StObject
  @JSImport("tizen-tv-webapis/productinfo", "ProductInfoSiServerType")
  @js.native
  object ProductInfoSiServerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProductInfoSiServerType & Double] = js.native
    
    /**
      * Developing server
      * @since 2.3
      */
    @js.native
    sealed trait SI_TYPE_DEVELOPING_SERVER
      extends StObject
         with ProductInfoSiServerType
    /* 2 */ val SI_TYPE_DEVELOPING_SERVER: typings.tizenTvWebapis.productinfoMod.ProductInfoSiServerType.SI_TYPE_DEVELOPING_SERVER & Double = js.native
    
    /**
      * Development server
      * @since 2.3
      */
    @js.native
    sealed trait SI_TYPE_DEVELOPMENT_SERVER
      extends StObject
         with ProductInfoSiServerType
    /* 1 */ val SI_TYPE_DEVELOPMENT_SERVER: typings.tizenTvWebapis.productinfoMod.ProductInfoSiServerType.SI_TYPE_DEVELOPMENT_SERVER & Double = js.native
    
    /**
      * Operating server
      * @since 2.3
      */
    @js.native
    sealed trait SI_TYPE_OPERATIING_SERVER
      extends StObject
         with ProductInfoSiServerType
    /* 0 */ val SI_TYPE_OPERATIING_SERVER: typings.tizenTvWebapis.productinfoMod.ProductInfoSiServerType.SI_TYPE_OPERATIING_SERVER & Double = js.native
  }
  
  type ProductInfoConfigChangeCallback = js.Function1[/* key */ ProductInfoConfigKey, Unit]
  
  @js.native
  trait ProductInfoManager extends StObject {
    
    var ProductInfoConfigKey: CONFIGKEYDATASERVICE = js.native
    
    var ProductInfoNoGlass3dSupport: NOGLASS3DNOTSUPPORTED = js.native
    
    var ProductInfoSiServerType: SITYPEDEVELOPINGSERVER = js.native
    
    /**
      * Registers a system configuration change listener.
      * @param key Productinfo configuration key
      * @param listener ProductInfoConfigChangeCallback listener
      * @returns Listener ID
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException TypeMismatchError, InvalidValuesError, SecurityError
      * @since 2.3
      * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
      */
    def addSystemConfigChangeListener(key: ProductInfoConfigKey, listener: ProductInfoConfigChangeCallback): Double = js.native
    
    /**
      * Retrieves the DUID.
      * @returns DUID
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def getDuid(): String = js.native
    
    /**
      * Retrieves the firmware information.
      * @returns Firmware version
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def getFirmware(): String = js.native
    
    /**
      * Retrieves the local set.
      * @returns LocalSet value
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException NotSupportedError, SecurityError
      * @since 2.3
      */
    def getLocalSet(): String = js.native
    
    /**
      * Retrieves the model name, such as "UJS9500".
      * @returns Model name
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def getModel(): String = js.native
    
    /**
      * Retrieves the model code, such as "15_HAWKP".
      * @returns Model code
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def getModelCode(): String = js.native
    
    /**
      * Checks whether glasses-free 3D is supported.
      * @returns NoGlass3dSupport value
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException NotSupportedError, SecurityError
      * @since 2.3
      */
    def getNoGlass3dSupport(): ProductInfoNoGlass3dSupport = js.native
    
    /**
      * Retrieves the full model name, such as UN65JS9500.
      * @returns Model name
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def getRealModel(): String = js.native
    
    /**
      * Retrieves the infolink server type.
      * @returns Infolink server type
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def getSmartTVServerType(): ProductInfoSiServerType = js.native
    
    /**
      * Retrieves the infolink server version, such as "T-INFOLINK2014-1002".
      * @returns Infolink server version
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def getSmartTVServerVersion(): String = js.native
    
    /**
      * Retrieves the value for the specified system configuration key, such as service country code.
      * @param key ProductInfoConfigKey
      * @returns System configuration value
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException TypeMismatchError, InvalidValuesError, SecurityError
      * @since 2.3
      */
    def getSystemConfig(key: ProductInfoConfigKey): String = js.native
    
    /**
      * Retrieves the tuner value from factory information.
      * @returns Tuner value
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException NotSupportedError, SecurityError
      * @since 2.3
      */
    def getTunerEpop(): String = js.native
    
    /**
      * Retrieves the plugin version number.
      * @returns Plugin version
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def getVersion(): String = js.native
    
    /**
      * Checks whether 8K panel is supported.
      * @returns Boolean value:
      * true: Supported
      * false: Not supported
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 4.0
      */
    def is8KPanelSupported(): Boolean = js.native
    
    /**
      * This method check whether display rotator is supported or not.
      * @returns true if display rotator is supported, else false
      * @since 5.5
      */
    def isDisplayRotatorSupported(): Boolean = js.native
    
    /**
      * Checks whether the TV Soccer Mode is enabled.
      * @returns Boolean value:
      * true: Enabled
      * false: Disabled
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException NotSupportedError, SecurityError
      * @since 2.3
      */
    def isSoccerModeEnabled(): Boolean = js.native
    
    /**
      * Checks whether TTV is supported.
      * @returns Boolean value:
      * true: Supported
      * false: Not supported
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def isTtvSupported(): Boolean = js.native
    
    /**
      * Checks whether the device supports Ultra HD Premium features.
      * @returns Boolean value:
      * true: Supported
      * false: Not supported
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 3.0
      */
    def isUHDAModel(): Boolean = js.native
    
    /**
      * Checks whether UdPanel is supported.
      * @returns Boolean value:
      * true: Supported
      * false: Not supported
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 2.3
      */
    def isUdPanelSupported(): Boolean = js.native
    
    /**
      * Checks whether the product model is WALL.
      * @returns Boolean value:
      * true: Wall Model
      * false: Not Wall Model
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException SecurityError
      * @since 5.0
      */
    def isWallModel(): Boolean = js.native
    
    /**
      * Unregister a system configuration change listener.
      * @param key Productinfo configuration key
      * @param listenerId ProductInfoConfigChangeCallback ID
      * @returns void
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException TypeMismatchError, InvalidValuesError, SecurityError
      * @since 2.3
      * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
      */
    def removeSystemConfigChangeListener(listenerId: Double): Unit = js.native
    
    // getSystemConfig: (
    //     key: ProductInfoConfigKey
    // ) => string;
    /**
      * Sets the value for the specified system configuration key.
      * @param key Product info configuration key
      * @param value Value to set
      * @param onsuccess Callback method to invoke when the system configuration key value is successfully set
      * @param onerror Callback method to invoke if an error has occurred
      * @returns void
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/productinfo
      * @throw WebAPIException TypeMismatchError, InvalidValuesError, NotSupportedError, SecurityError
      * @since 2.3
      * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
      */
    def setSystemConfig(key: ProductInfoConfigKey, value: String): Unit = js.native
    def setSystemConfig(key: ProductInfoConfigKey, value: String, onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
    def setSystemConfig(key: ProductInfoConfigKey, value: String, onsuccess: SuccessCallback): Unit = js.native
    def setSystemConfig(key: ProductInfoConfigKey, value: String, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  }
}
