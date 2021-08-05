package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A collection for storing documents. */
trait Collection extends StObject {
  
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
  
  inline def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  
  extension [Self <: Collection](x: Self) {
    
    inline def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    inline def setCollection_idUndefined: Self = StObject.set(x, "collection_id", js.undefined)
    
    inline def setConfiguration_id(value: String): Self = StObject.set(x, "configuration_id", value.asInstanceOf[js.Any])
    
    inline def setConfiguration_idUndefined: Self = StObject.set(x, "configuration_id", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisk_usage(value: CollectionDiskUsage): Self = StObject.set(x, "disk_usage", value.asInstanceOf[js.Any])
    
    inline def setDisk_usageUndefined: Self = StObject.set(x, "disk_usage", js.undefined)
    
    inline def setDocument_counts(value: DocumentCounts): Self = StObject.set(x, "document_counts", value.asInstanceOf[js.Any])
    
    inline def setDocument_countsUndefined: Self = StObject.set(x, "document_counts", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSource_crawl(value: SourceStatus): Self = StObject.set(x, "source_crawl", value.asInstanceOf[js.Any])
    
    inline def setSource_crawlUndefined: Self = StObject.set(x, "source_crawl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTraining_status(value: TrainingStatus): Self = StObject.set(x, "training_status", value.asInstanceOf[js.Any])
    
    inline def setTraining_statusUndefined: Self = StObject.set(x, "training_status", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
