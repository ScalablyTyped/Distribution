package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDataOptionsWithMetadata extends IDataOptions {
  /**
           * A set of key/value pairs that you can attach to an object. It can be
           * useful for storing additional information about the object in a structured
           * format. You can unset an individual key by setting its value to null and
           * then saving. To clear all keys, set metadata to null, then save.
           */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
}

