package typings
package web3Lib.ethAccountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageSignature extends Signature {
  var message: java.lang.String
  var signature: java.lang.String
}

object MessageSignature {
  @scala.inline
  def apply(
    message: java.lang.String,
    messageHash: java.lang.String,
    r: java.lang.String,
    s: java.lang.String,
    signature: java.lang.String,
    v: java.lang.String
  ): MessageSignature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("messageHash")(messageHash)
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("signature")(signature)
    __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[MessageSignature]
  }
}

