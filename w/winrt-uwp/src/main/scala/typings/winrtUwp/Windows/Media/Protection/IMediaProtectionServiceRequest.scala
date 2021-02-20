package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows a content enabler object to be exposed directly to an application rather than through a wrapper supplied by the ContentEnabler object. */
@js.native
trait IMediaProtectionServiceRequest extends StObject {
  
  /** Allows the application to identify the content protection system being used and therefore how to interpret the protection task. */
  var protectionSystem: String = js.native
  
  /** Retrieves the GUID for the type of operation that the IMediaProtectionServiceRequest performs. */
  var `type`: String = js.native
}
object IMediaProtectionServiceRequest {
  
  @scala.inline
  def apply(protectionSystem: String, `type`: String): IMediaProtectionServiceRequest = {
    val __obj = js.Dynamic.literal(protectionSystem = protectionSystem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaProtectionServiceRequest]
  }
  
  @scala.inline
  implicit class IMediaProtectionServiceRequestMutableBuilder[Self <: IMediaProtectionServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectionSystem(value: String): Self = StObject.set(x, "protectionSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
