package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** echo request ID, useful to track asynchronous requests */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(requestId: java.lang.String = null): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[RequestOptions]
  }
}

