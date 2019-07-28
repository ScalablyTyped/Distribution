package typings.useragent.useragentMod

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
    val __obj = js.Dynamic.literal(android = android, chrome = chrome, firefox = firefox, ie = ie, mobile_safari = mobile_safari, mozilla = mozilla, opera = opera, safari = safari, version = version, webkit = webkit)
  
    __obj.asInstanceOf[Details]
  }
}

