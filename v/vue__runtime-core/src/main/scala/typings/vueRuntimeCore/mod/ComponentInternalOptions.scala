package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentInternalOptions extends StObject {
  
  /**
    * This one should be exposed so that devtools can make use of it
    */
  var __file: js.UndefOr[String] = js.undefined
  
  /* Excluded from this release type: __scopeId */
  /* Excluded from this release type: __cssModules */
  /* Excluded from this release type: __hmrId */
  /**
    * Compat build only, for bailing out of certain compatibility behavior
    */
  var __isBuiltIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * name inferred from filename
    */
  var __name: js.UndefOr[String] = js.undefined
}
object ComponentInternalOptions {
  
  inline def apply(): ComponentInternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentInternalOptions]
  }
  
  extension [Self <: ComponentInternalOptions](x: Self) {
    
    inline def set__file(value: String): Self = StObject.set(x, "__file", value.asInstanceOf[js.Any])
    
    inline def set__fileUndefined: Self = StObject.set(x, "__file", js.undefined)
    
    inline def set__isBuiltIn(value: Boolean): Self = StObject.set(x, "__isBuiltIn", value.asInstanceOf[js.Any])
    
    inline def set__isBuiltInUndefined: Self = StObject.set(x, "__isBuiltIn", js.undefined)
    
    inline def set__name(value: String): Self = StObject.set(x, "__name", value.asInstanceOf[js.Any])
    
    inline def set__nameUndefined: Self = StObject.set(x, "__name", js.undefined)
  }
}
