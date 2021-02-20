package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Telemetry extends StObject {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
  
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: js.Any): Unit = js.native
}
object Telemetry {
  
  @scala.inline
  def apply(connection: IConnection, logEvent: js.Any => Unit): Telemetry = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], logEvent = js.Any.fromFunction1(logEvent))
    __obj.asInstanceOf[Telemetry]
  }
  
  @scala.inline
  implicit class TelemetryMutableBuilder[Self <: Telemetry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: IConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEvent(value: js.Any => Unit): Self = StObject.set(x, "logEvent", js.Any.fromFunction1(value))
  }
}
