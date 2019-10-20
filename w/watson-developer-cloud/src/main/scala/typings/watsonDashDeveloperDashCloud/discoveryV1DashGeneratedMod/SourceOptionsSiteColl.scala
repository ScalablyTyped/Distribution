package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object that defines a Microsoft SharePoint site collection to crawl with this configuration. */
trait SourceOptionsSiteColl extends js.Object {
  /** The maximum number of documents to crawl for this site collection. By default, all documents in the site collection are crawled. */
  var limit: js.UndefOr[Double] = js.undefined
  /** The Microsoft SharePoint Online site collection path to crawl. The path must be be relative to the **organization_url** that was specified in the credentials associated with this source configuration. */
  var site_collection_path: String
}

object SourceOptionsSiteColl {
  @scala.inline
  def apply(site_collection_path: String, limit: Int | Double = null): SourceOptionsSiteColl = {
    val __obj = js.Dynamic.literal(site_collection_path = site_collection_path)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsSiteColl]
  }
}

