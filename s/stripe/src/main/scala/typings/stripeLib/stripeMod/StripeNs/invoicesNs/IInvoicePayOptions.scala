package typings
package stripeLib.stripeMod.StripeNs.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IInvoicePayOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * A payment source to be charged. The source must be the ID of a source
               * belonging to the customer associated with the invoice being paid.
               */
  var source: js.UndefOr[stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptions] = js.undefined
}

