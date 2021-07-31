package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteConsole extends StObject {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection
  
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
  
  @scala.inline
  def apply(
    connection: IConnection,
    error: String => Unit,
    info: String => Unit,
    log: String => Unit,
    warn: String => Unit
  ): RemoteConsole = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[RemoteConsole]
  }
  
  @scala.inline
  implicit class RemoteConsoleMutableBuilder[Self <: RemoteConsole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: IConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
