package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to enable and disable High Dynamic Range (HDR) analysis for the SceneAnalysisEffect . */
trait HighDynamicRangeControl extends js.Object {
  /** Gets or sets a value that specifies whether High Dynamic Range (HDR) analysis is enabled for the SceneAnalysisEffect . */
  var enabled: Boolean
}

object HighDynamicRangeControl {
  @scala.inline
  def apply(enabled: Boolean): HighDynamicRangeControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighDynamicRangeControl]
  }
}

