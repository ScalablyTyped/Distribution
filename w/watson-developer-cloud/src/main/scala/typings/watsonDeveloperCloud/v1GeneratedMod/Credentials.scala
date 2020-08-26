package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing credential information. */
@js.native
trait Credentials extends js.Object {
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
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
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
    def setCredential_details(value: CredentialDetails): Self = this.set("credential_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential_details: Self = this.set("credential_details", js.undefined)
    @scala.inline
    def setCredential_id(value: String): Self = this.set("credential_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential_id: Self = this.set("credential_id", js.undefined)
    @scala.inline
    def setSource_type(value: String): Self = this.set("source_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_type: Self = this.set("source_type", js.undefined)
  }
  
}

