package typings.vscodeLanguageserver.serverMod

import typings.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteConsole
  extends StObject
     with FeatureBase {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: Connection
  
  /**
    * Show an error message.
    *
    * @param message The message to show.
    */
  def error(message: String): Unit
  
  /**
    * Show an information message.
    *
    * @param message The message to show.
    */
  def info(message: String): Unit
  
  /**
    * Log a message.
    *
    * @param message The message to log.
    */
  def log(message: String): Unit
  
  /**
    * Show a warning message.
    *
    * @param message The message to show.
    */
  def warn(message: String): Unit
}
object RemoteConsole {
  
  inline def apply(
    connection: Connection,
    error: String => Unit,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Unit,
    info: String => Unit,
    initialize: ClientCapabilities => Unit,
    log: String => Unit,
    warn: String => Unit
  ): RemoteConsole = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), info = js.Any.fromFunction1(info), initialize = js.Any.fromFunction1(initialize), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[RemoteConsole]
  }
  
  extension [Self <: RemoteConsole](x: Self) {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
