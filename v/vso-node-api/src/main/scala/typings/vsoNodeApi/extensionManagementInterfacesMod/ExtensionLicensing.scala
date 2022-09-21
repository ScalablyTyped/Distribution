package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionLicensing extends StObject {
  
  /**
    * A list of contributions which deviate from the default licensing behavior
    */
  var overrides: js.Array[LicensingOverride]
}
object ExtensionLicensing {
  
  inline def apply(overrides: js.Array[LicensingOverride]): ExtensionLicensing = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionLicensing]
  }
  
  extension [Self <: ExtensionLicensing](x: Self) {
    
    inline def setOverrides(value: js.Array[LicensingOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesVarargs(value: LicensingOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
