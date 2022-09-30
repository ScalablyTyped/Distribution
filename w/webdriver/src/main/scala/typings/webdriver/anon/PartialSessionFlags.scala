package typings.webdriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<webdriver.webdriver/build/types.SessionFlags> */
trait PartialSessionFlags extends StObject {
  
  var isAndroid: js.UndefOr[Boolean] = js.undefined
  
  var isChrome: js.UndefOr[Boolean] = js.undefined
  
  var isDevTools: js.UndefOr[Boolean] = js.undefined
  
  var isFirefox: js.UndefOr[Boolean] = js.undefined
  
  var isIOS: js.UndefOr[Boolean] = js.undefined
  
  var isMobile: js.UndefOr[Boolean] = js.undefined
  
  var isSauce: js.UndefOr[Boolean] = js.undefined
  
  var isSeleniumStandalone: js.UndefOr[Boolean] = js.undefined
  
  var isW3C: js.UndefOr[Boolean] = js.undefined
}
object PartialSessionFlags {
  
  inline def apply(): PartialSessionFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSessionFlags]
  }
  
  extension [Self <: PartialSessionFlags](x: Self) {
    
    inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
    
    inline def setIsAndroidUndefined: Self = StObject.set(x, "isAndroid", js.undefined)
    
    inline def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
    
    inline def setIsChromeUndefined: Self = StObject.set(x, "isChrome", js.undefined)
    
    inline def setIsDevTools(value: Boolean): Self = StObject.set(x, "isDevTools", value.asInstanceOf[js.Any])
    
    inline def setIsDevToolsUndefined: Self = StObject.set(x, "isDevTools", js.undefined)
    
    inline def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
    
    inline def setIsFirefoxUndefined: Self = StObject.set(x, "isFirefox", js.undefined)
    
    inline def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
    
    inline def setIsIOSUndefined: Self = StObject.set(x, "isIOS", js.undefined)
    
    inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
    
    inline def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
    
    inline def setIsSauceUndefined: Self = StObject.set(x, "isSauce", js.undefined)
    
    inline def setIsSeleniumStandalone(value: Boolean): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
    
    inline def setIsSeleniumStandaloneUndefined: Self = StObject.set(x, "isSeleniumStandalone", js.undefined)
    
    inline def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
    
    inline def setIsW3CUndefined: Self = StObject.set(x, "isW3C", js.undefined)
  }
}
