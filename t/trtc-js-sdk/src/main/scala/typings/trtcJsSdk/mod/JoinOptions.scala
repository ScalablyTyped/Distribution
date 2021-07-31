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
  var roomId: Double
}
object JoinOptions {
  
  @scala.inline
  def apply(roomId: Double): JoinOptions = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinOptions]
  }
  
  @scala.inline
  implicit class JoinOptionsMutableBuilder[Self <: JoinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateMapKey(value: String): Self = StObject.set(x, "privateMapKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateMapKeyUndefined: Self = StObject.set(x, "privateMapKey", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRoomId(value: Double): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
  }
}
