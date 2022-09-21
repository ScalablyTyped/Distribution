package typings.tsInvariant

import typings.tsInvariant.mod.VerbosityLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsInvariantStrings {
  
  @js.native
  sealed trait debug
    extends StObject
       with VerbosityLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with VerbosityLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait log
    extends StObject
       with VerbosityLevel
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait silent
    extends StObject
       with VerbosityLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait warn
    extends StObject
       with VerbosityLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
