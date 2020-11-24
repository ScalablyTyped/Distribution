package typings.useragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Details extends js.Object {
  
  var android: Boolean = js.native
  
  var chrome: Boolean = js.native
  
  var firefox: Boolean = js.native
  
  var ie: Boolean = js.native
  
  var mobile_safari: Boolean = js.native
  
  var mozilla: Boolean = js.native
  
  var opera: Boolean = js.native
  
  var safari: Boolean = js.native
  
  var version: String = js.native
  
  var webkit: Boolean = js.native
}
object Details {
  
  @scala.inline
  def apply(
    android: Boolean,
    chrome: Boolean,
    firefox: Boolean,
    ie: Boolean,
    mobile_safari: Boolean,
    mozilla: Boolean,
    opera: Boolean,
    safari: Boolean,
    version: String,
    webkit: Boolean
  ): Details = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], mobile_safari = mobile_safari.asInstanceOf[js.Any], mozilla = mozilla.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: Boolean): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefox(value: Boolean): Self = this.set("firefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe(value: Boolean): Self = this.set("ie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile_safari(value: Boolean): Self = this.set("mobile_safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozilla(value: Boolean): Self = this.set("mozilla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpera(value: Boolean): Self = this.set("opera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafari(value: Boolean): Self = this.set("safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkit(value: Boolean): Self = this.set("webkit", value.asInstanceOf[js.Any])
  }
}
