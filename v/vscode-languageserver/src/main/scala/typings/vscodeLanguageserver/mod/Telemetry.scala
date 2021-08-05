package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Telemetry extends StObject {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection
  
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: js.Any): Unit
}
object Telemetry {
  
  inline def apply(connection: IConnection, logEvent: js.Any => Unit): Telemetry = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], logEvent = js.Any.fromFunction1(logEvent))
    __obj.asInstanceOf[Telemetry]
  }
  
  extension [Self <: Telemetry](x: Self) {
    
    inline def setConnection(value: IConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setLogEvent(value: js.Any => Unit): Self = StObject.set(x, "logEvent", js.Any.fromFunction1(value))
  }
}
