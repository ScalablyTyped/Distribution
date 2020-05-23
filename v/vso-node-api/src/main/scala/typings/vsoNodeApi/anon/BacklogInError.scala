package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogInError extends js.Object {
  var backlogInError: scala.Double
  var doesntExistOrAccessDenied: scala.Double
  var maxTeamFieldsExceeded: scala.Double
  var maxTeamsExceeded: scala.Double
  var missingTeamFieldValue: scala.Double
  var noIterationsExist: scala.Double
  var oK: scala.Double
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
}

