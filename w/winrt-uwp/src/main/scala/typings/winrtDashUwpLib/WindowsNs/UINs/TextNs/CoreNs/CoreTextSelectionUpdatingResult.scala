package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

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
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextSelectionUpdatingResult
  
  /** The selection update operation completed successfully. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextSelectionUpdatingResult
  
  val failed: failed with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextSelectionUpdatingResult with java.lang.String
  ] = js.native
}

