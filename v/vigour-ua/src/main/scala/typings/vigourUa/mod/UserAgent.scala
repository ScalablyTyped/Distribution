package typings.vigourUa.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgent extends /* value */ StringDictionary[String | Double] {
  var browser: String
  var prefix: String
  var version: Double
}

object UserAgent {
  @scala.inline
  def apply(
    browser: String,
    prefix: String,
    version: Double,
    StringDictionary: /* key */ StringDictionary[String | Double] = null
  ): UserAgent = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[UserAgent]
  }
}

