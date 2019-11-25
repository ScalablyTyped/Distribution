package typings.web3DashCore.web3DashCoreMod

import typings.web3DashCore.Anon_Gas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RLPEncodedTransaction extends js.Object {
  var raw: String
  var tx: Anon_Gas
}

object RLPEncodedTransaction {
  @scala.inline
  def apply(raw: String, tx: Anon_Gas): RLPEncodedTransaction = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RLPEncodedTransaction]
  }
}

