package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

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
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextTextUpdatingResult
  
  /** The text update operation completed successfully. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextTextUpdatingResult
  
  val failed: failed with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextTextUpdatingResult with java.lang.String
  ] = js.native
}

