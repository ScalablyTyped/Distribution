package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  DUPLICATE_MODULE_NAMESPACE :boolean}> */
trait PartialDUPLICATEMODULENAM extends StObject {
  
  var DUPLICATE_MODULE_NAMESPACE: js.UndefOr[Boolean] = js.undefined
}
object PartialDUPLICATEMODULENAM {
  
  inline def apply(): PartialDUPLICATEMODULENAM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDUPLICATEMODULENAM]
  }
  
  extension [Self <: PartialDUPLICATEMODULENAM](x: Self) {
    
    inline def setDUPLICATE_MODULE_NAMESPACE(value: Boolean): Self = StObject.set(x, "DUPLICATE_MODULE_NAMESPACE", value.asInstanceOf[js.Any])
    
    inline def setDUPLICATE_MODULE_NAMESPACEUndefined: Self = StObject.set(x, "DUPLICATE_MODULE_NAMESPACE", js.undefined)
  }
}
