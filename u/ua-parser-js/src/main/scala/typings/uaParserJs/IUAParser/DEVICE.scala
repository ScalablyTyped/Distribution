package typings.uaParserJs.IUAParser

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
    val __obj = js.Dynamic.literal(CONSOLE = CONSOLE.asInstanceOf[js.Any], EMBEDDED = EMBEDDED.asInstanceOf[js.Any], MOBILE = MOBILE.asInstanceOf[js.Any], MODEL = MODEL.asInstanceOf[js.Any], SMARTTV = SMARTTV.asInstanceOf[js.Any], TABLET = TABLET.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any], VENDOR = VENDOR.asInstanceOf[js.Any], WEARABLE = WEARABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEVICE]
  }
}

