package typings.winrtDashUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy.automatic
import typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy.manual
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextInputPaneDisplayPolicy with Double] = js.native
  /* 0 */ @js.native
  object automatic extends TopLevel[automatic with Double]
  
  /* 1 */ @js.native
  object manual extends TopLevel[manual with Double]
  
}

