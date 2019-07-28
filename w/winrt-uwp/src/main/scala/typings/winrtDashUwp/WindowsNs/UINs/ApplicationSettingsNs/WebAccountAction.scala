package typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs

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
  sealed trait manage extends WebAccountAction
  
  /** The app does a custom action with the web account. */
  @js.native
  sealed trait more extends WebAccountAction
  
  /** The app attempts to connect to the web account. */
  @js.native
  sealed trait reconnect extends WebAccountAction
  
  /** The app removes the web account from the account settings pane. */
  @js.native
  sealed trait remove extends WebAccountAction
  
  /** The app displays details about the web account. */
  @js.native
  sealed trait viewDetails extends WebAccountAction
  
  /* 3 */ val manage: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction.manage with Double = js.native
  /* 4 */ val more: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction.more with Double = js.native
  /* 0 */ val reconnect: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction.reconnect with Double = js.native
  /* 1 */ val remove: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction.remove with Double = js.native
  /* 2 */ val viewDetails: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction.viewDetails with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountAction with Double] = js.native
}

