package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNonceStr extends js.Object {
  @JSName("package")
  var _package: String
  var nonceStr: String
  var paySign: String
  var signType: String
  var timeStamp: String
}

object AnonNonceStr {
  @scala.inline
  def apply(_package: String, nonceStr: String, paySign: String, signType: String, timeStamp: String): AnonNonceStr = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNonceStr]
  }
}

