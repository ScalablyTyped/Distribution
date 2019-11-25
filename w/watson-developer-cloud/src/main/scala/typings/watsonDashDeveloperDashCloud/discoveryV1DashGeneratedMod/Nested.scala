package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Nested. */
trait Nested extends js.Object {
  /** The area of the results the aggregation was restricted to. */
  var path: js.UndefOr[String] = js.undefined
}

object Nested {
  @scala.inline
  def apply(path: String = null): Nested = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nested]
  }
}

