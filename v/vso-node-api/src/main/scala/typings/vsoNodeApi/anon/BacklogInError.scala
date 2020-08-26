package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BacklogInError extends js.Object {
  var backlogInError: scala.Double = js.native
  var doesntExistOrAccessDenied: scala.Double = js.native
  var maxTeamFieldsExceeded: scala.Double = js.native
  var maxTeamsExceeded: scala.Double = js.native
  var missingTeamFieldValue: scala.Double = js.native
  var noIterationsExist: scala.Double = js.native
  var oK: scala.Double = js.native
}

object BacklogInError {
  @scala.inline
  def apply(
    backlogInError: scala.Double,
    doesntExistOrAccessDenied: scala.Double,
    maxTeamFieldsExceeded: scala.Double,
    maxTeamsExceeded: scala.Double,
    missingTeamFieldValue: scala.Double,
    noIterationsExist: scala.Double,
    oK: scala.Double
  ): BacklogInError = {
    val __obj = js.Dynamic.literal(backlogInError = backlogInError.asInstanceOf[js.Any], doesntExistOrAccessDenied = doesntExistOrAccessDenied.asInstanceOf[js.Any], maxTeamFieldsExceeded = maxTeamFieldsExceeded.asInstanceOf[js.Any], maxTeamsExceeded = maxTeamsExceeded.asInstanceOf[js.Any], missingTeamFieldValue = missingTeamFieldValue.asInstanceOf[js.Any], noIterationsExist = noIterationsExist.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogInError]
  }
  @scala.inline
  implicit class BacklogInErrorOps[Self <: BacklogInError] (val x: Self) extends AnyVal {
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
    def setBacklogInError(value: scala.Double): Self = this.set("backlogInError", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoesntExistOrAccessDenied(value: scala.Double): Self = this.set("doesntExistOrAccessDenied", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTeamFieldsExceeded(value: scala.Double): Self = this.set("maxTeamFieldsExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTeamsExceeded(value: scala.Double): Self = this.set("maxTeamsExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingTeamFieldValue(value: scala.Double): Self = this.set("missingTeamFieldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoIterationsExist(value: scala.Double): Self = this.set("noIterationsExist", value.asInstanceOf[js.Any])
    @scala.inline
    def setOK(value: scala.Double): Self = this.set("oK", value.asInstanceOf[js.Any])
  }
  
}

