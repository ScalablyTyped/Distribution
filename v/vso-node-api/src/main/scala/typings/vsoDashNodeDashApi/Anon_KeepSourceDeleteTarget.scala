package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeepSourceDeleteTarget extends js.Object {
  var keepSourceDeleteTarget: Double
  var keepSourceRenameTarget: Double
  var keepTargetDeleteSource: Double
  var keepTargetRenameSource: Double
  var undecided: Double
}

object Anon_KeepSourceDeleteTarget {
  @scala.inline
  def apply(
    keepSourceDeleteTarget: Double,
    keepSourceRenameTarget: Double,
    keepTargetDeleteSource: Double,
    keepTargetRenameSource: Double,
    undecided: Double
  ): Anon_KeepSourceDeleteTarget = {
    val __obj = js.Dynamic.literal(keepSourceDeleteTarget = keepSourceDeleteTarget, keepSourceRenameTarget = keepSourceRenameTarget, keepTargetDeleteSource = keepTargetDeleteSource, keepTargetRenameSource = keepTargetRenameSource, undecided = undecided)
  
    __obj.asInstanceOf[Anon_KeepSourceDeleteTarget]
  }
}

