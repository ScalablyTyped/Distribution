package typings.winrt.global.Windows.UI

import typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation
import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplicationSettings {
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsCommand")
  @js.native
  class SettingsCommand protected ()
    extends typings.winrt.Windows.UI.ApplicationSettings.SettingsCommand {
    def this(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler) = this()
  }
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
  @js.native
  object SettingsEdgeLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation with Double] = js.native
    
    /* 1 */ val left: typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.left with Double = js.native
    
    /* 0 */ val right: typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.right with Double = js.native
  }
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
  @js.native
  class SettingsPane ()
    extends typings.winrt.Windows.UI.ApplicationSettings.SettingsPane
  /* static members */
  object SettingsPane {
    
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane.edge")
    @js.native
    def edge: SettingsEdgeLocation = js.native
    @scala.inline
    def edge_=(x: SettingsEdgeLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edge")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrt.Windows.UI.ApplicationSettings.SettingsPane = js.native
    
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane.show")
    @js.native
    def show(): Unit = js.native
  }
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest")
  @js.native
  class SettingsPaneCommandsRequest ()
    extends typings.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs")
  @js.native
  class SettingsPaneCommandsRequestedEventArgs ()
    extends typings.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs
}
