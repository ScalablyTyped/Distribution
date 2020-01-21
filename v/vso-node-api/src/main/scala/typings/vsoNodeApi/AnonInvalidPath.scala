package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalidPath extends js.Object {
  var invalidPath: Double
  var mergeContentNotFound: Double
  var none: Double
  var otherError: Double
  var pathInUse: Double
  var unknownAction: Double
  var unknownMergeType: Double
}

object AnonInvalidPath {
  @scala.inline
  def apply(
    invalidPath: Double,
    mergeContentNotFound: Double,
    none: Double,
    otherError: Double,
    pathInUse: Double,
    unknownAction: Double,
    unknownMergeType: Double
  ): AnonInvalidPath = {
    val __obj = js.Dynamic.literal(invalidPath = invalidPath.asInstanceOf[js.Any], mergeContentNotFound = mergeContentNotFound.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], otherError = otherError.asInstanceOf[js.Any], pathInUse = pathInUse.asInstanceOf[js.Any], unknownAction = unknownAction.asInstanceOf[js.Any], unknownMergeType = unknownMergeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInvalidPath]
  }
}

