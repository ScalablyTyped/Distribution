package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreWindowFlowDirection extends js.Object

@JSGlobal("Windows.UI.Core.CoreWindowFlowDirection")
@js.native
object CoreWindowFlowDirection extends js.Object {
  @js.native
  sealed trait leftToRight
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreWindowFlowDirection
  
  @js.native
  sealed trait rightToLeft
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreWindowFlowDirection
  
  /* 0 */ val leftToRight: leftToRight with scala.Double = js.native
  /* 1 */ val rightToLeft: rightToLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreWindowFlowDirection with scala.Double] = js.native
}

