package typings
package winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs

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
  sealed trait manage
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions
  
  /** The app does a custom action with the web account. */
  @js.native
  sealed trait more
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions
  
  /** No action. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions
  
  /** The app attempts to connect to the web account. */
  @js.native
  sealed trait reconnect
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions
  
  /** The app removes the web account from the account settings pane. */
  @js.native
  sealed trait remove
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions
  
  /** The app displays details about the web account. */
  @js.native
  sealed trait viewDetails
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions
  
  /* 4 */ val manage: manage with scala.Double = js.native
  /* 5 */ val more: more with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val reconnect: reconnect with scala.Double = js.native
  /* 2 */ val remove: remove with scala.Double = js.native
  /* 3 */ val viewDetails: viewDetails with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SupportedWebAccountActions with scala.Double
  ] = js.native
}

