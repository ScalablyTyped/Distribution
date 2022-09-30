package typings.webdriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAndroid extends StObject {
  
  var isAndroid: Value
  
  var isChrome: Value
  
  var isFirefox: Value
  
  var isIOS: Value
  
  var isMobile: Value
  
  var isSauce: Value
  
  var isSeleniumStandalone: Value
  
  var isW3C: Value
}
object IsAndroid {
  
  inline def apply(
    isAndroid: Value,
    isChrome: Value,
    isFirefox: Value,
    isIOS: Value,
    isMobile: Value,
    isSauce: Value,
    isSeleniumStandalone: Value,
    isW3C: Value
  ): IsAndroid = {
    val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any], isSeleniumStandalone = isSeleniumStandalone.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAndroid]
  }
  
  extension [Self <: IsAndroid](x: Self) {
    
    inline def setIsAndroid(value: Value): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
    
    inline def setIsChrome(value: Value): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
    
    inline def setIsFirefox(value: Value): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
    
    inline def setIsIOS(value: Value): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
    
    inline def setIsMobile(value: Value): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setIsSauce(value: Value): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
    
    inline def setIsSeleniumStandalone(value: Value): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
    
    inline def setIsW3C(value: Value): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
  }
}
