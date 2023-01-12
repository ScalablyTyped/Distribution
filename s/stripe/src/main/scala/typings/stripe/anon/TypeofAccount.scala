package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAccount extends StObject {
  
  val Capabilities: Any
  
  val Company: TypeofCompany
  
  val Controller: Any
  
  val FutureRequirements: TypeofFutureRequirements
  
  val Requirements: TypeofRequirements
  
  val Settings: TypeofSettings
}
object TypeofAccount {
  
  inline def apply(
    Capabilities: Any,
    Company: TypeofCompany,
    Controller: Any,
    FutureRequirements: TypeofFutureRequirements,
    Requirements: TypeofRequirements,
    Settings: TypeofSettings
  ): TypeofAccount = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], Company = Company.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], FutureRequirements = FutureRequirements.asInstanceOf[js.Any], Requirements = Requirements.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAccount] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: Any): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: TypeofCompany): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    inline def setController(value: Any): Self = StObject.set(x, "Controller", value.asInstanceOf[js.Any])
    
    inline def setFutureRequirements(value: TypeofFutureRequirements): Self = StObject.set(x, "FutureRequirements", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: TypeofRequirements): Self = StObject.set(x, "Requirements", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: TypeofSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
