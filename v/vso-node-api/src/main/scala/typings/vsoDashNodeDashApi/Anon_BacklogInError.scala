package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BacklogInError extends js.Object {
  var backlogInError: Double
  var doesntExistOrAccessDenied: Double
  var maxTeamFieldsExceeded: Double
  var maxTeamsExceeded: Double
  var missingTeamFieldValue: Double
  var noIterationsExist: Double
  var oK: Double
}

object Anon_BacklogInError {
  @scala.inline
  def apply(
    backlogInError: Double,
    doesntExistOrAccessDenied: Double,
    maxTeamFieldsExceeded: Double,
    maxTeamsExceeded: Double,
    missingTeamFieldValue: Double,
    noIterationsExist: Double,
    oK: Double
  ): Anon_BacklogInError = {
    val __obj = js.Dynamic.literal(backlogInError = backlogInError, doesntExistOrAccessDenied = doesntExistOrAccessDenied, maxTeamFieldsExceeded = maxTeamFieldsExceeded, maxTeamsExceeded = maxTeamsExceeded, missingTeamFieldValue = missingTeamFieldValue, noIterationsExist = noIterationsExist, oK = oK)
  
    __obj.asInstanceOf[Anon_BacklogInError]
  }
}

