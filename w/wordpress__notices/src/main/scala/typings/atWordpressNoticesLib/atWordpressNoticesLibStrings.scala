package typings
package atWordpressNoticesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atWordpressNoticesLibStrings {
  @js.native
  sealed trait `core/notices` extends js.Object
  
  @js.native
  sealed trait error
    extends atWordpressNoticesLib.atWordpressNoticesMod.Status
  
  @js.native
  sealed trait info
    extends atWordpressNoticesLib.atWordpressNoticesMod.Status
  
  @js.native
  sealed trait success
    extends atWordpressNoticesLib.atWordpressNoticesMod.Status
  
  @js.native
  sealed trait warning
    extends atWordpressNoticesLib.atWordpressNoticesMod.Status
  
  @scala.inline
  def `core/notices`: `core/notices` = "core/notices".asInstanceOf[`core/notices`]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

