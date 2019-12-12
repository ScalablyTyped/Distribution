package typings.winrtDashUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult.failed
import typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult.succeeded
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextSelectionUpdatingResult with Double] = js.native
  /* 1 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 0 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
}

