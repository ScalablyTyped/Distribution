package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<webpack.webpack.ModuleReferenceOptions> */
trait PartialModuleReferenceOpt extends StObject {
  
  var asiSafe: js.UndefOr[Boolean] = js.undefined
  
  var call: js.UndefOr[Boolean] = js.undefined
  
  var directImport: js.UndefOr[Boolean] = js.undefined
  
  var ids: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialModuleReferenceOpt {
  
  inline def apply(): PartialModuleReferenceOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModuleReferenceOpt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialModuleReferenceOpt] (val x: Self) extends AnyVal {
    
    inline def setAsiSafe(value: Boolean): Self = StObject.set(x, "asiSafe", value.asInstanceOf[js.Any])
    
    inline def setAsiSafeUndefined: Self = StObject.set(x, "asiSafe", js.undefined)
    
    inline def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
    
    inline def setDirectImport(value: Boolean): Self = StObject.set(x, "directImport", value.asInstanceOf[js.Any])
    
    inline def setDirectImportUndefined: Self = StObject.set(x, "directImport", js.undefined)
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
