package typings.winrtDashUwp.Windows.Web.Http

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo
import typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProvider
import typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseCompletedEventArgs
import typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps
import typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestSentEventArgs
import typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderResponseReceivedEventArgs
import typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator
import typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.requestresponsecompleted
import typings.winrtDashUwp.winrtDashUwpStrings.requestsent
import typings.winrtDashUwp.winrtDashUwpStrings.responsereceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a diagnostic facility for tracing and profiling web traffic for applications build on HTTP protocols. */
@JSGlobal("Windows.Web.Http.Diagnostics")
@js.native
object Diagnostics extends js.Object {
  /** Provides a simple diagnostic facility for tracing and profiling web traffic in applications built on Microsoft’s HTTP stacks. */
  @js.native
  abstract class HttpDiagnosticProvider () extends js.Object {
    /** Subscribe to the RequestResponseCompleted event to receive a notification that a request has been submitted. */
    @JSName("onrequestresponsecompleted")
    var onrequestresponsecompleted_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs] = js.native
    /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
    @JSName("onrequestsent")
    var onrequestsent_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs] = js.native
    /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
    @JSName("onresponsereceived")
    var onresponsereceived_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs] = js.native
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
    /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
    def onrequestsent(ev: HttpDiagnosticProviderRequestSentEventArgs with WinRTEvent[HttpDiagnosticProvider]): Unit = js.native
    /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
    def onresponsereceived(ev: HttpDiagnosticProviderResponseReceivedEventArgs with WinRTEvent[HttpDiagnosticProvider]): Unit = js.native
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
  abstract class HttpDiagnosticProviderRequestResponseCompletedEventArgs () extends js.Object {
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String = js.native
    /** Gets the type of operation initiating this request. */
    var initiator: HttpDiagnosticRequestInitiator = js.native
    var processId: js.Any = js.native
     /* unmapped type */ /** Gets the URI of the requested response. */
    var requestedUri: Uri = js.native
    var sourceLocations: js.Any = js.native
     /* unmapped type */ var threadId: js.Any = js.native
     /* unmapped type */ /** Gets the timestamp for connection events. */
    var timestamps: HttpDiagnosticProviderRequestResponseTimestamps = js.native
  }
  
  /** Provides all the timestamps for connection events. */
  @js.native
  abstract class HttpDiagnosticProviderRequestResponseTimestamps () extends js.Object {
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
  
  /** Provides data for the RequestSent event. */
  @js.native
  abstract class HttpDiagnosticProviderRequestSentEventArgs () extends js.Object {
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
  
  /** Provides data for the ResponseReceived event. */
  @js.native
  abstract class HttpDiagnosticProviderResponseReceivedEventArgs () extends js.Object {
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String = js.native
    /** Gets the HttpResponseMessage including headers, the status code, and data. */
    var message: HttpResponseMessage = js.native
    /** Gets the timestamp of when the HttpResponseMessage was received. */
    var timestamp: Date = js.native
  }
  
  @js.native
  sealed trait HttpDiagnosticRequestInitiator extends js.Object
  
  /** Contains the source location of the HTTP activity. */
  @js.native
  abstract class HttpDiagnosticSourceLocation () extends js.Object {
    /** Gets the column number. */
    var columnNumber: Double = js.native
    /** Gets the line number. */
    var lineNumber: Double = js.native
    /** Gets the source URI. */
    var sourceUri: Uri = js.native
  }
  
  /* static members */
  @js.native
  object HttpDiagnosticProvider extends js.Object {
    /**
      * Creates a new HttpDiagnosticProvider based on the specified ProcessDiagnosticInfo object.
      * @param processDiagnosticInfo The ProcessDiagnosticInfo that identifies the process to watch.
      * @return The newly created HttpDiagnosticProvider .
      */
    def createFromProcessDiagnosticInfo(processDiagnosticInfo: ProcessDiagnosticInfo): HttpDiagnosticProvider = js.native
  }
  
  /** Provides the source of the request. */
  @js.native
  object HttpDiagnosticRequestInitiator extends js.Object {
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
    
    /* 7 */ val htmlDownload: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.htmlDownload with Double = js.native
    /* 2 */ val image: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.image with Double = js.native
    /* 3 */ val link: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.link with Double = js.native
    /* 6 */ val media: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.media with Double = js.native
    /* 9 */ val other: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.other with Double = js.native
    /* 0 */ val parsedElement: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.parsedElement with Double = js.native
    /* 8 */ val prefetch: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.prefetch with Double = js.native
    /* 1 */ val script: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.script with Double = js.native
    /* 4 */ val style: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.style with Double = js.native
    /* 5 */ val xmlHttpRequest: typings.winrtDashUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.xmlHttpRequest with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpDiagnosticRequestInitiator with Double] = js.native
  }
  
}

