package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.requestresponsecompleted
import typings.winrtUwp.winrtUwpStrings.requestsent
import typings.winrtUwp.winrtUwpStrings.responsereceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a simple diagnostic facility for tracing and profiling web traffic in applications built on Microsoft’s HTTP stacks. */
@js.native
trait HttpDiagnosticProvider extends js.Object {
  
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
