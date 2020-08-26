package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection for storing documents. */
@js.native
trait Collection extends js.Object {
  /** The unique identifier of the collection. */
  var collection_id: js.UndefOr[String] = js.native
  /** The unique identifier of the collection's configuration. */
  var configuration_id: js.UndefOr[String] = js.native
  /** The creation date of the collection in the format yyyy-MM-dd'T'HH:mmcon:ss.SSS'Z'. */
  var created: js.UndefOr[String] = js.native
  /** The description of the collection. */
  var description: js.UndefOr[String] = js.native
  /** Summary of the disk usage statistics for this collection. */
  var disk_usage: js.UndefOr[CollectionDiskUsage] = js.native
  var document_counts: js.UndefOr[DocumentCounts] = js.native
  /** The language of the documents stored in the collection. Permitted values include `en` (English), `de` (German), and `es` (Spanish). */
  var language: js.UndefOr[String] = js.native
  /** The name of the collection. */
  var name: js.UndefOr[String] = js.native
  /** Object containing source crawl status information. */
  var source_crawl: js.UndefOr[SourceStatus] = js.native
  /** The status of the collection. */
  var status: js.UndefOr[String] = js.native
  var training_status: js.UndefOr[TrainingStatus] = js.native
  /** The timestamp of when the collection was last updated in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var updated: js.UndefOr[String] = js.native
}

object Collection {
  @scala.inline
  def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
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
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection_id: Self = this.set("collection_id", js.undefined)
    @scala.inline
    def setConfiguration_id(value: String): Self = this.set("configuration_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration_id: Self = this.set("configuration_id", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisk_usage(value: CollectionDiskUsage): Self = this.set("disk_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisk_usage: Self = this.set("disk_usage", js.undefined)
    @scala.inline
    def setDocument_counts(value: DocumentCounts): Self = this.set("document_counts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_counts: Self = this.set("document_counts", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSource_crawl(value: SourceStatus): Self = this.set("source_crawl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_crawl: Self = this.set("source_crawl", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTraining_status(value: TrainingStatus): Self = this.set("training_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraining_status: Self = this.set("training_status", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

