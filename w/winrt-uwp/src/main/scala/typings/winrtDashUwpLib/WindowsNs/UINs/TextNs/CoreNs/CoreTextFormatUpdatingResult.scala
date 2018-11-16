package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

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
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextFormatUpdatingResult
  
  /** The format update operation completed successfully. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextFormatUpdatingResult
  
  val failed: failed with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextFormatUpdatingResult with java.lang.String
  ] = js.native
}

