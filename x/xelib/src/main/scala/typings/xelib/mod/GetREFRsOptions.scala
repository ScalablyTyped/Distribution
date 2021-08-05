package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetREFRsOptions extends StObject {
  
  /**
    * Pass true to exclude deleted REFRs.
    * @default false
    */
  var excludeDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Pass true to exclude disabled REFRs.
    * @default false
    */
  var excludeDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Pass true to exclude REFRs which have an XESP element.
    * @default false
    */
  var excludeXESP: js.UndefOr[Boolean] = js.undefined
}
object GetREFRsOptions {
  
  inline def apply(): GetREFRsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetREFRsOptions]
  }
  
  extension [Self <: GetREFRsOptions](x: Self) {
    
    inline def setExcludeDeleted(value: Boolean): Self = StObject.set(x, "excludeDeleted", value.asInstanceOf[js.Any])
    
    inline def setExcludeDeletedUndefined: Self = StObject.set(x, "excludeDeleted", js.undefined)
    
    inline def setExcludeDisabled(value: Boolean): Self = StObject.set(x, "excludeDisabled", value.asInstanceOf[js.Any])
    
    inline def setExcludeDisabledUndefined: Self = StObject.set(x, "excludeDisabled", js.undefined)
    
    inline def setExcludeXESP(value: Boolean): Self = StObject.set(x, "excludeXESP", value.asInstanceOf[js.Any])
    
    inline def setExcludeXESPUndefined: Self = StObject.set(x, "excludeXESP", js.undefined)
  }
}
