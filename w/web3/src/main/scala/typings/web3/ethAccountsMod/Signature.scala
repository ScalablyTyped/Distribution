package typings.web3.ethAccountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var messageHash: String
  var r: String
  var s: String
  var v: String
}

object Signature {
  @scala.inline
  def apply(messageHash: String, r: String, s: String, v: String): Signature = {
    val __obj = js.Dynamic.literal(messageHash = messageHash, r = r, s = s, v = v)
  
    __obj.asInstanceOf[Signature]
  }
}

