package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing source crawl status information. */
trait SourceStatus extends js.Object {
  /** Date in UTC format indicating when the last crawl was attempted. If `null`, no crawl was completed. */
  var last_updated: js.UndefOr[String] = js.undefined
  /** The current status of the source crawl for this collection. This field returns `not_configured` if the default configuration for this source does not have a **source** object defined. -  `running` indicates that a crawl to fetch more documents is in progress. -  `complete` indicates that the crawl has completed with no errors. -  `queued` indicates that the crawl has been paused by the system and will automatically restart when possible. */
  var status: js.UndefOr[String] = js.undefined
}

object SourceStatus {
  @scala.inline
  def apply(last_updated: String = null, status: String = null): SourceStatus = {
    val __obj = js.Dynamic.literal()
    if (last_updated != null) __obj.updateDynamic("last_updated")(last_updated.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceStatus]
  }
}

