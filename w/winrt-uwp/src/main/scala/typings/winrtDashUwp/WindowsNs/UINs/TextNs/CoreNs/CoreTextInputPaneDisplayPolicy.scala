package typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs

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
  sealed trait automatic extends CoreTextInputPaneDisplayPolicy
  
  /** Your app is responsible for showing and hiding the input pane. */
  @js.native
  sealed trait manual extends CoreTextInputPaneDisplayPolicy
  
  /* 0 */ val automatic: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputPaneDisplayPolicy.automatic with Double = js.native
  /* 1 */ val manual: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputPaneDisplayPolicy.manual with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextInputPaneDisplayPolicy with Double] = js.native
}

