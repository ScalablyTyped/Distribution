package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Text.RangeGravity.backward
import typings.winrtDashUwp.Windows.UI.Text.RangeGravity.forward
import typings.winrtDashUwp.Windows.UI.Text.RangeGravity.inward
import typings.winrtDashUwp.Windows.UI.Text.RangeGravity.outward
import typings.winrtDashUwp.Windows.UI.Text.RangeGravity.uiBehavior
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangeGravity with Double] = js.native
  /* 1 */ @js.native
  object backward extends TopLevel[backward with Double]
  
  /* 2 */ @js.native
  object forward extends TopLevel[forward with Double]
  
  /* 3 */ @js.native
  object inward extends TopLevel[inward with Double]
  
  /* 4 */ @js.native
  object outward extends TopLevel[outward with Double]
  
  /* 0 */ @js.native
  object uiBehavior extends TopLevel[uiBehavior with Double]
  
}

