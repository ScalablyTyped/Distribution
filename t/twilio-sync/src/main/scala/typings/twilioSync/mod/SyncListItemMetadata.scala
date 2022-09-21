package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List item metadata.
  */
trait SyncListItemMetadata extends StObject {
  
  /**
    * Specifies the time-to-live in seconds after which the list item is subject to automatic deletion.
    * The value 0 means infinity.
    */
  var ttl: js.UndefOr[Double] = js.undefined
}
object SyncListItemMetadata {
  
  inline def apply(): SyncListItemMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncListItemMetadata]
  }
  
  extension [Self <: SyncListItemMetadata](x: Self) {
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
