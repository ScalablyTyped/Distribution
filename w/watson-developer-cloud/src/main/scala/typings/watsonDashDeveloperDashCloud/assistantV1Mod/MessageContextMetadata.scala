package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Metadata related to the message. */
trait MessageContextMetadata extends js.Object {
  /** A label identifying the deployment environment, used for filtering log data. This string cannot contain carriage return, newline, or tab characters. */
  var deployment: js.UndefOr[String] = js.undefined
  /** A string value that identifies the user who is interacting with the workspace. The client must provide a unique identifier for each individual end user who accesses the application. For Plus and Premium plans, this user ID is used to identify unique users for billing purposes. This string cannot contain carriage return, newline, or tab characters. */
  var user_id: js.UndefOr[String] = js.undefined
}

object MessageContextMetadata {
  @scala.inline
  def apply(deployment: String = null, user_id: String = null): MessageContextMetadata = {
    val __obj = js.Dynamic.literal()
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageContextMetadata]
  }
}

