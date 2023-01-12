package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinOptions extends StObject {
  
  /**
    * @deprecated 进房钥匙，若需要权限控制请携带该参数，因某些局限性目前已不建议使用该参数。
    */
  var privateMapKey: js.UndefOr[String] = js.undefined
  
  /** 用户角色 */
  var role: js.UndefOr[Role] = js.undefined
  
  /** 房间号 */
  var roomId: Double | String
}
object JoinOptions {
  
  inline def apply(roomId: Double | String): JoinOptions = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinOptions] (val x: Self) extends AnyVal {
    
    inline def setPrivateMapKey(value: String): Self = StObject.set(x, "privateMapKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateMapKeyUndefined: Self = StObject.set(x, "privateMapKey", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoomId(value: Double | String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
  }
}
