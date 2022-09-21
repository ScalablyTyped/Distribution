package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Map options.
  */
trait OpenMapOptions
  extends StObject
     with OpenOptions {
  
  var includeItems: js.UndefOr[Boolean] = js.undefined
}
object OpenMapOptions {
  
  inline def apply(): OpenMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenMapOptions]
  }
  
  extension [Self <: OpenMapOptions](x: Self) {
    
    inline def setIncludeItems(value: Boolean): Self = StObject.set(x, "includeItems", value.asInstanceOf[js.Any])
    
    inline def setIncludeItemsUndefined: Self = StObject.set(x, "includeItems", js.undefined)
  }
}
