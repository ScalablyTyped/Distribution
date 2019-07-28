package typings.winrt.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreProximityEvaluationScore extends js.Object

@JSGlobal("Windows.UI.Core.CoreProximityEvaluationScore")
@js.native
object CoreProximityEvaluationScore extends js.Object {
  @js.native
  sealed trait closest extends CoreProximityEvaluationScore
  
  @js.native
  sealed trait farthest extends CoreProximityEvaluationScore
  
  /* 0 */ val closest: typings.winrt.WindowsNs.UINs.CoreNs.CoreProximityEvaluationScore.closest with Double = js.native
  /* 1 */ val farthest: typings.winrt.WindowsNs.UINs.CoreNs.CoreProximityEvaluationScore.farthest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreProximityEvaluationScore with Double] = js.native
}

