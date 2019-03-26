package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInit extends js.Object {
  var headers: js.UndefOr[HeaderInit] = js.undefined
  var status: scala.Double
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseInit {
  @scala.inline
  def apply(status: scala.Double, headers: HeaderInit = null, statusText: java.lang.String = null): ResponseInit = {
    val __obj = js.Dynamic.literal(status = status)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[ResponseInit]
  }
}

