package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeepSourceDeleteTarget extends js.Object {
  var keepSourceDeleteTarget: scala.Double
  var keepSourceRenameTarget: scala.Double
  var keepTargetDeleteSource: scala.Double
  var keepTargetRenameSource: scala.Double
  var undecided: scala.Double
}

object Anon_KeepSourceDeleteTarget {
  @scala.inline
  def apply(
    keepSourceDeleteTarget: scala.Double,
    keepSourceRenameTarget: scala.Double,
    keepTargetDeleteSource: scala.Double,
    keepTargetRenameSource: scala.Double,
    undecided: scala.Double
  ): Anon_KeepSourceDeleteTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keepSourceDeleteTarget")(keepSourceDeleteTarget)
    __obj.updateDynamic("keepSourceRenameTarget")(keepSourceRenameTarget)
    __obj.updateDynamic("keepTargetDeleteSource")(keepTargetDeleteSource)
    __obj.updateDynamic("keepTargetRenameSource")(keepTargetRenameSource)
    __obj.updateDynamic("undecided")(undecided)
    __obj.asInstanceOf[Anon_KeepSourceDeleteTarget]
  }
}

