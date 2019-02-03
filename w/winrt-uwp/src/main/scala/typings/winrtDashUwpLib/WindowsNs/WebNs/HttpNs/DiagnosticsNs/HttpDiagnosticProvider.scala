package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a simple diagnostic facility for tracing and profiling web traffic in applications built on Microsoft’s HTTP stacks. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProvider")
@js.native
abstract class HttpDiagnosticProvider () extends js.Object {
  /** Subscribe to the RequestResponseCompleted event to receive a notification that a request has been submitted. */
  @JSName("onrequestresponsecompleted")
  var onrequestresponsecompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs] = js.native
  /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
  @JSName("onrequestsent")
  var onrequestsent_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs] = js.native
  /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
  @JSName("onresponsereceived")
  var onresponsereceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requestresponsecompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.requestresponsecompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requestsent(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.requestsent,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.responsereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs]
  ): scala.Unit = js.native
  /** Subscribe to the RequestResponseCompleted event to receive a notification that a request has been submitted. */
  def onrequestresponsecompleted(
    ev: HttpDiagnosticProviderRequestResponseCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[HttpDiagnosticProvider]
  ): scala.Unit = js.native
  /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
  def onrequestsent(
    ev: HttpDiagnosticProviderRequestSentEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[HttpDiagnosticProvider]
  ): scala.Unit = js.native
  /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
  def onresponsereceived(
    ev: HttpDiagnosticProviderResponseReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[HttpDiagnosticProvider]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_requestresponsecompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.requestresponsecompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_requestsent(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.requestsent,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.responsereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs]
  ): scala.Unit = js.native
  /** Starts the HttpDiagnosticProvider monitoring the attached process target. */
  def start(): scala.Unit = js.native
  /** Stops the HttpDiagnosticProvider from monitoring the attached process target. */
  def stop(): scala.Unit = js.native
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
  def createFromProcessDiagnosticInfo(processDiagnosticInfo: winrtDashUwpLib.WindowsNs.SystemNs.DiagnosticsNs.ProcessDiagnosticInfo): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticProvider = js.native
}

