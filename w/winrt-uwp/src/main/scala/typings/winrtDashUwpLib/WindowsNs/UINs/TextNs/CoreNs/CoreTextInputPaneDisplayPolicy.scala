package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreTextInputPaneDisplayPolicy extends js.Object

/** Defines constants that specify whether the input pane should be shown automatically when focus enters your text input control. */
@JSGlobal("Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy")
@js.native
object CoreTextInputPaneDisplayPolicy extends js.Object {
  /** The input pane will be shown automatically when focus enters your text input control. */
  @js.native
  sealed trait automatic
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputPaneDisplayPolicy
  
  /** Your app is responsible for showing and hiding the input pane. */
  @js.native
  sealed trait manual
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputPaneDisplayPolicy
  
  /* 0 */ val automatic: automatic with scala.Double = js.native
  /* 1 */ val manual: manual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputPaneDisplayPolicy with scala.Double
  ] = js.native
}

