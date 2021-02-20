package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing credential information. */
@js.native
trait Credentials extends StObject {
  
  /** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
  var credential_details: js.UndefOr[CredentialDetails] = js.native
  
  /** Unique identifier for this set of credentials. */
  var credential_id: js.UndefOr[String] = js.native
  
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  var source_type: js.UndefOr[String] = js.native
}
object Credentials {
  
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential_details(value: CredentialDetails): Self = StObject.set(x, "credential_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredential_detailsUndefined: Self = StObject.set(x, "credential_details", js.undefined)
    
    @scala.inline
    def setCredential_id(value: String): Self = StObject.set(x, "credential_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredential_idUndefined: Self = StObject.set(x, "credential_id", js.undefined)
    
    @scala.inline
    def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
  }
}
