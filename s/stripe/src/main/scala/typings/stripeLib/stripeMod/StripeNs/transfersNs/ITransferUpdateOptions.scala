package typings
package stripeLib.stripeMod.StripeNs.transfersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransferUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * An arbitrary string which you can attach to a transfer object. It is
    * displayed when in the web interface alongside the transfer. This
    * can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
}

