package typings.winrtDashUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextFormatUpdatingResult with Double] = js.native
  /* 1 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 0 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
}

