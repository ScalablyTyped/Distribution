package typings
package stripeLib.stripeMod.StripeNs.productsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProductListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  /**
               * Only return products that are active or inactive (e.g. pass false to list all inactive products).
               */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Only return products with the given IDs.
               */
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Only return products that can be shipped (i.e., physical, not digital products).
               */
  var shippable: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Only return products with the given url
               */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

