package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseOptions extends js.Object {
  /** the request number [1] */
  var request: js.UndefOr[Double] = js.undefined
}

object ResponseOptions {
  @scala.inline
  def apply(request: js.UndefOr[Double] = js.undefined): ResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(request)) __obj.updateDynamic("request")(request.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOptions]
  }
}

