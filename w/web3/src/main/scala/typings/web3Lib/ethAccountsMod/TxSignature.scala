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
    val __obj = js.Dynamic.literal(messageHash = messageHash, r = r, rawTransaction = rawTransaction, s = s, v = v)
  
    __obj.asInstanceOf[TxSignature]
  }
}

