package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about the resource usage and capacity of the environment. */
trait IndexCapacity extends js.Object {
  /** Summary of the collection usage in the environment. */
  var collections: js.UndefOr[CollectionUsage] = js.undefined
  /** Summary of the disk usage statistics for the environment. */
  var disk_usage: js.UndefOr[DiskUsage] = js.undefined
  /** Summary of the document usage statistics for the environment. */
  var documents: js.UndefOr[EnvironmentDocuments] = js.undefined
}

object IndexCapacity {
  @scala.inline
  def apply(
    collections: CollectionUsage = null,
    disk_usage: DiskUsage = null,
    documents: EnvironmentDocuments = null
  ): IndexCapacity = {
    val __obj = js.Dynamic.literal()
    if (collections != null) __obj.updateDynamic("collections")(collections.asInstanceOf[js.Any])
    if (disk_usage != null) __obj.updateDynamic("disk_usage")(disk_usage.asInstanceOf[js.Any])
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexCapacity]
  }
}

