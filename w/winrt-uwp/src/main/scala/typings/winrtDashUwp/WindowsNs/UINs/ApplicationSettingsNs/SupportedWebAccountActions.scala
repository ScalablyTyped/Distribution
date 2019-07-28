package typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SupportedWebAccountActions extends js.Object

/** Specifies actions that your app enables on an web account instance in the account settings pane. */
@JSGlobal("Windows.UI.ApplicationSettings.SupportedWebAccountActions")
@js.native
object SupportedWebAccountActions extends js.Object {
  /** The app displays UI for managing the web account. */
  @js.native
  sealed trait manage extends SupportedWebAccountActions
  
  /** The app does a custom action with the web account. */
  @js.native
  sealed trait more extends SupportedWebAccountActions
  
  /** No action. */
  @js.native
  sealed trait none extends SupportedWebAccountActions
  
  /** The app attempts to connect to the web account. */
  @js.native
  sealed trait reconnect extends SupportedWebAccountActions
  
  /** The app removes the web account from the account settings pane. */
  @js.native
  sealed trait remove extends SupportedWebAccountActions
  
  /** The app displays details about the web account. */
  @js.native
  sealed trait viewDetails extends SupportedWebAccountActions
  
  /* 4 */ val manage: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions.manage with Double = js.native
  /* 5 */ val more: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions.more with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions.none with Double = js.native
  /* 1 */ val reconnect: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions.reconnect with Double = js.native
  /* 2 */ val remove: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions.remove with Double = js.native
  /* 3 */ val viewDetails: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions.viewDetails with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportedWebAccountActions with Double] = js.native
}

