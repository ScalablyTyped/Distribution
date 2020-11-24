package typings.winrtUwp.global.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.tracingstatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables tracing control flow across asynchronous operations. */
@JSGlobal("Windows.Foundation.Diagnostics.AsyncCausalityTracer")
@js.native
abstract class AsyncCausalityTracer ()
  extends typings.winrtUwp.Windows.Foundation.Diagnostics.AsyncCausalityTracer
/* static members */
@JSGlobal("Windows.Foundation.Diagnostics.AsyncCausalityTracer")
@js.native
object AsyncCausalityTracer extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tracingstatuschanged(`type`: tracingstatuschanged, listener: EventHandler[_]): Unit = js.native
  
  /** Raised when a client starts listening to the causality trace. */
  def ontracingstatuschanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Raised when a client starts listening to the causality trace. */
  @JSName("ontracingstatuschanged")
  var ontracingstatuschanged_Original: EventHandler[_] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tracingstatuschanged(`type`: tracingstatuschanged, listener: EventHandler[_]): Unit = js.native
  
  /**
    * Indicates that a previously created asynchronous operation has completed all of its asynchronous work.
    * @param traceLevel The trace level.
    * @param source The trace source.
    * @param platformId Identifier for the operation type.
    * @param operationId The identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
    * @param status The completion status of the asynchronous operation.
    */
  def traceOperationCompletion(
    traceLevel: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel,
    source: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource,
    platformId: String,
    operationId: Double,
    status: AsyncStatus
  ): Unit = js.native
  
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
    traceLevel: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel,
    source: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource,
    platformId: String,
    operationId: Double,
    operationName: String,
    relatedContext: Double
  ): Unit = js.native
  
  /**
    * Logs the relation between the currently running synchronous work item and a specific asynchronous operation that it's related to.
    * @param traceLevel The trace level.
    * @param source The trace source.
    * @param platformId Identifier for the operation type.
    * @param operationId The identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
    * @param relation The relationship between the synchronous work item and asynchronous operation identified by operationId.
    */
  def traceOperationRelation(
    traceLevel: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel,
    source: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource,
    platformId: String,
    operationId: Double,
    relation: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityRelation
  ): Unit = js.native
  
  /**
    * Indicates that the most recently created synchronous work item running on the thread that the TraceSynchronousWorkCompletion method is called on has completed.
    * @param traceLevel The trace level.
    * @param source The trace source.
    * @param work Indicates the type of completion.
    */
  def traceSynchronousWorkCompletion(
    traceLevel: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel,
    source: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource,
    work: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork
  ): Unit = js.native
  
  /**
    * Indicates that the specified asynchronous operation is scheduling synchronous work on the thread that the TraceSynchronousWorkStart method is called on.
    * @param traceLevel The trace level.
    * @param source The trace source.
    * @param platformId Identifier for the operation type.
    * @param operationId The identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
    * @param work The relationship between the work item and the asynchronous operation.
    */
  def traceSynchronousWorkStart(
    traceLevel: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel,
    source: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource,
    platformId: String,
    operationId: Double,
    work: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork
  ): Unit = js.native
}
