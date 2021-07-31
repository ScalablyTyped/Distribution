package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
trait CredentialDetails extends StObject {
  
  /** The access key ID associated with the cloud object store. Only valid, and required, with a **credential_type** of `aws4_hmac`. For more infomation, see the [cloud object store documentation](https://cloud.ibm.com/docs/services/cloud-object-storage?topic=cloud-object-storage-using-hmac-credentials#using-hmac-credentials). */
  var access_key_id: js.UndefOr[String] = js.undefined
  
  /** The **client_id** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. */
  var client_id: js.UndefOr[String] = js.undefined
  
  /** The **client_secret** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var client_secret: js.UndefOr[String] = js.undefined
  
  /** The authentication method for this credentials definition. The  **credential_type** specified must be supported by the **source_type**. The following combinations are possible: -  `"source_type": "box"` - valid `credential_type`s: `oauth2` -  `"source_type": "salesforce"` - valid `credential_type`s: `username_password` -  `"source_type": "sharepoint"` - valid `credential_type`s: `saml` with **source_version** of `online`, or `ntml_v1` with **source_version** of `2016` -  `"source_type": "web_crawl"` - valid `credential_type`s: `noauth` or `basic` -  "source_type": "cloud_object_storage"` - valid `credential_type`s: `aws4_hmac`. */
  var credential_type: js.UndefOr[String] = js.undefined
  
  /** The domain used to log in to your OnPrem SharePoint account. Only valid, and required, with a **source_version** of `2016`. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** The endpoint associated with the cloud object store that your are connecting to. Only valid, and required, with a **credential_type** of `aws4_hmac`. */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /** The **enterprise_id** of the Box site that these credentials connect to. Only valid, and required, with a **source_type** of `box`. */
  var enterprise_id: js.UndefOr[String] = js.undefined
  
  /** The ID of the **gateway** to be connected through (when connecting to intranet sites). Only valid with a **credential_type** of `noauth`, `basic`, or `ntml_v1`. Gateways are created using the `/v1/environments/{environment_id}/gateways` methods. */
  var gateway_id: js.UndefOr[String] = js.undefined
  
  /** The **organization_url** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `saml`. */
  var organization_url: js.UndefOr[String] = js.undefined
  
  /** The **passphrase** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var passphrase: js.UndefOr[String] = js.undefined
  
  /** The **password** of the source that these credentials connect to. Only valid, and required, with **credential_type**s of `saml`, `username_password`, `basic`, or `ntml_v1`. **Note:** When used with a **source_type** of `salesforce`, the password consists of the Salesforce password and a valid Salesforce security token concatenated. This value is never returned and is only used when creating or modifying **credentials**. */
  var password: js.UndefOr[String] = js.undefined
  
  /** The **private_key** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var private_key: js.UndefOr[String] = js.undefined
  
  /** The **public_key_id** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var public_key_id: js.UndefOr[String] = js.undefined
  
  /** The secret access key associated with the cloud object store. Only valid, and required, with a **credential_type** of `aws4_hmac`. This value is never returned and is only used when creating or modifying **credentials**. For more infomation, see the [cloud object store documentation](https://cloud.ibm.com/docs/services/cloud-object-storage?topic=cloud-object-storage-using-hmac-credentials#using-hmac-credentials). */
  var secret_access_key: js.UndefOr[String] = js.undefined
  
  /** The **site_collection.path** of the source that these credentials connect to. Only valid, and required, with a **source_type** of `sharepoint`. */
  var site_collection_path: js.UndefOr[String] = js.undefined
  
  /** The type of Sharepoint repository to connect to. Only valid, and required, with a **source_type** of `sharepoint`. */
  var source_version: js.UndefOr[String] = js.undefined
  
  /** The **url** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `username_password`, `noauth`, and `basic`. */
  var url: js.UndefOr[String] = js.undefined
  
  /** The **username** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `saml`, `username_password`, `basic`, or `ntml_v1`. */
  var username: js.UndefOr[String] = js.undefined
  
  /** SharePoint OnPrem WebApplication URL. Only valid, and required, with a **source_version** of `2016`. */
  var web_application_url: js.UndefOr[String] = js.undefined
}
object CredentialDetails {
  
  @scala.inline
  def apply(): CredentialDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialDetails]
  }
  
  @scala.inline
  implicit class CredentialDetailsMutableBuilder[Self <: CredentialDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_key_id(value: String): Self = StObject.set(x, "access_key_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_key_idUndefined: Self = StObject.set(x, "access_key_id", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    
    @scala.inline
    def setCredential_type(value: String): Self = StObject.set(x, "credential_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredential_typeUndefined: Self = StObject.set(x, "credential_type", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEnterprise_id(value: String): Self = StObject.set(x, "enterprise_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterprise_idUndefined: Self = StObject.set(x, "enterprise_id", js.undefined)
    
    @scala.inline
    def setGateway_id(value: String): Self = StObject.set(x, "gateway_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway_idUndefined: Self = StObject.set(x, "gateway_id", js.undefined)
    
    @scala.inline
    def setOrganization_url(value: String): Self = StObject.set(x, "organization_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_urlUndefined: Self = StObject.set(x, "organization_url", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
    
    @scala.inline
    def setPublic_key_id(value: String): Self = StObject.set(x, "public_key_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_key_idUndefined: Self = StObject.set(x, "public_key_id", js.undefined)
    
    @scala.inline
    def setSecret_access_key(value: String): Self = StObject.set(x, "secret_access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret_access_keyUndefined: Self = StObject.set(x, "secret_access_key", js.undefined)
    
    @scala.inline
    def setSite_collection_path(value: String): Self = StObject.set(x, "site_collection_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSite_collection_pathUndefined: Self = StObject.set(x, "site_collection_path", js.undefined)
    
    @scala.inline
    def setSource_version(value: String): Self = StObject.set(x, "source_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_versionUndefined: Self = StObject.set(x, "source_version", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setWeb_application_url(value: String): Self = StObject.set(x, "web_application_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb_application_urlUndefined: Self = StObject.set(x, "web_application_url", js.undefined)
  }
}
