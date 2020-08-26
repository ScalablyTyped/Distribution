package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing source parameters for the configuration. */
@js.native
trait Source extends js.Object {
  /** The **credential_id** of the credentials to use to connect to the source. Credentials are defined using the **credentials** method. The **source_type** of the credentials used must match the **type** field specified in this object. */
  var credential_id: js.UndefOr[String] = js.native
  /** The **options** object defines which items to crawl from the source system. */
  var options: js.UndefOr[SourceOptions] = js.native
  /** Object containing the schedule information for the source. */
  var schedule: js.UndefOr[SourceSchedule] = js.native
  /** The type of source to connect to. -  `box` indicates the configuration is to connect an instance of Enterprise Box. -  `salesforce` indicates the configuration is to connect to Salesforce. -  `sharepoint` indicates the configuration is to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the configuration is to perform a web page crawl. -  `cloud_object_storage` indicates the configuration is to connect to a cloud object store. */
  var `type`: js.UndefOr[String] = js.native
}

object Source {
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
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
    def setCredential_id(value: String): Self = this.set("credential_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential_id: Self = this.set("credential_id", js.undefined)
    @scala.inline
    def setOptions(value: SourceOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSchedule(value: SourceSchedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

