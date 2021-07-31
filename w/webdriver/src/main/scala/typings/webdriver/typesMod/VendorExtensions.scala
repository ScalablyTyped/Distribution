package typings.webdriver.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VendorExtensions
  extends StObject
     with EdgeCapabilities {
  
  @JSName("bstack:options")
  var bstackColonoptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  @JSName("goog:chromeOptions")
  var googColonchromeOptions: js.UndefOr[ChromeOptions] = js.undefined
  
  @JSName("moz:firefoxOptions")
  var mozColonfirefoxOptions: js.UndefOr[FirefoxOptions] = js.undefined
  
  @JSName("ms:edgeChromium")
  var msColonedgeChromium: js.UndefOr[MicrosoftEdgeOptions] = js.undefined
  
  @JSName("ms:edgeOptions")
  var msColonedgeOptions: js.UndefOr[MicrosoftEdgeOptions] = js.undefined
  
  @JSName("safari.options")
  var safariDotoptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  @JSName("sauce:options")
  var sauceColonoptions: js.UndefOr[SauceLabsCapabilities] = js.undefined
  
  @JSName("selenoid:options")
  var selenoidColonoptions: js.UndefOr[SelenoidOptions] = js.undefined
  
  @JSName("tb:options")
  var tbColonoptions: js.UndefOr[TestingbotCapabilities] = js.undefined
}
object VendorExtensions {
  
  @scala.inline
  def apply(): VendorExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorExtensions]
  }
  
  @scala.inline
  implicit class VendorExtensionsMutableBuilder[Self <: VendorExtensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstackColonoptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "bstack:options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBstackColonoptionsUndefined: Self = StObject.set(x, "bstack:options", js.undefined)
    
    @scala.inline
    def setGoogColonchromeOptions(value: ChromeOptions): Self = StObject.set(x, "goog:chromeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogColonchromeOptionsUndefined: Self = StObject.set(x, "goog:chromeOptions", js.undefined)
    
    @scala.inline
    def setMozColonfirefoxOptions(value: FirefoxOptions): Self = StObject.set(x, "moz:firefoxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColonfirefoxOptionsUndefined: Self = StObject.set(x, "moz:firefoxOptions", js.undefined)
    
    @scala.inline
    def setMsColonedgeChromium(value: MicrosoftEdgeOptions): Self = StObject.set(x, "ms:edgeChromium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsColonedgeChromiumUndefined: Self = StObject.set(x, "ms:edgeChromium", js.undefined)
    
    @scala.inline
    def setMsColonedgeOptions(value: MicrosoftEdgeOptions): Self = StObject.set(x, "ms:edgeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsColonedgeOptionsUndefined: Self = StObject.set(x, "ms:edgeOptions", js.undefined)
    
    @scala.inline
    def setSafariDotoptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "safari.options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariDotoptionsUndefined: Self = StObject.set(x, "safari.options", js.undefined)
    
    @scala.inline
    def setSauceColonoptions(value: SauceLabsCapabilities): Self = StObject.set(x, "sauce:options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSauceColonoptionsUndefined: Self = StObject.set(x, "sauce:options", js.undefined)
    
    @scala.inline
    def setSelenoidColonoptions(value: SelenoidOptions): Self = StObject.set(x, "selenoid:options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelenoidColonoptionsUndefined: Self = StObject.set(x, "selenoid:options", js.undefined)
    
    @scala.inline
    def setTbColonoptions(value: TestingbotCapabilities): Self = StObject.set(x, "tb:options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbColonoptionsUndefined: Self = StObject.set(x, "tb:options", js.undefined)
  }
}
