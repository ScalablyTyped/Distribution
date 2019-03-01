package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DEVICE extends js.Object {
  var CONSOLE: java.lang.String
  var EMBEDDED: java.lang.String
  var MOBILE: java.lang.String
  var MODEL: java.lang.String
  var SMARTTV: java.lang.String
  var TABLET: java.lang.String
  var TYPE: java.lang.String
  var VENDOR: java.lang.String
  var WEARABLE: java.lang.String
}

object DEVICE {
  @scala.inline
  def apply(
    CONSOLE: java.lang.String,
    EMBEDDED: java.lang.String,
    MOBILE: java.lang.String,
    MODEL: java.lang.String,
    SMARTTV: java.lang.String,
    TABLET: java.lang.String,
    TYPE: java.lang.String,
    VENDOR: java.lang.String,
    WEARABLE: java.lang.String
  ): DEVICE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CONSOLE")(CONSOLE)
    __obj.updateDynamic("EMBEDDED")(EMBEDDED)
    __obj.updateDynamic("MOBILE")(MOBILE)
    __obj.updateDynamic("MODEL")(MODEL)
    __obj.updateDynamic("SMARTTV")(SMARTTV)
    __obj.updateDynamic("TABLET")(TABLET)
    __obj.updateDynamic("TYPE")(TYPE)
    __obj.updateDynamic("VENDOR")(VENDOR)
    __obj.updateDynamic("WEARABLE")(WEARABLE)
    __obj.asInstanceOf[DEVICE]
  }
}

