package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SceneAnalysisEffect::SceneAnalyzed event. */
trait SceneAnalyzedEventArgs extends js.Object {
  /** Gets the result frame from the scene analysis operation. */
  var resultFrame: SceneAnalysisEffectFrame
}

object SceneAnalyzedEventArgs {
  @scala.inline
  def apply(resultFrame: SceneAnalysisEffectFrame): SceneAnalyzedEventArgs = {
    val __obj = js.Dynamic.literal(resultFrame = resultFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAnalyzedEventArgs]
  }
}

