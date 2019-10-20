package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateCredentialsConstants.SourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateCredentials` operation. */
trait UpdateCredentialsParams extends js.Object {
  /** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
  var credential_details: js.UndefOr[CredentialDetails] = js.undefined
  /** The unique identifier for a set of source credentials. */
  var credential_id: String
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  var source_type: js.UndefOr[SourceType | String] = js.undefined
}

object UpdateCredentialsParams {
  @scala.inline
  def apply(
    credential_id: String,
    environment_id: String,
    credential_details: CredentialDetails = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    source_type: SourceType | String = null
  ): UpdateCredentialsParams = {
    val __obj = js.Dynamic.literal(credential_id = credential_id, environment_id = environment_id)
    if (credential_details != null) __obj.updateDynamic("credential_details")(credential_details)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCredentialsParams]
  }
}

