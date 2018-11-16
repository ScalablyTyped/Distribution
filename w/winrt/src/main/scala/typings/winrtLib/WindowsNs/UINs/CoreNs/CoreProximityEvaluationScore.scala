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
  
  val closest: closest with java.lang.String = js.native
  val farthest: farthest with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.CoreNs.CoreProximityEvaluationScore with java.lang.String
  ] = js.native
}

