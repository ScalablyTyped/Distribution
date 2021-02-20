package typings.winrtUwp.Windows.Web.Http

import typings.std.Date
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
import scala.scalajs.js.`|`
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
    sealed trait htmlDownload extends HttpDiagnosticRequestInitiator
    
    /** An image resource. */
    @js.native
    sealed trait image extends HttpDiagnosticRequestInitiator
    
    /** A link. */
    @js.native
    sealed trait link extends HttpDiagnosticRequestInitiator
    
    /** A media resource. */
    @js.native
    sealed trait media extends HttpDiagnosticRequestInitiator
    
    /** An other resource. */
    @js.native
    sealed trait other extends HttpDiagnosticRequestInitiator
    
    /** A parsed element. */
    @js.native
    sealed trait parsedElement extends HttpDiagnosticRequestInitiator
    
    /** A pre-fetch request. */
    @js.native
    sealed trait prefetch extends HttpDiagnosticRequestInitiator
    
    /** A script resource. */
    @js.native
    sealed trait script extends HttpDiagnosticRequestInitiator
    
    /** A CSS element. */
    @js.native
    sealed trait style extends HttpDiagnosticRequestInitiator
    
    /** An XML HTTP request. */
    @js.native
    sealed trait xmlHttpRequest extends HttpDiagnosticRequestInitiator
  }
  
  /** Provides a simple diagnostic facility for tracing and profiling web traffic in applications built on Microsoft’s HTTP stacks. */
  @js.native
  trait HttpDiagnosticProvider extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
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
    def onrequestresponsecompleted(
      ev: HttpDiagnosticProviderRequestResponseCompletedEventArgs with WinRTEvent[HttpDiagnosticProvider]
    ): Unit = js.native
    /** Subscribe to the RequestResponseCompleted event to receive a notification that a request has been submitted. */
    @JSName("onrequestresponsecompleted")
    var onrequestresponsecompleted_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs] = js.native
    
    /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
    def onrequestsent(ev: HttpDiagnosticProviderRequestSentEventArgs with WinRTEvent[HttpDiagnosticProvider]): Unit = js.native
    /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
    @JSName("onrequestsent")
    var onrequestsent_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs] = js.native
    
    /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
    def onresponsereceived(ev: HttpDiagnosticProviderResponseReceivedEventArgs with WinRTEvent[HttpDiagnosticProvider]): Unit = js.native
    /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
    @JSName("onresponsereceived")
    var onresponsereceived_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
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
  @js.native
  trait HttpDiagnosticProviderRequestResponseCompletedEventArgs extends StObject {
    
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String = js.native
    
    /** Gets the type of operation initiating this request. */
    var initiator: HttpDiagnosticRequestInitiator = js.native
    
    var processId: js.Any = js.native
    
    /* unmapped type */
    /** Gets the URI of the requested response. */
    var requestedUri: Uri = js.native
    
    var sourceLocations: js.Any = js.native
    
    /* unmapped type */
    var threadId: js.Any = js.native
    
    /* unmapped type */
    /** Gets the timestamp for connection events. */
    var timestamps: HttpDiagnosticProviderRequestResponseTimestamps = js.native
  }
  object HttpDiagnosticProviderRequestResponseCompletedEventArgs {
    
    @scala.inline
    def apply(
      activityId: String,
      initiator: HttpDiagnosticRequestInitiator,
      processId: js.Any,
      requestedUri: Uri,
      sourceLocations: js.Any,
      threadId: js.Any,
      timestamps: HttpDiagnosticProviderRequestResponseTimestamps
    ): HttpDiagnosticProviderRequestResponseCompletedEventArgs = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], sourceLocations = sourceLocations.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any], timestamps = timestamps.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticProviderRequestResponseCompletedEventArgs]
    }
    
    @scala.inline
    implicit class HttpDiagnosticProviderRequestResponseCompletedEventArgsMutableBuilder[Self <: HttpDiagnosticProviderRequestResponseCompletedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiator(value: HttpDiagnosticRequestInitiator): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessId(value: js.Any): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedUri(value: Uri): Self = StObject.set(x, "requestedUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceLocations(value: js.Any): Self = StObject.set(x, "sourceLocations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadId(value: js.Any): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamps(value: HttpDiagnosticProviderRequestResponseTimestamps): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides all the timestamps for connection events. */
  @js.native
  trait HttpDiagnosticProviderRequestResponseTimestamps extends StObject {
    
    /** Gets the last time local cache was checked. */
    var cacheCheckedTimestamp: Date = js.native
    
    /** Gets the timestamp for the end of the TCP connection phase. */
    var connectionCompletedTimestamp: Date = js.native
    
    /** Gets the timestamp for the start of the TCP connection phase. */
    var connectionInitiatedTimestamp: Date = js.native
    
    /** Gets the time of the DNS name resolution. */
    var nameResolvedTimestamp: Date = js.native
    
    /** Gets the timestamp for the last byte sent. */
    var requestCompletedTimestamp: Date = js.native
    
    /** Gets the timestamp for the first byte sent. */
    var requestSentTimestamp: Date = js.native
    
    /** Gets the timestamp for the last byte received. */
    var responseCompletedTimestamp: Date = js.native
    
    /** Gets the timestamp for the fir byte received. */
    var responseReceivedTimestamp: Date = js.native
    
    /** Gets the time of the SSL handshake negotiation. */
    var sslNegotiatedTimestamp: Date = js.native
  }
  object HttpDiagnosticProviderRequestResponseTimestamps {
    
    @scala.inline
    def apply(
      cacheCheckedTimestamp: Date,
      connectionCompletedTimestamp: Date,
      connectionInitiatedTimestamp: Date,
      nameResolvedTimestamp: Date,
      requestCompletedTimestamp: Date,
      requestSentTimestamp: Date,
      responseCompletedTimestamp: Date,
      responseReceivedTimestamp: Date,
      sslNegotiatedTimestamp: Date
    ): HttpDiagnosticProviderRequestResponseTimestamps = {
      val __obj = js.Dynamic.literal(cacheCheckedTimestamp = cacheCheckedTimestamp.asInstanceOf[js.Any], connectionCompletedTimestamp = connectionCompletedTimestamp.asInstanceOf[js.Any], connectionInitiatedTimestamp = connectionInitiatedTimestamp.asInstanceOf[js.Any], nameResolvedTimestamp = nameResolvedTimestamp.asInstanceOf[js.Any], requestCompletedTimestamp = requestCompletedTimestamp.asInstanceOf[js.Any], requestSentTimestamp = requestSentTimestamp.asInstanceOf[js.Any], responseCompletedTimestamp = responseCompletedTimestamp.asInstanceOf[js.Any], responseReceivedTimestamp = responseReceivedTimestamp.asInstanceOf[js.Any], sslNegotiatedTimestamp = sslNegotiatedTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticProviderRequestResponseTimestamps]
    }
    
    @scala.inline
    implicit class HttpDiagnosticProviderRequestResponseTimestampsMutableBuilder[Self <: HttpDiagnosticProviderRequestResponseTimestamps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheCheckedTimestamp(value: Date): Self = StObject.set(x, "cacheCheckedTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionCompletedTimestamp(value: Date): Self = StObject.set(x, "connectionCompletedTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionInitiatedTimestamp(value: Date): Self = StObject.set(x, "connectionInitiatedTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameResolvedTimestamp(value: Date): Self = StObject.set(x, "nameResolvedTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCompletedTimestamp(value: Date): Self = StObject.set(x, "requestCompletedTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestSentTimestamp(value: Date): Self = StObject.set(x, "requestSentTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseCompletedTimestamp(value: Date): Self = StObject.set(x, "responseCompletedTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseReceivedTimestamp(value: Date): Self = StObject.set(x, "responseReceivedTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslNegotiatedTimestamp(value: Date): Self = StObject.set(x, "sslNegotiatedTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides data for the RequestSent event. */
  @js.native
  trait HttpDiagnosticProviderRequestSentEventArgs extends StObject {
    
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String = js.native
    
    /** Gets the type of operation initiating this request. */
    var initiator: HttpDiagnosticRequestInitiator = js.native
    
    /** Gets the HttpRequestMessage including headers. */
    var message: HttpRequestMessage = js.native
    
    /** Gets the process ID. */
    var processId: Double = js.native
    
    /** Gets the source location call stack. */
    var sourceLocations: IVectorView[HttpDiagnosticSourceLocation] = js.native
    
    /** Gets the thread ID. */
    var threadId: Double = js.native
    
    /** Gets the timestamp of when the HttpRequestMessage was sent. */
    var timestamp: Date = js.native
  }
  object HttpDiagnosticProviderRequestSentEventArgs {
    
    @scala.inline
    def apply(
      activityId: String,
      initiator: HttpDiagnosticRequestInitiator,
      message: HttpRequestMessage,
      processId: Double,
      sourceLocations: IVectorView[HttpDiagnosticSourceLocation],
      threadId: Double,
      timestamp: Date
    ): HttpDiagnosticProviderRequestSentEventArgs = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], sourceLocations = sourceLocations.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticProviderRequestSentEventArgs]
    }
    
    @scala.inline
    implicit class HttpDiagnosticProviderRequestSentEventArgsMutableBuilder[Self <: HttpDiagnosticProviderRequestSentEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiator(value: HttpDiagnosticRequestInitiator): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: HttpRequestMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceLocations(value: IVectorView[HttpDiagnosticSourceLocation]): Self = StObject.set(x, "sourceLocations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides data for the ResponseReceived event. */
  @js.native
  trait HttpDiagnosticProviderResponseReceivedEventArgs extends StObject {
    
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String = js.native
    
    /** Gets the HttpResponseMessage including headers, the status code, and data. */
    var message: HttpResponseMessage = js.native
    
    /** Gets the timestamp of when the HttpResponseMessage was received. */
    var timestamp: Date = js.native
  }
  object HttpDiagnosticProviderResponseReceivedEventArgs {
    
    @scala.inline
    def apply(activityId: String, message: HttpResponseMessage, timestamp: Date): HttpDiagnosticProviderResponseReceivedEventArgs = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticProviderResponseReceivedEventArgs]
    }
    
    @scala.inline
    implicit class HttpDiagnosticProviderResponseReceivedEventArgsMutableBuilder[Self <: HttpDiagnosticProviderResponseReceivedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: HttpResponseMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /** Contains the source location of the HTTP activity. */
  @js.native
  trait HttpDiagnosticSourceLocation extends StObject {
    
    /** Gets the column number. */
    var columnNumber: Double = js.native
    
    /** Gets the line number. */
    var lineNumber: Double = js.native
    
    /** Gets the source URI. */
    var sourceUri: Uri = js.native
  }
  object HttpDiagnosticSourceLocation {
    
    @scala.inline
    def apply(columnNumber: Double, lineNumber: Double, sourceUri: Uri): HttpDiagnosticSourceLocation = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], sourceUri = sourceUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDiagnosticSourceLocation]
    }
    
    @scala.inline
    implicit class HttpDiagnosticSourceLocationMutableBuilder[Self <: HttpDiagnosticSourceLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUri(value: Uri): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    }
  }
}
