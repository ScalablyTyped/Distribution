package typings.web3.ethAccountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TxSignature extends Signature {
  var rawTransaction: String
}

object TxSignature {
  @scala.inline
  def apply(messageHash: String, r: String, rawTransaction: String, s: String, v: String): TxSignature = {
    val __obj = js.Dynamic.literal(messageHash = messageHash, r = r, rawTransaction = rawTransaction, s = s, v = v)
  
    __obj.asInstanceOf[TxSignature]
  }
}

