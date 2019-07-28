package typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreTextSelectionUpdatingResult extends js.Object

/** Defines constants that specify the result of handling the SelectionUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingResult")
@js.native
object CoreTextSelectionUpdatingResult extends js.Object {
  /** The selection update operation was not completed as the text input server expected. */
  @js.native
  sealed trait failed extends CoreTextSelectionUpdatingResult
  
  /** The selection update operation completed successfully. */
  @js.native
  sealed trait succeeded extends CoreTextSelectionUpdatingResult
  
  /* 1 */ val failed: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextSelectionUpdatingResult.failed with Double = js.native
  /* 0 */ val succeeded: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextSelectionUpdatingResult.succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextSelectionUpdatingResult with Double] = js.native
}

