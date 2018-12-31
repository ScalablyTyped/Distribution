package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlanListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * Only return plans that are active or inactive (e.g., pass false to list all inactive products).
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only return plans for the given product.
    */
  var product: js.UndefOr[java.lang.String] = js.undefined
}

