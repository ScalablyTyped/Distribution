package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information defining an element's subject matter. */
trait CategoryComparison extends js.Object {
  /** The category of the associated element. */
  var label: js.UndefOr[String] = js.undefined
}

object CategoryComparison {
  @scala.inline
  def apply(label: String = null): CategoryComparison = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[CategoryComparison]
  }
}

