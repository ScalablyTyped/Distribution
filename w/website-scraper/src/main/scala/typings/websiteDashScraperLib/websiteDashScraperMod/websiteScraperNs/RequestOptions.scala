package typings
package websiteDashScraperLib.websiteDashScraperMod.websiteScraperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var headers: requestLib.requestMod.requestNs.Headers
}

object RequestOptions {
  @scala.inline
  def apply(headers: requestLib.requestMod.requestNs.Headers): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[RequestOptions]
  }
}

