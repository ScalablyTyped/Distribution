package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to enable and disable High Dynamic Range (HDR) analysis for the SceneAnalysisEffect . */
@js.native
trait HighDynamicRangeControl extends js.Object {
  /** Gets or sets a value that specifies whether High Dynamic Range (HDR) analysis is enabled for the SceneAnalysisEffect . */
  var enabled: Boolean = js.native
}

object HighDynamicRangeControl {
  @scala.inline
  def apply(enabled: Boolean): HighDynamicRangeControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighDynamicRangeControl]
  }
  @scala.inline
  implicit class HighDynamicRangeControlOps[Self <: HighDynamicRangeControl] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
  
}

