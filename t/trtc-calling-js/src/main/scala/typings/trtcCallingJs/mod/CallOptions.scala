package typings.trtcCallingJs.mod

import typings.trtcCallingJs.trtcCallingJsInts.`1`
import typings.trtcCallingJs.trtcCallingJsInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 1对1通话邀请参数类型 */
trait CallOptions
  extends StObject
     with UserInfo {
  
  var timeout: Double
  
  var `type`: `1` | `2`
}
object CallOptions {
  
  inline def apply(timeout: Double, `type`: `1` | `2`, userID: String): CallOptions = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallOptions] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setType(value: `1` | `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
