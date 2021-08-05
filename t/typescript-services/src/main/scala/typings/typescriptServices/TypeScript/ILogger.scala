package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILogger extends StObject {
  
  def debug(): Boolean
  
  def error(): Boolean
  
  def fatal(): Boolean
  
  def information(): Boolean
  
  def log(s: String): Unit
  
  def warning(): Boolean
}
object ILogger {
  
  inline def apply(
    debug: () => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    information: () => Boolean,
    log: String => Unit,
    warning: () => Boolean
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[ILogger]
  }
  
  extension [Self <: ILogger](x: Self) {
    
    inline def setDebug(value: () => Boolean): Self = StObject.set(x, "debug", js.Any.fromFunction0(value))
    
    inline def setError(value: () => Boolean): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
    
    inline def setFatal(value: () => Boolean): Self = StObject.set(x, "fatal", js.Any.fromFunction0(value))
    
    inline def setInformation(value: () => Boolean): Self = StObject.set(x, "information", js.Any.fromFunction0(value))
    
    inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setWarning(value: () => Boolean): Self = StObject.set(x, "warning", js.Any.fromFunction0(value))
  }
}
