package typings
package useragentLib.useragentMod.UseragentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  var android: scala.Boolean
  var chrome: scala.Boolean
  var firefox: scala.Boolean
  var ie: scala.Boolean
  var mobile_safari: scala.Boolean
  var mozilla: scala.Boolean
  var opera: scala.Boolean
  var safari: scala.Boolean
  var version: java.lang.String
  var webkit: scala.Boolean
}

object Details {
  @scala.inline
  def apply(
    android: scala.Boolean,
    chrome: scala.Boolean,
    firefox: scala.Boolean,
    ie: scala.Boolean,
    mobile_safari: scala.Boolean,
    mozilla: scala.Boolean,
    opera: scala.Boolean,
    safari: scala.Boolean,
    version: java.lang.String,
    webkit: scala.Boolean
  ): Details = {
    val __obj = js.Dynamic.literal(android = android, chrome = chrome, firefox = firefox, ie = ie, mobile_safari = mobile_safari, mozilla = mozilla, opera = opera, safari = safari, version = version, webkit = webkit)
  
    __obj.asInstanceOf[Details]
  }
}

