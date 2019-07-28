package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.SystemNs.DiagnosticsNs.ProcessDiagnosticInfo
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.requestresponsecompleted
import typings.winrtDashUwp.winrtDashUwpStrings.requestsent
import typings.winrtDashUwp.winrtDashUwpStrings.responsereceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a simple diagnostic facility for tracing and profiling web traffic in applications built on Microsoft’s HTTP stacks. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProvider")
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

/* static members */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProvider")
@js.native
object HttpDiagnosticProvider extends js.Object {
  /**
    * Creates a new HttpDiagnosticProvider based on the specified ProcessDiagnosticInfo object.
    * @param processDiagnosticInfo The ProcessDiagnosticInfo that identifies the process to watch.
    * @return The newly created HttpDiagnosticProvider .
    */
  def createFromProcessDiagnosticInfo(processDiagnosticInfo: ProcessDiagnosticInfo): HttpDiagnosticProvider = js.native
}

