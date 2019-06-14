package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeGravity extends js.Object

/** Specifies the gravity for a text range. */
@JSGlobal("Windows.UI.Text.RangeGravity")
@js.native
object RangeGravity extends js.Object {
  /** Use the formatting of the previous text run when on a boundary between runs. */
  @js.native
  sealed trait backward
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.RangeGravity
  
  /** Use the formatting of the following text run when on a boundary between runs. */
  @js.native
  sealed trait forward
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.RangeGravity
  
  /** The start of the text range has forward gravity, and the end has backward gravity. */
  @js.native
  sealed trait inward
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.RangeGravity
  
  /** The start of the text range has backward gravity, and the end has forward gravity. */
  @js.native
  sealed trait outward
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.RangeGravity
  
  /** Use selection user interface rules. */
  @js.native
  sealed trait uiBehavior
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.RangeGravity
  
  /* 1 */ val backward: backward with scala.Double = js.native
  /* 2 */ val forward: forward with scala.Double = js.native
  /* 3 */ val inward: inward with scala.Double = js.native
  /* 4 */ val outward: outward with scala.Double = js.native
  /* 0 */ val uiBehavior: uiBehavior with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.RangeGravity with scala.Double] = js.native
}

