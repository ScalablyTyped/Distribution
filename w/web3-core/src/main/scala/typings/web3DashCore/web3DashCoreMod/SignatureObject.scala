package typings.web3DashCore.web3DashCoreMod

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
    val __obj = js.Dynamic.literal(messageHash = messageHash, r = r, s = s, v = v)
  
    __obj.asInstanceOf[SignatureObject]
  }
}

