package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataOptionsWithMetadata extends IDataOptions {
  
  /**
    * A set of key/value pairs that you can attach to an object. It can be
    * useful for storing additional information about the object in a structured
    * format. You can unset an individual key by setting its value to null and
    * then saving. To clear all keys, set metadata to null, then save.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
}
object IDataOptionsWithMetadata {
  
  @scala.inline
  def apply(): IDataOptionsWithMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataOptionsWithMetadata]
  }
  
  @scala.inline
  implicit class IDataOptionsWithMetadataMutableBuilder[Self <: IDataOptionsWithMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
