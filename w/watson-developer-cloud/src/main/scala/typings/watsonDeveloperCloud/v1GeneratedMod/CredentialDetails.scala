package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
@js.native
trait CredentialDetails extends js.Object {
  /** The access key ID associated with the cloud object store. Only valid, and required, with a **credential_type** of `aws4_hmac`. For more infomation, see the [cloud object store documentation](https://cloud.ibm.com/docs/services/cloud-object-storage?topic=cloud-object-storage-using-hmac-credentials#using-hmac-credentials). */
  var access_key_id: js.UndefOr[String] = js.native
  /** The **client_id** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. */
  var client_id: js.UndefOr[String] = js.native
  /** The **client_secret** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var client_secret: js.UndefOr[String] = js.native
  /** The authentication method for this credentials definition. The  **credential_type** specified must be supported by the **source_type**. The following combinations are possible: -  `"source_type": "box"` - valid `credential_type`s: `oauth2` -  `"source_type": "salesforce"` - valid `credential_type`s: `username_password` -  `"source_type": "sharepoint"` - valid `credential_type`s: `saml` with **source_version** of `online`, or `ntml_v1` with **source_version** of `2016` -  `"source_type": "web_crawl"` - valid `credential_type`s: `noauth` or `basic` -  "source_type": "cloud_object_storage"` - valid `credential_type`s: `aws4_hmac`. */
  var credential_type: js.UndefOr[String] = js.native
  /** The domain used to log in to your OnPrem SharePoint account. Only valid, and required, with a **source_version** of `2016`. */
  var domain: js.UndefOr[String] = js.native
  /** The endpoint associated with the cloud object store that your are connecting to. Only valid, and required, with a **credential_type** of `aws4_hmac`. */
  var endpoint: js.UndefOr[String] = js.native
  /** The **enterprise_id** of the Box site that these credentials connect to. Only valid, and required, with a **source_type** of `box`. */
  var enterprise_id: js.UndefOr[String] = js.native
  /** The ID of the **gateway** to be connected through (when connecting to intranet sites). Only valid with a **credential_type** of `noauth`, `basic`, or `ntml_v1`. Gateways are created using the `/v1/environments/{environment_id}/gateways` methods. */
  var gateway_id: js.UndefOr[String] = js.native
  /** The **organization_url** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `saml`. */
  var organization_url: js.UndefOr[String] = js.native
  /** The **passphrase** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var passphrase: js.UndefOr[String] = js.native
  /** The **password** of the source that these credentials connect to. Only valid, and required, with **credential_type**s of `saml`, `username_password`, `basic`, or `ntml_v1`. **Note:** When used with a **source_type** of `salesforce`, the password consists of the Salesforce password and a valid Salesforce security token concatenated. This value is never returned and is only used when creating or modifying **credentials**. */
  var password: js.UndefOr[String] = js.native
  /** The **private_key** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var private_key: js.UndefOr[String] = js.native
  /** The **public_key_id** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var public_key_id: js.UndefOr[String] = js.native
  /** The secret access key associated with the cloud object store. Only valid, and required, with a **credential_type** of `aws4_hmac`. This value is never returned and is only used when creating or modifying **credentials**. For more infomation, see the [cloud object store documentation](https://cloud.ibm.com/docs/services/cloud-object-storage?topic=cloud-object-storage-using-hmac-credentials#using-hmac-credentials). */
  var secret_access_key: js.UndefOr[String] = js.native
  /** The **site_collection.path** of the source that these credentials connect to. Only valid, and required, with a **source_type** of `sharepoint`. */
  var site_collection_path: js.UndefOr[String] = js.native
  /** The type of Sharepoint repository to connect to. Only valid, and required, with a **source_type** of `sharepoint`. */
  var source_version: js.UndefOr[String] = js.native
  /** The **url** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `username_password`, `noauth`, and `basic`. */
  var url: js.UndefOr[String] = js.native
  /** The **username** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `saml`, `username_password`, `basic`, or `ntml_v1`. */
  var username: js.UndefOr[String] = js.native
  /** SharePoint OnPrem WebApplication URL. Only valid, and required, with a **source_version** of `2016`. */
  var web_application_url: js.UndefOr[String] = js.native
}

object CredentialDetails {
  @scala.inline
  def apply(): CredentialDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialDetails]
  }
  @scala.inline
  implicit class CredentialDetailsOps[Self <: CredentialDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccess_key_id(value: String): Self = this.set("access_key_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_key_id: Self = this.set("access_key_id", js.undefined)
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_secret: Self = this.set("client_secret", js.undefined)
    @scala.inline
    def setCredential_type(value: String): Self = this.set("credential_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential_type: Self = this.set("credential_type", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setEnterprise_id(value: String): Self = this.set("enterprise_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterprise_id: Self = this.set("enterprise_id", js.undefined)
    @scala.inline
    def setGateway_id(value: String): Self = this.set("gateway_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGateway_id: Self = this.set("gateway_id", js.undefined)
    @scala.inline
    def setOrganization_url(value: String): Self = this.set("organization_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization_url: Self = this.set("organization_url", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPrivate_key(value: String): Self = this.set("private_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate_key: Self = this.set("private_key", js.undefined)
    @scala.inline
    def setPublic_key_id(value: String): Self = this.set("public_key_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic_key_id: Self = this.set("public_key_id", js.undefined)
    @scala.inline
    def setSecret_access_key(value: String): Self = this.set("secret_access_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret_access_key: Self = this.set("secret_access_key", js.undefined)
    @scala.inline
    def setSite_collection_path(value: String): Self = this.set("site_collection_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite_collection_path: Self = this.set("site_collection_path", js.undefined)
    @scala.inline
    def setSource_version(value: String): Self = this.set("source_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_version: Self = this.set("source_version", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setWeb_application_url(value: String): Self = this.set("web_application_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeb_application_url: Self = this.set("web_application_url", js.undefined)
  }
  
}

