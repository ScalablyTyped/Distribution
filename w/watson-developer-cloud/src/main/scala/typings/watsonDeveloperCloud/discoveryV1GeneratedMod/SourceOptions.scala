package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The **options** object defines which items to crawl from the source system. */
trait SourceOptions extends StObject {
  
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
  
  inline def apply(): SourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceOptions] (val x: Self) extends AnyVal {
    
    inline def setBuckets(value: js.Array[SourceOptionsBuckets]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: SourceOptionsBuckets*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setCrawl_all_buckets(value: Boolean): Self = StObject.set(x, "crawl_all_buckets", value.asInstanceOf[js.Any])
    
    inline def setCrawl_all_bucketsUndefined: Self = StObject.set(x, "crawl_all_buckets", js.undefined)
    
    inline def setFolders(value: js.Array[SourceOptionsFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: SourceOptionsFolder*): Self = StObject.set(x, "folders", js.Array(value*))
    
    inline def setObjects(value: js.Array[SourceOptionsObject]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setObjectsVarargs(value: SourceOptionsObject*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setSite_collections(value: js.Array[SourceOptionsSiteColl]): Self = StObject.set(x, "site_collections", value.asInstanceOf[js.Any])
    
    inline def setSite_collectionsUndefined: Self = StObject.set(x, "site_collections", js.undefined)
    
    inline def setSite_collectionsVarargs(value: SourceOptionsSiteColl*): Self = StObject.set(x, "site_collections", js.Array(value*))
    
    inline def setUrls(value: js.Array[SourceOptionsWebCrawl]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: SourceOptionsWebCrawl*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
