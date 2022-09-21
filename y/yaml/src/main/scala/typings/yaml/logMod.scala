package typings.yaml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  @JSImport("yaml/dist/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debug(logLevel: LogLevelId, messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(List(logLevel.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def warn(logLevel: LogLevelId, warning: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(logLevel.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warn(logLevel: LogLevelId, warning: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(logLevel.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.yamlStrings.silent
    - typings.yaml.yamlStrings.error
    - typings.yaml.yamlStrings.warn
    - typings.yaml.yamlStrings.debug
  */
  trait LogLevelId extends StObject
  object LogLevelId {
    
    inline def debug: typings.yaml.yamlStrings.debug = "debug".asInstanceOf[typings.yaml.yamlStrings.debug]
    
    inline def error: typings.yaml.yamlStrings.error = "error".asInstanceOf[typings.yaml.yamlStrings.error]
    
    inline def silent: typings.yaml.yamlStrings.silent = "silent".asInstanceOf[typings.yaml.yamlStrings.silent]
    
    inline def warn: typings.yaml.yamlStrings.warn = "warn".asInstanceOf[typings.yaml.yamlStrings.warn]
  }
}
