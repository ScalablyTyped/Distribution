package typings.winrtDashUwp.WindowsNs.UINs.TextNs

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
  sealed trait backward extends RangeGravity
  
  /** Use the formatting of the following text run when on a boundary between runs. */
  @js.native
  sealed trait forward extends RangeGravity
  
  /** The start of the text range has forward gravity, and the end has backward gravity. */
  @js.native
  sealed trait inward extends RangeGravity
  
  /** The start of the text range has backward gravity, and the end has forward gravity. */
  @js.native
  sealed trait outward extends RangeGravity
  
  /** Use selection user interface rules. */
  @js.native
  sealed trait uiBehavior extends RangeGravity
  
  /* 1 */ val backward: typings.winrtDashUwp.WindowsNs.UINs.TextNs.RangeGravity.backward with Double = js.native
  /* 2 */ val forward: typings.winrtDashUwp.WindowsNs.UINs.TextNs.RangeGravity.forward with Double = js.native
  /* 3 */ val inward: typings.winrtDashUwp.WindowsNs.UINs.TextNs.RangeGravity.inward with Double = js.native
  /* 4 */ val outward: typings.winrtDashUwp.WindowsNs.UINs.TextNs.RangeGravity.outward with Double = js.native
  /* 0 */ val uiBehavior: typings.winrtDashUwp.WindowsNs.UINs.TextNs.RangeGravity.uiBehavior with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangeGravity with Double] = js.native
}

