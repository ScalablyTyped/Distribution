package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Browser extends js.Object {
  
  var ANDROID_VERSION: Double | Null = js.native
  
  var CHROME_VERSION: Double = js.native
  
  var IE_VERSION: Double = js.native
  
  var IOS_VERSION: Double | Null = js.native
  
  var IS_ANDROID: Boolean = js.native
  
  var IS_ANY_SAFARI: Boolean = js.native
  
  var IS_CHROME: Boolean = js.native
  
  var IS_EDGE: Boolean = js.native
  
  var IS_IOS: Boolean = js.native
  
  var IS_IPAD: Boolean = js.native
  
  var IS_IPHONE: Boolean = js.native
  
  var IS_IPOD: Boolean = js.native
  
  var IS_NATIVE_ANDROID: Boolean = js.native
  
  var IS_SAFARI: Boolean = js.native
  
  var TOUCH_ENABLED: Boolean = js.native
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
    val __obj = js.Dynamic.literal(CHROME_VERSION = CHROME_VERSION.asInstanceOf[js.Any], IE_VERSION = IE_VERSION.asInstanceOf[js.Any], IS_ANDROID = IS_ANDROID.asInstanceOf[js.Any], IS_ANY_SAFARI = IS_ANY_SAFARI.asInstanceOf[js.Any], IS_CHROME = IS_CHROME.asInstanceOf[js.Any], IS_EDGE = IS_EDGE.asInstanceOf[js.Any], IS_IOS = IS_IOS.asInstanceOf[js.Any], IS_IPAD = IS_IPAD.asInstanceOf[js.Any], IS_IPHONE = IS_IPHONE.asInstanceOf[js.Any], IS_IPOD = IS_IPOD.asInstanceOf[js.Any], IS_NATIVE_ANDROID = IS_NATIVE_ANDROID.asInstanceOf[js.Any], IS_SAFARI = IS_SAFARI.asInstanceOf[js.Any], TOUCH_ENABLED = TOUCH_ENABLED.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
    
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
    def setCHROME_VERSION(value: Double): Self = this.set("CHROME_VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIE_VERSION(value: Double): Self = this.set("IE_VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_ANDROID(value: Boolean): Self = this.set("IS_ANDROID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_ANY_SAFARI(value: Boolean): Self = this.set("IS_ANY_SAFARI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_CHROME(value: Boolean): Self = this.set("IS_CHROME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_EDGE(value: Boolean): Self = this.set("IS_EDGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_IOS(value: Boolean): Self = this.set("IS_IOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_IPAD(value: Boolean): Self = this.set("IS_IPAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_IPHONE(value: Boolean): Self = this.set("IS_IPHONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_IPOD(value: Boolean): Self = this.set("IS_IPOD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_NATIVE_ANDROID(value: Boolean): Self = this.set("IS_NATIVE_ANDROID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIS_SAFARI(value: Boolean): Self = this.set("IS_SAFARI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOUCH_ENABLED(value: Boolean): Self = this.set("TOUCH_ENABLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANDROID_VERSION(value: Double): Self = this.set("ANDROID_VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANDROID_VERSIONNull: Self = this.set("ANDROID_VERSION", null)
    
    @scala.inline
    def setIOS_VERSION(value: Double): Self = this.set("IOS_VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOS_VERSIONNull: Self = this.set("IOS_VERSION", null)
  }
}
