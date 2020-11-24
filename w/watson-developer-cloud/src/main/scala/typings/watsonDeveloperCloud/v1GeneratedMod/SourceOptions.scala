package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The **options** object defines which items to crawl from the source system. */
@js.native
trait SourceOptions extends js.Object {
  
  /** Array of cloud object store buckets to begin crawling. Only valid and required when the **type** field of the **source** object is set to `cloud_object_store`, and the **crawl_all_buckets** field is `false` or not specified. */
  var buckets: js.UndefOr[js.Array[SourceOptionsBuckets]] = js.native
  
  /** When `true`, all buckets in the specified cloud object store are crawled. If set to `true`, the **buckets** array must not be specified. */
  var crawl_all_buckets: js.UndefOr[Boolean] = js.native
  
  /** Array of folders to crawl from the Box source. Only valid, and required, when the **type** field of the **source** object is set to `box`. */
  var folders: js.UndefOr[js.Array[SourceOptionsFolder]] = js.native
  
  /** Array of Salesforce document object types to crawl from the Salesforce source. Only valid, and required, when the **type** field of the **source** object is set to `salesforce`. */
  var objects: js.UndefOr[js.Array[SourceOptionsObject]] = js.native
  
  /** Array of Microsoft SharePointoint Online site collections to crawl from the SharePoint source. Only valid and required when the **type** field of the **source** object is set to `sharepoint`. */
  var site_collections: js.UndefOr[js.Array[SourceOptionsSiteColl]] = js.native
  
  /** Array of Web page URLs to begin crawling the web from. Only valid and required when the **type** field of the **source** object is set to `web_crawl`. */
  var urls: js.UndefOr[js.Array[SourceOptionsWebCrawl]] = js.native
}
object SourceOptions {
  
  @scala.inline
  def apply(): SourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceOptions]
  }
  
  @scala.inline
  implicit class SourceOptionsOps[Self <: SourceOptions] (val x: Self) extends AnyVal {
    
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
    def setBucketsVarargs(value: SourceOptionsBuckets*): Self = this.set("buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: js.Array[SourceOptionsBuckets]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    
    @scala.inline
    def setCrawl_all_buckets(value: Boolean): Self = this.set("crawl_all_buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawl_all_buckets: Self = this.set("crawl_all_buckets", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: SourceOptionsFolder*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[SourceOptionsFolder]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
    
    @scala.inline
    def setObjectsVarargs(value: SourceOptionsObject*): Self = this.set("objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[SourceOptionsObject]): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    
    @scala.inline
    def setSite_collectionsVarargs(value: SourceOptionsSiteColl*): Self = this.set("site_collections", js.Array(value :_*))
    
    @scala.inline
    def setSite_collections(value: js.Array[SourceOptionsSiteColl]): Self = this.set("site_collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSite_collections: Self = this.set("site_collections", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: SourceOptionsWebCrawl*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[SourceOptionsWebCrawl]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
}
