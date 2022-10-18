package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StringDictionary
import typings.wdioTypes.mod.global.WebdriverIO.WDIODevtoolsOptions
import typings.wdioTypes.mod.global.WebdriverIO.WDIOVSCodeServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VendorExtensions
  extends StObject
     with EdgeCapabilities
     with AppiumW3CCapabilities
     with WDIODevtoolsOptions
     with WDIOVSCodeServiceOptions {
  
  @JSName("browserstack.local")
  var browserstackDotlocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @private
    */
  @JSName("browserstack.wdioService")
  var browserstackDotwdioService: js.UndefOr[String] = js.undefined
  
  @JSName("bstack:options")
  var bstackColonoptions: js.UndefOr[BrowserStackCapabilities] = js.undefined
  
  @JSName("experitest:accessKey")
  var experitestColonaccessKey: js.UndefOr[String] = js.undefined
  
  var firefox_profile: js.UndefOr[String] = js.undefined
  
  @JSName("goog:chromeOptions")
  var googColonchromeOptions: js.UndefOr[ChromeOptions] = js.undefined
  
  @JSName("moon:options")
  var moonColonoptions: js.UndefOr[MoonOptions] = js.undefined
  
  @JSName("moz:debuggerAddress")
  var mozColondebuggerAddress: js.UndefOr[Boolean] = js.undefined
  
  @JSName("moz:firefoxOptions")
  var mozColonfirefoxOptions: js.UndefOr[FirefoxOptions] = js.undefined
  
  @JSName("ms:edgeChromium")
  var msColonedgeChromium: js.UndefOr[MicrosoftEdgeOptions] = js.undefined
  
  @JSName("ms:edgeOptions")
  var msColonedgeOptions: js.UndefOr[MicrosoftEdgeOptions] = js.undefined
  
  @JSName("ms:experimental-webdriver")
  var `msColonexperimental-webdriver`: js.UndefOr[Boolean] = js.undefined
  
  @JSName("ms:waitForAppLaunch")
  var msColonwaitForAppLaunch: js.UndefOr[String] = js.undefined
  
  @JSName("safari.options")
  var safariDotoptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  @JSName("sauce:options")
  var sauceColonoptions: js.UndefOr[SauceLabsCapabilities] = js.undefined
  
  @JSName("sauce:visual")
  var sauceColonvisual: js.UndefOr[SauceLabsVisualCapabilities] = js.undefined
  
  /**
    * Selenium 4.0 Specific
    */
  @JSName("se:cdp")
  var seColoncdp: js.UndefOr[String] = js.undefined
  
  @JSName("selenoid:options")
  var selenoidColonoptions: js.UndefOr[SelenoidOptions] = js.undefined
  
  @JSName("tb:options")
  var tbColonoptions: js.UndefOr[TestingbotCapabilities] = js.undefined
  
  /**
    * @deprecated
    */
  var testobject_api_key: js.UndefOr[String] = js.undefined
}
object VendorExtensions {
  
  inline def apply(): VendorExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorExtensions]
  }
  
  extension [Self <: VendorExtensions](x: Self) {
    
    inline def setBrowserstackDotlocal(value: Boolean): Self = StObject.set(x, "browserstack.local", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotlocalUndefined: Self = StObject.set(x, "browserstack.local", js.undefined)
    
    inline def setBrowserstackDotwdioService(value: String): Self = StObject.set(x, "browserstack.wdioService", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotwdioServiceUndefined: Self = StObject.set(x, "browserstack.wdioService", js.undefined)
    
    inline def setBstackColonoptions(value: BrowserStackCapabilities): Self = StObject.set(x, "bstack:options", value.asInstanceOf[js.Any])
    
    inline def setBstackColonoptionsUndefined: Self = StObject.set(x, "bstack:options", js.undefined)
    
    inline def setExperitestColonaccessKey(value: String): Self = StObject.set(x, "experitest:accessKey", value.asInstanceOf[js.Any])
    
    inline def setExperitestColonaccessKeyUndefined: Self = StObject.set(x, "experitest:accessKey", js.undefined)
    
    inline def setFirefox_profile(value: String): Self = StObject.set(x, "firefox_profile", value.asInstanceOf[js.Any])
    
    inline def setFirefox_profileUndefined: Self = StObject.set(x, "firefox_profile", js.undefined)
    
    inline def setGoogColonchromeOptions(value: ChromeOptions): Self = StObject.set(x, "goog:chromeOptions", value.asInstanceOf[js.Any])
    
    inline def setGoogColonchromeOptionsUndefined: Self = StObject.set(x, "goog:chromeOptions", js.undefined)
    
    inline def setMoonColonoptions(value: MoonOptions): Self = StObject.set(x, "moon:options", value.asInstanceOf[js.Any])
    
    inline def setMoonColonoptionsUndefined: Self = StObject.set(x, "moon:options", js.undefined)
    
    inline def setMozColondebuggerAddress(value: Boolean): Self = StObject.set(x, "moz:debuggerAddress", value.asInstanceOf[js.Any])
    
    inline def setMozColondebuggerAddressUndefined: Self = StObject.set(x, "moz:debuggerAddress", js.undefined)
    
    inline def setMozColonfirefoxOptions(value: FirefoxOptions): Self = StObject.set(x, "moz:firefoxOptions", value.asInstanceOf[js.Any])
    
    inline def setMozColonfirefoxOptionsUndefined: Self = StObject.set(x, "moz:firefoxOptions", js.undefined)
    
    inline def setMsColonedgeChromium(value: MicrosoftEdgeOptions): Self = StObject.set(x, "ms:edgeChromium", value.asInstanceOf[js.Any])
    
    inline def setMsColonedgeChromiumUndefined: Self = StObject.set(x, "ms:edgeChromium", js.undefined)
    
    inline def setMsColonedgeOptions(value: MicrosoftEdgeOptions): Self = StObject.set(x, "ms:edgeOptions", value.asInstanceOf[js.Any])
    
    inline def setMsColonedgeOptionsUndefined: Self = StObject.set(x, "ms:edgeOptions", js.undefined)
    
    inline def `setMsColonexperimental-webdriver`(value: Boolean): Self = StObject.set(x, "ms:experimental-webdriver", value.asInstanceOf[js.Any])
    
    inline def `setMsColonexperimental-webdriverUndefined`: Self = StObject.set(x, "ms:experimental-webdriver", js.undefined)
    
    inline def setMsColonwaitForAppLaunch(value: String): Self = StObject.set(x, "ms:waitForAppLaunch", value.asInstanceOf[js.Any])
    
    inline def setMsColonwaitForAppLaunchUndefined: Self = StObject.set(x, "ms:waitForAppLaunch", js.undefined)
    
    inline def setSafariDotoptions(value: StringDictionary[Any]): Self = StObject.set(x, "safari.options", value.asInstanceOf[js.Any])
    
    inline def setSafariDotoptionsUndefined: Self = StObject.set(x, "safari.options", js.undefined)
    
    inline def setSauceColonoptions(value: SauceLabsCapabilities): Self = StObject.set(x, "sauce:options", value.asInstanceOf[js.Any])
    
    inline def setSauceColonoptionsUndefined: Self = StObject.set(x, "sauce:options", js.undefined)
    
    inline def setSauceColonvisual(value: SauceLabsVisualCapabilities): Self = StObject.set(x, "sauce:visual", value.asInstanceOf[js.Any])
    
    inline def setSauceColonvisualUndefined: Self = StObject.set(x, "sauce:visual", js.undefined)
    
    inline def setSeColoncdp(value: String): Self = StObject.set(x, "se:cdp", value.asInstanceOf[js.Any])
    
    inline def setSeColoncdpUndefined: Self = StObject.set(x, "se:cdp", js.undefined)
    
    inline def setSelenoidColonoptions(value: SelenoidOptions): Self = StObject.set(x, "selenoid:options", value.asInstanceOf[js.Any])
    
    inline def setSelenoidColonoptionsUndefined: Self = StObject.set(x, "selenoid:options", js.undefined)
    
    inline def setTbColonoptions(value: TestingbotCapabilities): Self = StObject.set(x, "tb:options", value.asInstanceOf[js.Any])
    
    inline def setTbColonoptionsUndefined: Self = StObject.set(x, "tb:options", js.undefined)
    
    inline def setTestobject_api_key(value: String): Self = StObject.set(x, "testobject_api_key", value.asInstanceOf[js.Any])
    
    inline def setTestobject_api_keyUndefined: Self = StObject.set(x, "testobject_api_key", js.undefined)
  }
}
