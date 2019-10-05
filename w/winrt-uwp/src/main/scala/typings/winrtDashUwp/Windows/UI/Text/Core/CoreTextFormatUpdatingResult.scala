package typings.winrtDashUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreTextFormatUpdatingResult extends js.Object

/** Defines constants that specify the result of handling the FormatUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingResult")
@js.native
object CoreTextFormatUpdatingResult extends js.Object {
  /** The format update operation was not completed as the text input server expected. */
  @js.native
  sealed trait failed extends CoreTextFormatUpdatingResult
  
  /** The format update operation completed successfully. */
  @js.native
  sealed trait succeeded extends CoreTextFormatUpdatingResult
  
  /* 1 */ val failed: typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult.failed with Double = js.native
  /* 0 */ val succeeded: typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult.succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextFormatUpdatingResult with Double] = js.native
}

