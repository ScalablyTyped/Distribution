package typings
package twilioDashMcsDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twilioDashMcsDashClientLibStrings {
  @js.native
  sealed trait debug
    extends twilioDashMcsDashClientLib.twilioDashMcsDashClientMod._LogLevel
  
  @js.native
  sealed trait error
    extends twilioDashMcsDashClientLib.twilioDashMcsDashClientMod._LogLevel
  
  @js.native
  sealed trait info
    extends twilioDashMcsDashClientLib.twilioDashMcsDashClientMod._LogLevel
  
  @js.native
  sealed trait silent
    extends twilioDashMcsDashClientLib.twilioDashMcsDashClientMod._LogLevel
  
  @js.native
  sealed trait trace
    extends twilioDashMcsDashClientLib.twilioDashMcsDashClientMod._LogLevel
  
  @js.native
  sealed trait warn
    extends twilioDashMcsDashClientLib.twilioDashMcsDashClientMod._LogLevel
  
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

