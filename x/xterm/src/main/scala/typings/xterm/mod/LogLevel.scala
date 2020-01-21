package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.xterm.xtermStrings.debug
  - typings.xterm.xtermStrings.info
  - typings.xterm.xtermStrings.warn
  - typings.xterm.xtermStrings.error
  - typings.xterm.xtermStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.xterm.xtermStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.xterm.xtermStrings.error = this.cast("error")
  @scala.inline
  def info: typings.xterm.xtermStrings.info = this.cast("info")
  @scala.inline
  def off: typings.xterm.xtermStrings.off = this.cast("off")
  @scala.inline
  def warn: typings.xterm.xtermStrings.warn = this.cast("warn")
}

