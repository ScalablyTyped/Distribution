package typings.yogLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined yog-log.yog-log.LEVELS[yog-log.yog-log.LevelInt] */
/* Rewritten from type alias, can be one of: 
  - typings.yogLog.yogLogStrings.DEBUG
  - typings.yogLog.yogLogStrings.WARNING
  - typings.yogLog.yogLogStrings.TRACE
  - typings.yogLog.yogLogStrings.ACCESS
  - typings.yogLog.yogLogStrings.ACCESS_ERROR
  - typings.yogLog.yogLogStrings.NOTICE
  - typings.yogLog.yogLogStrings.FATAL
*/
trait LevelName extends js.Object

object LevelName {
  @scala.inline
  def ACCESS: typings.yogLog.yogLogStrings.ACCESS = this.cast("ACCESS")
  @scala.inline
  def ACCESS_ERROR: typings.yogLog.yogLogStrings.ACCESS_ERROR = this.cast("ACCESS_ERROR")
  @scala.inline
  def DEBUG: typings.yogLog.yogLogStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def FATAL: typings.yogLog.yogLogStrings.FATAL = this.cast("FATAL")
  @scala.inline
  def NOTICE: typings.yogLog.yogLogStrings.NOTICE = this.cast("NOTICE")
  @scala.inline
  def TRACE: typings.yogLog.yogLogStrings.TRACE = this.cast("TRACE")
  @scala.inline
  def WARNING: typings.yogLog.yogLogStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

