package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrMsg extends StObject {
  
  var errMsg: String = js.native
  
  var isEnrolled: Boolean = js.native
}
object ErrMsg {
  
  @scala.inline
  def apply(errMsg: String, isEnrolled: Boolean): ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsg]
  }
  
  @scala.inline
  implicit class ErrMsgMutableBuilder[Self <: ErrMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnrolled(value: Boolean): Self = StObject.set(x, "isEnrolled", value.asInstanceOf[js.Any])
  }
}
