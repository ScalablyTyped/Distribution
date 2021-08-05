package typings.toastr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastrStrings {
  
  @js.native
  sealed trait error
    extends StObject
       with ToastrType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait hidden extends StObject
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait info
    extends StObject
       with ToastrType
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait success
    extends StObject
       with ToastrType
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait visible extends StObject
  inline def visible: visible = "visible".asInstanceOf[visible]
  
  @js.native
  sealed trait warning
    extends StObject
       with ToastrType
  inline def warning: warning = "warning".asInstanceOf[warning]
}
