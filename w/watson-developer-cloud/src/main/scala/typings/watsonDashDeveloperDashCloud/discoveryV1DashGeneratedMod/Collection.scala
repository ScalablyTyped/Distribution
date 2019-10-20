package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection for storing documents. */
trait Collection extends js.Object {
  /** The unique identifier of the collection. */
  var collection_id: js.UndefOr[String] = js.undefined
  /** The unique identifier of the collection's configuration. */
  var configuration_id: js.UndefOr[String] = js.undefined
  /** The creation date of the collection in the format yyyy-MM-dd'T'HH:mmcon:ss.SSS'Z'. */
  var created: js.UndefOr[String] = js.undefined
  /** The description of the collection. */
  var description: js.UndefOr[String] = js.undefined
  /** Summary of the disk usage statistics for this collection. */
  var disk_usage: js.UndefOr[CollectionDiskUsage] = js.undefined
  var document_counts: js.UndefOr[DocumentCounts] = js.undefined
  /** The language of the documents stored in the collection. Permitted values include `en` (English), `de` (German), and `es` (Spanish). */
  var language: js.UndefOr[String] = js.undefined
  /** The name of the collection. */
  var name: js.UndefOr[String] = js.undefined
  /** Object containing source crawl status information. */
  var source_crawl: js.UndefOr[SourceStatus] = js.undefined
  /** The status of the collection. */
  var status: js.UndefOr[String] = js.undefined
  var training_status: js.UndefOr[TrainingStatus] = js.undefined
  /** The timestamp of when the collection was last updated in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var updated: js.UndefOr[String] = js.undefined
}

object Collection {
  @scala.inline
  def apply(
    collection_id: String = null,
    configuration_id: String = null,
    created: String = null,
    description: String = null,
    disk_usage: CollectionDiskUsage = null,
    document_counts: DocumentCounts = null,
    language: String = null,
    name: String = null,
    source_crawl: SourceStatus = null,
    status: String = null,
    training_status: TrainingStatus = null,
    updated: String = null
  ): Collection = {
    val __obj = js.Dynamic.literal()
    if (collection_id != null) __obj.updateDynamic("collection_id")(collection_id)
    if (configuration_id != null) __obj.updateDynamic("configuration_id")(configuration_id)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (disk_usage != null) __obj.updateDynamic("disk_usage")(disk_usage)
    if (document_counts != null) __obj.updateDynamic("document_counts")(document_counts)
    if (language != null) __obj.updateDynamic("language")(language)
    if (name != null) __obj.updateDynamic("name")(name)
    if (source_crawl != null) __obj.updateDynamic("source_crawl")(source_crawl)
    if (status != null) __obj.updateDynamic("status")(status)
    if (training_status != null) __obj.updateDynamic("training_status")(training_status)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Collection]
  }
}

