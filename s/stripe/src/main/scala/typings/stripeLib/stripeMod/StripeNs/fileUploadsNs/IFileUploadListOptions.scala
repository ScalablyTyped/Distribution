package typings
package stripeLib.stripeMod.StripeNs.fileUploadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * The file purpose to filter queries by. If none is provided, files will not be
    * filtered by purpose.
    */
  var purpose: IPurpose
}

