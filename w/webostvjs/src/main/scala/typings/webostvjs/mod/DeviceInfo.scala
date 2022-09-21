package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInfo extends StObject {
  
  /**
    * The size of DDR DRAM in Bytes. For example, if the size of DDR DRAM is 3G, the return value is '3G'.
    * On the previous version of webOS TV that does not support this property, return undefined.
    */
  var ddrSize: js.UndefOr[String] = js.undefined
  
  /**
    * Indicate whether the device supports Dolby Atmos.
    * true: The device supports Dolby Atmos.
    * false: The device does not support Dolby Atmos.
    */
  var dolbyAtmos: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicate whether the device supports Dolby Vision.
    * true: The device supports Dolby Vision.
    * false: The device does not support Dolby Vision.
    */
  var dolbyVision: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicate whether the device supports HDR10.
    * true: The device supports HDR10.
    * false: The device does not support HDR10.
    */
  var hdr10: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The model name of the device in UTF-8 format.
    */
  var modelName: String
  
  /**
    * The model name of the device in ASCII format.
    */
  var modelNameAscii: String
  
  /**
    * Indicates whether the display type of device is OLED or not.
    * - true: The display type is OLED.
    * - false: The display type is LCD.
    * On the previous version of webOS TV that does not support this property, return undefined.
    */
  var oled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The screen Height in pixels.
    */
  var screenHeight: Double
  
  /**
    * The screen width in pixels.
    */
  var screenWidth: Double
  
  /**
    * The webOS SDK version.
    */
  var sdkVersion: String
  
  /**
    * Indicates whether the device supports Ultra HD resolution.
    * - true: The device supports Ultra HD resolution.
    * - false: The device does not support Ultra HD resolution.
    */
  var uhd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the device supports 8K UHD resolution.
    * - true: The device supports 8K UHD resolution.
    * - false: The device does not support 8K UHD resolution.
    */
  var uhd8K: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The full name of OS firmware version.
    */
  var version: String
  
  /**
    * The subset of OS version: Revision version number.
    */
  var versionDot: Double
  
  /**
    * The subset of OS version: Major version number.
    */
  var versionMajor: Double
  
  /**
    * The subset of OS version: Minor version number.
    */
  var versionMinor: Double
}
object DeviceInfo {
  
  inline def apply(
    modelName: String,
    modelNameAscii: String,
    screenHeight: Double,
    screenWidth: Double,
    sdkVersion: String,
    version: String,
    versionDot: Double,
    versionMajor: Double,
    versionMinor: Double
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], modelNameAscii = modelNameAscii.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionDot = versionDot.asInstanceOf[js.Any], versionMajor = versionMajor.asInstanceOf[js.Any], versionMinor = versionMinor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
  
  extension [Self <: DeviceInfo](x: Self) {
    
    inline def setDdrSize(value: String): Self = StObject.set(x, "ddrSize", value.asInstanceOf[js.Any])
    
    inline def setDdrSizeUndefined: Self = StObject.set(x, "ddrSize", js.undefined)
    
    inline def setDolbyAtmos(value: Boolean): Self = StObject.set(x, "dolbyAtmos", value.asInstanceOf[js.Any])
    
    inline def setDolbyAtmosUndefined: Self = StObject.set(x, "dolbyAtmos", js.undefined)
    
    inline def setDolbyVision(value: Boolean): Self = StObject.set(x, "dolbyVision", value.asInstanceOf[js.Any])
    
    inline def setDolbyVisionUndefined: Self = StObject.set(x, "dolbyVision", js.undefined)
    
    inline def setHdr10(value: Boolean): Self = StObject.set(x, "hdr10", value.asInstanceOf[js.Any])
    
    inline def setHdr10Undefined: Self = StObject.set(x, "hdr10", js.undefined)
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameAscii(value: String): Self = StObject.set(x, "modelNameAscii", value.asInstanceOf[js.Any])
    
    inline def setOled(value: Boolean): Self = StObject.set(x, "oled", value.asInstanceOf[js.Any])
    
    inline def setOledUndefined: Self = StObject.set(x, "oled", js.undefined)
    
    inline def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
    
    inline def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setUhd(value: Boolean): Self = StObject.set(x, "uhd", value.asInstanceOf[js.Any])
    
    inline def setUhd8K(value: Boolean): Self = StObject.set(x, "uhd8K", value.asInstanceOf[js.Any])
    
    inline def setUhd8KUndefined: Self = StObject.set(x, "uhd8K", js.undefined)
    
    inline def setUhdUndefined: Self = StObject.set(x, "uhd", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionDot(value: Double): Self = StObject.set(x, "versionDot", value.asInstanceOf[js.Any])
    
    inline def setVersionMajor(value: Double): Self = StObject.set(x, "versionMajor", value.asInstanceOf[js.Any])
    
    inline def setVersionMinor(value: Double): Self = StObject.set(x, "versionMinor", value.asInstanceOf[js.Any])
  }
}
