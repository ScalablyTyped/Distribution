package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BadRequest extends js.Object {
  var badRequest: Double
  var invalidResolution: Double
  var notFound: Double
  var succeeded: Double
  var unsupportedConflictType: Double
}

object Anon_BadRequest {
  @scala.inline
  def apply(
    badRequest: Double,
    invalidResolution: Double,
    notFound: Double,
    succeeded: Double,
    unsupportedConflictType: Double
  ): Anon_BadRequest = {
    val __obj = js.Dynamic.literal(badRequest = badRequest.asInstanceOf[js.Any], invalidResolution = invalidResolution.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unsupportedConflictType = unsupportedConflictType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BadRequest]
  }
}

