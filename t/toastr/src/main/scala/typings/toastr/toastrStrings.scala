package typings.toastr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastrStrings {
  
  @js.native
  sealed trait error extends ToastrType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait hidden extends StObject
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait info extends ToastrType
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait success extends ToastrType
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait visible extends StObject
  @scala.inline
  def visible: visible = "visible".asInstanceOf[visible]
  
  @js.native
  sealed trait warning extends ToastrType
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
