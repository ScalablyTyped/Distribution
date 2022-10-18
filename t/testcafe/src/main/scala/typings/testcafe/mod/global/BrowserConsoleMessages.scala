package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserConsoleMessages extends StObject {
  
  /**
    * Error messages output to the browser console by the console.error() method.
    */
  var error: js.Array[String]
  
  /**
    * Information messages output to the browser console by the console.info() method.
    */
  var info: js.Array[String]
  
  /**
    * Messages output to the browser console by the console.log() method.
    */
  var log: js.Array[String]
  
  /**
    * Warning messages output to the browser console by the console.warn() method.
    */
  var warn: js.Array[String]
}
object BrowserConsoleMessages {
  
  inline def apply(error: js.Array[String], info: js.Array[String], log: js.Array[String], warn: js.Array[String]): BrowserConsoleMessages = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserConsoleMessages]
  }
  
  extension [Self <: BrowserConsoleMessages](x: Self) {
    
    inline def setError(value: js.Array[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorVarargs(value: String*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setInfo(value: js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value*))
    
    inline def setLog(value: js.Array[String]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogVarargs(value: String*): Self = StObject.set(x, "log", js.Array(value*))
    
    inline def setWarn(value: js.Array[String]): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    inline def setWarnVarargs(value: String*): Self = StObject.set(x, "warn", js.Array(value*))
  }
}
