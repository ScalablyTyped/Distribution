package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAccountUpdateParams extends StObject {
  
  val Capabilities: Any
  
  val Company: TypeofCompany
  
  val Documents: Any
  
  val Individual: TypeofIndividual
  
  val Settings: TypeofSettingsCardIssuing
}
object TypeofAccountUpdateParams {
  
  inline def apply(
    Capabilities: Any,
    Company: TypeofCompany,
    Documents: Any,
    Individual: TypeofIndividual,
    Settings: TypeofSettingsCardIssuing
  ): TypeofAccountUpdateParams = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], Company = Company.asInstanceOf[js.Any], Documents = Documents.asInstanceOf[js.Any], Individual = Individual.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAccountUpdateParams]
  }
  
  extension [Self <: TypeofAccountUpdateParams](x: Self) {
    
    inline def setCapabilities(value: Any): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: TypeofCompany): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    inline def setDocuments(value: Any): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setIndividual(value: TypeofIndividual): Self = StObject.set(x, "Individual", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: TypeofSettingsCardIssuing): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
