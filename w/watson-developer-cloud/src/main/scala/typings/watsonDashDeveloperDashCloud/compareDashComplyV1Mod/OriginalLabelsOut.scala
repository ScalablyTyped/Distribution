package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The original labeling from the input document, without the submitted feedback. */
trait OriginalLabelsOut extends js.Object {
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.UndefOr[js.Array[Category]] = js.undefined
  /** A string identifying the type of modification the feedback entry in the `updated_labels` array. Possible values are `added`, `not_changed`, and `removed`. */
  var modification: js.UndefOr[String] = js.undefined
  /** Description of the action specified by the element and whom it affects. */
  var types: js.UndefOr[js.Array[TypeLabel]] = js.undefined
}

object OriginalLabelsOut {
  @scala.inline
  def apply(
    categories: js.Array[Category] = null,
    modification: String = null,
    types: js.Array[TypeLabel] = null
  ): OriginalLabelsOut = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (modification != null) __obj.updateDynamic("modification")(modification.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalLabelsOut]
  }
}

