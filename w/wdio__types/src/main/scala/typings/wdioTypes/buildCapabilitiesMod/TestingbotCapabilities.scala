package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestingbotCapabilities extends StObject {
  
  var build: js.UndefOr[String | Double] = js.undefined
  
  var chromedriverVersion: js.UndefOr[String] = js.undefined
  
  var edgedriverVersion: js.UndefOr[String] = js.undefined
  
  var geckodriverVersion: js.UndefOr[String] = js.undefined
  
  var idletimeout: js.UndefOr[Double] = js.undefined
  
  var iedriverVersion: js.UndefOr[String] = js.undefined
  
  var `load-extension`: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var operaDriverVersion: js.UndefOr[String] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var realDevice: js.UndefOr[Boolean] = js.undefined
  
  var `selenium-version`: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("testingbot.geoCountryCode")
  var testingbotDotgeoCountryCode: js.UndefOr[String] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
  
  var `tunnel-identifier`: js.UndefOr[String] = js.undefined
  
  var upload: js.UndefOr[String] = js.undefined
}
object TestingbotCapabilities {
  
  inline def apply(): TestingbotCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingbotCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestingbotCapabilities] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: String | Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setChromedriverVersion(value: String): Self = StObject.set(x, "chromedriverVersion", value.asInstanceOf[js.Any])
    
    inline def setChromedriverVersionUndefined: Self = StObject.set(x, "chromedriverVersion", js.undefined)
    
    inline def setEdgedriverVersion(value: String): Self = StObject.set(x, "edgedriverVersion", value.asInstanceOf[js.Any])
    
    inline def setEdgedriverVersionUndefined: Self = StObject.set(x, "edgedriverVersion", js.undefined)
    
    inline def setGeckodriverVersion(value: String): Self = StObject.set(x, "geckodriverVersion", value.asInstanceOf[js.Any])
    
    inline def setGeckodriverVersionUndefined: Self = StObject.set(x, "geckodriverVersion", js.undefined)
    
    inline def setIdletimeout(value: Double): Self = StObject.set(x, "idletimeout", value.asInstanceOf[js.Any])
    
    inline def setIdletimeoutUndefined: Self = StObject.set(x, "idletimeout", js.undefined)
    
    inline def setIedriverVersion(value: String): Self = StObject.set(x, "iedriverVersion", value.asInstanceOf[js.Any])
    
    inline def setIedriverVersionUndefined: Self = StObject.set(x, "iedriverVersion", js.undefined)
    
    inline def `setLoad-extension`(value: String): Self = StObject.set(x, "load-extension", value.asInstanceOf[js.Any])
    
    inline def `setLoad-extensionUndefined`: Self = StObject.set(x, "load-extension", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperaDriverVersion(value: String): Self = StObject.set(x, "operaDriverVersion", value.asInstanceOf[js.Any])
    
    inline def setOperaDriverVersionUndefined: Self = StObject.set(x, "operaDriverVersion", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setRealDevice(value: Boolean): Self = StObject.set(x, "realDevice", value.asInstanceOf[js.Any])
    
    inline def setRealDeviceUndefined: Self = StObject.set(x, "realDevice", js.undefined)
    
    inline def `setSelenium-version`(value: String): Self = StObject.set(x, "selenium-version", value.asInstanceOf[js.Any])
    
    inline def `setSelenium-versionUndefined`: Self = StObject.set(x, "selenium-version", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTestingbotDotgeoCountryCode(value: String): Self = StObject.set(x, "testingbot.geoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setTestingbotDotgeoCountryCodeUndefined: Self = StObject.set(x, "testingbot.geoCountryCode", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def `setTunnel-identifier`(value: String): Self = StObject.set(x, "tunnel-identifier", value.asInstanceOf[js.Any])
    
    inline def `setTunnel-identifierUndefined`: Self = StObject.set(x, "tunnel-identifier", js.undefined)
    
    inline def setUpload(value: String): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
