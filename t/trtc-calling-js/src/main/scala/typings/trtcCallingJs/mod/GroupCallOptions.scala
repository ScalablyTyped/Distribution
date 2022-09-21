package typings.trtcCallingJs.mod

import typings.trtcCallingJs.trtcCallingJsNumbers.`1`
import typings.trtcCallingJs.trtcCallingJsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 群组通话邀请参数类型 */
trait GroupCallOptions extends StObject {
  
  var groupID: js.UndefOr[String] = js.undefined
  
  var `type`: `1` | `2`
  
  var userIDList: js.Array[String]
}
object GroupCallOptions {
  
  inline def apply(`type`: `1` | `2`, userIDList: js.Array[String]): GroupCallOptions = {
    val __obj = js.Dynamic.literal(userIDList = userIDList.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCallOptions]
  }
  
  extension [Self <: GroupCallOptions](x: Self) {
    
    inline def setGroupID(value: String): Self = StObject.set(x, "groupID", value.asInstanceOf[js.Any])
    
    inline def setGroupIDUndefined: Self = StObject.set(x, "groupID", js.undefined)
    
    inline def setType(value: `1` | `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserIDList(value: js.Array[String]): Self = StObject.set(x, "userIDList", value.asInstanceOf[js.Any])
    
    inline def setUserIDListVarargs(value: String*): Self = StObject.set(x, "userIDList", js.Array(value*))
  }
}
