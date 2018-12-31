package typings
package winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods to show the accounts pane and also to enable the app to register callbacks when the accounts flyout is about to be displayed. */
@JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPane")
@js.native
abstract class AccountsSettingsPane () extends js.Object {
  /** Occurs when the user opens the accounts pane. Handling this event lets the app initialize the accounts commands and pause its UI until the user closes the pane. */
  @JSName("onaccountcommandsrequested")
  var onaccountcommandsrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountcommandsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountcommandsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when the user opens the accounts pane. Handling this event lets the app initialize the accounts commands and pause its UI until the user closes the pane. */
  def onaccountcommandsrequested(
    ev: AccountsSettingsPaneCommandsRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AccountsSettingsPane]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountcommandsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountcommandsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs]
  ): scala.Unit = js.native
}

/** Provides methods to show the accounts pane and also to enable the app to register callbacks when the accounts flyout is about to be displayed. */
@JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPane")
@js.native
object AccountsSettingsPane extends js.Object {
  /**
    * Gets an AccountsSettingsPane object that is associated with the current app view (that is, with CoreWindow ).
    * @return The account settings pane.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.AccountsSettingsPane = js.native
  /** Displays the account settings pane. */
  def show(): scala.Unit = js.native
}

