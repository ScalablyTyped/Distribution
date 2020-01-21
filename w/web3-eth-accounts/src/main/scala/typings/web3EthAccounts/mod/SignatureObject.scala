package typings.web3EthAccounts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureObject extends js.Object {
  var messageHash: String
  var r: String
  var s: String
  var v: String
}

object SignatureObject {
  @scala.inline
  def apply(messageHash: String, r: String, s: String, v: String): SignatureObject = {
    val __obj = js.Dynamic.literal(messageHash = messageHash.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignatureObject]
  }
}

