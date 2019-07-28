package typings.uaDashParserDashJs.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DEVICE extends js.Object {
  var CONSOLE: String
  var EMBEDDED: String
  var MOBILE: String
  var MODEL: String
  var SMARTTV: String
  var TABLET: String
  var TYPE: String
  var VENDOR: String
  var WEARABLE: String
}

object DEVICE {
  @scala.inline
  def apply(
    CONSOLE: String,
    EMBEDDED: String,
    MOBILE: String,
    MODEL: String,
    SMARTTV: String,
    TABLET: String,
    TYPE: String,
    VENDOR: String,
    WEARABLE: String
  ): DEVICE = {
    val __obj = js.Dynamic.literal(CONSOLE = CONSOLE, EMBEDDED = EMBEDDED, MOBILE = MOBILE, MODEL = MODEL, SMARTTV = SMARTTV, TABLET = TABLET, TYPE = TYPE, VENDOR = VENDOR, WEARABLE = WEARABLE)
  
    __obj.asInstanceOf[DEVICE]
  }
}

