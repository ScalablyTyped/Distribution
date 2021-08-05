package typings.wordpressNotices

import typings.wordpressNotices.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressNoticesStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait coreSlashnotices extends StObject
  inline def coreSlashnotices: coreSlashnotices = "core/notices".asInstanceOf[coreSlashnotices]
  
  @js.native
  sealed trait error
    extends StObject
       with Status
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with Status
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait snackbar extends StObject
  inline def snackbar: snackbar = "snackbar".asInstanceOf[snackbar]
  
  @js.native
  sealed trait success
    extends StObject
       with Status
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait warning
    extends StObject
       with Status
  inline def warning: warning = "warning".asInstanceOf[warning]
}
