package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeepSourceDeleteTarget extends js.Object {
  var keepSourceDeleteTarget: scala.Double = js.native
  var keepSourceRenameTarget: scala.Double = js.native
  var keepTargetDeleteSource: scala.Double = js.native
  var keepTargetRenameSource: scala.Double = js.native
  var undecided: scala.Double = js.native
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
  @scala.inline
  implicit class KeepSourceDeleteTargetOps[Self <: KeepSourceDeleteTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeepSourceDeleteTarget(value: scala.Double): Self = this.set("keepSourceDeleteTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepSourceRenameTarget(value: scala.Double): Self = this.set("keepSourceRenameTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepTargetDeleteSource(value: scala.Double): Self = this.set("keepTargetDeleteSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepTargetRenameSource(value: scala.Double): Self = this.set("keepTargetRenameSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndecided(value: scala.Double): Self = this.set("undecided", value.asInstanceOf[js.Any])
  }
  
}

