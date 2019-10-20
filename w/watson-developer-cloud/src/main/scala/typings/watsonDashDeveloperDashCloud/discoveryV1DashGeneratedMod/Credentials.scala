package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing credential information. */
trait Credentials extends js.Object {
  /** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
  var credential_details: js.UndefOr[CredentialDetails] = js.undefined
  /** Unique identifier for this set of credentials. */
  var credential_id: js.UndefOr[String] = js.undefined
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  var source_type: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    credential_details: CredentialDetails = null,
    credential_id: String = null,
    source_type: String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (credential_details != null) __obj.updateDynamic("credential_details")(credential_details)
    if (credential_id != null) __obj.updateDynamic("credential_id")(credential_id)
    if (source_type != null) __obj.updateDynamic("source_type")(source_type)
    __obj.asInstanceOf[Credentials]
  }
}

