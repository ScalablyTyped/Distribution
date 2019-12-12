package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Core.CoreProximityEvaluationScore.closest
import typings.winrt.Windows.UI.Core.CoreProximityEvaluationScore.farthest
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreProximityEvaluationScore with Double] = js.native
  /* 0 */ @js.native
  object closest extends TopLevel[closest with Double]
  
  /* 1 */ @js.native
  object farthest extends TopLevel[farthest with Double]
  
}

