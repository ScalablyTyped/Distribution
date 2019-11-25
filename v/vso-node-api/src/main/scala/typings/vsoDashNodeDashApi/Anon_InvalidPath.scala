package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InvalidPath extends js.Object {
  var invalidPath: Double
  var mergeContentNotFound: Double
  var none: Double
  var otherError: Double
  var pathInUse: Double
  var unknownAction: Double
  var unknownMergeType: Double
}

object Anon_InvalidPath {
  @scala.inline
  def apply(
    invalidPath: Double,
    mergeContentNotFound: Double,
    none: Double,
    otherError: Double,
    pathInUse: Double,
    unknownAction: Double,
    unknownMergeType: Double
  ): Anon_InvalidPath = {
    val __obj = js.Dynamic.literal(invalidPath = invalidPath.asInstanceOf[js.Any], mergeContentNotFound = mergeContentNotFound.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], otherError = otherError.asInstanceOf[js.Any], pathInUse = pathInUse.asInstanceOf[js.Any], unknownAction = unknownAction.asInstanceOf[js.Any], unknownMergeType = unknownMergeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InvalidPath]
  }
}

