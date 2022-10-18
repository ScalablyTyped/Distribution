package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensingOverride extends StObject {
  
  /**
    * How the inclusion of this contribution should change based on licensing
    */
  var behavior: ContributionLicensingBehaviorType
  
  /**
    * Fully qualified contribution id which we want to define licensing behavior for
    */
  var id: String
}
object LicensingOverride {
  
  inline def apply(behavior: ContributionLicensingBehaviorType, id: String): LicensingOverride = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensingOverride]
  }
  
  extension [Self <: LicensingOverride](x: Self) {
    
    inline def setBehavior(value: ContributionLicensingBehaviorType): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
