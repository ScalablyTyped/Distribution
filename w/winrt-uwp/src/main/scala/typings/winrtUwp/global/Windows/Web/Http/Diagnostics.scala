package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo
import typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a diagnostic facility for tracing and profiling web traffic for applications build on HTTP protocols. */
object Diagnostics {
  
  /** Provides a simple diagnostic facility for tracing and profiling web traffic in applications built on Microsoft’s HTTP stacks. */
  @JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProvider")
  @js.native
  abstract class HttpDiagnosticProvider ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProvider
  object HttpDiagnosticProvider {
    
    @JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new HttpDiagnosticProvider based on the specified ProcessDiagnosticInfo object.
      * @param processDiagnosticInfo The ProcessDiagnosticInfo that identifies the process to watch.
      * @return The newly created HttpDiagnosticProvider .
      */
    /* static member */
    inline def createFromProcessDiagnosticInfo(processDiagnosticInfo: ProcessDiagnosticInfo): typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProcessDiagnosticInfo")(processDiagnosticInfo.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProvider]
  }
  
  /** Provides data for the RequestResponseCompleted event. */
  @JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseCompletedEventArgs")
  @js.native
  abstract class HttpDiagnosticProviderRequestResponseCompletedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseCompletedEventArgs {
    
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    /* CompleteClass */
    var activityId: String = js.native
    
    /** Gets the type of operation initiating this request. */
    /* CompleteClass */
    var initiator: HttpDiagnosticRequestInitiator = js.native
    
    /* CompleteClass */
    var processId: Any = js.native
    
    /* unmapped type */
    /** Gets the URI of the requested response. */
    /* CompleteClass */
    var requestedUri: Uri = js.native
    
    /* CompleteClass */
    var sourceLocations: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var threadId: Any = js.native
    
    /* unmapped type */
    /** Gets the timestamp for connection events. */
    /* CompleteClass */
    var timestamps: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps = js.native
  }
  
  /** Provides all the timestamps for connection events. */
  @JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps")
  @js.native
  abstract class HttpDiagnosticProviderRequestResponseTimestamps ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps {
    
    /** Gets the last time local cache was checked. */
    /* CompleteClass */
    var cacheCheckedTimestamp: js.Date = js.native
    
    /** Gets the timestamp for the end of the TCP connection phase. */
    /* CompleteClass */
    var connectionCompletedTimestamp: js.Date = js.native
    
    /** Gets the timestamp for the start of the TCP connection phase. */
    /* CompleteClass */
    var connectionInitiatedTimestamp: js.Date = js.native
    
    /** Gets the time of the DNS name resolution. */
    /* CompleteClass */
    var nameResolvedTimestamp: js.Date = js.native
    
    /** Gets the timestamp for the last byte sent. */
    /* CompleteClass */
    var requestCompletedTimestamp: js.Date = js.native
    
    /** Gets the timestamp for the first byte sent. */
    /* CompleteClass */
    var requestSentTimestamp: js.Date = js.native
    
    /** Gets the timestamp for the last byte received. */
    /* CompleteClass */
    var responseCompletedTimestamp: js.Date = js.native
    
    /** Gets the timestamp for the fir byte received. */
    /* CompleteClass */
    var responseReceivedTimestamp: js.Date = js.native
    
    /** Gets the time of the SSL handshake negotiation. */
    /* CompleteClass */
    var sslNegotiatedTimestamp: js.Date = js.native
  }
  
  /** Provides data for the RequestSent event. */
  @JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestSentEventArgs")
  @js.native
  abstract class HttpDiagnosticProviderRequestSentEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestSentEventArgs {
    
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    /* CompleteClass */
    var activityId: String = js.native
    
    /** Gets the type of operation initiating this request. */
    /* CompleteClass */
    var initiator: HttpDiagnosticRequestInitiator = js.native
    
    /** Gets the HttpRequestMessage including headers. */
    /* CompleteClass */
    var message: typings.winrtUwp.Windows.Web.Http.HttpRequestMessage = js.native
    
    /** Gets the process ID. */
    /* CompleteClass */
    var processId: Double = js.native
    
    /** Gets the source location call stack. */
    /* CompleteClass */
    var sourceLocations: IVectorView[typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation] = js.native
    
    /** Gets the thread ID. */
    /* CompleteClass */
    var threadId: Double = js.native
    
    /** Gets the timestamp of when the HttpRequestMessage was sent. */
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  /** Provides data for the ResponseReceived event. */
  @JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderResponseReceivedEventArgs")
  @js.native
  abstract class HttpDiagnosticProviderResponseReceivedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticProviderResponseReceivedEventArgs {
    
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    /* CompleteClass */
    var activityId: String = js.native
    
    /** Gets the HttpResponseMessage including headers, the status code, and data. */
    /* CompleteClass */
    var message: typings.winrtUwp.Windows.Web.Http.HttpResponseMessage = js.native
    
    /** Gets the timestamp of when the HttpResponseMessage was received. */
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  /** Provides the source of the request. */
  @JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator")
  @js.native
  object HttpDiagnosticRequestInitiator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator & Double
      ] = js.native
    
    /* 7 */ val htmlDownload: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.htmlDownload & Double = js.native
    
    /* 2 */ val image: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.image & Double = js.native
    
    /* 3 */ val link: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.link & Double = js.native
    
    /* 6 */ val media: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.media & Double = js.native
    
    /* 9 */ val other: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.other & Double = js.native
    
    /* 0 */ val parsedElement: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.parsedElement & Double = js.native
    
    /* 8 */ val prefetch: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.prefetch & Double = js.native
    
    /* 1 */ val script: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.script & Double = js.native
    
    /* 4 */ val style: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.style & Double = js.native
    
    /* 5 */ val xmlHttpRequest: typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator.xmlHttpRequest & Double = js.native
  }
  
  /** Contains the source location of the HTTP activity. */
  @JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation")
  @js.native
  abstract class HttpDiagnosticSourceLocation ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation {
    
    /** Gets the column number. */
    /* CompleteClass */
    var columnNumber: Double = js.native
    
    /** Gets the line number. */
    /* CompleteClass */
    var lineNumber: Double = js.native
    
    /** Gets the source URI. */
    /* CompleteClass */
    var sourceUri: Uri = js.native
  }
}
