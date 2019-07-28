package typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreTextTextUpdatingResult extends js.Object

/** Defines constants that specify the result of handling the TextUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextTextUpdatingResult")
@js.native
object CoreTextTextUpdatingResult extends js.Object {
  /** The text update operation was not completed as the text input server expected. The state of the text input control is unchanged. */
  @js.native
  sealed trait failed extends CoreTextTextUpdatingResult
  
  /** The text update operation completed successfully. */
  @js.native
  sealed trait succeeded extends CoreTextTextUpdatingResult
  
  /* 1 */ val failed: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextTextUpdatingResult.failed with Double = js.native
  /* 0 */ val succeeded: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextTextUpdatingResult.succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextTextUpdatingResult with Double] = js.native
}

