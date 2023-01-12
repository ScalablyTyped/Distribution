package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileInfo extends StObject {
  
  var appRnVersion: String
  
  var appVersion: String
  
  var celsius: Double
  
  var countryCode: String
  
  var ele: String
  
  var iconfontNameMap: String
  
  var lang: String
  
  var lat: String
  
  var lon: String
  
  var os: String
  
  var osSystem: String
  
  var phoneCode: String
  
  var platform: String
  
  var service: MobileService
  
  var t: Double
  
  var timezoneId: String
  
  var ttid: String
}
object MobileInfo {
  
  inline def apply(
    appRnVersion: String,
    appVersion: String,
    celsius: Double,
    countryCode: String,
    ele: String,
    iconfontNameMap: String,
    lang: String,
    lat: String,
    lon: String,
    os: String,
    osSystem: String,
    phoneCode: String,
    platform: String,
    service: MobileService,
    t: Double,
    timezoneId: String,
    ttid: String
  ): MobileInfo = {
    val __obj = js.Dynamic.literal(appRnVersion = appRnVersion.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], celsius = celsius.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], ele = ele.asInstanceOf[js.Any], iconfontNameMap = iconfontNameMap.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], osSystem = osSystem.asInstanceOf[js.Any], phoneCode = phoneCode.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], timezoneId = timezoneId.asInstanceOf[js.Any], ttid = ttid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileInfo] (val x: Self) extends AnyVal {
    
    inline def setAppRnVersion(value: String): Self = StObject.set(x, "appRnVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setCelsius(value: Double): Self = StObject.set(x, "celsius", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setEle(value: String): Self = StObject.set(x, "ele", value.asInstanceOf[js.Any])
    
    inline def setIconfontNameMap(value: String): Self = StObject.set(x, "iconfontNameMap", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLon(value: String): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsSystem(value: String): Self = StObject.set(x, "osSystem", value.asInstanceOf[js.Any])
    
    inline def setPhoneCode(value: String): Self = StObject.set(x, "phoneCode", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setService(value: MobileService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTimezoneId(value: String): Self = StObject.set(x, "timezoneId", value.asInstanceOf[js.Any])
    
    inline def setTtid(value: String): Self = StObject.set(x, "ttid", value.asInstanceOf[js.Any])
  }
}
