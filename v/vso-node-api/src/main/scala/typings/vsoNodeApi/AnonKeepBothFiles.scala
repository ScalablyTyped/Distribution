package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeepBothFiles extends js.Object {
  var keepBothFiles: Double
  var keepSourcePath: Double
  var keepTargetPath: Double
  var undecided: Double
}

object AnonKeepBothFiles {
  @scala.inline
  def apply(keepBothFiles: Double, keepSourcePath: Double, keepTargetPath: Double, undecided: Double): AnonKeepBothFiles = {
    val __obj = js.Dynamic.literal(keepBothFiles = keepBothFiles.asInstanceOf[js.Any], keepSourcePath = keepSourcePath.asInstanceOf[js.Any], keepTargetPath = keepTargetPath.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeepBothFiles]
  }
}

