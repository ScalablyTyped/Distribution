package typings.vscode.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelemetryLogger extends StObject {
  
  /**
  		 * Dispose this object and free resources.
  		 */
  def dispose(): Unit = js.native
  
  /**
  		 * Whether or not error telemetry is enabled for this logger.
  		 */
  val isErrorsEnabled: Boolean = js.native
  
  /**
  		 * Whether or not usage telemetry is enabled for this logger.
  		 */
  val isUsageEnabled: Boolean = js.native
  
  /**
  		 * Log an error event.
  		 *
  		 * Calls `TelemetrySender.sendErrorData`. Does cleaning, telemetry checks, and data mix-in.
  		 * Automatically supports echoing to extension telemetry output channel.
  		 * Will also automatically log any exceptions thrown within the extension host process.
  		 * @param error The error object which contains the stack trace cleaned of PII
  		 * @param data Additional data to log alongside the stack trace
  		 */
  def logError(error: js.Error): Unit = js.native
  def logError(error: js.Error, data: Record[String, Any | TelemetryTrustedValue[Any]]): Unit = js.native
  /**
  		 * Log an error event.
  		 *
  		 * After completing cleaning, telemetry setting checks, and data mix-in calls `TelemetrySender.sendEventData` to log the event. Differs from `logUsage` in that it will log the event if the telemetry setting is Error+.
  		 * Automatically supports echoing to extension telemetry output channel.
  		 * @param eventName The event name to log
  		 * @param data The data to log
  		 */
  def logError(eventName: String): Unit = js.native
  def logError(eventName: String, data: Record[String, Any | TelemetryTrustedValue[Any]]): Unit = js.native
  
  /**
  		 * Log a usage event.
  		 *
  		 * After completing cleaning, telemetry setting checks, and data mix-in calls `TelemetrySender.sendEventData` to log the event.
  		 * Automatically supports echoing to extension telemetry output channel.
  		 * @param eventName The event name to log
  		 * @param data The data to log
  		 */
  def logUsage(eventName: String): Unit = js.native
  def logUsage(eventName: String, data: Record[String, Any | TelemetryTrustedValue[Any]]): Unit = js.native
  
  /**
  		 * An {@link Event} which fires when the enablement state of usage or error telemetry changes.
  		 */
  def onDidChangeEnableStates(listener: js.Function1[/* e */ TelemetryLogger, Any]): Disposable = js.native
  def onDidChangeEnableStates(listener: js.Function1[/* e */ TelemetryLogger, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeEnableStates(
    listener: js.Function1[/* e */ TelemetryLogger, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeEnableStates(
    listener: js.Function1[/* e */ TelemetryLogger, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}
