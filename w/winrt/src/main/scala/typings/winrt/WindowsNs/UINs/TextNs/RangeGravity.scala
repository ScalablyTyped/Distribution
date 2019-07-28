package typings.winrt.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeGravity extends js.Object

@JSGlobal("Windows.UI.Text.RangeGravity")
@js.native
object RangeGravity extends js.Object {
  @js.native
  sealed trait backward extends RangeGravity
  
  @js.native
  sealed trait forward extends RangeGravity
  
  @js.native
  sealed trait inward extends RangeGravity
  
  @js.native
  sealed trait outward extends RangeGravity
  
  @js.native
  sealed trait uIBehavior extends RangeGravity
  
  /* 1 */ val backward: typings.winrt.WindowsNs.UINs.TextNs.RangeGravity.backward with Double = js.native
  /* 2 */ val forward: typings.winrt.WindowsNs.UINs.TextNs.RangeGravity.forward with Double = js.native
  /* 3 */ val inward: typings.winrt.WindowsNs.UINs.TextNs.RangeGravity.inward with Double = js.native
  /* 4 */ val outward: typings.winrt.WindowsNs.UINs.TextNs.RangeGravity.outward with Double = js.native
  /* 0 */ val uIBehavior: typings.winrt.WindowsNs.UINs.TextNs.RangeGravity.uIBehavior with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangeGravity with Double] = js.native
}

