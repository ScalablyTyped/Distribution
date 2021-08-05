package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows a content enabler object to be exposed directly to an application rather than through a wrapper supplied by the ContentEnabler object. */
trait IMediaProtectionServiceRequest extends StObject {
  
  /** Allows the application to identify the content protection system being used and therefore how to interpret the protection task. */
  var protectionSystem: String
  
  /** Retrieves the GUID for the type of operation that the IMediaProtectionServiceRequest performs. */
  var `type`: String
}
object IMediaProtectionServiceRequest {
  
  inline def apply(protectionSystem: String, `type`: String): IMediaProtectionServiceRequest = {
    val __obj = js.Dynamic.literal(protectionSystem = protectionSystem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaProtectionServiceRequest]
  }
  
  extension [Self <: IMediaProtectionServiceRequest](x: Self) {
    
    inline def setProtectionSystem(value: String): Self = StObject.set(x, "protectionSystem", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
