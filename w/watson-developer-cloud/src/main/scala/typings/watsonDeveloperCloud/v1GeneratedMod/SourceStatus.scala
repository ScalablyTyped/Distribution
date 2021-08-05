package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing source crawl status information. */
trait SourceStatus extends StObject {
  
  /** Date in UTC format indicating when the last crawl was attempted. If `null`, no crawl was completed. */
  var last_updated: js.UndefOr[String] = js.undefined
  
  /** The current status of the source crawl for this collection. This field returns `not_configured` if the default configuration for this source does not have a **source** object defined. -  `running` indicates that a crawl to fetch more documents is in progress. -  `complete` indicates that the crawl has completed with no errors. -  `queued` indicates that the crawl has been paused by the system and will automatically restart when possible. */
  var status: js.UndefOr[String] = js.undefined
}
object SourceStatus {
  
  inline def apply(): SourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceStatus]
  }
  
  extension [Self <: SourceStatus](x: Self) {
    
    inline def setLast_updated(value: String): Self = StObject.set(x, "last_updated", value.asInstanceOf[js.Any])
    
    inline def setLast_updatedUndefined: Self = StObject.set(x, "last_updated", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
