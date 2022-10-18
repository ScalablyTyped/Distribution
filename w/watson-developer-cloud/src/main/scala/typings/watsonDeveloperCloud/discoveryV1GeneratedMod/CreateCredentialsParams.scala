package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCredentialsConstants.SourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createCredentials` operation. */
trait CreateCredentialsParams extends StObject {
  
  /** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
  var credential_details: js.UndefOr[CredentialDetails] = js.undefined
  
  /** The ID of the environment. */
  var environment_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  var source_type: js.UndefOr[SourceType | String] = js.undefined
}
object CreateCredentialsParams {
  
  inline def apply(environment_id: String): CreateCredentialsParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCredentialsParams]
  }
  
  extension [Self <: CreateCredentialsParams](x: Self) {
    
    inline def setCredential_details(value: CredentialDetails): Self = StObject.set(x, "credential_details", value.asInstanceOf[js.Any])
    
    inline def setCredential_detailsUndefined: Self = StObject.set(x, "credential_details", js.undefined)
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSource_type(value: SourceType | String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
    
    inline def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
  }
}
