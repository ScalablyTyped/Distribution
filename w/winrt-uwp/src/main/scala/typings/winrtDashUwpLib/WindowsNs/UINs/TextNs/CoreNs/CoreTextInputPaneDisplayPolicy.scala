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
  
  val automatic: automatic with java.lang.String = js.native
  val manual: manual with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputPaneDisplayPolicy with java.lang.String
  ] = js.native
}

