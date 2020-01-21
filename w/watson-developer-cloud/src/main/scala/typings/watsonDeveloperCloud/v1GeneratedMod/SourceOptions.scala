package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The **options** object defines which items to crawl from the source system. */
trait SourceOptions extends js.Object {
  /** Array of cloud object store buckets to begin crawling. Only valid and required when the **type** field of the **source** object is set to `cloud_object_store`, and the **crawl_all_buckets** field is `false` or not specified. */
  var buckets: js.UndefOr[js.Array[SourceOptionsBuckets]] = js.undefined
  /** When `true`, all buckets in the specified cloud object store are crawled. If set to `true`, the **buckets** array must not be specified. */
  var crawl_all_buckets: js.UndefOr[Boolean] = js.undefined
  /** Array of folders to crawl from the Box source. Only valid, and required, when the **type** field of the **source** object is set to `box`. */
  var folders: js.UndefOr[js.Array[SourceOptionsFolder]] = js.undefined
  /** Array of Salesforce document object types to crawl from the Salesforce source. Only valid, and required, when the **type** field of the **source** object is set to `salesforce`. */
  var objects: js.UndefOr[js.Array[SourceOptionsObject]] = js.undefined
  /** Array of Microsoft SharePointoint Online site collections to crawl from the SharePoint source. Only valid and required when the **type** field of the **source** object is set to `sharepoint`. */
  var site_collections: js.UndefOr[js.Array[SourceOptionsSiteColl]] = js.undefined
  /** Array of Web page URLs to begin crawling the web from. Only valid and required when the **type** field of the **source** object is set to `web_crawl`. */
  var urls: js.UndefOr[js.Array[SourceOptionsWebCrawl]] = js.undefined
}

object SourceOptions {
  @scala.inline
  def apply(
    buckets: js.Array[SourceOptionsBuckets] = null,
    crawl_all_buckets: js.UndefOr[Boolean] = js.undefined,
    folders: js.Array[SourceOptionsFolder] = null,
    objects: js.Array[SourceOptionsObject] = null,
    site_collections: js.Array[SourceOptionsSiteColl] = null,
    urls: js.Array[SourceOptionsWebCrawl] = null
  ): SourceOptions = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (!js.isUndefined(crawl_all_buckets)) __obj.updateDynamic("crawl_all_buckets")(crawl_all_buckets.asInstanceOf[js.Any])
    if (folders != null) __obj.updateDynamic("folders")(folders.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (site_collections != null) __obj.updateDynamic("site_collections")(site_collections.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptions]
  }
}

