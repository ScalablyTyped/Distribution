package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BacklogInError extends js.Object {
  var backlogInError: scala.Double
  var doesntExistOrAccessDenied: scala.Double
  var maxTeamFieldsExceeded: scala.Double
  var maxTeamsExceeded: scala.Double
  var missingTeamFieldValue: scala.Double
  var noIterationsExist: scala.Double
  var oK: scala.Double
}

object Anon_BacklogInError {
  @scala.inline
  def apply(
    backlogInError: scala.Double,
    doesntExistOrAccessDenied: scala.Double,
    maxTeamFieldsExceeded: scala.Double,
    maxTeamsExceeded: scala.Double,
    missingTeamFieldValue: scala.Double,
    noIterationsExist: scala.Double,
    oK: scala.Double
  ): Anon_BacklogInError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backlogInError")(backlogInError)
    __obj.updateDynamic("doesntExistOrAccessDenied")(doesntExistOrAccessDenied)
    __obj.updateDynamic("maxTeamFieldsExceeded")(maxTeamFieldsExceeded)
    __obj.updateDynamic("maxTeamsExceeded")(maxTeamsExceeded)
    __obj.updateDynamic("missingTeamFieldValue")(missingTeamFieldValue)
    __obj.updateDynamic("noIterationsExist")(noIterationsExist)
    __obj.updateDynamic("oK")(oK)
    __obj.asInstanceOf[Anon_BacklogInError]
  }
}

