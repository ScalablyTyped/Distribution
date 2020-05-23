package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The status and message of the deletion request. */
trait FeedbackDeleted extends js.Object {
  /** Status message returned from the service. */
  var message: js.UndefOr[String] = js.undefined
  /** HTTP return code. */
  var status: js.UndefOr[Double] = js.undefined
}

object FeedbackDeleted {
  @scala.inline
  def apply(message: String = null, status: js.UndefOr[Double] = js.undefined): FeedbackDeleted = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackDeleted]
  }
}

