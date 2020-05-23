package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Summary of the collection usage in the environment. */
trait CollectionUsage extends js.Object {
  /** Number of active collections in the environment. */
  var available: js.UndefOr[Double] = js.undefined
  /** Total number of collections allowed in the environment. */
  var maximum_allowed: js.UndefOr[Double] = js.undefined
}

object CollectionUsage {
  @scala.inline
  def apply(available: js.UndefOr[Double] = js.undefined, maximum_allowed: js.UndefOr[Double] = js.undefined): CollectionUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum_allowed)) __obj.updateDynamic("maximum_allowed")(maximum_allowed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionUsage]
  }
}

