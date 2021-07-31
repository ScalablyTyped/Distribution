package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionFlags extends StObject {
  
  var isAndroid: Boolean
  
  var isChrome: Boolean
  
  var isIOS: Boolean
  
  var isMobile: Boolean
  
  var isSauce: Boolean
  
  var isSeleniumStandalone: Boolean
  
  var isW3C: Boolean
}
object SessionFlags {
  
  @scala.inline
  def apply(
    isAndroid: Boolean,
    isChrome: Boolean,
    isIOS: Boolean,
    isMobile: Boolean,
    isSauce: Boolean,
    isSeleniumStandalone: Boolean,
    isW3C: Boolean
  ): SessionFlags = {
    val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any], isSeleniumStandalone = isSeleniumStandalone.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionFlags]
  }
  
  @scala.inline
  implicit class SessionFlagsMutableBuilder[Self <: SessionFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSeleniumStandalone(value: Boolean): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
  }
}
