package typings
package winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountAction extends js.Object

/** Specifies actions that your app does on an web account. */
@JSGlobal("Windows.UI.ApplicationSettings.WebAccountAction")
@js.native
object WebAccountAction extends js.Object {
  /** The app displays UI for managing the web account. */
  @js.native
  sealed trait manage
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction
  
  /** The app does a custom action with the web account. */
  @js.native
  sealed trait more
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction
  
  /** The app attempts to connect to the web account. */
  @js.native
  sealed trait reconnect
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction
  
  /** The app removes the web account from the account settings pane. */
  @js.native
  sealed trait remove
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction
  
  /** The app displays details about the web account. */
  @js.native
  sealed trait viewDetails
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction
  
  /* 3 */ val manage: manage with scala.Double = js.native
  /* 4 */ val more: more with scala.Double = js.native
  /* 0 */ val reconnect: reconnect with scala.Double = js.native
  /* 1 */ val remove: remove with scala.Double = js.native
  /* 2 */ val viewDetails: viewDetails with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction with scala.Double
  ] = js.native
}

