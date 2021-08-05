package typings.winrt.global.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation
import typings.winrt.Windows.UI.Popups.IUICommand
import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplicationSettings {
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsCommand")
  @js.native
  class SettingsCommand protected ()
    extends StObject
       with typings.winrt.Windows.UI.ApplicationSettings.SettingsCommand {
    def this(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler) = this()
    
    /* CompleteClass */
    var id: js.Any = js.native
    
    /* CompleteClass */
    override def invoked(command: IUICommand): Unit = js.native
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
  @js.native
  object SettingsEdgeLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation & Double] = js.native
    
    /* 1 */ val left: typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.left & Double = js.native
    
    /* 0 */ val right: typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.right & Double = js.native
  }
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
  @js.native
  class SettingsPane ()
    extends StObject
       with typings.winrt.Windows.UI.ApplicationSettings.SettingsPane {
    
    /* CompleteClass */
    var oncommandsrequested: js.Any = js.native
  }
  /* static members */
  object SettingsPane {
    
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane.edge")
    @js.native
    def edge: SettingsEdgeLocation = js.native
    inline def edge_=(x: SettingsEdgeLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edge")(x.asInstanceOf[js.Any])
    
    inline def getForCurrentView(): typings.winrt.Windows.UI.ApplicationSettings.SettingsPane = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.UI.ApplicationSettings.SettingsPane]
    
    inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
  }
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest")
  @js.native
  class SettingsPaneCommandsRequest ()
    extends StObject
       with typings.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest {
    
    /* CompleteClass */
    var applicationCommands: IVector[typings.winrt.Windows.UI.ApplicationSettings.SettingsCommand] = js.native
  }
  
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs")
  @js.native
  class SettingsPaneCommandsRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs {
    
    /* CompleteClass */
    var request: typings.winrt.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest = js.native
  }
}
