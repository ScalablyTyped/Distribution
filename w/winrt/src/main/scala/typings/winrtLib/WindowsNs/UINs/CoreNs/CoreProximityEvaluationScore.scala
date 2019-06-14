package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreProximityEvaluationScore extends js.Object

@JSGlobal("Windows.UI.Core.CoreProximityEvaluationScore")
@js.native
object CoreProximityEvaluationScore extends js.Object {
  @js.native
  sealed trait closest
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreProximityEvaluationScore
  
  @js.native
  sealed trait farthest
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreProximityEvaluationScore
  
  /* 0 */ val closest: closest with scala.Double = js.native
  /* 1 */ val farthest: farthest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreProximityEvaluationScore with scala.Double] = js.native
}

