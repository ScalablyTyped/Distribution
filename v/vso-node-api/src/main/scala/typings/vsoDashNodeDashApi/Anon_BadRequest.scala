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
    val __obj = js.Dynamic.literal(badRequest = badRequest, invalidResolution = invalidResolution, notFound = notFound, succeeded = succeeded, unsupportedConflictType = unsupportedConflictType)
  
    __obj.asInstanceOf[Anon_BadRequest]
  }
}

