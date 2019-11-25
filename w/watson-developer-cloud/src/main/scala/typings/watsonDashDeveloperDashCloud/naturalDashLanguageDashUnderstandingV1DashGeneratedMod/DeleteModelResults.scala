package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Delete model results. */
trait DeleteModelResults extends js.Object {
  /** model_id of the deleted model. */
  var deleted: js.UndefOr[String] = js.undefined
}

object DeleteModelResults {
  @scala.inline
  def apply(deleted: String = null): DeleteModelResults = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelResults]
  }
}

