package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object that defines a box folder to crawl with this configuration. */
trait SourceOptionsFolder extends StObject {
  
  /** The Box folder ID of the folder to crawl. */
  var folder_id: String
  
  /** The maximum number of documents to crawl for this folder. By default, all documents in the folder are crawled. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** The Box user ID of the user who owns the folder to crawl. */
  var owner_user_id: String
}
object SourceOptionsFolder {
  
  inline def apply(folder_id: String, owner_user_id: String): SourceOptionsFolder = {
    val __obj = js.Dynamic.literal(folder_id = folder_id.asInstanceOf[js.Any], owner_user_id = owner_user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsFolder]
  }
  
  extension [Self <: SourceOptionsFolder](x: Self) {
    
    inline def setFolder_id(value: String): Self = StObject.set(x, "folder_id", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOwner_user_id(value: String): Self = StObject.set(x, "owner_user_id", value.asInstanceOf[js.Any])
  }
}
