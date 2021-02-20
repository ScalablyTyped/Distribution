package typings.winrtUwp.Windows.ApplicationModel

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.requestreceived
import typings.winrtUwp.winrtUwpStrings.serviceclosed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for using app services. */
object AppService {
  
  @js.native
  sealed trait AppServiceClosedStatus extends StObject
  /** Describes the status that was set when the endpoint for the app service was closed. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceClosedStatus")
  @js.native
  object AppServiceClosedStatus extends StObject {
    
    /** The endpoint for the app service was closed by the client or the system */
    @js.native
    sealed trait canceled extends AppServiceClosedStatus
    
    /** The endpoint for the app service closed gracefully. */
    @js.native
    sealed trait completed extends AppServiceClosedStatus
    
    /** The endpoint for the app service was closed because the endpoint ran out of resources. */
    @js.native
    sealed trait resourceLimitsExceeded extends AppServiceClosedStatus
    
    /** An unknown error occurred. */
    @js.native
    sealed trait unknown extends AppServiceClosedStatus
  }
  
  @js.native
  sealed trait AppServiceConnectionStatus extends StObject
  /** Describes the status for the attempt that an app makes to open a connection to an app service by calling the AppServiceConnection.OpenAsync method. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceConnectionStatus")
  @js.native
  object AppServiceConnectionStatus extends StObject {
    
    /** The package for the app service to which a connection was attempted is not installed on the device. Check that the package is installed before trying to open a connection to the app service. */
    @js.native
    sealed trait appNotInstalled extends AppServiceConnectionStatus
    
    /** The app with the specified package family name is installed and available, but the app does not declare support for the specified app service. Check that the name of the app service and the version of the app are correct. */
    @js.native
    sealed trait appServiceUnavailable extends AppServiceConnectionStatus
    
    /** The package for the app service to which a connection was attempted is temporarily unavailable. Try to connect again later. */
    @js.native
    sealed trait appUnavailable extends AppServiceConnectionStatus
    
    /** The connection to the app service was opened successfully. */
    @js.native
    sealed trait success extends AppServiceConnectionStatus
    
    /** An unknown error occurred. */
    @js.native
    sealed trait unknown extends AppServiceConnectionStatus
  }
  
  @js.native
  sealed trait AppServiceResponseStatus extends StObject
  /** Describes the status when an app tries to send a message to an app service by calling the AppServiceConnection.SendMessageAsync method. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceResponseStatus")
  @js.native
  object AppServiceResponseStatus extends StObject {
    
    /** The app service failed to receive and process the message. */
    @js.native
    sealed trait failure extends AppServiceResponseStatus
    
    /** The app service exited because not enough resources were available. */
    @js.native
    sealed trait resourceLimitsExceeded extends AppServiceResponseStatus
    
    /** The app service successfully received and processed the message. */
    @js.native
    sealed trait success extends AppServiceResponseStatus
    
    /** An unknown error occurred. */
    @js.native
    sealed trait unknown extends AppServiceResponseStatus
  }
  
  /** Enumerates the available app service providers on the device. */
  @js.native
  trait AppServiceCatalog extends StObject
  
  /** Provides data for the AppServiceConnection.ServiceClosed event that occurs when the other endpoint closes connection to the app service. */
  @js.native
  trait AppServiceClosedEventArgs extends StObject {
    
    /** Gets the status that was set when the endpoint for the app service was closed. */
    var status: AppServiceClosedStatus = js.native
  }
  object AppServiceClosedEventArgs {
    
    @scala.inline
    def apply(status: AppServiceClosedStatus): AppServiceClosedEventArgs = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppServiceClosedEventArgs]
    }
    
    @scala.inline
    implicit class AppServiceClosedEventArgsMutableBuilder[Self <: AppServiceClosedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: AppServiceClosedStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a connection to the endpoint for an app service. */
  @js.native
  trait AppServiceConnection extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requestreceived(
      `type`: requestreceived,
      listener: TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_serviceclosed(
      `type`: serviceclosed,
      listener: TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs]
    ): Unit = js.native
    
    /** Gets or sets the name of the app service to which you want to connect. */
    var appServiceName: String = js.native
    
    /** Closes the connection to the app service. */
    def close(): Unit = js.native
    
    /** Occurs when a message arrives from the other endpoint of the app service connection. */
    def onrequestreceived(ev: AppServiceRequestReceivedEventArgs with WinRTEvent[AppServiceConnection]): Unit = js.native
    /** Occurs when a message arrives from the other endpoint of the app service connection. */
    @JSName("onrequestreceived")
    var onrequestreceived_Original: TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs] = js.native
    
    /** Occurs when the other endpoint closes the connection to the app service. */
    def onserviceclosed(ev: AppServiceClosedEventArgs with WinRTEvent[AppServiceConnection]): Unit = js.native
    /** Occurs when the other endpoint closes the connection to the app service. */
    @JSName("onserviceclosed")
    var onserviceclosed_Original: TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs] = js.native
    
    /**
      * Opens a connection to the endpoint for the app service.
      * @return An asynchronous operation to open a connection to the endpoint for the app service.
      */
    def openAsync(): IPromiseWithIAsyncOperation[AppServiceConnectionStatus] = js.native
    
    /** Gets or sets the package family name for the package that contains the endpoint for the app service. */
    var packageFamilyName: String = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_requestreceived(
      `type`: requestreceived,
      listener: TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_serviceclosed(
      `type`: serviceclosed,
      listener: TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs]
    ): Unit = js.native
    
    /**
      * Sends a message to the other endpoint of the app service connection.
      * @param message The message that you want to send.
      * @return An asynchronous operation to send the message that optionally returns a response message when complete.
      */
    def sendMessageAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponse] = js.native
  }
  
  /** Enables the background task for an app service to get a deferral so that the app service can respond to subsequent requests. */
  @js.native
  trait AppServiceDeferral extends StObject {
    
    /** Indicates that the content for an asynchronous handler for the AppServiceConnection.RequestReceived event is ready, or that an error occurred. */
    def complete(): Unit = js.native
  }
  object AppServiceDeferral {
    
    @scala.inline
    def apply(complete: () => Unit): AppServiceDeferral = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[AppServiceDeferral]
    }
    
    @scala.inline
    implicit class AppServiceDeferralMutableBuilder[Self <: AppServiceDeferral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    }
  }
  
  /** Represents a message that the endpoint for one app service sends to another app service. */
  @js.native
  trait AppServiceRequest extends StObject {
    
    /** Gets the message that request from the app service contains. */
    var message: ValueSet = js.native
    
    /**
      * Sends a response to a received request.
      * @param message The message that you want to include in the response.
      * @return An asynchronous operation to send the response.
      */
    def sendResponseAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponseStatus] = js.native
  }
  object AppServiceRequest {
    
    @scala.inline
    def apply(
      message: ValueSet,
      sendResponseAsync: ValueSet => IPromiseWithIAsyncOperation[AppServiceResponseStatus]
    ): AppServiceRequest = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sendResponseAsync = js.Any.fromFunction1(sendResponseAsync))
      __obj.asInstanceOf[AppServiceRequest]
    }
    
    @scala.inline
    implicit class AppServiceRequestMutableBuilder[Self <: AppServiceRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: ValueSet): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendResponseAsync(value: ValueSet => IPromiseWithIAsyncOperation[AppServiceResponseStatus]): Self = StObject.set(x, "sendResponseAsync", js.Any.fromFunction1(value))
    }
  }
  
  /** Provides data for the AppServiceConnection.RequestReceived event that occurs when a message arrives from the other endpoint of the app service connection. */
  @js.native
  trait AppServiceRequestReceivedEventArgs extends StObject {
    
    /**
      * Informs the system that the event handler might continue to perform work after the event handler returns.
      * @return The deferral.
      */
    def getDeferral(): AppServiceDeferral = js.native
    
    /** Gets the request that was received from the app service. */
    var request: AppServiceRequest = js.native
  }
  object AppServiceRequestReceivedEventArgs {
    
    @scala.inline
    def apply(getDeferral: () => AppServiceDeferral, request: AppServiceRequest): AppServiceRequestReceivedEventArgs = {
      val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppServiceRequestReceivedEventArgs]
    }
    
    @scala.inline
    implicit class AppServiceRequestReceivedEventArgsMutableBuilder[Self <: AppServiceRequestReceivedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDeferral(value: () => AppServiceDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequest(value: AppServiceRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the message that the app service sent in response to a request. */
  @js.native
  trait AppServiceResponse extends StObject {
    
    /** Gets the message that the response from the app service contains. */
    var message: ValueSet = js.native
    
    /** Gets the status for the response from the app service. */
    var status: AppServiceResponseStatus = js.native
  }
  object AppServiceResponse {
    
    @scala.inline
    def apply(message: ValueSet, status: AppServiceResponseStatus): AppServiceResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppServiceResponse]
    }
    
    @scala.inline
    implicit class AppServiceResponseMutableBuilder[Self <: AppServiceResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: ValueSet): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: AppServiceResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents details associated with the background task for the app service. */
  @js.native
  trait AppServiceTriggerDetails extends StObject {
    
    /** Gets the connection to the endpoint of the other app service. */
    var appServiceConnection: AppServiceConnection = js.native
    
    /** Gets the name of the package family for the client app that called the background task for the app service. */
    var callerPackageFamilyName: String = js.native
    
    /** Gets the name of the app service. */
    var name: String = js.native
  }
  object AppServiceTriggerDetails {
    
    @scala.inline
    def apply(appServiceConnection: AppServiceConnection, callerPackageFamilyName: String, name: String): AppServiceTriggerDetails = {
      val __obj = js.Dynamic.literal(appServiceConnection = appServiceConnection.asInstanceOf[js.Any], callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppServiceTriggerDetails]
    }
    
    @scala.inline
    implicit class AppServiceTriggerDetailsMutableBuilder[Self <: AppServiceTriggerDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppServiceConnection(value: AppServiceConnection): Self = StObject.set(x, "appServiceConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallerPackageFamilyName(value: String): Self = StObject.set(x, "callerPackageFamilyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
