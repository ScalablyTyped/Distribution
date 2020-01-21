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
  def apply(available: Int | Double = null, maximum_allowed: Int | Double = null): CollectionUsage = {
    val __obj = js.Dynamic.literal()
    if (available != null) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (maximum_allowed != null) __obj.updateDynamic("maximum_allowed")(maximum_allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionUsage]
  }
}

