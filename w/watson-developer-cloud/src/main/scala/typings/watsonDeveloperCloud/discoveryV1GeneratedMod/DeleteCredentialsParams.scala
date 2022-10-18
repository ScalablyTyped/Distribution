package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteCredentials` operation. */
trait DeleteCredentialsParams extends StObject {
  
  /** The unique identifier for a set of source credentials. */
  var credential_id: String
  
  /** The ID of the environment. */
  var environment_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object DeleteCredentialsParams {
  
  inline def apply(credential_id: String, environment_id: String): DeleteCredentialsParams = {
    val __obj = js.Dynamic.literal(credential_id = credential_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCredentialsParams]
  }
  
  extension [Self <: DeleteCredentialsParams](x: Self) {
    
    inline def setCredential_id(value: String): Self = StObject.set(x, "credential_id", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
