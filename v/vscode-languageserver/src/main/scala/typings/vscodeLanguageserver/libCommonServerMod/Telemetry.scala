package typings.vscodeLanguageserver.libCommonServerMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Telemetry
  extends StObject
     with FeatureBase {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: Connection
  
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: Any): Unit
}
object Telemetry {
  
  inline def apply(
    connection: Connection,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Unit,
    initialize: ClientCapabilities => Unit,
    logEvent: Any => Unit
  ): Telemetry = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize), logEvent = js.Any.fromFunction1(logEvent))
    __obj.asInstanceOf[Telemetry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Telemetry] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setLogEvent(value: Any => Unit): Self = StObject.set(x, "logEvent", js.Any.fromFunction1(value))
  }
}
