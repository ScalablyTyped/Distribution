package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataOptionsWithMetadata
  extends StObject
     with IDataOptions {
  
  /**
    * A set of key/value pairs that you can attach to an object. It can be
    * useful for storing additional information about the object in a structured
    * format. You can unset an individual key by setting its value to null and
    * then saving. To clear all keys, set metadata to null, then save.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
}
object IDataOptionsWithMetadata {
  
  inline def apply(): IDataOptionsWithMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataOptionsWithMetadata]
  }
  
  extension [Self <: IDataOptionsWithMetadata](x: Self) {
    
    inline def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
