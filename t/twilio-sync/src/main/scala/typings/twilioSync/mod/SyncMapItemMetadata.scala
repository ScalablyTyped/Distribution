package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Map item metadata.
  */
trait SyncMapItemMetadata extends StObject {
  
  /**
    * Specifies the time-to-live in seconds after which the map item is subject to automatic deletion.
    * The value 0 means infinity.
    */
  var ttl: js.UndefOr[Double] = js.undefined
}
object SyncMapItemMetadata {
  
  inline def apply(): SyncMapItemMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncMapItemMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncMapItemMetadata] (val x: Self) extends AnyVal {
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
