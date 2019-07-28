package typings.web3.ethAccountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageSignature extends Signature {
  var message: String
  var signature: String
}

object MessageSignature {
  @scala.inline
  def apply(message: String, messageHash: String, r: String, s: String, signature: String, v: String): MessageSignature = {
    val __obj = js.Dynamic.literal(message = message, messageHash = messageHash, r = r, s = s, signature = signature, v = v)
  
    __obj.asInstanceOf[MessageSignature]
  }
}

