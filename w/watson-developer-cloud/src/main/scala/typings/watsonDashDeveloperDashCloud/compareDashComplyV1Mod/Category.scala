package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information defining an element's subject matter. */
trait Category extends js.Object {
  /** The category of the associated element. */
  var label: js.UndefOr[String] = js.undefined
  /** One or more hashed values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.undefined
}

object Category {
  @scala.inline
  def apply(label: String = null, provenance_ids: js.Array[String] = null): Category = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (provenance_ids != null) __obj.updateDynamic("provenance_ids")(provenance_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

