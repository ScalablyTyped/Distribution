package typings.wordpressNotices

import typings.wordpressNotices.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressNoticesStrings {
  
  @js.native
  sealed trait default extends StObject
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait coreSlashnotices extends StObject
  @scala.inline
  def coreSlashnotices: coreSlashnotices = "core/notices".asInstanceOf[coreSlashnotices]
  
  @js.native
  sealed trait error extends Status
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info extends Status
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait snackbar extends StObject
  @scala.inline
  def snackbar: snackbar = "snackbar".asInstanceOf[snackbar]
  
  @js.native
  sealed trait success extends Status
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait warning extends Status
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
