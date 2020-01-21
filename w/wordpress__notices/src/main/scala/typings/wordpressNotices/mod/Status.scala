package typings.wordpressNotices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressNotices.wordpressNoticesStrings.error
  - typings.wordpressNotices.wordpressNoticesStrings.info
  - typings.wordpressNotices.wordpressNoticesStrings.success
  - typings.wordpressNotices.wordpressNoticesStrings.warning
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.wordpressNotices.wordpressNoticesStrings.error = this.cast("error")
  @scala.inline
  def info: typings.wordpressNotices.wordpressNoticesStrings.info = this.cast("info")
  @scala.inline
  def success: typings.wordpressNotices.wordpressNoticesStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.wordpressNotices.wordpressNoticesStrings.warning = this.cast("warning")
}

