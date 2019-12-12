package typings.winrtDashUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult.failed
import typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult.succeeded
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextTextUpdatingResult with Double] = js.native
  /* 1 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 0 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
}

