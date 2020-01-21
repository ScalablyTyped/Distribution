package typings.useragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  var android: Boolean
  var chrome: Boolean
  var firefox: Boolean
  var ie: Boolean
  var mobile_safari: Boolean
  var mozilla: Boolean
  var opera: Boolean
  var safari: Boolean
  var version: String
  var webkit: Boolean
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
}

