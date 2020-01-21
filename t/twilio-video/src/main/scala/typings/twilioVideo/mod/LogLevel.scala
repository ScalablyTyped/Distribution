package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioVideo.twilioVideoStrings.debug
  - typings.twilioVideo.twilioVideoStrings.info
  - typings.twilioVideo.twilioVideoStrings.warn
  - typings.twilioVideo.twilioVideoStrings.error
  - typings.twilioVideo.twilioVideoStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.twilioVideo.twilioVideoStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.twilioVideo.twilioVideoStrings.error = this.cast("error")
  @scala.inline
  def info: typings.twilioVideo.twilioVideoStrings.info = this.cast("info")
  @scala.inline
  def off: typings.twilioVideo.twilioVideoStrings.off = this.cast("off")
  @scala.inline
  def warn: typings.twilioVideo.twilioVideoStrings.warn = this.cast("warn")
}

