package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** NormalizationOperation. */
trait NormalizationOperation extends js.Object {
  /** The destination field for the operation. */
  var destination_field: js.UndefOr[String] = js.undefined
  /** Identifies what type of operation to perform. **copy** - Copies the value of the **source_field** to the **destination_field** field. If the **destination_field** already exists, then the value of the **source_field** overwrites the original value of the **destination_field**. **move** - Renames (moves) the **source_field** to the **destination_field**. If the **destination_field** already exists, then the value of the **source_field** overwrites the original value of the **destination_field**. Rename is identical to copy, except that the **source_field** is removed after the value has been copied to the **destination_field** (it is the same as a _copy_ followed by a _remove_). **merge** - Merges the value of the **source_field** with the value of the **destination_field**. The **destination_field** is converted into an array if it is not already an array, and the value of the **source_field** is appended to the array. This operation removes the **source_field** after the merge. If the **source_field** does not exist in the current document, then the **destination_field** is still converted into an array (if it is not an array already). This conversion ensures the type for **destination_field** is consistent across all documents. **remove** - Deletes the **source_field** field. The **destination_field** is ignored for this operation. **remove_nulls** - Removes all nested null (blank) field values from the ingested document. **source_field** and **destination_field** are ignored by this operation because _remove_nulls_ operates on the entire ingested document. Typically, **remove_nulls** is invoked as the last normalization operation (if it is invoked at all, it can be time-expensive). */
  var operation: js.UndefOr[String] = js.undefined
  /** The source field for the operation. */
  var source_field: js.UndefOr[String] = js.undefined
}

object NormalizationOperation {
  @scala.inline
  def apply(destination_field: String = null, operation: String = null, source_field: String = null): NormalizationOperation = {
    val __obj = js.Dynamic.literal()
    if (destination_field != null) __obj.updateDynamic("destination_field")(destination_field.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (source_field != null) __obj.updateDynamic("source_field")(source_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationOperation]
  }
}

