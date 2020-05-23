package typings.winrt.Windows.UI.Core

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
  
}

