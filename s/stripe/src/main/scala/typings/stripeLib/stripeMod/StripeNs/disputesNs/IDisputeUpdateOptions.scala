package typings
package stripeLib.stripeMod.StripeNs.disputesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDisputeUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * Evidence to upload to respond to a dispute. Updating any field in the hash will submit all fields in the hash for review.
               */
  var evidence: js.UndefOr[IDisputeEvidence] = js.undefined
}

