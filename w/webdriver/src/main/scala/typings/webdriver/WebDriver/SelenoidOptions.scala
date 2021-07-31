package typings.webdriver.WebDriver

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelenoidOptions extends StObject {
  
  var additionalNetworks: js.UndefOr[js.Array[String]] = js.undefined
  
  var applicationContainers: js.UndefOr[js.Array[String]] = js.undefined
  
  var dnsServers: js.UndefOr[js.Array[String]] = js.undefined
  
  var enableLog: js.UndefOr[Boolean] = js.undefined
  
  var enableVNC: js.UndefOr[Boolean] = js.undefined
  
  var enableVideo: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[js.Array[String]] = js.undefined
  
  var hostsEntries: js.UndefOr[js.Array[String]] = js.undefined
  
  var labels: js.UndefOr[Map[String, String]] = js.undefined
  
  var logName: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var s3KeyPattern: js.UndefOr[String] = js.undefined
  
  var screenResolution: js.UndefOr[String] = js.undefined
  
  var sessionTimeout: js.UndefOr[String] = js.undefined
  
  var skin: js.UndefOr[String] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
  
  var videoCodec: js.UndefOr[String] = js.undefined
  
  var videoFrameRate: js.UndefOr[Double] = js.undefined
  
  var videoName: js.UndefOr[String] = js.undefined
  
  var videoScreenSize: js.UndefOr[String] = js.undefined
}
object SelenoidOptions {
  
  @scala.inline
  def apply(): SelenoidOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelenoidOptions]
  }
  
  @scala.inline
  implicit class SelenoidOptionsMutableBuilder[Self <: SelenoidOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalNetworks(value: js.Array[String]): Self = StObject.set(x, "additionalNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalNetworksUndefined: Self = StObject.set(x, "additionalNetworks", js.undefined)
    
    @scala.inline
    def setAdditionalNetworksVarargs(value: String*): Self = StObject.set(x, "additionalNetworks", js.Array(value :_*))
    
    @scala.inline
    def setApplicationContainers(value: js.Array[String]): Self = StObject.set(x, "applicationContainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationContainersUndefined: Self = StObject.set(x, "applicationContainers", js.undefined)
    
    @scala.inline
    def setApplicationContainersVarargs(value: String*): Self = StObject.set(x, "applicationContainers", js.Array(value :_*))
    
    @scala.inline
    def setDnsServers(value: js.Array[String]): Self = StObject.set(x, "dnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsServersUndefined: Self = StObject.set(x, "dnsServers", js.undefined)
    
    @scala.inline
    def setDnsServersVarargs(value: String*): Self = StObject.set(x, "dnsServers", js.Array(value :_*))
    
    @scala.inline
    def setEnableLog(value: Boolean): Self = StObject.set(x, "enableLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLogUndefined: Self = StObject.set(x, "enableLog", js.undefined)
    
    @scala.inline
    def setEnableVNC(value: Boolean): Self = StObject.set(x, "enableVNC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVNCUndefined: Self = StObject.set(x, "enableVNC", js.undefined)
    
    @scala.inline
    def setEnableVideo(value: Boolean): Self = StObject.set(x, "enableVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVideoUndefined: Self = StObject.set(x, "enableVideo", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setHostsEntries(value: js.Array[String]): Self = StObject.set(x, "hostsEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsEntriesUndefined: Self = StObject.set(x, "hostsEntries", js.undefined)
    
    @scala.inline
    def setHostsEntriesVarargs(value: String*): Self = StObject.set(x, "hostsEntries", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: Map[String, String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setS3KeyPattern(value: String): Self = StObject.set(x, "s3KeyPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPatternUndefined: Self = StObject.set(x, "s3KeyPattern", js.undefined)
    
    @scala.inline
    def setScreenResolution(value: String): Self = StObject.set(x, "screenResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenResolutionUndefined: Self = StObject.set(x, "screenResolution", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: String): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    @scala.inline
    def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCodecUndefined: Self = StObject.set(x, "videoCodec", js.undefined)
    
    @scala.inline
    def setVideoFrameRate(value: Double): Self = StObject.set(x, "videoFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoFrameRateUndefined: Self = StObject.set(x, "videoFrameRate", js.undefined)
    
    @scala.inline
    def setVideoName(value: String): Self = StObject.set(x, "videoName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoNameUndefined: Self = StObject.set(x, "videoName", js.undefined)
    
    @scala.inline
    def setVideoScreenSize(value: String): Self = StObject.set(x, "videoScreenSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoScreenSizeUndefined: Self = StObject.set(x, "videoScreenSize", js.undefined)
  }
}
