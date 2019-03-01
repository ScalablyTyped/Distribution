package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrCodeResponse extends js.Object {
  var errCode: scala.Double
}

object ErrCodeResponse {
  @scala.inline
  def apply(errCode: scala.Double): ErrCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errCode")(errCode)
    __obj.asInstanceOf[ErrCodeResponse]
  }
}

