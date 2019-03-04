package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedTransaction extends js.Object {
  var raw: java.lang.String
  var tx: web3Lib.Anon_Gas
}

object EncodedTransaction {
  @scala.inline
  def apply(raw: java.lang.String, tx: web3Lib.Anon_Gas): EncodedTransaction = {
    val __obj = js.Dynamic.literal(raw = raw, tx = tx)
  
    __obj.asInstanceOf[EncodedTransaction]
  }
}

