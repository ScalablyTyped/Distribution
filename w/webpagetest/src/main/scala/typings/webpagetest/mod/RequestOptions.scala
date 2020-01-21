package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** echo request ID, useful to track asynchronous requests */
  var requestId: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(requestId: String = null): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

