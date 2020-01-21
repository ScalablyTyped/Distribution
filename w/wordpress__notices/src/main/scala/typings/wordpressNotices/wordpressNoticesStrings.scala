package typings.wordpressNotices

import typings.wordpressNotices.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wordpressNoticesStrings {
  @js.native
  sealed trait coreSlashnotices extends js.Object
  
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
  def coreSlashnotices: coreSlashnotices = "core/notices".asInstanceOf[coreSlashnotices]
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

