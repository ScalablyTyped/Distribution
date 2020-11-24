package typings.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastrStrings {
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @scala.inline
  def visible: visible = "visible".asInstanceOf[visible]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait error extends ToastrType
  
  @js.native
  sealed trait hidden extends js.Object
  
  @js.native
  sealed trait info extends ToastrType
  
  @js.native
  sealed trait success extends ToastrType
  
  @js.native
  sealed trait visible extends js.Object
  
  @js.native
  sealed trait warning extends ToastrType
}
