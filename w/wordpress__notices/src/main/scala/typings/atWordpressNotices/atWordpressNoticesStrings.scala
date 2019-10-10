package typings.atWordpressNotices

import typings.atWordpressNotices.atWordpressNoticesMod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atWordpressNoticesStrings {
  @js.native
  sealed trait `core/notices` extends js.Object
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait error extends Status
  
  @js.native
  sealed trait info extends Status
  
  @js.native
  sealed trait snackbar extends js.Object
  
  @js.native
  sealed trait success extends Status
  
  @js.native
  sealed trait warning extends Status
  
  @scala.inline
  def `core/notices`: `core/notices` = "core/notices".asInstanceOf[`core/notices`]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def snackbar: snackbar = "snackbar".asInstanceOf[snackbar]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

