package typings
package vigourDashUaLib.vigourDashUaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgent
  extends /* value */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] {
  var browser: java.lang.String
  var prefix: java.lang.String
  var version: scala.Double
}

object UserAgent {
  @scala.inline
  def apply(
    browser: java.lang.String,
    prefix: java.lang.String,
    version: scala.Double,
    StringDictionary: /* value */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] = null
  ): UserAgent = {
    val __obj = js.Dynamic.literal(browser = browser, prefix = prefix, version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[UserAgent]
  }
}

