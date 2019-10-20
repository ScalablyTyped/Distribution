package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TestDocument. */
trait TestDocument extends js.Object {
  /** The unique identifier for the configuration. */
  var configuration_id: js.UndefOr[String] = js.undefined
  /** The number of 10-kB chunks of field data that were enriched. This can be used to estimate the cost of running a real ingestion. */
  var enriched_field_units: js.UndefOr[Double] = js.undefined
  /** An array of notice messages about the preview operation. */
  var notices: js.UndefOr[js.Array[Notice]] = js.undefined
  /** Format of the test document. */
  var original_media_type: js.UndefOr[String] = js.undefined
  /** An array of objects that describe each step in the preview process. */
  var snapshots: js.UndefOr[js.Array[DocumentSnapshot]] = js.undefined
  /** Status of the preview operation. */
  var status: js.UndefOr[String] = js.undefined
}

object TestDocument {
  @scala.inline
  def apply(
    configuration_id: String = null,
    enriched_field_units: Int | Double = null,
    notices: js.Array[Notice] = null,
    original_media_type: String = null,
    snapshots: js.Array[DocumentSnapshot] = null,
    status: String = null
  ): TestDocument = {
    val __obj = js.Dynamic.literal()
    if (configuration_id != null) __obj.updateDynamic("configuration_id")(configuration_id)
    if (enriched_field_units != null) __obj.updateDynamic("enriched_field_units")(enriched_field_units.asInstanceOf[js.Any])
    if (notices != null) __obj.updateDynamic("notices")(notices)
    if (original_media_type != null) __obj.updateDynamic("original_media_type")(original_media_type)
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[TestDocument]
  }
}

