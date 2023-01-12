package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.requestresponsecompleted
import typings.winrtUwp.winrtUwpStrings.requestsent
import typings.winrtUwp.winrtUwpStrings.responsereceived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a diagnostic facility for tracing and profiling web traffic for applications build on HTTP protocols. */
object Diagnostics {
  
  @js.native
  sealed trait HttpDiagnosticRequestInitiator extends StObject
  /** Provides the source of the request. */
  @JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator")
  @js.native
  object HttpDiagnosticRequestInitiator extends StObject {
    
    /** An HTML download. */
    @js.native
    sealed trait htmlDownload
      extends StObject
         with HttpDiagnosticRequestInitiator
    
    /** An image resource. */
    @js.native
    sealed trait image
      extends StObject
         with HttpDiagnosticRequestInitiator
    
    /** A link. */
    @js.native
    sealed trait link
      extends StObject
         with HttpDiagnosticRequestInitiator
    
    /** A media resource. */
    @js.native
    sealed trait media
      extends StObject
         with HttpDiagnosticRequestInitiator
    
    /** An other resource. */
    @js.native
    sealed trait other
      extends StObject
         with HttpDiagnosticRequestInitiator
    
    /** A parsed element. */
    @js.native
    sealed trait parsedElement
      extends StObject
         with HttpDiagnosticRequestInitiator
    
    /** A pre-fetch request. */
    @js.native
    sealed trait prefetch
      extends StObject
         with HttpDiagnosticRequestInitiator
    
    /** A script resource. */
    @js.native
    sealed trait script
      extends StObject
         with HttpDiagnosticRequestInitiator
    
    /** A CSS element. */
    @js.native
    sealed trait style
      extends StObject
         with HttpDiagnosticRequestInitiator
    
    /** An XML HTTP request. */
    @js.native
    sealed trait xmlHttpRequest
      extends StObject
         with HttpDiagnosticRequestInitiator
  }
  
  /** Provides a simple diagnostic facility for tracing and profiling web traffic in applications built on Microsoft’s HTTP stacks. */
  @js.native
  trait HttpDiagnosticProvider extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requestresponsecompleted(
      `type`: requestresponsecompleted,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requestsent(
      `type`: requestsent,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_responsereceived(
      `type`: responsereceived,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs]
    ): Unit = js.native
    
    /** Subscribe to the RequestResponseCompleted event to receive a notification that a request has been submitted. */
    def onrequestresponsecompleted(ev: HttpDiagnosticProviderRequestResponseCompletedEventArgs & WinRTEvent[HttpDiagnosticProvider]): Unit = js.native
    /** Subscribe to the RequestResponseCompleted event to receive a notification that a request has been submitted. */
    @JSName("onrequestresponsecompleted")
    var onrequestresponsecompleted_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs] = js.native
    
    /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
    def onrequestsent(ev: HttpDiagnosticProviderRequestSentEventArgs & WinRTEvent[HttpDiagnosticProvider]): Unit = js.native
    /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
    @JSName("onrequestsent")
    var onrequestsent_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs] = js.native
    
    /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
    def onresponsereceived(ev: HttpDiagnosticProviderResponseReceivedEventArgs & WinRTEvent[HttpDiagnosticProvider]): Unit = js.native
    /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
    @JSName("onresponsereceived")
    var onresponsereceived_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_requestresponsecompleted(
      `type`: requestresponsecompleted,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_requestsent(
      `type`: requestsent,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_responsereceived(
      `type`: responsereceived,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs]
    ): Unit = js.native
    
    /** Starts the HttpDiagnosticProvider monitoring the attached process target. */
    def start(): Unit = js.native
    
    /** Stops the HttpDiagnosticProvider from monitoring the attached process target. */
    def stop(): Unit = js.native
  }
  
  /** Provides data for the RequestResponseCompleted event. */
  trait HttpDiagnosticProviderRequestResponseCompletedEventArgs extends StObject {
    
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String
    
    /** Gets the type of operation initiating this request. */
    var initiator: HttpDiagnosticRequestInitiator
    
    var processId: Any
    
    /* unmapped type */
    /** Gets the URI of the requested response. */
    var requestedUri: Uri
    
    var sourceLocations: Any
    
    /* unmapped type */
    var threadId: Any
    
    /* unmapped type */
    /** Gets the timestamp for connection events. */
    var timestamps: HttpDiagnosticProviderRequestResponseTimestamps
  }
  object HttpDiagnosticProviderRequestResponseCompletedEventArgs {
    
    inline def apply(
      activityId: String,
      initiator: HttpDiagnosticRequestInitiator,
      processId: Any,
      requestedUri: Uri,
      sourceLocations: Any,
      threadId: Any,
      timestamps: HttpDiagnosticProviderRequestResponseTimestamps
    ): HttpDiagnosticProviderRequestResponseCompletedEventArgs = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], sourceLocations = sourceLocations.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any], timestamps = timestamps.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticProviderRequestResponseCompletedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpDiagnosticProviderRequestResponseCompletedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      inline def setInitiator(value: HttpDiagnosticRequestInitiator): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
      
      inline def setProcessId(value: Any): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      inline def setRequestedUri(value: Uri): Self = StObject.set(x, "requestedUri", value.asInstanceOf[js.Any])
      
      inline def setSourceLocations(value: Any): Self = StObject.set(x, "sourceLocations", value.asInstanceOf[js.Any])
      
      inline def setThreadId(value: Any): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
      
      inline def setTimestamps(value: HttpDiagnosticProviderRequestResponseTimestamps): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides all the timestamps for connection events. */
  trait HttpDiagnosticProviderRequestResponseTimestamps extends StObject {
    
    /** Gets the last time local cache was checked. */
    var cacheCheckedTimestamp: js.Date
    
    /** Gets the timestamp for the end of the TCP connection phase. */
    var connectionCompletedTimestamp: js.Date
    
    /** Gets the timestamp for the start of the TCP connection phase. */
    var connectionInitiatedTimestamp: js.Date
    
    /** Gets the time of the DNS name resolution. */
    var nameResolvedTimestamp: js.Date
    
    /** Gets the timestamp for the last byte sent. */
    var requestCompletedTimestamp: js.Date
    
    /** Gets the timestamp for the first byte sent. */
    var requestSentTimestamp: js.Date
    
    /** Gets the timestamp for the last byte received. */
    var responseCompletedTimestamp: js.Date
    
    /** Gets the timestamp for the fir byte received. */
    var responseReceivedTimestamp: js.Date
    
    /** Gets the time of the SSL handshake negotiation. */
    var sslNegotiatedTimestamp: js.Date
  }
  object HttpDiagnosticProviderRequestResponseTimestamps {
    
    inline def apply(
      cacheCheckedTimestamp: js.Date,
      connectionCompletedTimestamp: js.Date,
      connectionInitiatedTimestamp: js.Date,
      nameResolvedTimestamp: js.Date,
      requestCompletedTimestamp: js.Date,
      requestSentTimestamp: js.Date,
      responseCompletedTimestamp: js.Date,
      responseReceivedTimestamp: js.Date,
      sslNegotiatedTimestamp: js.Date
    ): HttpDiagnosticProviderRequestResponseTimestamps = {
      val __obj = js.Dynamic.literal(cacheCheckedTimestamp = cacheCheckedTimestamp.asInstanceOf[js.Any], connectionCompletedTimestamp = connectionCompletedTimestamp.asInstanceOf[js.Any], connectionInitiatedTimestamp = connectionInitiatedTimestamp.asInstanceOf[js.Any], nameResolvedTimestamp = nameResolvedTimestamp.asInstanceOf[js.Any], requestCompletedTimestamp = requestCompletedTimestamp.asInstanceOf[js.Any], requestSentTimestamp = requestSentTimestamp.asInstanceOf[js.Any], responseCompletedTimestamp = responseCompletedTimestamp.asInstanceOf[js.Any], responseReceivedTimestamp = responseReceivedTimestamp.asInstanceOf[js.Any], sslNegotiatedTimestamp = sslNegotiatedTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticProviderRequestResponseTimestamps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpDiagnosticProviderRequestResponseTimestamps] (val x: Self) extends AnyVal {
      
      inline def setCacheCheckedTimestamp(value: js.Date): Self = StObject.set(x, "cacheCheckedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setConnectionCompletedTimestamp(value: js.Date): Self = StObject.set(x, "connectionCompletedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setConnectionInitiatedTimestamp(value: js.Date): Self = StObject.set(x, "connectionInitiatedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setNameResolvedTimestamp(value: js.Date): Self = StObject.set(x, "nameResolvedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setRequestCompletedTimestamp(value: js.Date): Self = StObject.set(x, "requestCompletedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setRequestSentTimestamp(value: js.Date): Self = StObject.set(x, "requestSentTimestamp", value.asInstanceOf[js.Any])
      
      inline def setResponseCompletedTimestamp(value: js.Date): Self = StObject.set(x, "responseCompletedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setResponseReceivedTimestamp(value: js.Date): Self = StObject.set(x, "responseReceivedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setSslNegotiatedTimestamp(value: js.Date): Self = StObject.set(x, "sslNegotiatedTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides data for the RequestSent event. */
  trait HttpDiagnosticProviderRequestSentEventArgs extends StObject {
    
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String
    
    /** Gets the type of operation initiating this request. */
    var initiator: HttpDiagnosticRequestInitiator
    
    /** Gets the HttpRequestMessage including headers. */
    var message: HttpRequestMessage
    
    /** Gets the process ID. */
    var processId: Double
    
    /** Gets the source location call stack. */
    var sourceLocations: IVectorView[HttpDiagnosticSourceLocation]
    
    /** Gets the thread ID. */
    var threadId: Double
    
    /** Gets the timestamp of when the HttpRequestMessage was sent. */
    var timestamp: js.Date
  }
  object HttpDiagnosticProviderRequestSentEventArgs {
    
    inline def apply(
      activityId: String,
      initiator: HttpDiagnosticRequestInitiator,
      message: HttpRequestMessage,
      processId: Double,
      sourceLocations: IVectorView[HttpDiagnosticSourceLocation],
      threadId: Double,
      timestamp: js.Date
    ): HttpDiagnosticProviderRequestSentEventArgs = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], sourceLocations = sourceLocations.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticProviderRequestSentEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpDiagnosticProviderRequestSentEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      inline def setInitiator(value: HttpDiagnosticRequestInitiator): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: HttpRequestMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      inline def setSourceLocations(value: IVectorView[HttpDiagnosticSourceLocation]): Self = StObject.set(x, "sourceLocations", value.asInstanceOf[js.Any])
      
      inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides data for the ResponseReceived event. */
  trait HttpDiagnosticProviderResponseReceivedEventArgs extends StObject {
    
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String
    
    /** Gets the HttpResponseMessage including headers, the status code, and data. */
    var message: HttpResponseMessage
    
    /** Gets the timestamp of when the HttpResponseMessage was received. */
    var timestamp: js.Date
  }
  object HttpDiagnosticProviderResponseReceivedEventArgs {
    
    inline def apply(activityId: String, message: HttpResponseMessage, timestamp: js.Date): HttpDiagnosticProviderResponseReceivedEventArgs = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticProviderResponseReceivedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpDiagnosticProviderResponseReceivedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: HttpResponseMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /** Contains the source location of the HTTP activity. */
  trait HttpDiagnosticSourceLocation extends StObject {
    
    /** Gets the column number. */
    var columnNumber: Double
    
    /** Gets the line number. */
    var lineNumber: Double
    
    /** Gets the source URI. */
    var sourceUri: Uri
  }
  object HttpDiagnosticSourceLocation {
    
    inline def apply(columnNumber: Double, lineNumber: Double, sourceUri: Uri): HttpDiagnosticSourceLocation = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], sourceUri = sourceUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticSourceLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpDiagnosticSourceLocation] (val x: Self) extends AnyVal {
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setSourceUri(value: Uri): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    }
  }
}
