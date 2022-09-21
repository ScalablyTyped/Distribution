package typings.winrt.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.UI.Popups.IUICommand
import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplicationSettings {
  
  @js.native
  sealed trait SettingsEdgeLocation extends StObject
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
  @js.native
  object SettingsEdgeLocation extends StObject {
    
    @js.native
    sealed trait left
      extends StObject
         with SettingsEdgeLocation
    
    @js.native
    sealed trait right
      extends StObject
         with SettingsEdgeLocation
  }
  
  trait ISettingsCommandFactory extends StObject {
    
    def create(settingsCommandId: Any, label: String, handler: UICommandInvokedHandler): SettingsCommand
  }
  object ISettingsCommandFactory {
    
    inline def apply(create: (Any, String, UICommandInvokedHandler) => SettingsCommand): ISettingsCommandFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create))
      __obj.asInstanceOf[ISettingsCommandFactory]
    }
    
    extension [Self <: ISettingsCommandFactory](x: Self) {
      
      inline def setCreate(value: (Any, String, UICommandInvokedHandler) => SettingsCommand): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    }
  }
  
  trait ISettingsPane extends StObject {
    
    var oncommandsrequested: Any
  }
  object ISettingsPane {
    
    inline def apply(oncommandsrequested: Any): ISettingsPane = {
      val __obj = js.Dynamic.literal(oncommandsrequested = oncommandsrequested.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingsPane]
    }
    
    extension [Self <: ISettingsPane](x: Self) {
      
      inline def setOncommandsrequested(value: Any): Self = StObject.set(x, "oncommandsrequested", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISettingsPaneCommandsRequest extends StObject {
    
    var applicationCommands: IVector[SettingsCommand]
  }
  object ISettingsPaneCommandsRequest {
    
    inline def apply(applicationCommands: IVector[SettingsCommand]): ISettingsPaneCommandsRequest = {
      val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingsPaneCommandsRequest]
    }
    
    extension [Self <: ISettingsPaneCommandsRequest](x: Self) {
      
      inline def setApplicationCommands(value: IVector[SettingsCommand]): Self = StObject.set(x, "applicationCommands", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISettingsPaneCommandsRequestedEventArgs extends StObject {
    
    var request: SettingsPaneCommandsRequest
  }
  object ISettingsPaneCommandsRequestedEventArgs {
    
    inline def apply(request: SettingsPaneCommandsRequest): ISettingsPaneCommandsRequestedEventArgs = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingsPaneCommandsRequestedEventArgs]
    }
    
    extension [Self <: ISettingsPaneCommandsRequestedEventArgs](x: Self) {
      
      inline def setRequest(value: SettingsPaneCommandsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISettingsPaneStatics extends StObject {
    
    var edge: SettingsEdgeLocation
    
    def getForCurrentView(): SettingsPane
    
    def show(): Unit
  }
  object ISettingsPaneStatics {
    
    inline def apply(edge: SettingsEdgeLocation, getForCurrentView: () => SettingsPane, show: () => Unit): ISettingsPaneStatics = {
      val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], getForCurrentView = js.Any.fromFunction0(getForCurrentView), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ISettingsPaneStatics]
    }
    
    extension [Self <: ISettingsPaneStatics](x: Self) {
      
      inline def setEdge(value: SettingsEdgeLocation): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setGetForCurrentView(value: () => SettingsPane): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait SettingsCommand
    extends StObject
       with IUICommand
  object SettingsCommand {
    
    inline def apply(id: Any, invoked: /* command */ IUICommand => Unit, label: String): SettingsCommand = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invoked = js.Any.fromFunction1(invoked), label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsCommand]
    }
  }
  
  trait SettingsPane
    extends StObject
       with ISettingsPane
  object SettingsPane {
    
    inline def apply(oncommandsrequested: Any): SettingsPane = {
      val __obj = js.Dynamic.literal(oncommandsrequested = oncommandsrequested.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsPane]
    }
  }
  
  trait SettingsPaneCommandsRequest
    extends StObject
       with ISettingsPaneCommandsRequest
  object SettingsPaneCommandsRequest {
    
    inline def apply(applicationCommands: IVector[SettingsCommand]): SettingsPaneCommandsRequest = {
      val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsPaneCommandsRequest]
    }
  }
  
  trait SettingsPaneCommandsRequestedEventArgs
    extends StObject
       with ISettingsPaneCommandsRequestedEventArgs
  object SettingsPaneCommandsRequestedEventArgs {
    
    inline def apply(request: SettingsPaneCommandsRequest): SettingsPaneCommandsRequestedEventArgs = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsPaneCommandsRequestedEventArgs]
    }
  }
}
