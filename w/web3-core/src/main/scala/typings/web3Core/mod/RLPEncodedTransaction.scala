package typings.web3Core.mod

import typings.web3Core.anon.Gas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RLPEncodedTransaction extends js.Object {
  var raw: String
  var tx: Gas
}

object RLPEncodedTransaction {
  @scala.inline
  def apply(raw: String, tx: Gas): RLPEncodedTransaction = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[RLPEncodedTransaction]
  }
}

