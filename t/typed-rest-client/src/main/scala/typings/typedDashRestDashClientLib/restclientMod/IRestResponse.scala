package typings
package typedDashRestDashClientLib.restclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestResponse[T] extends js.Object {
  var result: T | scala.Null
  var statusCode: scala.Double
}

object IRestResponse {
  @scala.inline
  def apply[T](statusCode: scala.Double, result: T = null): IRestResponse[T] = {
    val __obj = js.Dynamic.literal(statusCode = statusCode)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestResponse[T]]
  }
}

