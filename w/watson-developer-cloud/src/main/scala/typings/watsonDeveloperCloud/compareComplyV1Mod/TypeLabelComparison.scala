package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identification of a specific type. */
trait TypeLabelComparison extends js.Object {
  /** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
  var label: js.UndefOr[Label] = js.undefined
}

object TypeLabelComparison {
  @scala.inline
  def apply(label: Label = null): TypeLabelComparison = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeLabelComparison]
  }
}

