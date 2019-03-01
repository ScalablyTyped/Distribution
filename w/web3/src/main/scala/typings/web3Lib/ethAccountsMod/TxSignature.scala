package typings
package web3Lib.ethAccountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TxSignature extends Signature {
  var rawTransaction: java.lang.String
}

object TxSignature {
  @scala.inline
  def apply(
    messageHash: java.lang.String,
    r: java.lang.String,
    rawTransaction: java.lang.String,
    s: java.lang.String,
    v: java.lang.String
  ): TxSignature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messageHash")(messageHash)
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("rawTransaction")(rawTransaction)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[TxSignature]
  }
}

