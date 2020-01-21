package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
trait CredentialDetails extends js.Object {
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
  def apply(
    access_key_id: String = null,
    client_id: String = null,
    client_secret: String = null,
    credential_type: String = null,
    domain: String = null,
    endpoint: String = null,
    enterprise_id: String = null,
    gateway_id: String = null,
    organization_url: String = null,
    passphrase: String = null,
    password: String = null,
    private_key: String = null,
    public_key_id: String = null,
    secret_access_key: String = null,
    site_collection_path: String = null,
    source_version: String = null,
    url: String = null,
    username: String = null,
    web_application_url: String = null
  ): CredentialDetails = {
    val __obj = js.Dynamic.literal()
    if (access_key_id != null) __obj.updateDynamic("access_key_id")(access_key_id.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    if (credential_type != null) __obj.updateDynamic("credential_type")(credential_type.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (enterprise_id != null) __obj.updateDynamic("enterprise_id")(enterprise_id.asInstanceOf[js.Any])
    if (gateway_id != null) __obj.updateDynamic("gateway_id")(gateway_id.asInstanceOf[js.Any])
    if (organization_url != null) __obj.updateDynamic("organization_url")(organization_url.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (private_key != null) __obj.updateDynamic("private_key")(private_key.asInstanceOf[js.Any])
    if (public_key_id != null) __obj.updateDynamic("public_key_id")(public_key_id.asInstanceOf[js.Any])
    if (secret_access_key != null) __obj.updateDynamic("secret_access_key")(secret_access_key.asInstanceOf[js.Any])
    if (site_collection_path != null) __obj.updateDynamic("site_collection_path")(site_collection_path.asInstanceOf[js.Any])
    if (source_version != null) __obj.updateDynamic("source_version")(source_version.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (web_application_url != null) __obj.updateDynamic("web_application_url")(web_application_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialDetails]
  }
}

