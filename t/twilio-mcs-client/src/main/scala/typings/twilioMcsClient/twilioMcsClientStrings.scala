package typings.twilioMcsClient

import typings.twilioMcsClient.mod._LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twilioMcsClientStrings {
  @js.native
  sealed trait debug extends _LogLevel
  
  @js.native
  sealed trait error extends _LogLevel
  
  @js.native
  sealed trait info extends _LogLevel
  
  @js.native
  sealed trait silent extends _LogLevel
  
  @js.native
  sealed trait trace extends _LogLevel
  
  @js.native
  sealed trait warn extends _LogLevel
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

