package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The comparison of the two submitted documents. */
trait CompareReturn extends js.Object {
  /** A list of pairs of elements that semantically align between the compared documents. */
  var aligned_elements: js.UndefOr[js.Array[AlignedElement]] = js.undefined
  /** Information about the documents being compared. */
  var documents: js.UndefOr[js.Array[Document]] = js.undefined
  /** The analysis model used to compare the input documents. For the **Compare two documents** method, the only valid value is `contracts`. */
  var model_id: js.UndefOr[String] = js.undefined
  /** The version of the analysis model identified by the value of the `model_id` key. */
  var model_version: js.UndefOr[String] = js.undefined
  /** A list of elements that do not semantically align between the compared documents. */
  var unaligned_elements: js.UndefOr[js.Array[UnalignedElement]] = js.undefined
}

object CompareReturn {
  @scala.inline
  def apply(
    aligned_elements: js.Array[AlignedElement] = null,
    documents: js.Array[Document] = null,
    model_id: String = null,
    model_version: String = null,
    unaligned_elements: js.Array[UnalignedElement] = null
  ): CompareReturn = {
    val __obj = js.Dynamic.literal()
    if (aligned_elements != null) __obj.updateDynamic("aligned_elements")(aligned_elements.asInstanceOf[js.Any])
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (model_id != null) __obj.updateDynamic("model_id")(model_id.asInstanceOf[js.Any])
    if (model_version != null) __obj.updateDynamic("model_version")(model_version.asInstanceOf[js.Any])
    if (unaligned_elements != null) __obj.updateDynamic("unaligned_elements")(unaligned_elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareReturn]
  }
}

