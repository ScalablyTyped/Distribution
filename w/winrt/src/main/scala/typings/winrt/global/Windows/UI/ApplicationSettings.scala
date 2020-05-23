package typings.winrt.global.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation
import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ApplicationSettings")
@js.native
object ApplicationSettings extends js.Object {
  @js.native
  class SettingsCommand protected ()
    extends typings.winrt.Windows.UI.ApplicationSettings.SettingsCommand {
    def this(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler) = this()
  }
  
  @js.native
  class SettingsPane ()
    extends typings.winrt.Windows.UI.ApplicationSettings.SettingsPane {
    /* CompleteClass */
    override var oncommandsrequested: js.Any = js.native
  }
  
  @js.native
  class SettingsPaneCommandsRequest ()
    extends typings.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest {
    /* CompleteClass */
    override var applicationCommands: IVector[typings.winrt.Windows.UI.ApplicationSettings.SettingsCommand] = js.native
  }
  
  @js.native
  class SettingsPaneCommandsRequestedEventArgs ()
    extends typings.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs {
    /* CompleteClass */
    override var request: typings.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest = js.native
  }
  
  @js.native
  object SettingsEdgeLocation extends js.Object {
    /* 1 */ val left: typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.left with Double = js.native
    /* 0 */ val right: typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.right with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation with Double] = js.native
  }
  
  /* static members */
  @js.native
  object SettingsPane extends js.Object {
    var edge: SettingsEdgeLocation = js.native
    def getForCurrentView(): typings.winrt.Windows.UI.ApplicationSettings.SettingsPane = js.native
    def show(): Unit = js.native
  }
  
}

