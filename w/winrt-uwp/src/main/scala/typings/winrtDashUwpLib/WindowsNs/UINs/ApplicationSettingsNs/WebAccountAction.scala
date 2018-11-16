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
  
  val manage: manage with java.lang.String = js.native
  val more: more with java.lang.String = js.native
  val reconnect: reconnect with java.lang.String = js.native
  val remove: remove with java.lang.String = js.native
  val viewDetails: viewDetails with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.WebAccountAction with java.lang.String
  ] = js.native
}

