package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object toastrLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait hidden extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @js.native
  sealed trait visible extends js.Object
  
  @js.native
  sealed trait warning extends js.Object
  
  def error: error = "error".asInstanceOf[error]
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  def info: info = "info".asInstanceOf[info]
  def success: success = "success".asInstanceOf[success]
  def visible: visible = "visible".asInstanceOf[visible]
  def warning: warning = "warning".asInstanceOf[warning]
}

