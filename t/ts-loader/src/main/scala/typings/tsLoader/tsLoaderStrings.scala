package typings.tsLoader

import typings.tsLoader.interfacesMod.LogLevel
import typings.tsLoader.interfacesMod.Severity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsLoaderStrings {
  
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @scala.inline
  def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @scala.inline
  def dts: dts = "dts".asInstanceOf[dts]
  
  @scala.inline
  def error_ : error_ = "error".asInstanceOf[error_]
  
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  
  @scala.inline
  def quit: quit = "quit".asInstanceOf[quit]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait ERROR extends LogLevel
  
  @js.native
  sealed trait INFO extends LogLevel
  
  @js.native
  sealed trait WARN extends LogLevel
  
  @js.native
  sealed trait dts extends js.Object
  
  @js.native
  sealed trait error_ extends Severity
  
  @js.native
  sealed trait js_ extends js.Object
  
  @js.native
  sealed trait quit extends js.Object
  
  @js.native
  sealed trait warning extends Severity
}
