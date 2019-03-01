package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseOptions extends js.Object {
  /** the request number [1] */
  var request: js.UndefOr[scala.Double] = js.undefined
}

object ResponseOptions {
  @scala.inline
  def apply(request: scala.Int | scala.Double = null): ResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOptions]
  }
}

