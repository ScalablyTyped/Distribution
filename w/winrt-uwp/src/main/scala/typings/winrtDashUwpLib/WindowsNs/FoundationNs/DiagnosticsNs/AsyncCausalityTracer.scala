package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables tracing control flow across asynchronous operations. */
@JSGlobal("Windows.Foundation.Diagnostics.AsyncCausalityTracer")
@js.native
abstract class AsyncCausalityTracer () extends js.Object

/** Enables tracing control flow across asynchronous operations. */
@JSGlobal("Windows.Foundation.Diagnostics.AsyncCausalityTracer")
@js.native
object AsyncCausalityTracer extends js.Object {
  /** Raised when a client starts listening to the causality trace. */
  @JSName("ontracingstatuschanged")
  var ontracingstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tracingstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.tracingstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /** Raised when a client starts listening to the causality trace. */
  def ontracingstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tracingstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.tracingstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
    * Indicates that a previously created asynchronous operation has completed all of its asynchronous work.
    * @param traceLevel The trace level.
    * @param source The trace source.
    * @param platformId Identifier for the operation type.
    * @param operationId The identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
    * @param status The completion status of the asynchronous operation.
    */
  def traceOperationCompletion(
    traceLevel: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityTraceLevel,
    source: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySource,
    platformId: java.lang.String,
    operationId: scala.Double,
    status: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  /**
    * Logs the creation of an asynchronous operation.
    * @param traceLevel The trace level.
    * @param source The trace source.
    * @param platformId Identifier for the operation type.
    * @param operationId An identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
    * @param operationName A human-readable description of the asynchronous work.
    * @param relatedContext Additional information related to this operation.
    */
  def traceOperationCreation(
    traceLevel: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityTraceLevel,
    source: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySource,
    platformId: java.lang.String,
    operationId: scala.Double,
    operationName: java.lang.String,
    relatedContext: scala.Double
  ): scala.Unit = js.native
  /**
    * Logs the relation between the currently running synchronous work item and a specific asynchronous operation that it's related to.
    * @param traceLevel The trace level.
    * @param source The trace source.
    * @param platformId Identifier for the operation type.
    * @param operationId The identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
    * @param relation The relationship between the synchronous work item and asynchronous operation identified by operationId.
    */
  def traceOperationRelation(
    traceLevel: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityTraceLevel,
    source: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySource,
    platformId: java.lang.String,
    operationId: scala.Double,
    relation: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityRelation
  ): scala.Unit = js.native
  /**
    * Indicates that the most recently created synchronous work item running on the thread that the TraceSynchronousWorkCompletion method is called on has completed.
    * @param traceLevel The trace level.
    * @param source The trace source.
    * @param work Indicates the type of completion.
    */
  def traceSynchronousWorkCompletion(
    traceLevel: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityTraceLevel,
    source: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySource,
    work: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySynchronousWork
  ): scala.Unit = js.native
  /**
    * Indicates that the specified asynchronous operation is scheduling synchronous work on the thread that the TraceSynchronousWorkStart method is called on.
    * @param traceLevel The trace level.
    * @param source The trace source.
    * @param platformId Identifier for the operation type.
    * @param operationId The identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
    * @param work The relationship between the work item and the asynchronous operation.
    */
  def traceSynchronousWorkStart(
    traceLevel: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityTraceLevel,
    source: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySource,
    platformId: java.lang.String,
    operationId: scala.Double,
    work: winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySynchronousWork
  ): scala.Unit = js.native
}

