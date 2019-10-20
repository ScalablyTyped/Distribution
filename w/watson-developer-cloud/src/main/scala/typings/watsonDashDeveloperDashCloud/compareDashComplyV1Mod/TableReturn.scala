package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The analysis of the document's tables. */
trait TableReturn extends js.Object {
  /** Information about the parsed input document. */
  var document: js.UndefOr[DocInfo] = js.undefined
  /** The ID of the model used to extract the table contents. The value for table extraction is `tables`. */
  var model_id: js.UndefOr[String] = js.undefined
  /** The version of the `tables` model ID. */
  var model_version: js.UndefOr[String] = js.undefined
  /** Definitions of the tables identified in the input document. */
  var tables: js.UndefOr[js.Array[Tables]] = js.undefined
}

object TableReturn {
  @scala.inline
  def apply(
    document: DocInfo = null,
    model_id: String = null,
    model_version: String = null,
    tables: js.Array[Tables] = null
  ): TableReturn = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    if (model_id != null) __obj.updateDynamic("model_id")(model_id)
    if (model_version != null) __obj.updateDynamic("model_version")(model_version)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    __obj.asInstanceOf[TableReturn]
  }
}

