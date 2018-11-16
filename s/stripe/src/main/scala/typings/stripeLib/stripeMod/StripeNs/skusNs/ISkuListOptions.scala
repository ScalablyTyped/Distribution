package typings
package stripeLib.stripeMod.StripeNs.skusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISkuListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  /**
               * Only return SKUs that are active or inactive (e.g. pass false to list all inactive products).
               */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Only return SKUs that have the specified key/value pairs in this partially constructed dictionary.
               * Can be specified only if product is also supplied. For instance, if the associated product has
               * attributes ["color", "size"], passing in attributes[color]=red returns all the SKUs for this product
               * that have color set to red.
               */
  var attributes: js.UndefOr[ISkuAttributes] = js.undefined
  /**
               * Only return SKUs with the given IDs.
               */
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Only return SKUs that are either in stock or out of stock (e.g. pass false to list all SKUs that are out of stock).
               * If no value is provided, all SKUs are returned.
               */
  var in_stock: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The ID of the product whose SKUs will be retrieved.
               */
  var product: js.UndefOr[java.lang.String] = js.undefined
}

