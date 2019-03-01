package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeepBothFiles extends js.Object {
  var keepBothFiles: scala.Double
  var keepSourcePath: scala.Double
  var keepTargetPath: scala.Double
  var undecided: scala.Double
}

object Anon_KeepBothFiles {
  @scala.inline
  def apply(
    keepBothFiles: scala.Double,
    keepSourcePath: scala.Double,
    keepTargetPath: scala.Double,
    undecided: scala.Double
  ): Anon_KeepBothFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keepBothFiles")(keepBothFiles)
    __obj.updateDynamic("keepSourcePath")(keepSourcePath)
    __obj.updateDynamic("keepTargetPath")(keepTargetPath)
    __obj.updateDynamic("undecided")(undecided)
    __obj.asInstanceOf[Anon_KeepBothFiles]
  }
}

