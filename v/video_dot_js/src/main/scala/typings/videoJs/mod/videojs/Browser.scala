package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browser extends StObject {
  
  var ANDROID_VERSION: Double | Null
  
  var CHROME_VERSION: Double
  
  var IE_VERSION: Double
  
  var IOS_VERSION: Double | Null
  
  var IS_ANDROID: Boolean
  
  var IS_ANY_SAFARI: Boolean
  
  var IS_CHROME: Boolean
  
  var IS_EDGE: Boolean
  
  var IS_IOS: Boolean
  
  var IS_IPAD: Boolean
  
  var IS_IPHONE: Boolean
  
  var IS_IPOD: Boolean
  
  var IS_NATIVE_ANDROID: Boolean
  
  var IS_SAFARI: Boolean
  
  var TOUCH_ENABLED: Boolean
}
object Browser {
  
  @scala.inline
  def apply(
    CHROME_VERSION: Double,
    IE_VERSION: Double,
    IS_ANDROID: Boolean,
    IS_ANY_SAFARI: Boolean,
    IS_CHROME: Boolean,
    IS_EDGE: Boolean,
    IS_IOS: Boolean,
    IS_IPAD: Boolean,
    IS_IPHONE: Boolean,
    IS_IPOD: Boolean,
    IS_NATIVE_ANDROID: Boolean,
    IS_SAFARI: Boolean,
    TOUCH_ENABLED: Boolean
  ): Browser = {
    val __obj = js.Dynamic.literal(CHROME_VERSION = CHROME_VERSION.asInstanceOf[js.Any], IE_VERSION = IE_VERSION.asInstanceOf[js.Any], IS_ANDROID = IS_ANDROID.asInstanceOf[js.Any], IS_ANY_SAFARI = IS_ANY_SAFARI.asInstanceOf[js.Any], IS_CHROME = IS_CHROME.asInstanceOf[js.Any], IS_EDGE = IS_EDGE.asInstanceOf[js.Any], IS_IOS = IS_IOS.asInstanceOf[js.Any], IS_IPAD = IS_IPAD.asInstanceOf[js.Any], IS_IPHONE = IS_IPHONE.asInstanceOf[js.Any], IS_IPOD = IS_IPOD.asInstanceOf[js.Any], IS_NATIVE_ANDROID = IS_NATIVE_ANDROID.asInstanceOf[js.Any], IS_SAFARI = IS_SAFARI.asInstanceOf[js.Any], TOUCH_ENABLED = TOUCH_ENABLED.asInstanceOf[js.Any], ANDROID_VERSION = null, IOS_VERSION = null)
    __obj.asInstanceOf[Browser]
  }
  
  @scala.inline
  implicit class BrowserMutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setANDROID_VERSION(value: Double): Self = StObject.set(x, "ANDROID_VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANDROID_VERSIONNull: Self = StObject.set(x, "ANDROID_VERSION", null)
    
    @scala.inline
    def setCHROME_VERSION(value: Double): Self = StObject.set(x, "CHROME_VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIE_VERSION(value: Double): Self = StObject.set(x, "IE_VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOS_VERSION(value: Double): Self = StObject.set(x, "IOS_VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOS_VERSIONNull: Self = StObject.set(x, "IOS_VERSION", null)
    
    @scala.inline
    def setIS_ANDROID(value: Boolean): Self = StObject.set(x, "IS_ANDROID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_ANY_SAFARI(value: Boolean): Self = StObject.set(x, "IS_ANY_SAFARI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_CHROME(value: Boolean): Self = StObject.set(x, "IS_CHROME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_EDGE(value: Boolean): Self = StObject.set(x, "IS_EDGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_IOS(value: Boolean): Self = StObject.set(x, "IS_IOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_IPAD(value: Boolean): Self = StObject.set(x, "IS_IPAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_IPHONE(value: Boolean): Self = StObject.set(x, "IS_IPHONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_IPOD(value: Boolean): Self = StObject.set(x, "IS_IPOD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_NATIVE_ANDROID(value: Boolean): Self = StObject.set(x, "IS_NATIVE_ANDROID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_SAFARI(value: Boolean): Self = StObject.set(x, "IS_SAFARI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOUCH_ENABLED(value: Boolean): Self = StObject.set(x, "TOUCH_ENABLED", value.asInstanceOf[js.Any])
  }
}
