package typings.websiteDashScraper.websiteDashScraperMod

import typings.request.requestMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var headers: Headers
}

object RequestOptions {
  @scala.inline
  def apply(headers: Headers): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[RequestOptions]
  }
}

