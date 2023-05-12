package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogOutputChannel
  extends StObject
     with OutputChannel {
  
  /**
  		 * Outputs the given debug message to the channel.
  		 *
  		 * The message is only logged if the channel is configured to display {@link LogLevel.Debug debug} log level or lower.
  		 *
  		 * @param message debug message to log
  		 */
  def debug(message: String, args: Any*): Unit = js.native
  
  /**
  		 * Outputs the given error or error message to the channel.
  		 *
  		 * The message is only logged if the channel is configured to display {@link LogLevel.Error error} log level or lower.
  		 *
  		 * @param error Error or error message to log
  		 */
  def error(error: String, args: Any*): Unit = js.native
  def error(error: js.Error, args: Any*): Unit = js.native
  
  /**
  		 * Outputs the given information message to the channel.
  		 *
  		 * The message is only logged if the channel is configured to display {@link LogLevel.Info info} log level or lower.
  		 *
  		 * @param message info message to log
  		 */
  def info(message: String, args: Any*): Unit = js.native
  
  /**
  		 * The current log level of the channel. Defaults to {@link env.logLevel editor log level}.
  		 */
  val logLevel: LogLevel = js.native
  
  /**
  		 * An {@link Event} which fires when the log level of the channel changes.
  		 */
  def onDidChangeLogLevel(listener: js.Function1[/* e */ LogLevel, Any]): Disposable = js.native
  def onDidChangeLogLevel(listener: js.Function1[/* e */ LogLevel, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeLogLevel(listener: js.Function1[/* e */ LogLevel, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidChangeLogLevel(listener: js.Function1[/* e */ LogLevel, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
  		 * Outputs the given trace message to the channel. Use this method to log verbose information.
  		 *
  		 * The message is only logged if the channel is configured to display {@link LogLevel.Trace trace} log level.
  		 *
  		 * @param message trace message to log
  		 */
  def trace(message: String, args: Any*): Unit = js.native
  
  /**
  		 * Outputs the given warning message to the channel.
  		 *
  		 * The message is only logged if the channel is configured to display {@link LogLevel.Warning warning} log level or lower.
  		 *
  		 * @param message warning message to log
  		 */
  def warn(message: String, args: Any*): Unit = js.native
}
