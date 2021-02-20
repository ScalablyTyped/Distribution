package typings.winrt.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.UI.Popups.IUICommand
import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplicationSettings {
  
  @js.native
  sealed trait SettingsEdgeLocation extends StObject
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
  @js.native
  object SettingsEdgeLocation extends StObject {
    
    @js.native
    sealed trait left extends SettingsEdgeLocation
    
    @js.native
    sealed trait right extends SettingsEdgeLocation
  }
  
  @js.native
  trait ISettingsCommandFactory extends StObject {
    
    def create(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler): SettingsCommand = js.native
  }
  object ISettingsCommandFactory {
    
    @scala.inline
    def apply(create: (js.Any, String, UICommandInvokedHandler) => SettingsCommand): ISettingsCommandFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create))
      __obj.asInstanceOf[ISettingsCommandFactory]
    }
    
    @scala.inline
    implicit class ISettingsCommandFactoryMutableBuilder[Self <: ISettingsCommandFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (js.Any, String, UICommandInvokedHandler) => SettingsCommand): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ISettingsPane extends StObject {
    
    var oncommandsrequested: js.Any = js.native
  }
  object ISettingsPane {
    
    @scala.inline
    def apply(oncommandsrequested: js.Any): ISettingsPane = {
      val __obj = js.Dynamic.literal(oncommandsrequested = oncommandsrequested.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingsPane]
    }
    
    @scala.inline
    implicit class ISettingsPaneMutableBuilder[Self <: ISettingsPane] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOncommandsrequested(value: js.Any): Self = StObject.set(x, "oncommandsrequested", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISettingsPaneCommandsRequest extends StObject {
    
    var applicationCommands: IVector[SettingsCommand] = js.native
  }
  object ISettingsPaneCommandsRequest {
    
    @scala.inline
    def apply(applicationCommands: IVector[SettingsCommand]): ISettingsPaneCommandsRequest = {
      val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingsPaneCommandsRequest]
    }
    
    @scala.inline
    implicit class ISettingsPaneCommandsRequestMutableBuilder[Self <: ISettingsPaneCommandsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationCommands(value: IVector[SettingsCommand]): Self = StObject.set(x, "applicationCommands", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISettingsPaneCommandsRequestedEventArgs extends StObject {
    
    var request: SettingsPaneCommandsRequest = js.native
  }
  object ISettingsPaneCommandsRequestedEventArgs {
    
    @scala.inline
    def apply(request: SettingsPaneCommandsRequest): ISettingsPaneCommandsRequestedEventArgs = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingsPaneCommandsRequestedEventArgs]
    }
    
    @scala.inline
    implicit class ISettingsPaneCommandsRequestedEventArgsMutableBuilder[Self <: ISettingsPaneCommandsRequestedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: SettingsPaneCommandsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISettingsPaneStatics extends StObject {
    
    var edge: SettingsEdgeLocation = js.native
    
    def getForCurrentView(): SettingsPane = js.native
    
    def show(): Unit = js.native
  }
  object ISettingsPaneStatics {
    
    @scala.inline
    def apply(edge: SettingsEdgeLocation, getForCurrentView: () => SettingsPane, show: () => Unit): ISettingsPaneStatics = {
      val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], getForCurrentView = js.Any.fromFunction0(getForCurrentView), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ISettingsPaneStatics]
    }
    
    @scala.inline
    implicit class ISettingsPaneStaticsMutableBuilder[Self <: ISettingsPaneStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdge(value: SettingsEdgeLocation): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetForCurrentView(value: () => SettingsPane): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SettingsCommand extends IUICommand
  
  @js.native
  trait SettingsPane extends ISettingsPane
  object SettingsPane {
    
    @scala.inline
    def apply(oncommandsrequested: js.Any): SettingsPane = {
      val __obj = js.Dynamic.literal(oncommandsrequested = oncommandsrequested.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsPane]
    }
  }
  
  @js.native
  trait SettingsPaneCommandsRequest extends ISettingsPaneCommandsRequest
  object SettingsPaneCommandsRequest {
    
    @scala.inline
    def apply(applicationCommands: IVector[SettingsCommand]): SettingsPaneCommandsRequest = {
      val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsPaneCommandsRequest]
    }
  }
  
  @js.native
  trait SettingsPaneCommandsRequestedEventArgs extends ISettingsPaneCommandsRequestedEventArgs
  object SettingsPaneCommandsRequestedEventArgs {
    
    @scala.inline
    def apply(request: SettingsPaneCommandsRequest): SettingsPaneCommandsRequestedEventArgs = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsPaneCommandsRequestedEventArgs]
    }
  }
}
