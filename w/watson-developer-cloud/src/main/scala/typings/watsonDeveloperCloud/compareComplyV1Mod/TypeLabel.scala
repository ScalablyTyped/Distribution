package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identification of a specific type. */
trait TypeLabel extends js.Object {
  /** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
  var label: js.UndefOr[Label] = js.undefined
  /** One or more hash values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.undefined
}

object TypeLabel {
  @scala.inline
  def apply(label: Label = null, provenance_ids: js.Array[String] = null): TypeLabel = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (provenance_ids != null) __obj.updateDynamic("provenance_ids")(provenance_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeLabel]
  }
}

