package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadRequest extends js.Object {
  var badRequest: scala.Double
  var invalidResolution: scala.Double
  var notFound: scala.Double
  var succeeded: scala.Double
  var unsupportedConflictType: scala.Double
}

object BadRequest {
  @scala.inline
  def apply(
    badRequest: scala.Double,
    invalidResolution: scala.Double,
    notFound: scala.Double,
    succeeded: scala.Double,
    unsupportedConflictType: scala.Double
  ): BadRequest = {
    val __obj = js.Dynamic.literal(badRequest = badRequest.asInstanceOf[js.Any], invalidResolution = invalidResolution.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unsupportedConflictType = unsupportedConflictType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadRequest]
  }
}

