package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --系统信息
trait SystemInfo extends StObject {
  
  /**
    * 客户端基础库版本
    */
  var SDKVersion: String
  
  /**
    * 电量，范围 1 - 100
    */
  var battery: Double
  
  /**
    * 性能等级
    */
  var benchmarkLevel: Double
  
  /**
    * 手机品牌
    */
  var brand: String
  
  /**
    * 用户字体大小设置。以“我-设置-通用-字体大小”中的设置为准，单位 px。
    */
  var fontSizeSetting: String
  
  /**
    * 微信设置的语言
    */
  var language: String
  
  /**
    * 手机型号
    */
  var model: String
  
  /**
    * 设备像素比
    */
  var pixelRatio: Double
  
  /**
    * 客户端平台
    */
  var platform: String
  
  /**
    * 屏幕高度
    */
  var screenHeight: Double
  
  /**
    * 屏幕宽度
    */
  var screenWidth: Double
  
  /**
    * 操作系统版本
    */
  var system: String
  
  /**
    * 微信版本号
    */
  var version: String
  
  /**
    * wifi 信号强度，范围 0 - 4
    */
  var wifiSignal: Double
  
  /**
    * 可使用窗口高度
    */
  var windowHeight: Double
  
  /**
    * 可使用窗口宽度
    */
  var windowWidth: Double
}
object SystemInfo {
  
  inline def apply(
    SDKVersion: String,
    battery: Double,
    benchmarkLevel: Double,
    brand: String,
    fontSizeSetting: String,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: String,
    screenHeight: Double,
    screenWidth: Double,
    system: String,
    version: String,
    wifiSignal: Double,
    windowHeight: Double,
    windowWidth: Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion.asInstanceOf[js.Any], battery = battery.asInstanceOf[js.Any], benchmarkLevel = benchmarkLevel.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], wifiSignal = wifiSignal.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
  
  extension [Self <: SystemInfo](x: Self) {
    
    inline def setBattery(value: Double): Self = StObject.set(x, "battery", value.asInstanceOf[js.Any])
    
    inline def setBenchmarkLevel(value: Double): Self = StObject.set(x, "benchmarkLevel", value.asInstanceOf[js.Any])
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setFontSizeSetting(value: String): Self = StObject.set(x, "fontSizeSetting", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setSDKVersion(value: String): Self = StObject.set(x, "SDKVersion", value.asInstanceOf[js.Any])
    
    inline def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
    
    inline def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWifiSignal(value: Double): Self = StObject.set(x, "wifiSignal", value.asInstanceOf[js.Any])
    
    inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
