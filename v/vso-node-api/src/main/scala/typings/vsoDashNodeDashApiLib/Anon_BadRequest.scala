package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BadRequest extends js.Object {
  var badRequest: scala.Double
  var invalidResolution: scala.Double
  var notFound: scala.Double
  var succeeded: scala.Double
  var unsupportedConflictType: scala.Double
}

object Anon_BadRequest {
  @scala.inline
  def apply(
    badRequest: scala.Double,
    invalidResolution: scala.Double,
    notFound: scala.Double,
    succeeded: scala.Double,
    unsupportedConflictType: scala.Double
  ): Anon_BadRequest = {
    val __obj = js.Dynamic.literal(badRequest = badRequest, invalidResolution = invalidResolution, notFound = notFound, succeeded = succeeded, unsupportedConflictType = unsupportedConflictType)
  
    __obj.asInstanceOf[Anon_BadRequest]
  }
}

