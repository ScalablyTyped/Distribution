package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// twilio-chat is used by Flex SDK. Please DO NOT change
trait Logger extends StObject {
  
  def debug(args: Any*): Unit
  
  def error(args: Any*): Unit
  
  def info(args: Any*): Unit
  
  /* private */ var prefix: Any
  
  def setLevel(level: Any): Unit
  
  def trace(args: Any*): Unit
  
  def warn(args: Any*): Unit
}
object Logger {
  
  inline def apply(
    debug: /* repeated */ Any => Unit,
    error: /* repeated */ Any => Unit,
    info: /* repeated */ Any => Unit,
    prefix: Any,
    setLevel: Any => Unit,
    trace: /* repeated */ Any => Unit,
    warn: /* repeated */ Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), prefix = prefix.asInstanceOf[js.Any], setLevel = js.Any.fromFunction1(setLevel), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setPrefix(value: Any): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSetLevel(value: Any => Unit): Self = StObject.set(x, "setLevel", js.Any.fromFunction1(value))
    
    inline def setTrace(value: /* repeated */ Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
