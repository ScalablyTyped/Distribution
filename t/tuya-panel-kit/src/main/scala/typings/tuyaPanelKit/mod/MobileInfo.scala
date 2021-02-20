package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileInfo extends StObject {
  
  var appRnVersion: String = js.native
  
  var appVersion: String = js.native
  
  var celsius: Double = js.native
  
  var countryCode: String = js.native
  
  var ele: String = js.native
  
  var iconfontNameMap: String = js.native
  
  var lang: String = js.native
  
  var lat: String = js.native
  
  var lon: String = js.native
  
  var os: String = js.native
  
  var osSystem: String = js.native
  
  var phoneCode: String = js.native
  
  var platform: String = js.native
  
  var service: MobileService = js.native
  
  var t: Double = js.native
  
  var timezoneId: String = js.native
  
  var ttid: String = js.native
}
object MobileInfo {
  
  @scala.inline
  def apply(
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
  implicit class MobileInfoMutableBuilder[Self <: MobileInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppRnVersion(value: String): Self = StObject.set(x, "appRnVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCelsius(value: Double): Self = StObject.set(x, "celsius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEle(value: String): Self = StObject.set(x, "ele", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconfontNameMap(value: String): Self = StObject.set(x, "iconfontNameMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLon(value: String): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsSystem(value: String): Self = StObject.set(x, "osSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneCode(value: String): Self = StObject.set(x, "phoneCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: MobileService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneId(value: String): Self = StObject.set(x, "timezoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtid(value: String): Self = StObject.set(x, "ttid", value.asInstanceOf[js.Any])
  }
}
