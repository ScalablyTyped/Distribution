package typings.atWordpressNotices.atWordpressNoticesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atWordpressNotices.atWordpressNoticesStrings.error
  - typings.atWordpressNotices.atWordpressNoticesStrings.info
  - typings.atWordpressNotices.atWordpressNoticesStrings.success
  - typings.atWordpressNotices.atWordpressNoticesStrings.warning
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.atWordpressNotices.atWordpressNoticesStrings.error = this.cast("error")
  @scala.inline
  def info: typings.atWordpressNotices.atWordpressNoticesStrings.info = this.cast("info")
  @scala.inline
  def success: typings.atWordpressNotices.atWordpressNoticesStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.atWordpressNotices.atWordpressNoticesStrings.warning = this.cast("warning")
}

