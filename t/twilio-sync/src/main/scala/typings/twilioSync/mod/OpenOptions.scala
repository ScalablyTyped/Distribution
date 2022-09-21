package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for opening a Sync object.
  *
  * @example The following example is applicable to all Sync objects
  * (i.e., `syncClient.document()`, `syncClient.list()`,` syncClient.map()`, `syncClient.stream()`)
  * ```typescript
  * // Attempts to open an existing document with a unique name of 'MyDocument'
  * // If no such document exists, the promise is rejected
  * syncClient.document({
  *   id: 'MyDocument',
  *   mode: 'open_existing'
  * })
  *   .then(...)
  *   .catch(...);
  *
  * // Attempts to create a new document with a unique name of 'MyDocument', TTL of 24 hours and initial data `{ name: 'John Smith' }`
  * // If such a document already exists, the promise is rejected
  * syncClient.document({
  *   id: 'MyDocument',
  *   mode: 'create_new',
  *   ttl: 86400
  *   data: { name: 'John Smith' } // the `data` property is only applicable for Documents
  * })
  *   .then(...)
  *   .catch(...);
  * ```
  */
trait OpenOptions extends StObject {
  
  /**
    * Sync object SID or unique name.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Mode for opening the Sync object.
    */
  var mode: js.UndefOr[OpenMode] = js.undefined
  
  /**
    * The time-to-live of the Sync object in seconds. This is applied only if the object is created.
    */
  var ttl: js.UndefOr[Double] = js.undefined
}
object OpenOptions {
  
  inline def apply(): OpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenOptions]
  }
  
  extension [Self <: OpenOptions](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMode(value: OpenMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
