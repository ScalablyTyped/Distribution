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

