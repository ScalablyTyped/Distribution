package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBadRequest extends js.Object {
  var badRequest: Double
  var invalidResolution: Double
  var notFound: Double
  var succeeded: Double
  var unsupportedConflictType: Double
}

object AnonBadRequest {
  @scala.inline
  def apply(
    badRequest: Double,
    invalidResolution: Double,
    notFound: Double,
    succeeded: Double,
    unsupportedConflictType: Double
  ): AnonBadRequest = {
    val __obj = js.Dynamic.literal(badRequest = badRequest.asInstanceOf[js.Any], invalidResolution = invalidResolution.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unsupportedConflictType = unsupportedConflictType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBadRequest]
  }
}

