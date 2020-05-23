package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepBothFiles extends js.Object {
  var keepBothFiles: scala.Double
  var keepSourcePath: scala.Double
  var keepTargetPath: scala.Double
  var undecided: scala.Double
}

object KeepBothFiles {
  @scala.inline
  def apply(
    keepBothFiles: scala.Double,
    keepSourcePath: scala.Double,
    keepTargetPath: scala.Double,
    undecided: scala.Double
  ): KeepBothFiles = {
    val __obj = js.Dynamic.literal(keepBothFiles = keepBothFiles.asInstanceOf[js.Any], keepSourcePath = keepSourcePath.asInstanceOf[js.Any], keepTargetPath = keepTargetPath.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepBothFiles]
  }
}

