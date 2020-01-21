package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBacklogInError extends js.Object {
  var backlogInError: Double
  var doesntExistOrAccessDenied: Double
  var maxTeamFieldsExceeded: Double
  var maxTeamsExceeded: Double
  var missingTeamFieldValue: Double
  var noIterationsExist: Double
  var oK: Double
}

object AnonBacklogInError {
  @scala.inline
  def apply(
    backlogInError: Double,
    doesntExistOrAccessDenied: Double,
    maxTeamFieldsExceeded: Double,
    maxTeamsExceeded: Double,
    missingTeamFieldValue: Double,
    noIterationsExist: Double,
    oK: Double
  ): AnonBacklogInError = {
    val __obj = js.Dynamic.literal(backlogInError = backlogInError.asInstanceOf[js.Any], doesntExistOrAccessDenied = doesntExistOrAccessDenied.asInstanceOf[js.Any], maxTeamFieldsExceeded = maxTeamFieldsExceeded.asInstanceOf[js.Any], maxTeamsExceeded = maxTeamsExceeded.asInstanceOf[js.Any], missingTeamFieldValue = missingTeamFieldValue.asInstanceOf[js.Any], noIterationsExist = noIterationsExist.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBacklogInError]
  }
}

