package typings
package websiteDashScraperLib.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var headers: requestLib.requestMod.Headers
}

object RequestOptions {
  @scala.inline
  def apply(headers: requestLib.requestMod.Headers): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[RequestOptions]
  }
}

