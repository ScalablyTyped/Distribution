package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileInfo extends js.Object {
  
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
  implicit class MobileInfoOps[Self <: MobileInfo] (val x: Self) extends AnyVal {
    
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
    def setAppRnVersion(value: String): Self = this.set("appRnVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCelsius(value: Double): Self = this.set("celsius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEle(value: String): Self = this.set("ele", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconfontNameMap(value: String): Self = this.set("iconfontNameMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLat(value: String): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLon(value: String): Self = this.set("lon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsSystem(value: String): Self = this.set("osSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneCode(value: String): Self = this.set("phoneCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: MobileService): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneId(value: String): Self = this.set("timezoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtid(value: String): Self = this.set("ttid", value.asInstanceOf[js.Any])
  }
}
