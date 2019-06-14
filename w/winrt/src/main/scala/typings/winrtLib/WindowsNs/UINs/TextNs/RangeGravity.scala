package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeGravity extends js.Object

@JSGlobal("Windows.UI.Text.RangeGravity")
@js.native
object RangeGravity extends js.Object {
  @js.native
  sealed trait backward
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  @js.native
  sealed trait forward
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  @js.native
  sealed trait inward
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  @js.native
  sealed trait outward
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  @js.native
  sealed trait uIBehavior
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  /* 1 */ val backward: backward with scala.Double = js.native
  /* 2 */ val forward: forward with scala.Double = js.native
  /* 3 */ val inward: inward with scala.Double = js.native
  /* 4 */ val outward: outward with scala.Double = js.native
  /* 0 */ val uIBehavior: uIBehavior with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.RangeGravity with scala.Double] = js.native
}

