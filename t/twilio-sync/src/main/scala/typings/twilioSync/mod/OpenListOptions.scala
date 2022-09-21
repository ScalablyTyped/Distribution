package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List options.
  */
trait OpenListOptions
  extends StObject
     with OpenOptions {
  
  var context: js.UndefOr[json] = js.undefined
  
  var includeItems: js.UndefOr[Boolean] = js.undefined
  
  var purpose: js.UndefOr[String] = js.undefined
}
object OpenListOptions {
  
  inline def apply(): OpenListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenListOptions]
  }
  
  extension [Self <: OpenListOptions](x: Self) {
    
    inline def setContext(value: json): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setIncludeItems(value: Boolean): Self = StObject.set(x, "includeItems", value.asInstanceOf[js.Any])
    
    inline def setIncludeItemsUndefined: Self = StObject.set(x, "includeItems", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
  }
}
