package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def error(message: String): Unit
  
  def info(message: String): Unit
  
  def log(message: String): Unit
  
  def warn(message: String): Unit
}
object Logger {
  
  inline def apply(error: String => Unit, info: String => Unit, log: String => Unit, warn: String => Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
