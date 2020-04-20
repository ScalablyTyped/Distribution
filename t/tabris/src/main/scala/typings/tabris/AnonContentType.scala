package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentType extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var jobName: js.UndefOr[String] = js.undefined
}

object AnonContentType {
  @scala.inline
  def apply(contentType: String = null, jobName: String = null): AnonContentType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentType]
  }
}

