package typings.web3Core.mod

import typings.web3Core.AnonGas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RLPEncodedTransaction extends js.Object {
  var raw: String
  var tx: AnonGas
}

object RLPEncodedTransaction {
  @scala.inline
  def apply(raw: String, tx: AnonGas): RLPEncodedTransaction = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RLPEncodedTransaction]
  }
}

