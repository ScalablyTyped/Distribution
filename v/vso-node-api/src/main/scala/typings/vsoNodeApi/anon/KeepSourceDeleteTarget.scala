package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepSourceDeleteTarget extends js.Object {
  var keepSourceDeleteTarget: scala.Double
  var keepSourceRenameTarget: scala.Double
  var keepTargetDeleteSource: scala.Double
  var keepTargetRenameSource: scala.Double
  var undecided: scala.Double
}

object KeepSourceDeleteTarget {
  @scala.inline
  def apply(
    keepSourceDeleteTarget: scala.Double,
    keepSourceRenameTarget: scala.Double,
    keepTargetDeleteSource: scala.Double,
    keepTargetRenameSource: scala.Double,
    undecided: scala.Double
  ): KeepSourceDeleteTarget = {
    val __obj = js.Dynamic.literal(keepSourceDeleteTarget = keepSourceDeleteTarget.asInstanceOf[js.Any], keepSourceRenameTarget = keepSourceRenameTarget.asInstanceOf[js.Any], keepTargetDeleteSource = keepTargetDeleteSource.asInstanceOf[js.Any], keepTargetRenameSource = keepTargetRenameSource.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepSourceDeleteTarget]
  }
}

