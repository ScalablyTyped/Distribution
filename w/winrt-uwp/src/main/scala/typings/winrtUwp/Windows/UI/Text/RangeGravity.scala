package typings.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
