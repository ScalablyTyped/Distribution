package typings.tsLoader

import typings.tsLoader.interfacesMod.LogLevel
import typings.tsLoader.interfacesMod.Severity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsLoaderStrings {
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LogLevel
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait INFO
    extends StObject
       with LogLevel
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait WARN
    extends StObject
       with LogLevel
  inline def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait dts extends StObject
  inline def dts: dts = "dts".asInstanceOf[dts]
  
  @js.native
  sealed trait error_
    extends StObject
       with Severity
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait js_ extends StObject
  inline def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait quit extends StObject
  inline def quit: quit = "quit".asInstanceOf[quit]
  
  @js.native
  sealed trait warning
    extends StObject
       with Severity
  inline def warning: warning = "warning".asInstanceOf[warning]
}
