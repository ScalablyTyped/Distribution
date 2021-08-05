package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the Continuous Relevancy Training for this environment. */
trait SearchStatus extends StObject {
  
  /** The date stamp of the most recent completed training for this environment. */
  var last_trained: js.UndefOr[String] = js.undefined
  
  /** Current scope of the training. Always returned as `environment`. */
  var scope: js.UndefOr[String] = js.undefined
  
  /** The current status of Continuous Relevancy Training for this environment. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Long description of the current Continuous Relevancy Training status. */
  var status_description: js.UndefOr[String] = js.undefined
}
object SearchStatus {
  
  inline def apply(): SearchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchStatus]
  }
  
  extension [Self <: SearchStatus](x: Self) {
    
    inline def setLast_trained(value: String): Self = StObject.set(x, "last_trained", value.asInstanceOf[js.Any])
    
    inline def setLast_trainedUndefined: Self = StObject.set(x, "last_trained", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatus_description(value: String): Self = StObject.set(x, "status_description", value.asInstanceOf[js.Any])
    
    inline def setStatus_descriptionUndefined: Self = StObject.set(x, "status_description", js.undefined)
  }
}
