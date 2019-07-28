package typings.webgme.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionResult extends js.Object {
  var hash: String
  /**
    * may be: 'SYNCED' or 'FORKED'
    */
  var status: String
}

object TransactionResult {
  @scala.inline
  def apply(hash: String, status: String): TransactionResult = {
    val __obj = js.Dynamic.literal(hash = hash, status = status)
  
    __obj.asInstanceOf[TransactionResult]
  }
}

