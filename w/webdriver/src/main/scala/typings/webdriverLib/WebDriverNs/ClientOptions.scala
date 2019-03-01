package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var capabilities: DesiredCapabilities
  var isAndroid: scala.Boolean
  var isIOS: scala.Boolean
  var isMobile: scala.Boolean
  var isW3C: scala.Boolean
  var sessionId: java.lang.String
}

object ClientOptions {
  @scala.inline
  def apply(
    capabilities: DesiredCapabilities,
    isAndroid: scala.Boolean,
    isIOS: scala.Boolean,
    isMobile: scala.Boolean,
    isW3C: scala.Boolean,
    sessionId: java.lang.String
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capabilities")(capabilities)
    __obj.updateDynamic("isAndroid")(isAndroid)
    __obj.updateDynamic("isIOS")(isIOS)
    __obj.updateDynamic("isMobile")(isMobile)
    __obj.updateDynamic("isW3C")(isW3C)
    __obj.updateDynamic("sessionId")(sessionId)
    __obj.asInstanceOf[ClientOptions]
  }
}

