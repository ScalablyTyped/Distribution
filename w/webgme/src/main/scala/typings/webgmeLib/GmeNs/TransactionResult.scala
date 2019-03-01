package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionResult extends js.Object {
  var hash: java.lang.String
  /**
    * may be: 'SYNCED' or 'FORKED'
    */
  var status: java.lang.String
}

object TransactionResult {
  @scala.inline
  def apply(hash: java.lang.String, status: java.lang.String): TransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[TransactionResult]
  }
}

