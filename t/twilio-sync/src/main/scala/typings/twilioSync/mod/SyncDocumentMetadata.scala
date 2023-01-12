package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Document metadata.
  */
trait SyncDocumentMetadata extends StObject {
  
  /**
    * Specifies the time-to-live in seconds after which the document is subject to automatic deletion.
    * The value 0 means infinity.
    */
  var ttl: js.UndefOr[Double] = js.undefined
}
object SyncDocumentMetadata {
  
  inline def apply(): SyncDocumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncDocumentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncDocumentMetadata] (val x: Self) extends AnyVal {
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
