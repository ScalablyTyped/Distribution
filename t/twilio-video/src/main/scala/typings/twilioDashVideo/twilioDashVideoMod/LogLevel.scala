package typings.twilioDashVideo.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashVideo.twilioDashVideoStrings.debug
  - typings.twilioDashVideo.twilioDashVideoStrings.info
  - typings.twilioDashVideo.twilioDashVideoStrings.warn
  - typings.twilioDashVideo.twilioDashVideoStrings.error
  - typings.twilioDashVideo.twilioDashVideoStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.twilioDashVideo.twilioDashVideoStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.twilioDashVideo.twilioDashVideoStrings.error = this.cast("error")
  @scala.inline
  def info: typings.twilioDashVideo.twilioDashVideoStrings.info = this.cast("info")
  @scala.inline
  def off: typings.twilioDashVideo.twilioDashVideoStrings.off = this.cast("off")
  @scala.inline
  def warn: typings.twilioDashVideo.twilioDashVideoStrings.warn = this.cast("warn")
}

