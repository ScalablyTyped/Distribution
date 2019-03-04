package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InvalidPath extends js.Object {
  var invalidPath: scala.Double
  var mergeContentNotFound: scala.Double
  var none: scala.Double
  var otherError: scala.Double
  var pathInUse: scala.Double
  var unknownAction: scala.Double
  var unknownMergeType: scala.Double
}

object Anon_InvalidPath {
  @scala.inline
  def apply(
    invalidPath: scala.Double,
    mergeContentNotFound: scala.Double,
    none: scala.Double,
    otherError: scala.Double,
    pathInUse: scala.Double,
    unknownAction: scala.Double,
    unknownMergeType: scala.Double
  ): Anon_InvalidPath = {
    val __obj = js.Dynamic.literal(invalidPath = invalidPath, mergeContentNotFound = mergeContentNotFound, none = none, otherError = otherError, pathInUse = pathInUse, unknownAction = unknownAction, unknownMergeType = unknownMergeType)
  
    __obj.asInstanceOf[Anon_InvalidPath]
  }
}

