package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus
import typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains classes for using app services. */
@JSGlobal("Windows.ApplicationModel.AppService")
@js.native
object AppService extends js.Object {
  /** Enumerates the available app service providers on the device. */
  @js.native
  abstract class AppServiceCatalog ()
    extends typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceCatalog
  
  /** Provides data for the AppServiceConnection.ServiceClosed event that occurs when the other endpoint closes connection to the app service. */
  @js.native
  abstract class AppServiceClosedEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedEventArgs {
    /** Gets the status that was set when the endpoint for the app service was closed. */
    /* CompleteClass */
    override var status: AppServiceClosedStatus = js.native
  }
  
  /** Represents a connection to the endpoint for an app service. */
  @js.native
  /** Creates and initializes a new instance of the AppServiceConnection class. */
  class AppServiceConnection ()
    extends typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnection
  
  /** Enables the background task for an app service to get a deferral so that the app service can respond to subsequent requests. */
  @js.native
  abstract class AppServiceDeferral ()
    extends typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceDeferral {
    /** Indicates that the content for an asynchronous handler for the AppServiceConnection.RequestReceived event is ready, or that an error occurred. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Represents a message that the endpoint for one app service sends to another app service. */
  @js.native
  abstract class AppServiceRequest ()
    extends typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceRequest {
    /** Gets the message that request from the app service contains. */
    /* CompleteClass */
    override var message: ValueSet = js.native
    /**
      * Sends a response to a received request.
      * @param message The message that you want to include in the response.
      * @return An asynchronous operation to send the response.
      */
    /* CompleteClass */
    override def sendResponseAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponseStatus] = js.native
  }
  
  /** Provides data for the AppServiceConnection.RequestReceived event that occurs when a message arrives from the other endpoint of the app service connection. */
  @js.native
  abstract class AppServiceRequestReceivedEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceRequestReceivedEventArgs {
    /** Gets the request that was received from the app service. */
    /* CompleteClass */
    override var request: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceRequest = js.native
    /**
      * Informs the system that the event handler might continue to perform work after the event handler returns.
      * @return The deferral.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceDeferral = js.native
  }
  
  /** Represents the message that the app service sent in response to a request. */
  @js.native
  abstract class AppServiceResponse ()
    extends typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponse {
    /** Gets the message that the response from the app service contains. */
    /* CompleteClass */
    override var message: ValueSet = js.native
    /** Gets the status for the response from the app service. */
    /* CompleteClass */
    override var status: AppServiceResponseStatus = js.native
  }
  
  /** Represents details associated with the background task for the app service. */
  @js.native
  abstract class AppServiceTriggerDetails ()
    extends typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceTriggerDetails {
    /** Gets the connection to the endpoint of the other app service. */
    /* CompleteClass */
    override var appServiceConnection: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnection = js.native
    /** Gets the name of the package family for the client app that called the background task for the app service. */
    /* CompleteClass */
    override var callerPackageFamilyName: String = js.native
    /** Gets the name of the app service. */
    /* CompleteClass */
    override var name: String = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceCatalog extends js.Object {
    var findAppServiceProvidersAsync: js.Any = js.native
  }
  
  /** Describes the status that was set when the endpoint for the app service was closed. */
  @js.native
  object AppServiceClosedStatus extends js.Object {
    /* 1 */ val canceled: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.canceled with Double = js.native
    /* 0 */ val completed: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.completed with Double = js.native
    /* 2 */ val resourceLimitsExceeded: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.resourceLimitsExceeded with Double = js.native
    /* 3 */ val unknown: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus with Double
      ] = js.native
  }
  
  /** Describes the status for the attempt that an app makes to open a connection to an app service by calling the AppServiceConnection.OpenAsync method. */
  @js.native
  object AppServiceConnectionStatus extends js.Object {
    /* 1 */ val appNotInstalled: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.appNotInstalled with Double = js.native
    /* 3 */ val appServiceUnavailable: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.appServiceUnavailable with Double = js.native
    /* 2 */ val appUnavailable: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.appUnavailable with Double = js.native
    /* 0 */ val success: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.success with Double = js.native
    /* 4 */ val unknown: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus with Double
      ] = js.native
  }
  
  /** Describes the status when an app tries to send a message to an app service by calling the AppServiceConnection.SendMessageAsync method. */
  @js.native
  object AppServiceResponseStatus extends js.Object {
    /* 1 */ val failure: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.failure with Double = js.native
    /* 2 */ val resourceLimitsExceeded: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.resourceLimitsExceeded with Double = js.native
    /* 0 */ val success: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.success with Double = js.native
    /* 3 */ val unknown: typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus with Double
      ] = js.native
  }
  
}

