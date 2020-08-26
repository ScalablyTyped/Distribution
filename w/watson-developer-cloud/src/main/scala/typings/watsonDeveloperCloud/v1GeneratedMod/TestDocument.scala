package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TestDocument. */
@js.native
trait TestDocument extends js.Object {
  /** The unique identifier for the configuration. */
  var configuration_id: js.UndefOr[String] = js.native
  /** The number of 10-kB chunks of field data that were enriched. This can be used to estimate the cost of running a real ingestion. */
  var enriched_field_units: js.UndefOr[Double] = js.native
  /** An array of notice messages about the preview operation. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  /** Format of the test document. */
  var original_media_type: js.UndefOr[String] = js.native
  /** An array of objects that describe each step in the preview process. */
  var snapshots: js.UndefOr[js.Array[DocumentSnapshot]] = js.native
  /** Status of the preview operation. */
  var status: js.UndefOr[String] = js.native
}

object TestDocument {
  @scala.inline
  def apply(): TestDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestDocument]
  }
  @scala.inline
  implicit class TestDocumentOps[Self <: TestDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfiguration_id(value: String): Self = this.set("configuration_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration_id: Self = this.set("configuration_id", js.undefined)
    @scala.inline
    def setEnriched_field_units(value: Double): Self = this.set("enriched_field_units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnriched_field_units: Self = this.set("enriched_field_units", js.undefined)
    @scala.inline
    def setNoticesVarargs(value: Notice*): Self = this.set("notices", js.Array(value :_*))
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = this.set("notices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotices: Self = this.set("notices", js.undefined)
    @scala.inline
    def setOriginal_media_type(value: String): Self = this.set("original_media_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginal_media_type: Self = this.set("original_media_type", js.undefined)
    @scala.inline
    def setSnapshotsVarargs(value: DocumentSnapshot*): Self = this.set("snapshots", js.Array(value :_*))
    @scala.inline
    def setSnapshots(value: js.Array[DocumentSnapshot]): Self = this.set("snapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshots: Self = this.set("snapshots", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

