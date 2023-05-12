package typings.vscode.mod

import typings.std.Record
import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelemetrySender extends StObject {
  
  /**
  		 * Optional flush function which will give this sender a chance to send any remaining events
  		 * as its {@link TelemetryLogger} is being disposed
  		 */
  var flush: js.UndefOr[js.Function0[Unit | Thenable[Unit]]] = js.native
  
  /**
  		 * Function to send an error. Used within a {@link TelemetryLogger}
  		 *
  		 * @param error The error being logged
  		 * @param data Any additional data to be collected with the exception
  		 */
  def sendErrorData(error: js.Error): Unit = js.native
  def sendErrorData(error: js.Error, data: Record[String, Any]): Unit = js.native
  
  /**
  		 * Function to send event data without a stacktrace. Used within a {@link TelemetryLogger}
  		 *
  		 * @param eventName The name of the event which you are logging
  		 * @param data A serializable key value pair that is being logged
  		 */
  def sendEventData(eventName: String): Unit = js.native
  def sendEventData(eventName: String, data: Record[String, Any]): Unit = js.native
}
