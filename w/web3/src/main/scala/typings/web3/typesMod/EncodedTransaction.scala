package typings.web3.typesMod

import typings.web3.Anon_Gas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedTransaction extends js.Object {
  var raw: String
  var tx: Anon_Gas
}

object EncodedTransaction {
  @scala.inline
  def apply(raw: String, tx: Anon_Gas): EncodedTransaction = {
    val __obj = js.Dynamic.literal(raw = raw, tx = tx)
  
    __obj.asInstanceOf[EncodedTransaction]
  }
}

