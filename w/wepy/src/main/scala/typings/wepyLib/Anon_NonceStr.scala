package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NonceStr extends js.Object {
  var nonceStr: java.lang.String
  var `package`: java.lang.String
  var paySign: java.lang.String
  var signType: java.lang.String
  var timeStamp: java.lang.String
}

object Anon_NonceStr {
  @scala.inline
  def apply(
    nonceStr: java.lang.String,
    `package`: java.lang.String,
    paySign: java.lang.String,
    signType: java.lang.String,
    timeStamp: java.lang.String
  ): Anon_NonceStr = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr, paySign = paySign, signType = signType, timeStamp = timeStamp)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[Anon_NonceStr]
  }
}

