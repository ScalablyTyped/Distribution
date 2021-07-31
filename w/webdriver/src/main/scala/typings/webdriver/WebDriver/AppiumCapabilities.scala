package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppiumCapabilities extends StObject {
  
  var app: js.UndefOr[String] = js.undefined
  
  var autoWebview: js.UndefOr[Boolean] = js.undefined
  
  var automationName: js.UndefOr[String] = js.undefined
  
  var deviceName: js.UndefOr[String] = js.undefined
  
  var enablePerformanceLogging: js.UndefOr[Boolean] = js.undefined
  
  var eventTimings: js.UndefOr[Boolean] = js.undefined
  
  var fullReset: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var newCommandTimeout: js.UndefOr[Double] = js.undefined
  
  var noReset: js.UndefOr[Boolean] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var platformVersion: js.UndefOr[String] = js.undefined
  
  var printPageSourceOnFindFailure: js.UndefOr[Boolean] = js.undefined
  
  var udid: js.UndefOr[String] = js.undefined
}
object AppiumCapabilities {
  
  @scala.inline
  def apply(): AppiumCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppiumCapabilities]
  }
  
  @scala.inline
  implicit class AppiumCapabilitiesMutableBuilder[Self <: AppiumCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    @scala.inline
    def setAutoWebview(value: Boolean): Self = StObject.set(x, "autoWebview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWebviewUndefined: Self = StObject.set(x, "autoWebview", js.undefined)
    
    @scala.inline
    def setAutomationName(value: String): Self = StObject.set(x, "automationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationNameUndefined: Self = StObject.set(x, "automationName", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setEnablePerformanceLogging(value: Boolean): Self = StObject.set(x, "enablePerformanceLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePerformanceLoggingUndefined: Self = StObject.set(x, "enablePerformanceLogging", js.undefined)
    
    @scala.inline
    def setEventTimings(value: Boolean): Self = StObject.set(x, "eventTimings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimingsUndefined: Self = StObject.set(x, "eventTimings", js.undefined)
    
    @scala.inline
    def setFullReset(value: Boolean): Self = StObject.set(x, "fullReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullResetUndefined: Self = StObject.set(x, "fullReset", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setNewCommandTimeout(value: Double): Self = StObject.set(x, "newCommandTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewCommandTimeoutUndefined: Self = StObject.set(x, "newCommandTimeout", js.undefined)
    
    @scala.inline
    def setNoReset(value: Boolean): Self = StObject.set(x, "noReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResetUndefined: Self = StObject.set(x, "noReset", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    @scala.inline
    def setPrintPageSourceOnFindFailure(value: Boolean): Self = StObject.set(x, "printPageSourceOnFindFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintPageSourceOnFindFailureUndefined: Self = StObject.set(x, "printPageSourceOnFindFailure", js.undefined)
    
    @scala.inline
    def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
  }
}
