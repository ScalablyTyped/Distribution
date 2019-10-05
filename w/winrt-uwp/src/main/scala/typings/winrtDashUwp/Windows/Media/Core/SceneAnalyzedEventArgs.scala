package typings.winrtDashUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SceneAnalysisEffect::SceneAnalyzed event. */
@JSGlobal("Windows.Media.Core.SceneAnalyzedEventArgs")
@js.native
abstract class SceneAnalyzedEventArgs () extends js.Object {
  /** Gets the result frame from the scene analysis operation. */
  var resultFrame: SceneAnalysisEffectFrame = js.native
}

