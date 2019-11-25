package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing source parameters for the configuration. */
trait Source extends js.Object {
  /** The **credential_id** of the credentials to use to connect to the source. Credentials are defined using the **credentials** method. The **source_type** of the credentials used must match the **type** field specified in this object. */
  var credential_id: js.UndefOr[String] = js.undefined
  /** The **options** object defines which items to crawl from the source system. */
  var options: js.UndefOr[SourceOptions] = js.undefined
  /** Object containing the schedule information for the source. */
  var schedule: js.UndefOr[SourceSchedule] = js.undefined
  /** The type of source to connect to. -  `box` indicates the configuration is to connect an instance of Enterprise Box. -  `salesforce` indicates the configuration is to connect to Salesforce. -  `sharepoint` indicates the configuration is to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the configuration is to perform a web page crawl. -  `cloud_object_storage` indicates the configuration is to connect to a cloud object store. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    credential_id: String = null,
    options: SourceOptions = null,
    schedule: SourceSchedule = null,
    `type`: String = null
  ): Source = {
    val __obj = js.Dynamic.literal()
    if (credential_id != null) __obj.updateDynamic("credential_id")(credential_id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

